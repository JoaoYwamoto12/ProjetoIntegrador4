package com.example.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    EditText edtUsuario, edtSenha;
    Button btnLogin, btnPadrao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnPadrao = (Button) findViewById(R.id.btnPadrao);

        btnPadrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == btnPadrao){
                    startActivity(new Intent(TelaLogin.this, MainActivity.class));
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUsuario.getText().toString().equals("joao.ywamoto") && edtSenha.getText().toString().equals("12345"))
                    startActivity(new Intent(TelaLogin.this, AdminVisualizacao.class));
                else
                    Toast.makeText(TelaLogin.this, "Usuário ou Senha invalidos", Toast.LENGTH_SHORT).show();

            }
        });

    }
}