package com.shivam.jwtAuthentication.service.jwt;

import io.jsonwebtoken.Claims;

import org.springframework.security.core.userdetails.UserDetails;


import java.util.Map;
import java.util.function.Function;

public interface JwtService {
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

    String extractUsername(String token);

    boolean isTokenValid(String token, UserDetails userDetails);

    String generateToken(UserDetails userDetails);

    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);

}
