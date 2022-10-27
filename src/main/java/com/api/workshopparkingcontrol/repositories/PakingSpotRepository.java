package com.api.workshopparkingcontrol.repositories;

import com.api.workshopparkingcontrol.models.PakingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PakingSpotRepository extends JpaRepository<PakingSpotModel, UUID> {
}
