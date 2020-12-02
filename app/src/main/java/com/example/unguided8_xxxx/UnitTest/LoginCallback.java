package com.example.unguided8_xxxx.UnitTest;

import com.example.unguided8_xxxx.UserDAO;

public interface LoginCallback {
    void onSuccess(boolean value, UserDAO user);
    void onError();
}
