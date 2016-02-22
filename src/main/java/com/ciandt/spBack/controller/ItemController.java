package com.ciandt.spBack.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ciandt.spBack.domain.Item;


@RestController
@RequestMapping("/item")
public class ItemController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Item process(@RequestParam(value = "content", required = false, defaultValue = "content") String content) {
        return new Item(counter.incrementAndGet(), content );
    }

}
