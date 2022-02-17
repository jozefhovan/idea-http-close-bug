package jozefhovan

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("jozefhovan")
		.start()
}

