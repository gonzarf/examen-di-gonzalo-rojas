package com.example.gonzalorojas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    public void showalert(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("RECUPERACIÓN DE CONTRASEÑA");
        alert.setMessage("Introduzca correo de recuperación");

        EditText password = new EditText(this);
        password.setInputType(InputType.TYPE_CLASS_TEXT);
        password.setHint("correo@example.com");
        alert.setView(password);

        alert.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!password.getText().toString().isEmpty()){
                    Toast.makeText(Acceso.this, "Correo enviado correctamente a " + password.getText().toString() , Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Acceso.this, "Introduzca un correo", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alert.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        alert.create().show();

    }

    Button boton_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        boton_registro = findViewById(R.id.botonregistrar);

        boton_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Acceso.this, Registro.class);
                startActivity(intent);
            }
        });
    }

}