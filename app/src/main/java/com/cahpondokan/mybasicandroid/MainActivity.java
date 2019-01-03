package com.cahpondokan.mybasicandroid;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


//public (modifier)
//class (tipe file/petunjuk class)
//MainActivity (nama Class)
//extends (penanda untuk mengambil sifat dari class superclass)
//AppCompatActivity (superclass)

public class MainActivity extends AppCompatActivity {
    //(variable declaration) variable ppenampung komponen tombol
    Button btnRegister, btnList, btnInput, btnDialog, btnWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tampilkan toast
        Toast.makeText(this, "Activity Stared", Toast.LENGTH_SHORT).show();
        //(variable initialitation) masukkan komponen de dalam variable
        btnRegister = findViewById(R.id.btnregister);
        btnDialog = findViewById(R.id.btndialog);
        btnList = findViewById(R.id.btnlistdata);
        btnInput = findViewById(R.id.btninput);
        btnWebView = findViewById(R.id.btnwebview);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // menjalankan perintah
                // untuk pindah activity (startActivity)
                // startActivity membutuhkan komponen dengan nama "Intent"
                // Intent : yang membawa alamatnya
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListActivity.class));
            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Keluar")
                        .setMessage("Yakin keluar dari aplikasi?")
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                .show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Activity Start", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_SHORT).show();
    }



}
// TODO: 12/15/2018 (tanggal aplikasi di buat)
// class : (krangka) yang terdiri dari banyak object untuk menjadi sebuah object baru (di awali huruf besar)
// object : (object) yang memiliki properti dan tingkah laku
// method : tingkah laku/ event/ pringtah untuk menamilkan sesuatu (biasanya di awali dengan huruf kecil)
// kalau mau memanggil method gunakan tanda titik (.)
// property : atribut dari sebuah object
// scope : ruang lingkup code, biasanya di dalam tanda {}
// super : menjalankan printah yang ada d dalam superclass
// @Override : penandan bhwa kita menjalankan perintah kita sendiri di dalam method superclass
// argument : (data) yang di butuhkan method atau (data) yang harus kita berikan kepada method
// parameter : (wadah) argument / sesuatu yang di butuhkan
// Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_SHORT).show();
// Class.method(parameter:argument, parameter :argument).
// variable : tempat / wadah penyimpanan data semantara
// aturan penulisan variable di sini adalah dengan menulis huruf kecil di awal dan huruf besar di awal kata berikutnya
//-----------------------------------------------
// cara membuat onClick ada 2 cara dasar :
// 1. lewat MainAcivity.java
// 2. lewat actifity_main.xml
