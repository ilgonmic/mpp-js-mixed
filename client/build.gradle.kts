import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType.*

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
    jcenter()
    mavenLocal()
}

kotlin {
    js(IR) {
        browser {
        }

        binaries.executable()
    }
}

dependencies {
    "jsImplementation"(kotlin("stdlib-js"))

    "jsImplementation"(project(":shared"))
}