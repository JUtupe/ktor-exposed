package pl.jutupe

data class DatabaseConfiguration(
    val url: String,
    val driver: String,
    val user: String,
    val password: String
)