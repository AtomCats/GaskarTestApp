package com.ecommerce.spring.service;

import com.ecommerce.spring.model.Tag;
import com.ecommerce.spring.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAll() {

        return  StreamSupport.stream(tagRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }
}
