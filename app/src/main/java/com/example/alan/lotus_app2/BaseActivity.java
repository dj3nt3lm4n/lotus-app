package com.example.alan.lotus_app2;

import android.support.v7.app.AppCompatActivity;

import com.example.alan.lotus_app2.Utils.BusProvider;
import com.squareup.otto.Subscribe;

/**
 * Created by alan on 20/03/18.
 */

public class BaseActivity extends AppCompatActivity {


    @Subscribe
    public void onResume() {
        super.onResume();
        BusProvider.getInstance().register(this);
    }

    @Subscribe
    public void onPause() {
        BusProvider.getInstance().unregister(this);
        super.onPause();
    }
}
