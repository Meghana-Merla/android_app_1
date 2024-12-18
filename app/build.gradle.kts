plugins {
    id("com.android.application") version "8.2.0" apply true
    id("org.jetbrains.kotlin.android") version "1.9.0" apply true
}

android {
    namespace = "com.example.hackverse1" // Change to your package name
    compileSdk = 34 // Use the latest compile SDK version

    defaultConfig {
        applicationId = "com.example.hackverse1" // Change to your app ID
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
    release {
        isMinifyEnabled = false
        proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
        )
    }
}

compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

buildFeatures {
    viewBinding = true // Optional, for XML layouts with View Binding
}
}

dependencies {
// AndroidX Core libraries
implementation("androidx.core:core-ktx:1.12.0")
implementation("androidx.appcompat:appcompat:1.6.1")
implementation("com.google.android.material:material:1.11.0")
implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.androidx.activity)

// Testing dependencies (optional)
testImplementation("junit:junit:4.13.2")
androidTestImplementation("androidx.test.ext:junit:1.1.5")
androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}