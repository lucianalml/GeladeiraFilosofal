package com.llima.geladeirafilosofal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class OpenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// Esconde a barra com o nome do aplicativo
        getSupportActionBar().hide();

        setContentView(R.layout.activity_open);
    }
}
