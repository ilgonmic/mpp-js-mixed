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

//dependencies {
//    implementation(kotlin("stdlib-js"))
//
//    implementation(project(":shared"))
//}

kotlin {
    js(org.jetbrains.kotlin.gradle.plugin.JsCompilerType.ir) {
        browser {
        }

        produceExecutable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))

                implementation(project(":shared"))
            }
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}