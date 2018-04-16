package com.example.maikebg.bodycarespa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Doin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doin_layout);
    }

    public void HomeClick(View view) {
        Intent intent = new Intent(Doin_Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void AgendarClick(View view) {
        Toast.makeText(Doin_Activity.this,"In contruction",Toast.LENGTH_SHORT).show();
    }
}
