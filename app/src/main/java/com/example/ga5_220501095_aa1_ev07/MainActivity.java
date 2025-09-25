package com.example.ga5_220501095_aa1_ev07;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView TextoUNO;

    Button btnboton;

    EditText textuno;

    EditText textdos;

    String Usuario = "Samuel";
    String Password = "1234";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        textuno = findViewById(R.id.EditTextoUno);
        textdos = findViewById(R.id.EditTextoDos);
        btnboton = findViewById(R.id.BotonUno);

        btnboton.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                String UsuarioIngresado = textuno.getText().toString();
                String PasswordIngresado = textdos.getText().toString();

                if(UsuarioIngresado.equals(Usuario) && PasswordIngresado.equals(Password) ){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
