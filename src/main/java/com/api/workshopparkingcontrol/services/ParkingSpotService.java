package com.api.workshopparkingcontrol.services;

import com.api.workshopparkingcontrol.models.ParkingSpotModel;
import com.api.workshopparkingcontrol.repositories.PakingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}

