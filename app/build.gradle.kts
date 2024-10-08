plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

    android {
    namespace = "com.example.assignment2"
    compileSdk = 33

    defaultConfig {
      applicationId = "com.example.assignment2"
    minSdk = 24
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
       release {
           isMinifyEnabled = false
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
       }
    }
    }

  dependencies {

      implementation("androidx.appcompat:appcompat:1.7.0")
      implementation("com.google.android.material:material:1.12.0")
      implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  }