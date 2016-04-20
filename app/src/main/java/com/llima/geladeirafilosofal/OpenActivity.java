package com.llima.geladeirafilosofal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class OpenActivity extends AppCompatActivity {

    private Firebase mRef;
    TextView mTvFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// Esconde a barra com o nome do aplicativo
        getSupportActionBar().hide();

        setContentView(R.layout.activity_open);

        setUI();
        setActions();

        mRef = new Firebase("https://geladeira-filosofal.firebaseio.com/geladeira-filosofal/frases/1");

//        mTvFrase.setText(mRef.getKey().toString());

    }

    private void setUI(){
        mTvFrase = (TextView) findViewById(R.id.tv_frase);
    }

    private void setActions(){
    }

}
