# Fabric Loader Environment

Provides environment annotations from [Fabric Loader](https://github.com/FabricMC/fabric-loader)
to silent compile warnings when using [Loom](https://github.com/FabricMC/fabric-loom)
without Fabric Loader present, for example in the common project in a multi-platform setup.

```kotlin
// build.gradle.kts
repositories {
    maven("https://maven2.bai.lol") {
        content {
            includeGroup("lol.bai")
        }
    }
}

dependencies {
    compileOnly("lol.bai:fabric-loader-environment:0.0.1")
}
```

```groovy
// build.gradle
repositories {
    maven {
        url "https://maven2.bai.lol"
        content {
            includeGroup "lol.bai"
        }
    }
}

dependencies {
    compileOnly "lol.bai:fabric-loader-environment:0.0.1"
}
```
