package com.aquariumstore.controller;

import com.aquariumstore.entity.Fish;
import com.aquariumstore.service.FishService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fish")
@CrossOrigin(origins = "*")
public class FishController {

    private final FishService fishService;

    public FishController(FishService fishService) { this.fishService = fishService; }

    @GetMapping
    public List<Fish> getAll() { return fishService.getAll(); }

    @PostMapping
    public Fish add(@RequestBody Fish fish) { return fishService.save(fish); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { fishService.delete(id); }
}
