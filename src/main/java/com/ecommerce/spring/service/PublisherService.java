package com.ecommerce.spring.service;

import com.ecommerce.spring.model.Publisher;
import com.ecommerce.spring.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAll() {

        return  StreamSupport.stream(publisherRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
