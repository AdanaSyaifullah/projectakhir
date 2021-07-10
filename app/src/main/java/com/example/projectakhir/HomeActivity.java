package com.example.projectakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btncargo, btntopi, btnjaket, btntas; //deklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btncargo = findViewById(R.id.idcargo);
        btnjaket = findViewById(R.id.idjaket);
        btntopi = findViewById(R.id.idtopi); //menghubungkan variabel pada button layout
        btntas = findViewById(R.id.idtas);

        btntopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityTopi.class); //berpindah layout
                startActivity(i);
            }
        });

        btntas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityTas.class);
                startActivity(i);
            }
        });

        btnjaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityJaket.class);
                startActivity(i);
            }
        });

        btncargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityCargo.class);
                startActivity(i);
            }
        });
    }
}