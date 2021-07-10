package com.example.projectakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsign, btndaftar; //deklarasi variabel
    EditText edemail, edpassword;

    String nama, password; //variabel untuk nyimpan email dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsign = findViewById(R.id.btnsignin); //menghubungkan variabel pada button layout
        edemail = findViewById(R.id.user);
        edpassword = findViewById(R.id.pass);
        btndaftar = findViewById(R.id.btnregist);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), register.class);
                startActivity(i);
            }
        });

        btnsign.setOnClickListener(new View.OnClickListener() { // fungsi onklik
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString(); //nyimpan input user variabel nama
                password = edpassword.getText().toString();
                String email = "danisurhomie"; //untuk mengeset email yang benar
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { //untuk mengeset bahwa email dan password tidak boleh kosong
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);
                    edemail.setError("Email dan Password tidak boleh kosong"); //memberi set error bertulisan email dan password tidak boleh kosong
                    edpassword.setError("Email dan Password tidak boleh kosong");
                    t.show();

                } else {
                    //untuk ngecek apakah isi dari email dan pass sudah benar
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat variabel toast bertulisan login sukses
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        //masukkan value dan beri kunci a dan b
                        //dimasukkan kedalam bundle
                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        //untuk berpindah layout
                        Intent i = new Intent(getApplicationContext(), HomeActivity.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);

                        //memberi set error bertulisan login gagal
                        edemail.setError("Login Gagal");
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
        }
    }
