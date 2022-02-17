package jozefhovan

import io.micronaut.http.HttpRequest
import io.micronaut.http.server.exceptions.ExceptionHandler
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class HttpExceptionHandler : ExceptionHandler<Throwable, String> {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun handle(request: HttpRequest<*>?, exception: Throwable?): String {
        logger.error("Got unhandled exception: ${exception?.message}", exception)

        return "There was an error"
    }

}
