package br.com.etecia.bandeirasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.etecia.bandeirasapp.Model.State;

public class MainActivity extends AppCompatActivity {


   State states [] = {new State("", "", "", "")};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
