plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.client"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.client"
        minSdk = 27
        targetSdk = 34
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation(libs.annotation)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("androidx.fragment:fragment:1.7.1")

    implementation ("androidx.datastore:datastore-preferences:1.1.1")
    implementation ("androidx.datastore:datastore-preferences-rxjava2:1.1.1")
    implementation ("androidx.datastore:datastore-preferences-rxjava3:1.1.1")
}