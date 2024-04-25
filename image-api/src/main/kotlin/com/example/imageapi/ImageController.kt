package com.example.imageapi

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("image")
class ImageController(
    @Value("\${image.env}") val env: String
) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @GetMapping("{id}")
    fun imageCreate(@PathVariable id: Int): String {
        log.info("env: {}", env)
        log.info("image created: {}", id)
        return "OK"
    }
}
