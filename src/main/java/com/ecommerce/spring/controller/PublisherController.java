package com.ecommerce.spring.controller;

import com.ecommerce.spring.model.Publisher;
import com.ecommerce.spring.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping(value = "/all")
    public List<Publisher> getAllAuthors() {
        return publisherService.getAll();
    }

    @PostMapping
    public Publisher saveAuthor(@RequestBody Publisher publisher) {
        return publisherService.savePublisher(publisher);
    }
}
