package com.example.alan.lotus_app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {
    TextView cedulaVisible, enviarLogin;
    EditText edtCedula,edtNombre,edtCorreoDeRegistro,edtPasswordDeRegistro,edtTelefonoRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cedulaVisible=findViewById(R.id.txtVisibleCedula);
        edtCedula=findViewById(R.id.edtCedula);
        edtNombre=findViewById(R.id.edtNombre);
        edtCorreoDeRegistro=findViewById(R.id.edtCorreo);
        edtTelefonoRegistro=findViewById(R.id.edtTelefonoDeRegistro);
        edtPasswordDeRegistro=findViewById(R.id.edtPasswordDeRegistro);
        enviarLogin=findViewById(R.id.txtEnviaLogin);
        cedulaVisible.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                edtCedula.setVisibility(View.VISIBLE);
            }
        });
        enviarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registro.this,Login.class));
                finish();
            }
        });


    }
}
