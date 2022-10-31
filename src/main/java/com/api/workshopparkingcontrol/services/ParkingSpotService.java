package com.api.workshopparkingcontrol.services;

import com.api.workshopparkingcontrol.models.ParkingSpotModel;
import com.api.workshopparkingcontrol.repositories.PakingSpotRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    final PakingSpotRepository pakingSpotRepository; //outra forma de injeção de dependencia sem usar o Autowired

    public ParkingSpotService(PakingSpotRepository pakingSpotRepository) {
        this.pakingSpotRepository = pakingSpotRepository;
    }
    @Transactional //recomenda utilizar em metodos construtivo ou destrutivo para que não aconteça de ter dados quebrado devido uma falha
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return pakingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return pakingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return pakingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return pakingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {

        return pakingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return pakingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        pakingSpotRepository.delete(parkingSpotModel);
    }
}

