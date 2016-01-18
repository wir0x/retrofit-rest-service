package com.velasquez.salazar.gonzalo.retrofit_rest_service.API;

import com.squareup.okhttp.Response;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.Persona;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.SubscriptionDto;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

public interface SubscriptionService {

    @GET("rest/subscription/88")
    Call<SubscriptionDto> getSubscription();

    @GET("rest/app/status")
    Call<String> getStatus();
}
