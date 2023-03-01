package com.qradardemo.app.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BCryptHasher implements Hasher{
    @Autowired
    private PasswordEncoder encoder;
    
    @Override
    public String hash(String decoded) {
        return encoder.encode(decoded);
    }

    @Override
    public boolean compare(String decoded, String hashed) {
        return encoder.matches(decoded, hashed);
    }
    
}
