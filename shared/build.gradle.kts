plugins {
    kotlin("multiplatform")
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":innertube"))
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        jvmTest.dependencies {
            implementation(libs.junit)
        }
    }
}
