package jozefhovan

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class SampleController {

    @Get("index.txt")
    fun resolve(): String {
        return "Hello IntelliJ. Please resolve this bug."
    }
}
