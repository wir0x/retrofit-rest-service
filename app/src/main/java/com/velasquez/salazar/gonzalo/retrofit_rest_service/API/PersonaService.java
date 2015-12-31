package com.velasquez.salazar.gonzalo.retrofit_rest_service.API;

import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.Persona;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

public interface PersonaService {

    @GET("/daniel")
    Call<List<Persona>> findPersonas();


}
