package com.example.centroacopioii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.btnLogueo);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast mensaje = Toast.makeText(this, "Usuario correcto ", Toast.LENGTH_LONG);
        mensaje.show();
        startActivity(new Intent(getApplicationContext(),gestion.class));


    }


}
