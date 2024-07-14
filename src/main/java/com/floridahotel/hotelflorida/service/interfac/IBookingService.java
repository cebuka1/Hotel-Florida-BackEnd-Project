package com.floridahotel.hotelflorida.service.interfac;


import com.floridahotel.hotelflorida.dto.Response;
import com.floridahotel.hotelflorida.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}