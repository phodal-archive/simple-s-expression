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

    // for run kotlin script
    implementation(kotlin("compiler-embeddable"))
    implementation(kotlin("scripting-jsr223"))
    runtimeOnly(kotlin("scripting-compiler-embeddable"))

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
