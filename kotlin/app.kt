import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun main() {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/hello") {
                call.respondText("Hello, world!")
            }
        }
    }
    server.start(wait = true)
}