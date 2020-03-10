package pl.jutupe

import io.ktor.application.Application
import io.ktor.application.ApplicationFeature
import io.ktor.util.AttributeKey

class Exposed {

    companion object Feature : ApplicationFeature<Application, ExposedConfiguration, Exposed> {

        override val key: AttributeKey<Exposed>
            get() = AttributeKey("Exposed")

        override fun install(
            pipeline: Application,
            configure: ExposedConfiguration.() -> Unit
        ): Exposed {
            val application = ExposedConfiguration.create()
            application.apply(configure)
            return Exposed()
        }

    }
}