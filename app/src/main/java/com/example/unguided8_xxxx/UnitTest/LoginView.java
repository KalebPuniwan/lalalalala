package com.example.unguided8_xxxx.UnitTest;


import com.example.unguided8_xxxx.UserDAO;

public interface LoginView {

    String getNim();
    void showNimError(String message);
    String getPassword();
    void showPasswordError(String message);
    void startMainActivity();
    void startUserProfileActivity(UserDAO user);
    void showLoginError(String message);
    void showErrorResponse(String message);

}
