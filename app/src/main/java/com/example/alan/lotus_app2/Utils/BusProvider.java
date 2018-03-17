package com.example.alan.lotus_app2.Utils;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by alan on 16/03/18.
 */

public class BusProvider {

    public static final Bus BUS =new Bus(ThreadEnforcer.ANY);

    public static Bus getInstnce(){
        return BUS;
    }

}
