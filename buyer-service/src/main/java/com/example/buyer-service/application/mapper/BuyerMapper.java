package com.example.buyer-service.application.mapper;

import com.example.buyerservice.application.dto.BuyerDTO;
import com.example.buyerservice.domain.model.Buyer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BuyerMapper {
    BuyerMapper INSTANCE = Mappers.getMapper(BuyerMapper.class);

    BuyerDTO toBuyerDTO(Buyer buyer);
    Buyer toBuyer(BuyerDTO buyerDTO);
}

