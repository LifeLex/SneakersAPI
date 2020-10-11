package com.company.sneakerapi.services;

import com.company.sneakerapi.exception.SaAuthException;
import com.company.sneakerapi.model.User;

public interface UserService {
    //validate and register user
    User validateUser(String email, String password) throws SaAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws SaAuthException;
}
