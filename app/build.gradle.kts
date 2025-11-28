plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.tallerdatabinding"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.tallerdatabinding"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding=true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.41")
    implementation ("androidx.appcompat:appcompat:1.0.2")
    implementation ("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation ("android.arch.lifecycle:extensions:1.1.1")
    implementation ("android.arch.lifecycle:viewmodel:1.1.1")
    implementation ("androidx.core:core-ktx:1.2.0-alpha03")
    implementation ("androidx.recyclerview:recyclerview:1.1.0-beta03")
    implementation ("com.google.android.material:material:1.1.0-alpha09")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}