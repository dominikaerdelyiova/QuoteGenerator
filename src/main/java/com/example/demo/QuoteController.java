package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteController {

    public static final String template = "If you expect nothing from somebody you are never disappointed.";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/quote")
    public Quote quote(@RequestParam(value = "randomize", defaultValue = "Quote") String randomize) {
        return new Quote(counter.incrementAndGet(),String.format(template,randomize));

    }


}
