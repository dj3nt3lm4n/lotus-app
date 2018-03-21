package com.example.alan.lotus_app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alan.lotus_app2.Managers.UserManager;
import com.example.alan.lotus_app2.events.ErrorEvent;
import com.example.alan.lotus_app2.events.SignUpEvent;
import com.example.alan.lotus_app2.modelos.RegistroData;
import com.squareup.otto.Subscribe;

public class Registro extends BaseActivity {
    TextView cedulaVisible, enviarLogin;
    EditText edtCedula,edtNombre,edtCorreoDeRegistro,edtPasswordDeRegistro,edtTelefonoRegistro, edtcp;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        cedulaVisible=findViewById(R.id.txtVisibleCedula);
        edtCedula=findViewById(R.id.edtCedula);
        edtNombre=findViewById(R.id.edtNombre);
        edtCorreoDeRegistro=findViewById(R.id.edtCorreoDeRegistro);
        edtTelefonoRegistro=findViewById(R.id.edtTelefonoDeRegistro);
        edtPasswordDeRegistro=findViewById(R.id.edtPasswordDeRegistro);
        edtcp=findViewById(R.id.edtPasswordConfirm);
        btnRegistrar=findViewById(R.id.btnRegistrar);
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

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegistroData registroData = new RegistroData();
                registroData.setSex(edtNombre.getText().toString());
                registroData.setBirthday(edtCorreoDeRegistro.getText().toString());
                registroData.setName(edtTelefonoRegistro.getText().toString());
                registroData.setEmail(edtCedula.getText().toString());
                registroData.setPassword(edtPasswordDeRegistro.getText().toString());
                registroData.setPassword_confirmation(edtcp.getText().toString());
                UserManager.singUp(registroData);
            }
        });

    }

    @Subscribe
    public void signupOk(SignUpEvent signUpEvent) {
       signUpEvent.toString();
    }

    @Subscribe
    public void signupError(ErrorEvent errorEvent) {
        Toast.makeText(this, "Error: "+errorEvent.getMessage(), Toast.LENGTH_SHORT).show();
    }

}
