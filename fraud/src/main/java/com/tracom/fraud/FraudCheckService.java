package com.tracom.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckRepository fraudCheckRepository;


    public boolean isFraudster(Integer customerId){
        fraudCheckRepository.save(
                FraudCheckHistory
                        .builder()
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .customerId(customerId)
                        .build()
        );
        return false;
    }
}
