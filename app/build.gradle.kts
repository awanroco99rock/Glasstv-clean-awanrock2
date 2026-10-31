plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.glasstv.bekasi"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.glasstv.bekasi"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    flavorDimensions += "device"
    productFlavors {
        create("mxqPro") { dimension = "device"; applicationIdSuffix = ".mxqpro" }
        create("akari") { dimension = "device"; applicationIdSuffix = ".akari" }
        create("b860h") { dimension = "device"; applicationIdSuffix = ".b860h" }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies { }
