plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
    id("spargat.blockman.blockmanlord") version "1.0.0"
}
group = "spargat.blockman.blockmanlord.games.template"
version = "1.0.0"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
kotlin {
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
dependencies {
    //build in
    testImplementation(libs.junit)
    //kotlin
    implementation(libs.kotlin.stdlib)
}