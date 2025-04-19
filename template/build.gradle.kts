plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
    id("spargat.blockman.blockmanlord") version "1.0.0"
}
group = "spargat.blockman.blockmanlord.games.template"
version = "1.0.0"
java {
    sourceCompatibility = JavaVersion.VERSION_{JVM_VERSION}
    targetCompatibility = JavaVersion.VERSION_{JVM_VERSION}
    toolchain {
        languageVersion.set(JavaLanguageVersion.of({JVM_VERSION}))
    }
}
kotlin {
    jvmToolchain({JVM_VERSION})
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