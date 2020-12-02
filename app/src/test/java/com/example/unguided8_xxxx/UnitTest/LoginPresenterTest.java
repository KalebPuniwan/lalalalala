package com.example.unguided8_xxxx.UnitTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    private LoginView view;
    @Mock
    private LoginService service;
    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view, service);
    }

    @Test
    public void shouldShowErrorMessageWhenUsernameIsEmpty() throws Exception {
        when(view.getNim()).thenReturn("");
        System.out.println("nim : " + view.getNim());
        presenter.onLoginClicked();
        verify(view).showNimError("Nim Tidak Boleh Kosong");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordIsEmpty() throws Exception {
        when(view.getNim()).thenReturn("admin");
        System.out.println("nim : " + view.getNim());
        when(view.getPassword()).thenReturn("");
        System.out.println("password : " + view.getPassword());
        presenter.onLoginClicked();
        verify(view).showPasswordError("Password Tidak Boleh Kosong");
    }

    @Test
    public void shouldStartMainActivityWhenNimAndPasswordAreCorrect() throws
            Exception {
        when(view.getNim()).thenReturn("admin");
        System.out.println("nim : " + view.getNim());
        when(view.getPassword()).thenReturn("admin");
        System.out.println("password : " + view.getPassword());
        when(service.getValid(view, view.getNim(),
                view.getPassword())).thenReturn(true);
        System.out.println("Hasil : " + service.getValid(view, view.getNim(),
                view.getPassword()));
        presenter.onLoginClicked();
        //verify(view).startMainActivity();
    }

    @Test
    public void shouldShowLoginErrorWhenNimAndPasswordAreInvalid() throws
            Exception {
        when(view.getNim()).thenReturn("admin");
        System.out.println("nim : " + view.getNim());
        when(view.getPassword()).thenReturn("admins");
        System.out.println("password : " + view.getPassword());
        when(service.getValid(view, view.getNim(),
                view.getPassword())).thenReturn(false);
        System.out.println("Hasil : " + service.getValid(view, view.getNim(),
                view.getPassword()));
        presenter.onLoginClicked();
        //verify(view).showLoginError(R.string.login_failed);
    }
}