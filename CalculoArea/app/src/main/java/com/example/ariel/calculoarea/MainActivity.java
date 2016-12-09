package com.example.ariel.calculoarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RadioGroup rgFigura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgFigura = (RadioGroup) findViewById(R.id.rgFigura);

    }

    public void escolheFigura(View origemDoClique){

       /* Intent abridor = new Intent(getApplicationContext(),RetanguloActivity.class);
        startActivity(abridor);*/

        int idRBSelecionado = rgFigura.getCheckedRadioButtonId();

        if(idRBSelecionado == -1){
            Toast.makeText(MainActivity.this.getApplicationContext(), "Selecione uma opção", Toast.LENGTH_SHORT).show();

        }else{

            RadioButton opcaoSelecionada = (RadioButton) findViewById(idRBSelecionado);

            if(opcaoSelecionada.getText().toString().equals("Retângulo")){
                Intent abridor = new Intent(this, RetanguloActivity.class);
                startActivity(abridor);

            }else if(opcaoSelecionada.getText().toString().equals("Triângulo")){
                Intent abridor = new Intent(this, TrianguloActivity.class);
                startActivity(abridor);

            }else{
                Intent abridor = new Intent(this, CirculoActivity.class);
                startActivity(abridor);
            }

        }



    }
}

