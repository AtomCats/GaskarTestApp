package com.ecommerce.spring.controller;

import com.ecommerce.spring.model.Tag;
import com.ecommerce.spring.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping(value = "/all")
    public List<Tag> getAllAuthors() {
        return tagService.getAll();
    }

    @PostMapping
    public Tag saveAuthor(@RequestBody Tag tag) {
        return tagService.saveTag(tag);
    }
}
