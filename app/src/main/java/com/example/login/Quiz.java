package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz extends AppCompatActivity implements View.OnClickListener, Runnable{

    private String prova = "enem";
    private String categoria = "Linguagens, Códigos e suas Tecnologias";

    private TextView vidas, categoria_text, enunciado;
    private ProgressBar barra;
    private Button btn1, btn2, btn3, btn4, btn5, proximo;

    private ArrayList<Pergunta> lista;
    private int indice, contaAcerto, limitePerguntas;
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
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        proximo = (Button) findViewById(R.id.proximo);

        // Selecionar somente as questões cuja tabela seja = prova e cuja categoria seja = categoria

        // montar array com as questoes selecionadas

        limitePerguntas = 5; // mudar
        handler = new Handler();
        lista = new ArrayList<Pergunta>();
        carregaPerguntas();

        if(savedInstanceState != null){
            indice = savedInstanceState.getInt("chave");
        }
        else{
            indice = 0;
        }
        carregaPerguntanoDesign();
    }
    public void carregaPerguntas(){
        Pergunta a = new Pergunta();
        a.setPergunta("Qual a cor do cavalo branco de Napoleão?");
        a.setRes1("Branco");
        a.setRes2("Verde");
        a.setRes3("Azul");
        a.setRes4("Cinza");
        a.setRes5("Cinza");
        a.setResposta("Branco");
        lista.add(a);

        Pergunta b = new Pergunta();
        b.setPergunta("Quanto é 2 * 2: ");
        b.setRes1("1");
        b.setRes2("2");
        b.setRes3("3");
        b.setRes4("4");
        b.setRes5("4");
        b.setResposta("4");
        lista.add(b);

        Pergunta c = new Pergunta();
        c.setPergunta("Quanto é 5 - 2: ");
        c.setRes1("1");
        c.setRes2("2");
        c.setRes3("3");
        c.setRes4("4");
        c.setRes5("4");
        c.setResposta("3");
        lista.add(c);

        Pergunta d = new Pergunta();
        d.setPergunta("Quem foi o Rei Arthur?");
        d.setRes1("Principe");
        d.setRes2("Presidente");
        d.setRes3("Rei");
        d.setRes4("Desenvolvedor");
        d.setResposta("Rei");
        d.setRes5("4");
        lista.add(d);

        Pergunta e = new Pergunta();
        e.setPergunta("Em qual país fica o estado do pão de queijo Minas Gerais?");
        e.setRes1("Argentina");
        e.setRes2("EUA");
        e.setRes3("Brasil");
        e.setRes4("Itália");
        e.setResposta("Brasil");
        lista.add(e);

        Pergunta f = new Pergunta();
        f.setPergunta("Quanto é 1+1");
        f.setRes1("1");
        f.setRes2("11");
        f.setRes3("2");
        f.setRes4("12");
        f.setResposta("2");
        f.setRes5("4");
        lista.add(f);

        Pergunta g = new Pergunta();
        g.setPergunta("Quanto é 2 - 2: ");
        g.setRes1("0");
        g.setRes2("1");
        g.setRes3("2");
        g.setRes4("3");
        g.setRes5("4");
        g.setResposta("0");
        lista.add(g);

        Pergunta h = new Pergunta();
        h.setPergunta("Quanto é 6 / 2: ");
        h.setRes1("4");
        h.setRes2("3");
        h.setRes3("2");
        h.setRes4("1");
        h.setRes5("4");
        h.setResposta("3");
        lista.add(h);

        Pergunta i = new Pergunta();
        i.setPergunta("Quanto é 10 * 2:");
        i.setRes1("10");
        i.setRes2("5");
        i.setRes3("20");
        i.setRes4("40");
        i.setRes5("4");
        i.setResposta("20");
        lista.add(i);

        Pergunta j = new Pergunta();
        j.setPergunta("Quanto é 10 + 2");
        j.setRes1("5");
        j.setRes2("102");
        j.setRes3("12");
        j.setRes4("22");
        j.setRes5("4");
        j.setResposta("12");
        lista.add(j);
    }
    public void carregaPerguntanoDesign(){
        barra.setProgress(0);
        Collections.shuffle(lista);
        vidas.append(Integer.toString(contaAcerto));

        enunciado.setText(lista.get(indice).getPergunta());
        btn1.setText((lista.get(indice).getRes1()));
        btn2.setText((lista.get(indice).getRes2()));
        btn3.setText((lista.get(indice).getRes3()));
        btn4.setText((lista.get(indice).getRes4()));
        btn5.setText((lista.get(indice).getRes5()));

    }
    public void verificaResultado(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        proximo.setEnabled(false);

        if(textRadioSelecionado.compareToIgnoreCase(lista.get(indice).getResposta()) == 0){
            contaAcerto++;
        }
        barra.setProgress(barra.getProgress() + barra.getMax()/limitePerguntas);
        if(indice >= limitePerguntas ){
            //acabou o quiz e vai para outra tela e de lá redireciona para o jogo novamente.
        }
        else{
            handler.postDelayed(this,3000);
        }

    }

    @Override
    public void onClick(View view) {
        if(view == proximo){
            proximo.setEnabled(false);
            verificaResultado();
        }
        if(view == btn1){
            textRadioSelecionado = (String) btn1.getText();
        }
        if(view == btn2){
            textRadioSelecionado = (String) btn2.getText();
        }
        if(view == btn3){
            textRadioSelecionado = (String) btn3.getText();
        }
        if(view == btn4){
            textRadioSelecionado = (String) btn4.getText();
        }
        if(view == btn5){
            textRadioSelecionado = (String) btn5.getText();
        }
    }

    @Override
    public void run() {

    }
}