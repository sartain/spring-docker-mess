package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    private final DemoRepository repository;

    public DemoService(DemoRepository demoRepository) {
        this.repository = demoRepository;
    }

    void saveToRepository() {
        repository.save(new DemoEntity("hello world"));
    }

    DemoEntity retrieveFromRepository(Integer id) {
        Optional<DemoEntity> response = repository.findById(id);
        return response.orElseGet(DemoEntity::new);
    }


}
