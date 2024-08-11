import java.nio.charset.StandardCharsets

plugins {
    `java-library`
    `maven-publish`
}

group = "lol.bai"
version = "0.0.1"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    withSourcesJar()
}

tasks.withType<JavaCompile> {
    options.encoding = StandardCharsets.UTF_8.name()
}

publishing {
    repositories {
        maven {
            url = uri("https://maven4.bai.lol")
            name = "Badasintended"
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            artifactId = base.archivesName.get()
            from(components["java"])
        }
    }
}
