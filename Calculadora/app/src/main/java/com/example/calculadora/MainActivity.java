package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnCero,
            btnMr,btnDiezPor,btnEe,btnRand,btnLogDiez,btnC,btnMasMenos,btnPorcentaje,
    btnDividir,btnMultiplicar,btnSumar,btnRestar,btnIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
        accionesHorizontal();}
    }

    private void accionesHorizontal() {
        btnMr.setOnClickListener(this);
        btnDiezPor.setOnClickListener(this::onClick);
        btnEe.setOnClickListener(this::onClick);
        btnRand.setOnClickListener(this::onClick);
        btnLogDiez.setOnClickListener(this::onClick);

    }

    private void acciones() {
        btnUno.setOnClickListener(this::onClick);
        btnDos.setOnClickListener(this::onClick);
        btnTres.setOnClickListener(this::onClick);
        btnCuatro.setOnClickListener(this::onClick);
        btnCinco.setOnClickListener(this::onClick);
        btnSeis.setOnClickListener(this::onClick);
        btnSiete.setOnClickListener(this::onClick);
        btnOcho.setOnClickListener(this::onClick);
        btnNueve.setOnClickListener(this::onClick);
        btnCero.setOnClickListener(this::onClick);
        btnC.setOnClickListener(this::onClick);
        btnMasMenos.setOnClickListener(this);
        btnPorcentaje.setOnClickListener(this::onClick);
        btnDividir.setOnClickListener(this::onClick);
        btnMultiplicar.setOnClickListener(this::onClick);
        btnRestar.setOnClickListener(this::onClick);
        btnSumar.setOnClickListener(this::onClick);
        btnIgual.setOnClickListener(this::onClick);


    }

    private void instancias() {
        btnCero=findViewById(R.id.btn_cero);
        btnUno=findViewById(R.id.btn_uno);
        btnDos=findViewById(R.id.btn_dos);
        btnTres=findViewById(R.id.btn_tres);
        btnCuatro=findViewById(R.id.btn_cuatro);
        btnCinco=findViewById(R.id.btn_cinco);
        btnSeis=findViewById(R.id.btn_seis);
        btnSiete=findViewById(R.id.btn_siete);
        btnOcho=findViewById(R.id.btn_ocho);
        btnNueve=findViewById(R.id.btn_nueve);
        btnMr=findViewById(R.id.btn_MR);
        btnDiezPor=findViewById(R.id.btn_diez_por);
        btnEe=findViewById(R.id.btn_ee);
        btnRand=findViewById(R.id.rand);
        btnLogDiez=findViewById(R.id.btn_log);
        btnC=findViewById(R.id.btn_C);
        btnMasMenos=findViewById(R.id.btn_mas_menos);
        btnPorcentaje=findViewById(R.id.btn_porcentaje);
        btnDividir=findViewById(R.id.btn_dividir);
        btnMultiplicar=findViewById(R.id.btn_multiplicar);
        btnSumar=findViewById(R.id.btn_mas);
        btnRestar=findViewById(R.id.btn_menos);
        btnIgual=findViewById(R.id.btn_igual);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.btn_uno:

                break;
            case R.id.btn_dos:

                break;
            case R.id.btn_tres:

                break;
            case R.id.btn_cuatro:

                break;
            case R.id.btn_cinco:

                break;
            case R.id.btn_seis:

                break;
            case R.id.btn_siete:

                break;
            case R.id.btn_ocho:

                break;
            case R.id.btn_nueve:

                break;

            case R.id.btn_cero:

                break;
                

        }
    }
}