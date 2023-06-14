package com.example.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgButton;
    ImageButton imgButton2;

    ImageButton imgButton3;

    ImageButton imgButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButton = findViewById(R.id.imgButton);
        imgButton.setOnClickListener(this);
        imgButton2 = findViewById(R.id.imgButton2);
        imgButton2.setOnClickListener(this);
        imgButton3 = findViewById(R.id.imgButton3);
        imgButton3.setOnClickListener(this);
        imgButton4 = findViewById(R.id.imgButton4);
        imgButton4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == imgButton){
            Intent intent = new Intent(this, DescricaoPrimeiraTela.class);
            startActivity(intent);
        }
        else if (view == imgButton2) {
            Intent intent = new Intent(this, DescricaoSegundaTela.class);
            startActivity(intent);
        }
        else if (view == imgButton3) {
            Intent intent = new Intent(this, DescricaoTerceiraTela.class);
            startActivity(intent);
        }
        else if (view == imgButton4) {
            Intent intent = new Intent(this, DescricaoQuartaImagem.class);
            startActivity(intent);
        }
    }
}