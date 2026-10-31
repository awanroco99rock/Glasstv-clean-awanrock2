plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.glasstv.clean"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.glasstv.clean"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0-bekasi"
    }
    flavorDimensions += "version"
    productFlavors {
        create("original") { dimension = "version"; applicationIdSuffix = ".original" }
        create("awanrock") { dimension = "version"; applicationIdSuffix = ".awanrock" }
        create("clean") { dimension = "version"; applicationIdSuffix = ".clean" }
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
