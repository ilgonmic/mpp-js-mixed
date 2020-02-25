import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.LEGACY

plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

group = "com.ilgonmic"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
    mavenCentral()
    mavenLocal()
}

kotlin {
    js(LEGACY) {
        browser {
        }

        produceExecutable()
    }
}

dependencies {
    "jsImplementation"(kotlin("stdlib-js"))

    "jsImplementation"(project(":shared"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}