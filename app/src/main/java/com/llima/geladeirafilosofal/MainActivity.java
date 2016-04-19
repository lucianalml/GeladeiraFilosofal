package com.llima.geladeirafilosofal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mGeladeira;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// Esconde a barra com o nome do aplicativo
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        setUI();
        setActions();

    }

    private void setUI(){

        mGeladeira = (ImageView) findViewById(R.id.iv_geladeira_fechada);

    }

    private void setActions(){

        mGeladeira.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                abrirGeladeira(v);
            }
        });
    }

    private void abrirGeladeira(View v) {
        Intent intent = new Intent(this, OpenActivity.class);
        startActivity(intent);

    }


}
