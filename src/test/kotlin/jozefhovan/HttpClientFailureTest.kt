package jozefhovan

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.junit.jupiter.api.Test

class HttpClientFailureTest {

    @Test
    fun testFailure(){
        HttpClients.createSystem().use { httpclient ->
            val httpget = HttpGet("http://localhost:8080/index.txt")
            val response = httpclient.execute(httpget)

            val bytes = ByteArray(response.entity.contentLength.toInt())
            response.entity.content.read(bytes)

            //required to read one byte more to fully read response anc close tcp stream

            println(String(bytes))

        }

    }

}
