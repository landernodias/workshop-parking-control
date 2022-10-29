package com.api.workshopparkingcontrol.repositories;

import com.api.workshopparkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PakingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
