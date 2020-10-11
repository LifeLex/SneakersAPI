package com.company.sneakerapi.repository;

import com.company.sneakerapi.exception.SaAuthException;
import com.company.sneakerapi.model.User;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws SaAuthException;
    User findByEmailAndPassword(String email, String password) throws SaAuthException;
}
