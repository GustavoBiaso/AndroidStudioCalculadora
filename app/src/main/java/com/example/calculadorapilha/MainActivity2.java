package com.example.calculadorapilha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("Fatorial");

        voltar = findViewById(R.id.button10);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void Calcular(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView7);
        int valor = Integer.parseInt(escrevendo.getText().toString());
        int i,fat=1;
        for( i = 2; i <= valor; i++ ){
            fat*=i;
        }
        Atualiza(fat);
    }

    public void Atualiza(int fat){
        TextView texto = (TextView) findViewById(R.id.textView12);
        texto.setText(Integer.toString(fat));
    }

}