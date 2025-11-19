package com.aquariumstore.repository;

import com.aquariumstore.entity.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {}
