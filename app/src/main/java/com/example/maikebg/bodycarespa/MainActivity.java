package com.example.maikebg.bodycarespa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    mTextMessage.setText(R.string.hom);
                    return true;
                case R.id.nav_Agendar:
                    Intent intent = new Intent(MainActivity.this,Agendar_Activity.class);
                    startActivity(intent);
                case R.id.nav_notificacoes:
                    mTextMessage.setText(com.example.maikebg.bodycarespa.R.string.dev);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void QuickClick(View view) {
        Intent intent = new Intent(MainActivity.this,Quick_Activity.class);
        startActivity(intent);
    }

    public void AuriculoClick(View view) {
        Intent intent = new Intent(MainActivity.this,Auriculo_Activity.class);
        startActivity(intent);
    }

    public void VentosaClick(View view) {
        Intent intent = new Intent(MainActivity.this,Ventosa_Activity.class);
        startActivity(intent);
    }

    public void ReflexologiaClick(View view) {
        Intent intent = new Intent(MainActivity.this,Reflexologia_Activity.class);
        startActivity(intent);
    }

    public void DoinClick(View view) {
        Intent intent = new Intent(MainActivity.this,Doin_Activity.class);
        startActivity(intent);
    }

    public void AgendarClick(View view) {
        Intent intent = new Intent(MainActivity.this,Agendar_Activity.class);
        startActivity(intent);
    }

    public void ContatoClick(View view) {
        Toast.makeText(MainActivity.this,"In construction",Toast.LENGTH_SHORT).show();
    }

}

