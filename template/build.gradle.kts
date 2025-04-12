plugins {
    `java-gradle-plugin`
    kotlin("jvm")
}
group = "spargat.blockman.blockmanlord.games.template"
version = "1.0.0"
dependencies {
    //build in
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //kotlin
    implementation(libs.kotlin.stdlib)
}