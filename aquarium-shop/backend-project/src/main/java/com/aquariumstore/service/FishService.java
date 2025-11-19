package com.aquariumstore.service;

import com.aquariumstore.entity.Fish;
import com.aquariumstore.repository.FishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {

    private final FishRepository repo;

    public FishService(FishRepository repo) { this.repo = repo; }

    public List<Fish> getAll() { return repo.findAll(); }
    public Fish save(Fish fish) { return repo.save(fish); }
    public void delete(Long id) { repo.deleteById(id); }
}
