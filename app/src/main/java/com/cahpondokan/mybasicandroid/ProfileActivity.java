package com.cahpondokan.mybasicandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class ProfileActivity extends AppCompatActivity {

    TextView txtNama, txtEmail, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtNama = findViewById(R.id.txt_nama);
        txtEmail = findViewById(R.id.txt_email);
        txtPass = findViewById(R.id.txt_password);

        Intent intent =getIntent();
        txtNama.setText(intent.getStringExtra("inama"));
        txtEmail.setText(intent.getStringExtra("iemail"));
        txtPass.setText(intent.getStringExtra("ipass"));

        txtPass.setVisibility(View.GONE);

    }

    public void onShowPassClick(View view) {
        txtPass.setVisibility(View.VISIBLE);
    }
}
