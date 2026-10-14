plugins {
    id("com.android.library")
    kotlin("multiplatform")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.metrolist.innertube"
    compileSdk = 37

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

kotlin {
    jvmToolchain(21)

    androidTarget()
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.serialization.json)
            implementation(libs.ktor.client.encoding)
        }
        androidMain.dependencies {
            api(libs.innertubex)
            implementation(libs.ktor.client.okhttp)
            implementation(libs.timber)
        }
        jvmMain.dependencies {
            api(libs.innertubex.desktop)
            implementation(libs.ktor.client.cio)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation(libs.ktor.client.mock)
        }
        jvmTest.dependencies {
            implementation(libs.junit)
        }
    }
}
