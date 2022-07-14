package com.tracom.fraud;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "api/v1/fraud")
public class FraudController {
    private final FraudCheckService fraudCheckService;


    public FraudController(FraudCheckService fraudCheckService) {
        this.fraudCheckService = fraudCheckService;
    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId){
        boolean isFraudulent = fraudCheckService.isFraudster(customerId);
        return new FraudCheckResponse(isFraudulent);
    }
}
