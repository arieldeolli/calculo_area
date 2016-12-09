package com.example.ariel.calculoarea;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final);

        Float resultadoFinal = getIntent().getFloatExtra("Resultado",-1);
        String recebeCodigo = getIntent().getStringExtra("Codigo");

        TextView tvResultadoFinal = (TextView) findViewById(R.id.tvResultadoFinal);
        tvResultadoFinal.setText("Area do "+recebeCodigo+" "+resultadoFinal.toString()+" cm²");

        ImageView imEscolhefigura = (ImageView)findViewById(R.id.imEscolhefigura);

        if(recebeCodigo.equals("Retângulo")){
            imEscolhefigura.setImageResource(R.drawable.retangulo);

        }else if(recebeCodigo.equals("Círculo")){
            imEscolhefigura.setImageResource(R.drawable.circulo);
        }else{
            imEscolhefigura.setImageResource(R.drawable.triangulo);
        }
    }

    public void cliqueVoltar(View origemDoClique){
        Intent abridor = new Intent(this.getApplicationContext(), MainActivity.class);
        abridor.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(abridor);

        finish();

    }
}
