package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enterokay (View v ){
     EditText usuario = findViewById(R.id.usuario);
     Log.d("datos", usuario.getText().toString());
    }
    public void register (View d){

    }
    public void texto (View n) {

    }
    public void segundo (View g ){
        Intent bicho = new Intent(this, segundo.class );
        startActivity(bicho);
    }
}
