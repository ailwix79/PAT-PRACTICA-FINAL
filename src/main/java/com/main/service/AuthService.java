package com.main.service;

import com.main.utility.*;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    public Boolean validateLogin(Credentials credentials);
    public Boolean registerNewUser(Credentials credentials);
}
