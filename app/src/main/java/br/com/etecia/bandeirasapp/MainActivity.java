package br.com.etecia.bandeirasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.com.etecia.bandeirasapp.Model.State;

public class MainActivity extends AppCompatActivity {


    private ListView statesList;

   State states [] = {
           new State("Pernambuco", "Pernambuco é uma das 27 unidades federativas do Brasil. Está localizado no centro-leste da região Nordeste e tem como limites os estados da Paraíba, do Ceará, de Alagoas, da Bahia e do Piauí, além de ser banhado pelo oceano Atlântico.", "98.312 km²", "9,278 milhões"),
           new State("Rio Grande do Norte", "Rio Grande do Norte é uma das 27 unidades federativas do Brasil. Está situado no nordeste da Região Nordeste e tem por limites o Oceano Atlântico a norte a leste, a Paraíba a sul e o Ceará a oeste.", "52.797 km²", "3,409 milhões"),
           new State("São Paulo", "São Paulo é uma das 27 unidades federativas do Brasil. Está situado na Região Sudeste e tem por limites os estados de Minas Gerais a norte e nordeste, Paraná a sul, Rio de Janeiro a leste e Mato Grosso do Sul a oeste, além do Oceano Atlântico a sudeste.", "248.209 km²", "44,04 milhões"),

   };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.statesList = findViewById(R.id.lstEstados);

        ArrayAdapter adapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            this.states
        );
        this.statesList.setAdapter(adapter);

    }
}
