package com.velasquez.salazar.gonzalo.retrofit_rest_service;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.Persona;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    final String API = "http://arg.com.bo";
    final Retrofit rf = new Retrofit.Builder()
            .baseUrl(API)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    
}