package com.example.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DescricaoTerceiraTela extends AppCompatActivity {

    private Button btnButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_terceira_tela);


        btnButton3 = findViewById(R.id.btnButton3);
        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://unidades.cuidarebr.com.br/bueno?gclid=CjwKCAjwp6CkBhB_EiwAlQVyxU95JCx-w_ErP6bwgk3D_m73dGY_FQGijCch-GolcsIc9HfWG176rBoCBXcQAvD_BwE")));
            }
        });

    }
}