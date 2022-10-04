package com.ramirez.gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno, cont, conta=0;
    String letra;

    EditText Et_ganador;

    Integer c=0;
    Button btniveluno, btniveldos,btniveltres,
            btnivelcuatro,btnivelcinco,btnivelseis,
            btnivelsiete,btnivelocho,btnivelnueve,
            Btn_salir, Btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_ganador=(EditText)findViewById(R.id.Et_ganador);

        btniveluno=(Button) (findViewById(R.id.btniveluno));
        btniveldos=(Button) (findViewById(R.id.btniveldos));
        btniveltres=(Button) (findViewById(R.id.btniveltres));
        btnivelcuatro=(Button) (findViewById(R.id.btnivelcuatro));
        btnivelcinco=(Button) (findViewById(R.id.btnivelcinco));
        btnivelseis=(Button) (findViewById(R.id.btnivelseis));
        btnivelsiete=(Button) (findViewById(R.id.btnivelsiete));
        btnivelocho=(Button) (findViewById(R.id.btnivelocho));
        btnivelnueve=(Button) (findViewById(R.id.btnivelnueve));
        Btn_salir=(Button)(findViewById(R.id.Btn_salir));
        Btn_reset=(Button)(findViewById(R.id.Btn_reset));

        btniveluno.setOnClickListener(this);
        btniveldos.setOnClickListener(this);
        btniveltres.setOnClickListener(this);
        btnivelcuatro.setOnClickListener(this);
        btnivelcinco.setOnClickListener(this);
        btnivelseis.setOnClickListener(this);
        btnivelsiete.setOnClickListener(this);
        btnivelocho.setOnClickListener(this);
        btnivelnueve.setOnClickListener(this);
        Btn_reset.setOnClickListener(this);
        Btn_salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        cont++;
        turno = cont%2;

        //Jugador 1 X
        if (turno == 1){
            imprimirXO('X', v);
        }

        //Jugador 2 O
        else{
            imprimirXO('O', v);
        }

    }

    public void imprimirXO(char letra, View v)
    {
        if (v.getId() == R.id.Btn_reset){
            Et_ganador.setEnabled(true);
            Et_ganador.setText("");

            btniveluno.setEnabled(true);
            btniveluno.setText("");

            btniveldos.setEnabled(true);
            btniveldos.setText("");

            btniveltres.setEnabled(true);
            btniveltres.setText("");

            btnivelcuatro.setEnabled(true);
            btnivelcuatro.setText("");

            btnivelcinco.setEnabled(true);
            btnivelcinco.setText("");

            btnivelseis.setEnabled(true);
            btnivelseis.setText("");

            btnivelsiete.setEnabled(true);
            btnivelsiete.setText("");

            btnivelocho.setEnabled(true);
            btnivelocho.setText("");

            btnivelnueve.setEnabled(true);
            btnivelnueve.setText("");
        }

        if (v.getId() == R.id.Btn_salir){
            System.exit(0);

        }

        if(v.getId() == R.id.btniveluno){
            btniveluno.setText(letra+"");
            btniveluno.setEnabled(false);
        }//Cierro if
        else if (v.getId() == R.id.btniveldos){
            btniveldos.setText(letra+"");
            btniveldos.setEnabled(false);
        }
        else if (v.getId() == R.id.btniveltres){
            btniveltres.setText(letra+"");
            btniveltres.setEnabled(false);
        }
        else if (v.getId() == R.id.btnivelcuatro){
            btnivelcuatro.setText(letra+"");
            btnivelcuatro.setEnabled(false);
        }
        else if (v.getId() == R.id.btnivelcinco){
            btnivelcinco.setText(letra+"");
            btnivelcinco.setEnabled(false);
        }
        else if (v.getId() == R.id.btnivelseis){
            btnivelseis.setText(letra+"");
            btnivelseis.setEnabled(false);
        }
        else if (v.getId() == R.id.btnivelsiete){
            btnivelsiete.setText(letra+"");
            btnivelsiete.setEnabled(false);
        }
        else if (v.getId() == R.id.btnivelocho){
            btnivelocho.setText(letra+"");
            btnivelocho.setEnabled(false);
        }
        else {
            btnivelnueve.setText(letra+"");
            btnivelnueve.setEnabled(false);
        }

        Ganador(letra);
    }

    public void Ganador(char letra){
        if (btniveluno.getText().toString().equals(letra+"") && (btniveldos.getText().toString().equals(letra+"")) && (btniveltres.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelcinco.setEnabled(false);
            btnivelseis.setEnabled(false);
            btnivelsiete.setEnabled(false);
            btnivelocho.setEnabled(false);
            btnivelnueve.setEnabled(false);
        }
        else if (btnivelcuatro.getText().toString().equals(letra+"") && (btnivelcinco.getText().toString().equals(letra+"")) && (btnivelseis.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveluno.setEnabled(false);
            btniveldos.setEnabled(false);
            btniveltres.setEnabled(false);
            btnivelsiete.setEnabled(false);
            btnivelocho.setEnabled(false);
            btnivelnueve.setEnabled(false);
        }
        else if (btnivelsiete.getText().toString().equals(letra+"") && (btnivelocho.getText().toString().equals(letra+"")) && (btnivelnueve.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveluno.setEnabled(false);
            btniveldos.setEnabled(false);
            btniveltres.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelcinco.setEnabled(false);
            btnivelseis.setEnabled(false);
        }
        else if (btniveluno.getText().toString().equals(letra+"") && (btnivelcuatro.getText().toString().equals(letra+"")) && (btnivelsiete.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveldos.setEnabled(false);
            btniveltres.setEnabled(false);
            btnivelcinco.setEnabled(false);
            btnivelseis.setEnabled(false);
            btnivelocho.setEnabled(false);
            btnivelnueve.setEnabled(false);
        }

        else if (btniveldos.getText().toString().equals(letra+"") && (btnivelcinco.getText().toString().equals(letra+"")) && (btnivelocho.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveluno.setEnabled(false);
            btniveltres.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelseis.setEnabled(false);
            btnivelsiete.setEnabled(false);
            btnivelnueve.setEnabled(false);
        }

        else if (btniveltres.getText().toString().equals(letra+"") && (btnivelseis.getText().toString().equals(letra+"")) && (btnivelnueve.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveluno.setEnabled(false);
            btniveldos.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelcinco.setEnabled(false);
            btnivelsiete.setEnabled(false);
            btnivelocho.setEnabled(false);
        }

        else if (btniveluno.getText().toString().equals(letra+"") && (btnivelcinco.getText().toString().equals(letra+"")) && (btnivelnueve.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveldos.setEnabled(false);
            btniveltres.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelseis.setEnabled(false);
            btnivelsiete.setEnabled(false);
            btnivelocho.setEnabled(false);
        }

        else if (btniveltres.getText().toString().equals(letra+"") && (btnivelcinco.getText().toString().equals(letra+"")) && (btnivelsiete.getText().toString().equals(letra+""))){
            Et_ganador.setText("El ganador es " + letra);
            Et_ganador.setEnabled(false);
            btniveluno.setEnabled(false);
            btniveldos.setEnabled(false);
            btnivelcuatro.setEnabled(false);
            btnivelseis.setEnabled(false);
            btnivelocho.setEnabled(false);
            btnivelnueve.setEnabled(false);
        }else if (conta<9){
            conta++;
        }else {
            Et_ganador.setText("EMPATE");
        }
    }


}