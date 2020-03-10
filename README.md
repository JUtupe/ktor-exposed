# ktor-exposed
[![](https://jitpack.io/v/JUtupe/ktor-exposed.svg)](https://jitpack.io/#JUtupe/ktor-exposed)

Ktor Exposed database feature.

```kotlin
    install(Exposed) {
        connectWithConfig(DatabaseConfiguration(
            "jdbc:mysql://localhost:3306/<database_name_here>",
            "com.mysql.jdbc.Driver",
            "username",
            "password"
        ))

        createSchemas(
            Users
        )
    }
```
