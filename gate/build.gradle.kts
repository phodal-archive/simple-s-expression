plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.phodal.gate"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}