package com.example.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DescricaoQuartaImagem extends AppCompatActivity {

    private Button btnButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_quarta_imagem);

        btnButton4 = findViewById(R.id.btnButton4);
        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://casadeapoiosaoluiz.org.br/")));
            }
        });

    }
}