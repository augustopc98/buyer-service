package java.com.example.buyerservice.domain.repository;

import java.com.example.buyerservice.domain.model.Buyer;
import java.util.List;

public interface BuyerRepository {
    Buyer save(Buyer buyer);
    Buyer findById(int id);
    List<Buyer> findAll();
    void deleteById(int id);
}

