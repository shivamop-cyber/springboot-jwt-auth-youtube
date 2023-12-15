package com.shivam.jwtAuthentication.service.auth;

import com.shivam.jwtAuthentication.dto.AuthenticationRequest;
import com.shivam.jwtAuthentication.dto.AuthenticationResponse;
import com.shivam.jwtAuthentication.dto.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
