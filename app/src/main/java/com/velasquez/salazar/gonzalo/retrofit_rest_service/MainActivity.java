package com.velasquez.salazar.gonzalo.retrofit_rest_service;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.okhttp.ResponseBody;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.API.PersonaService;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.API.SubscriptionService;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.Persona;
import com.velasquez.salazar.gonzalo.retrofit_rest_service.model.SubscriptionDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ProgressBar progressBar;
    private static final String API = "http://192.168.0.141:8080";
//    private static final String API = "http://arg.com.bo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.tv);
        progressBar = (ProgressBar) findViewById(R.id.pb);
        progressBar.setVisibility(View.INVISIBLE);


        click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);

                Retrofit rf = new Retrofit.Builder()
                        .baseUrl(API)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                SubscriptionService subscriptionService = rf.create(SubscriptionService.class);
//                PersonaService subscriptionService = rf.create(PersonaService.class);

                Call call = subscriptionService.getSubscription();

                call.enqueue(new Callback() {
                    @Override
                    public void onResponse(Response response, Retrofit retrofit) {

                        Log.i("response'", response.toString());
//                        SubscriptionDto dataModel = (SubscriptionDto) response.body();
                        SubscriptionDto dataModel = (SubscriptionDto) response.body();


                        if (dataModel == null) {
                            // ERROR 404 (NOT FOUND)
                            ResponseBody responseBody = response.errorBody();

                            if (responseBody != null) {
                                try {

                                    tv.setText("Response body: " + responseBody.string());

                                } catch (IOException ioE) {

                                    ioE.printStackTrace();
                                }
                            }
                        } else {
                            // ERROR 200 (OK)
                            Log.i("subscriptionDto: ", dataModel.toString());

                            tv.setText(String.format("id: %s\n deviceName: %s \n Color: %s \n icon: %s"
                                    , dataModel.getDevice().getId()
                                    , dataModel.getDevice().getName()
                                    , dataModel.getDevice().getColor()
                                    , dataModel.getDevice().getIcon()));

                        }
                        progressBar.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        tv.setText("Failure: " + t.getMessage());
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
