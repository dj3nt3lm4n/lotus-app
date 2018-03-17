package com.example.alan.lotus_app2;

import com.example.alan.lotus_app2.Utils.JSONkeys;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alan on 16/03/18.
 */

public class ApiController {

    public ApiController() {
    }

    public static <S> S createService(Class<S> serviceClass){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JSONkeys.KEY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  retrofit.create(serviceClass);

    }
}
