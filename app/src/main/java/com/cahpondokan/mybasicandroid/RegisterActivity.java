package com.cahpondokan.mybasicandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText edNama, edEmail, edPassword, edCpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edNama = findViewById(R.id.ed_nama);
        edEmail = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        edCpassword = findViewById(R.id.ed_cpassword);
    }

    public void onBtnSignClick(View view) {
        String nama = edNama.getText().toString();
        String email = edEmail.getText().toString();
        String pass = edPassword.getText().toString();
        String cpass = edCpassword.getText().toString();

        if (TextUtils.isEmpty(nama)){
            edNama.setError("Nama is requiered");
            edNama.requestFocus();
        } else if(TextUtils.isEmpty(email)){
            edEmail.setError("Email is requiered");
            edEmail.requestFocus();
        } else if(TextUtils.isEmpty(pass)){
            edPassword.setError("password is requiered");
            edCpassword.requestFocus();
        } else if (TextUtils.isEmpty(cpass)){
            edCpassword.setError("password is requiered");
            edCpassword.requestFocus();
        } else if (!pass.equalsIgnoreCase(cpass)){
            edCpassword.setError("Confirm password is'n math");
            edCpassword.requestFocus();
        } else {
            //kirim data ke profle
            Intent intent = new Intent(RegisterActivity.this,ProfileActivity.class);
            intent.putExtra("inama", nama);
            intent.putExtra("iemail", email);
            intent.putExtra("ipass", pass);
            startActivity(intent);
        }
    }
}
