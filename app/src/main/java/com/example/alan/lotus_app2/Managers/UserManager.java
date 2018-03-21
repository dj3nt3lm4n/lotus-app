package com.example.alan.lotus_app2.Managers;

import com.example.alan.lotus_app2.ApiController;
import com.example.alan.lotus_app2.ILotus;
import com.example.alan.lotus_app2.Registro;
import com.example.alan.lotus_app2.Utils.BusProvider;
import com.example.alan.lotus_app2.Utils.Config;
import com.example.alan.lotus_app2.events.ErrorEvent;
import com.example.alan.lotus_app2.events.SignUpEvent;
import com.example.alan.lotus_app2.modelos.RegistroData;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alan on 16/03/18.
 */

/*RegistroData registroData = new RegistroData();
registroData.setNombre(edtnombre.getText.tostring();

UserManager.signUp(registroData)--->*/
public class UserManager {
    public static void singUp(RegistroData registro) {
        Call<JsonObject> callResponse = ApiController
                .createService(ILotus.class)
                .singUp(registro);
        callResponse.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    Gson gson = new Gson();
                    JsonElement respuesta = response.body().get("result");
                    Boolean respuesta1 = respuesta.getAsBoolean();

                    if (respuesta1) {
                        JsonElement token = response.body().get("auth_token");
                        Config.sharedPreferencesUsers.saveSession(token.toString());
                        String mesaje = token.toString();
                        BusProvider.getInstance().post((new SignUpEvent(mesaje)));
                    }else{
                        BusProvider.getInstance().post(new ErrorEvent(response.message(), 0));
                    }

                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                BusProvider.getInstance().post(new ErrorEvent(t.getMessage(), 0));

            }
        });

    }

}

