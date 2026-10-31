plugins { id("com.android.application") }
android {
    namespace = "com.glasstv.bekasi.clean"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.glasstv.bekasi.clean"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    flavorDimensions += "stb"
    productFlavors {
        create("mxqPro") { dimension = "stb" }
        create("akari") { dimension = "stb" }
        create("b860h") { dimension = "stb" }
    }
}
