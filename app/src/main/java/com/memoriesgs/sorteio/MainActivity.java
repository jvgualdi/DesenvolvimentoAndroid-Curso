package com.memoriesgs.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorteada(View view){

        Random numeroSorteio = new Random();
        TextView fraseSorteada = findViewById(R.id.fraseSorteada);
        fraseSorteada.setText("O número selecionado é: " + numeroSorteio.nextInt(10));

    }
}
