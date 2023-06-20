package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz extends AppCompatActivity implements View.OnClickListener, Runnable{

    private String prova = "enem";
    private String categoria = "Matemática e suas Tecnologias";

    private TextView vidas, categoria_text, enunciado;
    private ProgressBar barra;
    private Button btn1, btn2, btn3, btn4, btn5, proximo;

    private ArrayList<Pergunta> ListaObmep;
    private ArrayList<Pergunta> ListaEnem;
    private ArrayList<Pergunta> ListaAux;

    private int indice, contaAcerto = 5 , limitePerguntas;
    private String mod1, mod2, textRadioSelecionado;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        vidas = (TextView) findViewById(R.id.vidas);
        categoria_text = (TextView) findViewById(R.id.categoria_text);
        enunciado = (TextView) findViewById(R.id.enunciado);

        barra = (ProgressBar) findViewById(R.id.barra);

        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        proximo = (Button) findViewById(R.id.proximo);
        proximo.setOnClickListener(this);

        // Selecionar somente as questões cuja tabela seja = prova e cuja categoria seja = categoria

        // montar array com as questoes selecionadas

        handler = new Handler();
        ListaObmep = new ArrayList<Pergunta>();
        ListaEnem = new ArrayList<Pergunta>();
        ListaAux = new ArrayList<Pergunta>();
        Utils util  = new Utils();
        ListaEnem = util.getListaEnem();
        ListaObmep = util.getListaObmep();

        if(prova.equals("enem")){
            for (Pergunta elemento : ListaEnem) {
                if(elemento.getCategoria().equals(categoria))
                ListaAux.add(elemento);
            }
        }else{
            for (Pergunta elemento : ListaObmep) {
                if(elemento.getCategoria().equals(categoria))
                ListaAux.add(elemento);
            };
        }
        limitePerguntas = ListaAux.size(); // mudar pra lista.lenght

        //ListaAux = ListaObmep;

        if(savedInstanceState != null){
            indice = savedInstanceState.getInt("chave");
        }
        else{
            indice = 0;
        }
        carregaPerguntanoDesign();
    }

    public void verificaResultado(){
        Log.d("##",textRadioSelecionado);
        if(textRadioSelecionado.compareToIgnoreCase(ListaObmep.get(indice).getResposta()) == 0){
            contaAcerto++;
        }else{
            contaAcerto--;
        }
        vidas.setText(Integer.toString(contaAcerto));
        barra.setProgress(barra.getProgress() + barra.getMax()/limitePerguntas);
        if(indice >= limitePerguntas ){
            //acabou o quiz e vai para outra tela e de lá redireciona para o jogo novamente.
        }
        else{
            handler.postDelayed(this,200);
        }

    }
    public void carregaPerguntanoDesign(){
        barra.setProgress(0);
        Collections.shuffle(ListaAux);
        vidas.setText(Integer.toString(contaAcerto));
        categoria_text.setText(categoria);

        enunciado.setText(ListaAux.get(indice).getPergunta());
        btn1.setText((ListaAux.get(indice).getRes1()));
        btn2.setText((ListaAux.get(indice).getRes2()));
        btn3.setText((ListaAux.get(indice).getRes3()));
        btn4.setText((ListaAux.get(indice).getRes4()));
        btn5.setText((ListaAux.get(indice).getRes5()));

    }
    @Override
    public void onClick(View view) {
        if(view == proximo){
            verificaResultado();
        }
        if(view == btn1){
            textRadioSelecionado = (String) btn1.getText();
            btn1.setTextColor(Color.RED);
            btn2.setTextColor(Color.WHITE);
            btn3.setTextColor(Color.WHITE);
            btn4.setTextColor(Color.WHITE);
            btn5.setTextColor(Color.WHITE);
        }
        if(view == btn2){
            textRadioSelecionado = (String) btn2.getText();
            btn1.setTextColor(Color.WHITE);
            btn2.setTextColor(Color.RED);
            btn3.setTextColor(Color.WHITE);
            btn4.setTextColor(Color.WHITE);
            btn5.setTextColor(Color.WHITE);
        }
        if(view == btn3){
            textRadioSelecionado = (String) btn3.getText();
            btn1.setTextColor(Color.WHITE);
            btn2.setTextColor(Color.WHITE);
            btn3.setTextColor(Color.RED);
            btn4.setTextColor(Color.WHITE);
            btn5.setTextColor(Color.WHITE);
        }
        if(view == btn4){
            textRadioSelecionado = (String) btn4.getText();
            btn1.setTextColor(Color.WHITE);
            btn2.setTextColor(Color.WHITE);
            btn3.setTextColor(Color.WHITE);
            btn4.setTextColor(Color.RED);
            btn5.setTextColor(Color.WHITE);
        }
        if(view == btn5){
            textRadioSelecionado = (String) btn5.getText();
            btn1.setTextColor(Color.WHITE);
            btn2.setTextColor(Color.WHITE);
            btn3.setTextColor(Color.WHITE);
            btn4.setTextColor(Color.WHITE);
            btn5.setTextColor(Color.RED);
        }
    }

    @Override
    public void run() {
        indice ++;
        enunciado.setText(ListaAux.get(indice).getPergunta());
        btn1.setText((ListaAux.get(indice).getRes1()));
        btn2.setText((ListaAux.get(indice).getRes2()));
        btn3.setText((ListaAux.get(indice).getRes3()));
        btn4.setText((ListaAux.get(indice).getRes4()));
        btn5.setText((ListaAux.get(indice).getRes5()));
        btn1.setTextColor(Color.WHITE);
        btn2.setTextColor(Color.WHITE);
        btn3.setTextColor(Color.WHITE);
        btn4.setTextColor(Color.WHITE);
        btn5.setTextColor(Color.WHITE);
    }
}