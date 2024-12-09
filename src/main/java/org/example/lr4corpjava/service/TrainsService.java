package org.example.lr4corpjava.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.lr4corpjava.data.Trains;
import org.example.lr4corpjava.repository.TrainsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TrainsService {

    private TrainsRepository trainRepository;

    public TrainsService(TrainsRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Trains> findAllTrains() {
        return trainRepository.findAll();
    }


    public void addTrain(String nameM, String typeTrain) {
        Trains trains=new Trains(nameM,typeTrain);
        trainRepository.save(trains);
    }

    public void updateTrain(int id, String nameM, String typeTrain) {
        trainRepository.findById(id).ifPresent(trains -> {
            trains.setNameMar(nameM);
            trains.setTypeTrain(typeTrain);
            trainRepository.save(trains);
        });
    }


    public void deleteTrain(int id) {
        trainRepository.deleteById(id);
    }
}
