package com.example.buyer-service.infrastructure.persistence;

import com.example.buyer-service.domain.model.Buyer;
import com.example.buyer-service.domain.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public class BuyerRepositoryImpl implements BuyerRepository {

    private final JpaBuyerRepository jpaBuyerRepository;

    @Autowired
    public BuyerRepositoryImpl(JpaBuyerRepository jpaBuyerRepository) {
        this.jpaBuyerRepository = jpaBuyerRepository;
    }

    @Override
    public Buyer save(Buyer buyer) {
        return jpaBuyerRepository.save(buyer);
    }

    @Override
    public Buyer findById(int id) {
        return jpaBuyerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Buyer> findAll() {
        return jpaBuyerRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        jpaBuyerRepository.deleteById(id);
    }
}

interface JpaBuyerRepository extends JpaRepository<Buyer, Integer> {
}
