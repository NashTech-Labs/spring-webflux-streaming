package com.knoldus.streaming.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class StreamingController {

    @GetMapping(value = "/streaming", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Long> getItemsStream(){

        return Flux.interval(Duration.ofSeconds(1));
    }
}
