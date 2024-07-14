package com.floridahotel.hotelflorida.service.interfac;

import com.floridahotel.hotelflorida.dto.LoginRequest;
import com.floridahotel.hotelflorida.dto.Response;
import com.floridahotel.hotelflorida.entity.User;


public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}