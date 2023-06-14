package com.example.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AdminVisualizacao extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_visualizacao);

       ListView lista = (ListView) findViewById(R.id.listCategorias);

        ArrayList<String> equipes = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Instituição Miau auau");
        dados.add("Associação dos Surdos de Goiânia");
        dados.add("Instituição: Cuidadores De Pessoas");


        return dados;
    }

}