package com.example.calculadorapilha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("Primo");

        voltar = findViewById(R.id.button11);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void Calcular(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView8);
        int valor = Integer.parseInt(escrevendo.getText().toString());
        TextView texto = (TextView) findViewById(R.id.textView14);
        int contador=0,i;
        for(i=1;i<=valor;i++){
            if(valor%i==0){
                contador = 1+contador;
            }
        }
        if(contador==2){
            texto.setText("O número "+ valor +" é primo!");
        }else{
            texto.setText("O número "+ valor +" não é primo!");
        }
    }
}