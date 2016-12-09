package com.example.ariel.calculoarea;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RetanguloActivity extends AppCompatActivity {

    EditText edAlturaR;
    EditText edBaseR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);

        edAlturaR = (EditText) findViewById(R.id.edAlturaR);
        edBaseR = (EditText) findViewById(R.id.edBaseR);
    }

    public void cliqueAvancarRetangulo(View origemDoClique){

        Intent abridor = new Intent(this.getApplicationContext(), ResultadoFinalActivity.class);
        String codigo = "Retângulo";

        if(edAlturaR.getText().toString().isEmpty()|| edBaseR.getText().toString().isEmpty()){
            Toast.makeText(RetanguloActivity.this.getApplicationContext(), "Insira Valor", Toast.LENGTH_SHORT).show();
        }else{
            String valorAltura = edAlturaR.getText().toString();
            String valorBase = edBaseR.getText().toString();

            Float altura = Float.parseFloat(valorAltura);
            Float base = Float.parseFloat(valorBase);

            Float resultado = altura * base;

            abridor.putExtra("Resultado",resultado);
            abridor.putExtra("Codigo",codigo);

            startActivity(abridor);

        }



    }


}
