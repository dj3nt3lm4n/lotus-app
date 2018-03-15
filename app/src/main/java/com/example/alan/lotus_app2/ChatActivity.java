package com.example.alan.lotus_app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ChatActivity extends AppCompatActivity {

    String activeUser="";

    public void sendChat(View view){

        EditText chatEditText = (EditText) findViewById(R.id.chatEditText);

        //ParceObject message = ParceObject("message");

       // message.put("sender", ParceUse.g)



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Intent intent = getIntent();

        activeUser = intent.getStringExtra("username");

        setTitle("chat with"+ activeUser);

        Log.i("info",activeUser);
    }
}
