package jozefhovan

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.junit.jupiter.api.Test

class HttpClientOkTest {

    @Test
    fun testOk(){
        HttpClients.createSystem().use { httpclient ->
            val httpget = HttpGet("http://localhost:8080/index.txt")
            val response = httpclient.execute(httpget)

            val readAllBytes = response.entity.content.readAllBytes()
            println(String(readAllBytes))
        }
    }

    @Test
    fun testOk2(){
        HttpClients.createSystem().use { httpclient ->
            val httpget = HttpGet("http://localhost:8080/index.txt")
            val response = httpclient.execute(httpget)


            val bytes = ByteArray(response.entity.contentLength.toInt())
            val inputStream = response.entity.content
            inputStream.read(bytes)

            inputStream.read()
            println(String(bytes))
        }
    }

}
