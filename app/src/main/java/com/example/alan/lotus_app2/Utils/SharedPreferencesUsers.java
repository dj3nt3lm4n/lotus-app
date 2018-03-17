package com.example.alan.lotus_app2.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by alan on 16/03/18.
 */

public class SharedPreferencesUsers {
    public static final String PREF_TOKEN = "token";

    private SharedPreferences prefs;

    public SharedPreferencesUsers(Context context) {
        prefs = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }

    public void saveSession(String token) {
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString(PREF_TOKEN, token);

        editor.apply();
    }

    public String getCurrentUser() {
        String token = prefs.getString(PREF_TOKEN, "");
        return token;
    }

    public void logOut() {
        prefs.edit().clear().apply();
    }
}
