package com.tracom.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email ) {
}
