import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    application
    jacoco
    id("java")
    id("checkstyle")
    id("com.github.ben-manes.versions") version "0.52.0"
    id "org.sonarqube" version "6.0.1.5171"
}

group = "hexlet.code"

version = "1.0-SNAPSHOT"

application { mainClass = "hexlet.code.App" }

repositories { mavenCentral() }

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events = mutableSetOf(TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.SKIPPED)
        showStandardStreams = true
    }
}

tasks.jacocoTestReport { reports { xml.required.set(true) } }

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
  properties {
    property "sonar.projectKey", "vppatrick_java-project-61"
    property "sonar.organization", "vppatrick"
    property "sonar.host.url", "https://sonarcloud.io"
  }
}
