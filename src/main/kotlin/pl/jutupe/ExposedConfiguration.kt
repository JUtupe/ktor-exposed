package pl.jutupe

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.transactions.transaction


class ExposedConfiguration private constructor() {

    private val database = Database

    /**
     * Connects to a database with provided [DatabaseConfiguration]
     */
    fun connectWithConfig(configuration: DatabaseConfiguration) {
        database.connect(
            url = configuration.url,
            driver = configuration.driver,
            user = configuration.user,
            password = configuration.password
        )
    }

    /**
     * Creates database schemas if they do not exists.
     */
    fun <T: Table> createSchemas(vararg schemas: T) {
        transaction {
            SchemaUtils.create(*schemas)
        }
    }

    companion object {
        fun create(): ExposedConfiguration {
            return ExposedConfiguration()
        }
    }
}