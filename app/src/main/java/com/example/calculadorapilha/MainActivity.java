package com.example.calculadorapilha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Stack<Integer> stack1 = new Stack<Integer>();
    Button buttonFatorial, buttonPrimo, buttonFibonacci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFatorial=findViewById(R.id.button8);
        buttonPrimo=findViewById(R.id.button9);
        buttonFibonacci=findViewById(R.id.button7);

        buttonFatorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Fatorial = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(Fatorial);
            }
        });

        buttonPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Primo = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(Primo);
            }
        });

        buttonFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Fibonacci = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(Fibonacci);
            }
        });

    }

    public void Empilha(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView);
        int passando = Integer.parseInt(escrevendo.getText().toString());
        stack1.push(passando);
        Atualiza();
    }

    public void Desempilha(View view) {
        stack1.pop();
        Atualiza();
    }

    public void Mais(View view) {
        int elemento1 = (Integer) stack1.pop();
        int elemento2 = (Integer) stack1.pop();
        stack1.push( elemento1 + elemento2 );
        Atualiza();
    }

    public void Menos(View view) {
        int elemento3 = (Integer) stack1.pop();
        int elemento4 = (Integer) stack1.pop();
        stack1.push( elemento3 - elemento4 );
        Atualiza();
    }

    public void Multiplica(View view) {
        int elemento5 = (Integer) stack1.pop();
        int elemento6 = (Integer) stack1.pop();
        stack1.push( elemento5 * elemento6 );
        Atualiza();
    }

    public void Divide(View view) {
        int elemento7 = (Integer) stack1.pop();
        int elemento8 = (Integer) stack1.pop();
        stack1.push( elemento7 / elemento8 );
        Atualiza();
    }

    public void Atualiza(){
        TextView texto = (TextView) findViewById(R.id.textView3);
        texto.setText(stack1.toString());
    }


}