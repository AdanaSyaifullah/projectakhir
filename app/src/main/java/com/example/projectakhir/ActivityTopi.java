package com.example.projectakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTopi extends AppCompatActivity {
    Button btnbtltopi, btnbelitopi; //deklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topi);

        btnbelitopi = findViewById(R.id.belitopi);  //menghubungkan variabel pada button layout
        btnbtltopi = findViewById(R.id.bataltopi);

        btnbelitopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityDetailPemesanan.class); // berpindah layout
                startActivity(i);
            }
        });

        btnbtltopi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}