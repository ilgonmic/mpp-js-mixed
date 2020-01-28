plugins {
    kotlin("js")
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

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(project(":shared"))
}

kotlin {
    target {
        browser {
        }

        produceKotlinLibrary()
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
}