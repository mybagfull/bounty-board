plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.matebook"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    jvmToolchain(15)
}

application {
    mainClass.set("MainKt")
}