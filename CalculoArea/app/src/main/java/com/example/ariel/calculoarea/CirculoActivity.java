package com.example.ariel.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CirculoActivity extends AppCompatActivity {

    EditText edRaio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        edRaio = (EditText) findViewById(R.id.edRaio);
    }

    public void cliqueAvancarCirculo(View origemDoClique){

        Intent abridor = new Intent(this.getApplicationContext(), ResultadoFinalActivity.class);
        String codigo = "Círculo";

        if(edRaio.getText().toString().isEmpty()) {
            Toast.makeText(CirculoActivity.this.getApplicationContext(), "Insira Valor", Toast.LENGTH_SHORT).show();
        }else {
            String valor = edRaio.getText().toString();
            Float valorEmFloat = Float.parseFloat(valor);
            float areaCirculo = (float) (Math.PI * Math.pow(valorEmFloat, 2));

            abridor.putExtra("Resultado", areaCirculo);
            abridor.putExtra("Codigo", codigo);


            startActivity(abridor);
        }

    }



}