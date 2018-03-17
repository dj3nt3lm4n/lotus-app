package com.example.alan.lotus_app2;

import com.example.alan.lotus_app2.modelos.RegistroData;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alan on 16/03/18.
 */

public interface ILotus {
    @POST("sign-up")
    Call<JsonObject> singUp(@Body Registro registroData);

    @POST("re")
    Call<JsonObject> registro(@Query("sex")String sexo,
                              @Query("birthday")String fechaNac,
                              @Query("name")String  nombre,
                              @Query("email")String email,
                              @Query("password")String password,
                              @Query("password_confirmation")String contraConfirm);



}
