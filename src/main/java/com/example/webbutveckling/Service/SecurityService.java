package com.example.webbutveckling.Service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}