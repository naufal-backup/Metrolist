plugins {
    kotlin("multiplatform")
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":innertube"))
            implementation(libs.koin.core)
            implementation(libs.coroutines.core)
        }
        jvmMain.dependencies {
            implementation(libs.vlcj)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        jvmTest.dependencies {
            implementation(libs.junit)
        }
    }
}
