package com.example.alunonota10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View v) {
        EditText nomeInput = findViewById(R.id.inpNome);
        String nome = nomeInput.getText().toString();

        EditText nota1Input = findViewById(R.id.inpNota1);
        String nota1Str = nota1Input.getText().toString();
        double nota1 = Double.parseDouble(nota1Str);

        EditText nota2Input = findViewById(R.id.inpNota2);
        String nota2Str = nota2Input.getText().toString();
        double nota2 = Double.parseDouble(nota2Str);

        EditText nota3Input = findViewById(R.id.inpNota3);
        String nota3Str = nota3Input.getText().toString();
        double nota3 = Double.parseDouble(nota3Str);

        EditText nota4Input = findViewById(R.id.inpNota4);
        String nota4Str = nota4Input.getText().toString();
        double nota4 = Double.parseDouble(nota4Str);

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resAprov = (media >= 6) ? "APROVADO" : "REPROVADO";

        String resFormat = String.format("\nO Aluno : %s \nTeve a média : %.1f%nE foi %s",nome, media, resAprov);

        TextView txtRes = findViewById(R.id.txtRes);
        txtRes.setText(resFormat);

    }
}
