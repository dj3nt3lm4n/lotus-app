package com.example.alan.lotus_app2.Managers;

import com.example.alan.lotus_app2.ApiController;
import com.example.alan.lotus_app2.ILotus;
import com.example.alan.lotus_app2.Registro;
import com.example.alan.lotus_app2.Utils.BusProvider;
import com.example.alan.lotus_app2.Utils.Config;
import com.example.alan.lotus_app2.events.ErrorEvent;
import com.example.alan.lotus_app2.events.SignUpEvent;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alan on 16/03/18.
 */

public class UserManager {
    public static void singUp(Registro registro) {
        Call<JsonObject> callResponse = ApiController
                .createService(ILotus.class)
                .singUp(registro);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {

                    Gson gson = new Gson();

                    JsonObject respuesta = response.body();
                    JsonElement token = respuesta.get("auth_token");
                    Config.sharedPreferencesUsers.saveSession(token.toString());
                    String mesaje = token.toString();
                    BusProvider.getInstnce().post((new SignUpEvent(mesaje)));


                } else {
                    BusProvider.getInstnce().post(new ErrorEvent(response.message(), 0));
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                BusProvider.getInstnce().post(new ErrorEvent(t.getMessage(), 0));

            }
        });

    }

}

