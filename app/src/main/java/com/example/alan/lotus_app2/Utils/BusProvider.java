package com.example.alan.lotus_app2.Utils;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by alan on 16/03/18.
 */
//envia informacion del manager a la actividad
public class BusProvider {

    public static final Bus BUS =new Bus(ThreadEnforcer.ANY);

    public static Bus getInstance(){
        return BUS;
    }

}
