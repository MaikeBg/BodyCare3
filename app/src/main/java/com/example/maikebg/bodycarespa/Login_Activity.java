package com.example.maikebg.bodycarespa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void ClickEntrar(View view) {
        Intent intent = new Intent(Login_Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
