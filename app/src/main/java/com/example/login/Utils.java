package com.example.login;

import java.util.ArrayList;
import java.util.Collections;

public class Utils {
    private ArrayList<Pergunta> ListaObmep = new ArrayList<Pergunta>();

    private ArrayList<Pergunta> ListaEnem = new ArrayList<Pergunta>();

    public Utils(){
        carregaPerguntas();
    }


    public ArrayList<Pergunta> getListaObmep() {
        return ListaObmep;
    }

    public void setListaObmep(ArrayList<Pergunta> listaObmep) {
        ListaObmep = listaObmep;
    }


    public ArrayList<Pergunta> getListaEnem() {
        return ListaEnem;
    }

    public void setListaEnem(ArrayList<Pergunta> listaEnem) {
        ListaEnem = listaEnem;
    }
    public void carregaPerguntas(){
        // Consulta 1
        Pergunta pergunta1 = new Pergunta();
        pergunta1.setCategoria("NIVEL 1");
        pergunta1.setPergunta("Ana, Cláudia, Joaquim, Pedro e Fabiana se esconderam durante uma brincadeira. Nessa brincadeira, havia exatamente duas crianças na casa da árvore; Pedro, que nasceu em São Paulo, se escondeu junto com Fabiana; uma menina se escondeu sozinha; Ana não estava sozinha em seu esconderijo; O menino pernambucano estava na casa da árvore. Quem estava na casa da árvore?");
        pergunta1.setRes1("Pedro e Fabiana.");
        pergunta1.setRes2("Joaquim e Cláudia.");
        pergunta1.setRes3("Ana e Joaquim.");
        pergunta1.setRes4("Pedro e Ana.");
        pergunta1.setRes5("Cláudia e Fabiana.");
        pergunta1.setResposta("Ana e Joaquim.");
        pergunta1.setUrl("");
        ListaObmep.add(pergunta1);

        // Consulta 2
        Pergunta pergunta2 = new Pergunta();
        pergunta2.setCategoria("NIVEL 1");
        pergunta2.setPergunta("Um grupo de meninos e meninas brinca de roda. Nessa roda 7 meninas têm uma menina à sua direita; 9 meninas têm um menino à sua direita; 2/5 dos meninos têm um menino à sua esquerda. Quantas crianças há nesse grupo?");
        pergunta2.setRes1("29");
        pergunta2.setRes2("30");
        pergunta2.setRes3("31");
        pergunta2.setRes4("32");
        pergunta2.setRes5("33");
        pergunta2.setResposta("31");
        pergunta2.setUrl("");
        ListaObmep.add(pergunta2);

        // Consulta 3
        Pergunta pergunta3 = new Pergunta();
        pergunta3.setCategoria("NIVEL 1");
        pergunta3.setPergunta("Após uma divisão de maçãs pelos 3 casais de irmãos, Ana pegou uma maçã, Bete pegou duas e Carla pegou três. Diogo pegou a mesma quantidade de maçãs que sua irmã pegou, Edson pegou o dobro do que sua irmã pegou e Fábio pegou o quádruplo do que sua irmã pegou. Sabendo que Fábio pegou menos maçãs do que Edson, quantas maçãs ao todo Diogo, Edson e Fábio pegaram?");
        pergunta3.setRes1("11");
        pergunta3.setRes2("12");
        pergunta3.setRes3("13");
        pergunta3.setRes4("15");
        pergunta3.setRes5("16");
        pergunta3.setResposta("12");
        pergunta3.setUrl("");
        ListaObmep.add(pergunta3);

        // Consulta 4
        Pergunta pergunta4 = new Pergunta();
        pergunta4.setCategoria("NIVEL 1");
        pergunta4.setPergunta("Ana é irmã de Bruno. Bruno é irmão de Carlos. Carlos é irmão de Dulce. Dulce é irmã de Eliana. O senhor Fábio e a dona Geralda têm somente esses filhos. Quantas irmãs tem Dulce?");
        pergunta4.setRes1("Nenhuma");
        pergunta4.setRes2("Uma");
        pergunta4.setRes3("Duas");
        pergunta4.setRes4("Três");
        pergunta4.setRes5("Quatro");
        pergunta4.setResposta("Duas");
        pergunta4.setUrl("");
        ListaObmep.add(pergunta4);

        // Consulta 5
        Pergunta pergunta5 = new Pergunta();
        pergunta5.setCategoria("NIVEL 2");
        pergunta5.setPergunta("Joana é a sétima pessoa de uma fila. Geraldo é a penúltima pessoa da mesma fila. Entre Joana e Geraldo há outras 12 pessoas. Quantas pessoas estão nessa fila?");
        pergunta5.setRes1("19");
        pergunta5.setRes2("20");
        pergunta5.setRes3("21");
        pergunta5.setRes4("22");
        pergunta5.setRes5("23");
        pergunta5.setResposta("19");
        pergunta5.setUrl("");
        ListaObmep.add(pergunta5);

        // Consulta 6
        Pergunta pergunta6 = new Pergunta();
        pergunta6.setCategoria("NIVEL 2");
        pergunta6.setPergunta("Daniel tem um pacote com 18 lápis. Ele dividiu igualmente todos os lápis entre todos os seus amigos. Qual número a seguir NÃO pode ser a quantidade de amigos de Daniel?");
        pergunta6.setRes1("2");
        pergunta6.setRes2("3");
        pergunta6.setRes3("4");
        pergunta6.setRes4("6");
        pergunta6.setRes5("9");
        pergunta6.setResposta("4");
        pergunta6.setUrl("");
        ListaObmep.add(pergunta6);

        // Consulta 7
        Pergunta pergunta7 = new Pergunta();
        pergunta7.setCategoria("NIVEL 2");
        pergunta7.setPergunta("A cada vez que Pinóquio mente, seu nariz cresce 6 cm e a cada vez que diz a verdade, seu nariz diminui 2 cm. Quando seu nariz estava com 4 cm, ele disse algumas mentiras e 3 verdades. Seu nariz está agora com 16 cm. Quantas mentiras ele contou?");
        pergunta7.setRes1("2");
        pergunta7.setRes2("3");
        pergunta7.setRes3("4");
        pergunta7.setRes4("5");
        pergunta7.setRes5("6");
        pergunta7.setResposta("3");
        pergunta7.setUrl("");
        ListaObmep.add(pergunta7);

        // Consulta 8
        Pergunta pergunta8 = new Pergunta();
        pergunta8.setCategoria("NIVEL 2");
        pergunta8.setPergunta("Marco tem as 3 moedas de 5, 10 e 50 centavos. Quantas quantias diferentes ele pode pagar usando uma ou mais dessas moedas?");
        pergunta8.setRes1("3");
        pergunta8.setRes2("4");
        pergunta8.setRes3("7");
        pergunta8.setRes4("10");
        pergunta8.setRes5("15");
        pergunta8.setResposta("7");
        pergunta8.setUrl("");
        ListaObmep.add(pergunta8);

// Consulta 9
        Pergunta pergunta9 = new Pergunta();
        pergunta9.setCategoria("NIVEL 2");
        pergunta9.setPergunta("Numa brincadeira de adivinhar, Ana pensa num número de 3 algarismos diferentes de zero e dá algumas informações sobre esse número. i. Todos os algarismos são pares e diferentes entre si. ii. O algarismo da unidade é a soma dos outros 2 algarismos. Beto acha corretamente todas as possibilidades e escolhe uma delas. Qual é a chance de ele acertar o número pensado por Ana?");
        pergunta9.setRes1("1 em 4");
        pergunta9.setRes2("1 em 3");
        pergunta9.setRes3("1 em 2");
        pergunta9.setRes4("1 em 5");
        pergunta9.setRes5("1 em 6");
        pergunta9.setResposta("1 em 4");
        pergunta9.setUrl("");
        ListaObmep.add(pergunta9);

// Consulta 10
        Pergunta pergunta10 = new Pergunta();
        pergunta10.setCategoria("NIVEL 2");
        pergunta10.setPergunta("Um balão carrega um cesto que contém até 80 quilos de carga. Dois balões ligados a um cesto igual ao primeiro carregam até 180 quilos de carga. Quanto pesa o cesto?");
        pergunta10.setRes1("10 quilos");
        pergunta10.setRes2("20 quilos");
        pergunta10.setRes3("30 quilos");
        pergunta10.setRes4("40 quilos");
        pergunta10.setRes5("50 quilos");
        pergunta10.setResposta("20 quilos");
        pergunta10.setUrl("");
        ListaObmep.add(pergunta10);

// Consulta 11
        Pergunta pergunta11 = new Pergunta();
        pergunta11.setCategoria("NIVEL 2");
        pergunta11.setPergunta("Num torneio de futebol, o vencedor de cada partida ganha 3 pontos e o perdedor fica com 0. Em caso de empate, cada time fica com 1 ponto. Um time jogou 38 partidas e ganhou 80 pontos. No máximo, quantas partidas esse time perdeu?");
        pergunta11.setRes1("6");
        pergunta11.setRes2("7");
        pergunta11.setRes3("8");
        pergunta11.setRes4("9");
        pergunta11.setRes5("10");
        pergunta11.setResposta("10");
        pergunta11.setUrl("");
        ListaObmep.add(pergunta11);

// Consulta 12
        Pergunta pergunta12 = new Pergunta();
        pergunta12.setCategoria("NIVEL 1");
        pergunta12.setPergunta("Qual é o número que está escondido pelo borrão? 17 – 3 = 20 – 16 + (BORRÃO)");
        pergunta12.setRes1("10");
        pergunta12.setRes2("11");
        pergunta12.setRes3("12");
        pergunta12.setRes4("13");
        pergunta12.setRes5("14");
        pergunta12.setResposta("11");
        pergunta12.setUrl("");
        ListaObmep.add(pergunta12);

// Consulta 13
        Pergunta pergunta13 = new Pergunta();
        pergunta13.setCategoria("NIVEL 1");
        pergunta13.setPergunta("Janaína tem três canecas, uma pequena, uma média e uma grande. Com a caneca pequena cheia, ela enche 3/5 da caneca média. Com a caneca média cheia, ela enche 5/8 da caneca grande. Janaína enche as canecas pequena e média e despeja tudo na caneca grande. O que vai acontecer com a caneca grande?");
        pergunta13.setRes1("Ela ficará preenchida em 7/8 de sua capacidade.");
        pergunta13.setRes2("Ela ficará preenchida em 8/13 de sua capacidade.");
        pergunta13.setRes3("Ela ficará preenchida em 5/8 de sua capacidade.");
        pergunta13.setRes4("Ela ficará totalmente cheia, sem transbordar.");
        pergunta13.setRes5("Ela vai transbordar.");
        pergunta13.setResposta("Ela vai transbordar.");
        pergunta13.setUrl("");
        ListaObmep.add(pergunta13);

// Consulta 14
        Pergunta pergunta14 = new Pergunta();
        pergunta14.setCategoria("NIVEL 1");
        pergunta14.setPergunta("Uma fotografia mostra três pessoas: Armando, Benedita e Carlitos. Nessa foto, Armando está olhando para Benedita, e Benedita está olhando para Carlitos. Armando está de óculos, e Carlitos está sem óculos. Qual das alternativas abaixo é, com certeza, verdadeira?");
        pergunta14.setRes1("Há uma pessoa de óculos olhando para uma pessoa sem óculos.");
        pergunta14.setRes2("Há apenas uma pessoa sem óculos, e ela está olhando para uma pessoa de óculos.");
        pergunta14.setRes3("Há apenas uma pessoa de óculos, e ela está olhando para uma pessoa sem óculos.");
        pergunta14.setRes4("Carlitos está sendo olhado por uma pessoa sem óculos.");
        pergunta14.setRes5("Carlitos está sendo olhado por uma pessoa de óculos.");
        pergunta14.setResposta("Há apenas uma pessoa de óculos, e ela está olhando para uma pessoa sem óculos.");
        pergunta14.setUrl("");
        ListaObmep.add(pergunta14);

// Consulta 15
        Pergunta pergunta15 = new Pergunta();
        pergunta15.setCategoria("NIVEL 2");
        pergunta15.setPergunta("Miguel tinha em sua carteira várias notas de 2, 5, 10, 20 e 50 reais. Ele pagou 63 reais por um livro com seis dessas notas, sem ter troco a receber. Quantas notas de 2 reais ele usou?");
        pergunta15.setRes1("0");
        pergunta15.setRes2("1");
        pergunta15.setRes3("2");
        pergunta15.setRes4("3");
        pergunta15.setRes5("4");
        pergunta15.setResposta("4");
        pergunta15.setUrl("");
        ListaObmep.add(pergunta15);

// Consulta 16
        Pergunta pergunta16 = new Pergunta();
        pergunta16.setCategoria("NIVEL 2");
        pergunta16.setPergunta("Marcos comprou 21 litros de tinta. Ele usou água para diluir essa tinta até que a quantidade de água acrescentada fosse 30% do total da mistura. Quantos litros de água ele usou?");
        pergunta16.setRes1("5");
        pergunta16.setRes2("6");
        pergunta16.setRes3("7");
        pergunta16.setRes4("8");
        pergunta16.setRes5("9");
        pergunta16.setResposta("6");
        pergunta16.setUrl("");
        ListaObmep.add(pergunta16);

// Consulta 17
        Pergunta pergunta17 = new Pergunta();
        pergunta17.setCategoria("NIVEL 2");
        pergunta17.setPergunta("Juca colocou algumas bolinhas em uma caixa na qual cabem, no máximo, 100 bolinhas. Artur tirou 1/2 das bolinhas dessa caixa, depois Bernardo tirou 1/3 das restantes, em seguida Carlos tirou 1/4 das que sobraram e, finalmente, Danilo tirou 1/5 das que restaram. Quantas bolinhas ficaram na caixa?");
        pergunta17.setRes1("0");
        pergunta17.setRes2("3");
        pergunta17.setRes3("6");
        pergunta17.setRes4("12");
        pergunta17.setRes5("24");
        pergunta17.setResposta("12");
        pergunta17.setUrl("");
        ListaObmep.add(pergunta17);

// Consulta 18
        Pergunta pergunta18 = new Pergunta();
        pergunta18.setCategoria("NIVEL 2");
        pergunta18.setPergunta("Cinco crianças lançaram, cada uma, dois dados. A soma dos pontos obtidos nos dez dados foi 57. Quantas crianças, no mínimo, tiraram 6 em ambos os dados?");
        pergunta18.setRes1("1");
        pergunta18.setRes2("2");
        pergunta18.setRes3("3");
        pergunta18.setRes4("4");
        pergunta18.setRes5("5");
        pergunta18.setResposta("2");
        pergunta18.setUrl("");
        ListaObmep.add(pergunta18);

// Consulta 19
        Pergunta pergunta19 = new Pergunta();
        pergunta19.setCategoria("NIVEL 2");
        pergunta19.setPergunta("Um supermercado vende rolos idênticos de papel higiênico e faz as promoções abaixo: 1. Pague 5 e leve 6. 2. Pague 11 e leve 12. 3. Pague 14 e leve 18. 4. Pague 21 e leve 24. 5. Pague 31 e leve 36. Qual é a promoção mais vantajosa?");
        pergunta19.setRes1("1");
        pergunta19.setRes2("2");
        pergunta19.setRes3("3");
        pergunta19.setRes4("4");
        pergunta19.setRes5("5");
        pergunta19.setResposta("3");
        pergunta19.setUrl("");
        ListaObmep.add(pergunta19);

// Consulta 20
        Pergunta pergunta20 = new Pergunta();
        pergunta20.setCategoria("NIVEL 2");
        pergunta20.setPergunta("Maria escolheu um número inteiro. Ela somou a esse número os três números ímpares imediatamente inferiores e os dois números pares imediatamente superiores a ele e obteve 1414 como resultado. Qual é a soma dos algarismos do número que Maria escolheu?");
        pergunta20.setRes1("12");
        pergunta20.setRes2("13");
        pergunta20.setRes3("14");
        pergunta20.setRes4("15");
        pergunta20.setRes5("16");
        pergunta20.setResposta("13");
        pergunta20.setUrl("");
        ListaObmep.add(pergunta20);

// Consulta 21
        Pergunta pergunta21 = new Pergunta();
        pergunta21.setCategoria("NIVEL 2");
        pergunta21.setPergunta("Um estacionamento tem 10 vagas, uma ao lado da outra, inicialmente todas livres. Um carro preto e um carro rosa chegam a esse estacionamento. De quantas maneiras diferentes esses carros podem ocupar duas vagas de forma que haja pelo menos uma vaga livre entre eles?");
        pergunta21.setRes1("56");
        pergunta21.setRes2("70");
        pergunta21.setRes3("71");
        pergunta21.setRes4("72");
        pergunta21.setRes5("80");
        pergunta21.setResposta("71");
        pergunta21.setUrl("");
        ListaObmep.add(pergunta21);

// Consulta 22
        Pergunta pergunta22 = new Pergunta();
        pergunta22.setCategoria("NIVEL 2");
        pergunta22.setPergunta("Vovó Vera quis saber qual de suas cinco netinhas tinha feito um desenho na parede de sua sala. As netinhas fizeram as seguintes declarações: • Emília: Não fui eu. • Luísa: Quem desenhou foi a Marília ou a Rafaela. • Marília: Não foi a Rafaela nem a Vitória. • Rafaela: Não foi a Luísa. • Vitória: Luísa não está dizendo a verdade. Se apenas uma das netinhas mentiu, quem fez o desenho?");
        pergunta22.setRes1("Emília");
        pergunta22.setRes2("Luísa");
        pergunta22.setRes3("Marília");
        pergunta22.setRes4("Rafaela");
        pergunta22.setRes5("Vitória");
        pergunta22.setResposta("Marília");
        pergunta22.setUrl("");
        ListaObmep.add(pergunta22);

// Consulta 23
        Pergunta pergunta23 = new Pergunta();
        pergunta23.setCategoria("NIVEL 2");
        pergunta23.setPergunta("Ao redor de uma mesa sentaram-se os 17 participantes de um debate. Alguns deles sempre dizem a verdade, e os demais sempre mentem. Todos iniciaram o debate dizendo: “Meus dois vizinhos mentem”. No máximo, quantos mentirosos havia entre os participantes?");
        pergunta23.setRes1("10");
        pergunta23.setRes2("11");
        pergunta23.setRes3("12");
        pergunta23.setRes4("15");
        pergunta23.setRes5("17");
        pergunta23.setResposta("11");
        pergunta23.setUrl("");
        ListaObmep.add(pergunta23);

        // Consulta 1
        Pergunta pergunta24 = new Pergunta();
        pergunta24.setCategoria("Nivel 1");
        pergunta24.setPergunta("Quanto é 100 x 101?");
        pergunta24.setRes1("Mil e um.");
        pergunta24.setRes2("Mil e dez");
        pergunta24.setRes3("Dez mil e dez");
        pergunta24.setRes4("Dez mil e cem");
        pergunta24.setRes5("Onze mil e cem");
        pergunta24.setResposta("Mil e um.");
        pergunta24.setUrl("");
        ListaObmep.add(pergunta24);

        // Consulta 2
        Pergunta pergunta25 = new Pergunta();
        pergunta25.setCategoria("Nivel 1");
        pergunta25.setPergunta("A primeira fase da OBMEP é composta por três provas, de níveis 1, 2 e 3, com 20 questões em cada prova. Nessas provas, três questões são comuns aos três níveis, duas são comuns somente aos níveis 1 e 2 e outras duas são comuns somente aos níveis 2 e 3. As demais questões só aparecem em uma das provas. Quantas questões diferentes aparecem nas três provas da primeira fase da OBMEP?");
        pergunta25.setRes1("50");
        pergunta25.setRes2("52");
        pergunta25.setRes3("55");
        pergunta25.setRes4("56");
        pergunta25.setRes5("57");
        pergunta25.setResposta("50");
        pergunta25.setUrl("");
        ListaObmep.add(pergunta25);












        /// ENEM

        Pergunta enem1 = new Pergunta();
        enem1.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem1.setPergunta("We are now a nation obsessed with the cult of celebrity. Celebrities have replaced the classic notion of the hero. But instead of being respected for talent, courage or intelligence, it is money, style and image the deciding factors in what commands respect. Image is everything. Their image is painstakingly constructed by a multitude of different image consultants to carve out the most profitable celebrity they can. Then society is right behind them, believing in everything that celebrity believes in. Companies know that people will buy a product if a celebrity has it too. It is as if the person buying the product feels that they now have some kind of connection with the celebrity and that some of their perceived happiness will now be passed onto the consumer. So to look at it one way, the cult of celebrity is really nothing more than a sophisticated marketing scheme. Celebrities though cannot be blamed for all negative aspects of society. In reality society is to blame. We are the people who seemed to have lost the ability to think for ourselves. I suppose it’s easier to be told what to think, rather than challenging what we are told. The reason we are swamped by celebrity is because there is a demand for it. Disponível em: www.pitlanemagazine.com. Acesso em: 7 dez. 2017 (adaptado). O texto, que aborda questões referentes ao tema do culto à celebridade, tem o objetivo de");
        enem1.setRes1("destacar os méritos das celebridades.");
        enem1.setRes2("criticar o consumismo das celebridades.");
        enem1.setRes3("ressaltar a necessidade de reflexão dos fãs.");
        enem1.setRes4("culpar as celebridades pela obsessão dos fãs.");
        enem1.setRes5("valorizar o marketing pessoal das celebridades.");
        enem1.setResposta("ressaltar a necessidade de reflexão dos fãs.");
        enem1.setUrl("");
        ListaEnem.add(enem1);


        Pergunta enem2 = new Pergunta();
        enem2.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem2.setPergunta("The British (serves 60 million)  Take some Picts, Celts and Silures And let them settle, Then overrun them with Roman conquerors. Remove the Romans after approximately 400 years Add lots of Norman French to some Angles, Saxons, Jutes and Vikings, then stir vigorously. […] Sprinkle some fresh Indians, Malaysians, Bosnians, Iraqis and Bangladeshis together with some Afghans, Spanish, Turkish, Kurdish, Japanese And Palestinians Then add to the melting pot. Leave the ingredients to simmer. As they mix and blend allow their languages to flourish Binding them together with English. Allow time to be cool. Add some unity, understanding, and respect for the future, Serve with justice And enjoy.   Note: All the ingredients are equally important. Treating one ingredient better than another will leave a bitter unpleasant taste.  Warning: An unequal spread of justice will damage the people and cause pain. Give justice and equality to all.  Disponível em: www.benjaminzephaniah.com. Acesso em: 12 dez. 2018 (fragmento).  Ao descrever o processo de formação da Inglaterra, o autor do poema recorre a características de outro gênero textual para evidenciar");
        enem2.setRes1("a riqueza da mistura cultural.");
        enem2.setRes2("um legado de origem geográfica.");
        enem2.setRes3("um impacto de natureza histórica.");
        enem2.setRes4("um problema de estratificação social.");
        enem2.setRes5("a questão da intolerância linguística.");
        enem2.setResposta("a riqueza da mistura cultural.");
        enem2.setUrl("");
        ListaEnem.add(enem2);


        Pergunta enem3 = new Pergunta();
        enem3.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem3.setPergunta("Becoming  Back in the ancestral homeland of Michelle Obama, black women were rarely granted the honorific Miss or Mrs., but were addressed by their first name, or simply as “gal” or “auntie” or worse. This so openly demeaned them that many black women, long after they had left the South, refused to answer if called by their first name. A mother and father in 1970s Texas named their newborn “Miss” so that white people would have no choice but to address their daughter by that title. Black women were meant for the field or the kitchen, or for use as they saw fit. They were, by definition, not ladies. The very idea of a black woman as first lady of the land, well, that would have been unthinkable.  Disponível em: www.nytimes.com. Acesso em: 28 dez. 2018 (adaptado).  A crítica do livro de memórias de Michelle Obama, ex-primeira-dama dos EUA, aborda a história das relações humanas na cidade natal da autora. Nesse contexto, o uso do vocábulo “unthinkable” ressalta que");
        enem3.setRes1("a ascensão social era improvável.");
        enem3.setRes2("a mudança de nome era impensável.");
        enem3.setRes3("a origem do indivíduo era irrelevante.");
        enem3.setRes4("o trabalho feminino era inimaginável.");
        enem3.setRes5("o comportamento parental era irresponsável.");
        enem3.setResposta("a ascensão social era improvável.");
        enem3.setUrl("");
        ListaEnem.add(enem3);


        Pergunta enem4 = new Pergunta();
        enem4.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem4.setPergunta("SIPRESS. Disponível em: www.newyorker.com. Acesso em: 12 jun. 2018.  A presença de “at odds with” na fala da personagem do cartum revela o(a)");
        enem4.setRes1("necessidade de acessar informações confiáveis.");
        enem4.setRes2("dificuldade de conciliar diferentes anseios.");
        enem4.setRes3("desejo de dominar novas tecnologias.");
        enem4.setRes4("desafio de permanecer imparcial.");
        enem4.setRes5("vontade de ler notícias positivas.");
        enem4.setResposta("dificuldade de conciliar diferentes anseios.");
        enem4.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex4.png");
        ListaEnem.add(enem4);


        Pergunta enem5 = new Pergunta();
        enem5.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem5.setPergunta("Exterior: Between The Museums — Day  CELINE Americans always think Europe is perfect. But such beauty and history can be really oppressive. It reduces the individual to nothing. It just reminds you all the time you are just a little speck in a long history, where in America you feel like you could be making history. That’s why I like Los Angeles because it is so… JESSE Ugly? CELINE No, I was going to say “neutral”. It’s like looking at a blank canvas. I think people go to places like Venice on their honeymoon to make sure they are not going to fight for the first two weeks of their marriage because they’ll be too busy looking around at all the beautiful things. That’s what people call a romantic place — somewhere where the prettiness will contain your primary violent instinct. A real good honeymoon spot would be like somewhere in New Jersey. KRIZAN, K.; LINKLATER, R. Before Sunrise: screenplay. New York: Vintage Books, 2005.  Considerando-se o olhar dos personagens, esse trecho do roteiro de um filme permite reconhecer que a avaliação sobre um lugar depende do(a)");
        enem5.setRes1("beleza do próprio local.");
        enem5.setRes2("perspectiva do visitante.");
        enem5.setRes3("contexto histórico do local.");
        enem5.setRes4("tempo de permanência no local.");
        enem5.setRes5("finalidade da viagem do visitante.");
        enem5.setResposta("perspectiva do visitante.");
        enem5.setUrl("");
        ListaEnem.add(enem5);


        Pergunta enem6 = new Pergunta();
        enem6.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem6.setPergunta("Um asteroide de cerca de um mil metros de diâmetro, viajando a 288 mil quilômetros por hora, passou a uma distância insignificante — em termos cósmicos — da Terra, pouco mais do dobro da distância que nos separa da Lua. Segundo os cálculos matemáticos, o asteroide cruzou a órbita da Terra e somente não colidiu porque ela não estava naquele ponto de interseção. Se ele tivesse sido capturado pelo campo gravitacional do nosso planeta e colidido, o impacto equivaleria a 40 bilhões de toneladas de TNT, ou o equivalente à explosão de 40 mil bombas de hidrogênio, conforme calcularam os computadores operados pelos astrônomos do programa de Exploração do Sistema Solar da Nasa; se caísse no continente, abriria uma cratera de cinco quilômetros, no mínimo, e destruiria tudo o que houvesse num raio de milhares de outros; se desabasse no oceano, provocaria maremotos que devastariam imensas regiões costeiras. Enfim, uma visão do Apocalipse.  Disponível em: http://bdjur.stj.jus.br. Acesso em: 23 abr. 2010.  Qual estratégia caracteriza o texto como uma notícia alarmante?");
        enem6.setRes1("A descrição da velocidade do asteroide.");
        enem6.setRes2("A recorrência de formulações hipotéticas.");
        enem6.setRes3("A referência à opinião dos astrônomos.");
        enem6.setRes4("A utilização da locução adverbial “no mínimo”.");
        enem6.setRes5("A comparação com a distância da Lua à Terra.");
        enem6.setResposta("A recorrência de formulações hipotéticas.");
        enem6.setUrl("");
        ListaEnem.add(enem6);


        Pergunta enem7 = new Pergunta();
        enem7.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem7.setPergunta("A draga  A gente não sabia se aquela draga tinha nascido ali, no Porto, como um pé de árvore ou uma duna. — E que fosse uma casa de peixes? Meia dúzia de loucos e bêbados moravam dentro dela, enraizados em suas ferragens. Dos viventes da draga era um o meu amigo Mário-pega-sapo. [...] Quando Mário morreu, um literato oficial, em necrológio caprichado, chamou-o de Mário- -Captura-Sapo! Ai que dor! Ao literato cujo fazia-lhe nojo a forma coloquial. Queria captura em vez de pega para não macular (sic) a língua nacional lá dele… [...] Da velha draga Abrigo de vagabundos e de bêbados, restaram as expressões: estar na draga, viver na draga por estar sem dinheiro, viver na miséria Que ora ofereço ao filólogo Aurélio Buarque de Hollanda Para que as registre em seus léxicos Pois que o povo já as registrou.  BARROS, M. Gramática expositiva do chão: poesia quase toda. Rio de Janeiro: Civilização Brasileira, 1990 (fragmento).  Ao criticar o preciosismo linguístico do literato e ao sugerir a dicionarização de expressões locais, o poeta expressa uma concepção de língua que");
        enem7.setRes1("contrapõe características da escrita e da fala.");
        enem7.setRes2("ironiza a comunicação fora da norma-padrão.");
        enem7.setRes3("substitui regionalismos por registros formais.");
        enem7.setRes4("valoriza o uso de variedades populares.");
        enem7.setRes5("defende novas regras gramaticais.");
        enem7.setResposta("valoriza o uso de variedades populares.");
        enem7.setUrl("");
        ListaEnem.add(enem7);


        Pergunta enem8 = new Pergunta();
        enem8.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem8.setPergunta("O documentário O menino que fez um museu, direção de Sérgio Utsch, produção independente de brasileiros e britânicos, gravado no Nordeste em 2016, mais precisamente no distrito Dom Quintino, zona rural do Crato, foi premiado em Londres, pela Foreign Press Association (FPA), a associação de correspondentes estrangeiros mais antiga do mundo, fundada em 1888. De acordo com o diretor, O menino que fez um museu foi o único trabalho produzido por equipes fora do eixo Estados Unidos-Europa entre os finalistas. O documentário conta a história de um Brasil profundo, desconhecido até mesmo por muitos brasileiros. É apresentado com o carisma de Pedro Lucas Feitosa, 11 anos. Quando tinha 10 anos, Pedro Lucas criou o Museu de Luiz Gonzaga, que fica no distrito de Dom Quintino. A ideia surgiu após uma visita que o garoto fez, em 2013, quando tinha 8 anos, ao Museu do Gonzagão, em Exu, Pernambuco. Pedro decidiu criar o próprio lugar de exposição para homenagear o rei e o local escolhido foi a casa da sua bisavó já falecida, que fica ao lado da casa dele, na rua Alto de Antena.  Disponível em: www.opovo.com.br. Acesso em: 18 abr. 2018.  No segundo parágrafo, uma citação afirma que o documentário “foi o único trabalho produzido por equipes fora do eixo Estados Unidos-Europa entre os finalistas”. No texto, esse recurso expressa uma estratégia argumentativa que reforça a");
        enem8.setRes1("originalidade da iniciativa de homenagem à vida e à obra de Luiz Gonzaga.");
        enem8.setRes2("falta de concorrentes ao prêmio de uma das associações mais antigas do mundo.");
        enem8.setRes3("proeza da premiação de uma história ambientada no interior do Nordestebrasileiro.");
        enem8.setRes4("escassez de investimentos para a produção cinematográfica independente nopaís.");
        enem8.setRes5("mportância da parceria entre brasileiros e britânicos para a realização dasfilmagens.");
        enem8.setResposta("proeza da premiação de uma história ambientada no interior do Nordestebrasileiro.");
        enem8.setUrl("");
        ListaEnem.add(enem8);


        Pergunta enem9 = new Pergunta();
        enem9.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem9.setPergunta("A volta do marido pródigo  — Bom dia, seu Marrinha! Como passou de ontem? — Bem. Já sabe, não é? Só ganha meio dia. [...] Lá além, Generoso cotuca Tercino: — [...] Vai em festa, dorme que-horas, e, quando chega, ainda é todo enfeitado e salamistrão!... — Que é que hei de fazer, seu Marrinha... Amanheci com uma nevralgia... Fiquei com cisma de apanhar friagem... — Hum... — Mas o senhor vai ver como eu toco o meu serviço e ainda faço este povo trabalhar... [...] Pintão suou para desprender um pedrouço, e teve de pular para trás, para que a laje lhe não esmagasse um pé. Pragueja: — Quem não tem brio engorda! — É... Esse sujeito só é isso, e mais isso... — opina Sidu. — Também, tudo p’ra ele sai bom, e no fim dá certo... — diz Correia, suspirando e retomando o enxadão. — “P’ra uns, as vacas morrem ... p’ra outros até boi pega a parir...”. Seu Marra já concordou: — Está bem, seu Laio, por hoje, como foi por doença, eu aponto o dia todo. Que é a última vez!... E agora, deixa de conversa fiada e vai pegando a ferramenta!  ROSA, J. G. Sagarana. Rio de Janeiro: José Olympio, 1967.  Esse texto tem importância singular como patrimônio linguístico para a preservação da cultura nacional devido");
        enem9.setRes1("à menção a enfermidades que indicam falta de cuidado pessoal.");
        enem9.setRes2("à referência a profissões já extintas que caracterizam a vida no campo.");
        enem9.setRes3("aos nomes de personagens que acentuam aspectos de sua personalidade.");
        enem9.setRes4("ao emprego de ditados populares que resgatam memórias e saberes coletivos.");
        enem9.setRes5("às descrições de costumes regionais que desmistificam crenças e superstições.");
        enem9.setResposta("ao emprego de ditados populares que resgatam memórias e saberes coletivos.");
        enem9.setUrl("");
        ListaEnem.add(enem9);


        Pergunta enem10 = new Pergunta();
        enem10.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem10.setPergunta("Intenso e original, Son of Saul retrata horror do holocausto Centenas de filmes sobre o holocausto já foram produzidos em diversos países do mundo, mas nenhum é tão intenso como o húngaro Son of Saul, do estreante em longa-metragens László Nemes, vencedor do Grande Prêmio do Júri no último Festival de Cannes. Ao contrário da grande maioria das produções do gênero, que costuma oferecer uma variedade de informações didáticas e não raro cruza diferentes pontos de vista sobre o horror do campo de concentração, o filme acompanha apenas um personagem. Ele é Saul (Géza Röhrig), um dos encarregados de conduzir as execuções de judeus como ele que, por um dia e meio, luta obsessivamente para que um menino já morto — que pode ou não ser seu filho — tenha um enterro digno e não seja simplesmente incinerado. O acompanhamento da jornada desse prisioneiro é no sentido mais literal que o cinema pode proporcionar: a câmera está o tempo todo com o personagem, seja por sobre seus ombros, seja com um close em primeiro plano ou em sua visão subjetiva. O que se passa ao seu redor é secundário, muitas vezes desfocado. Saul percorre diferentes divisões de Auschwitz à procura de um rabino que possa conduzir o enterro da criança, e por isso pouco se envolve nos planos de fuga que os companheiros tramam e, quando o faz, geralmente atrapalha. “Você abandonou os vivos para cuidar de um morto”, acusa um deles. Ver toda essa via crucis é por vezes duro e exige certa entrega do espectador, mas certamente é daquelas experiências cinematográficas que permanecem na cabeça por muito tempo. O longa já está sendo apontado como o grande favorito ao Oscar de filme estrangeiro. Se levar a estatueta, certamente não faltará quem diga que a Academia tem uma preferência por quem aborda a 2ª Guerra. Por mais que exista uma dose de verdade na afirmação, premiar uma abordagem tão ousada e radical como Son of Saul não deixaria de ser um passo à frente dos votantes.  Carta Capital, n. 873, 22 out. 2015.  A resenha é, normalmente, um texto de base argumentativa. Na resenha do filme Son of Saul, o trecho da sequência argumentativa que se constitui como opinião implícita é");
        enem10.setRes1("“[…] do estreante em longa-metragens László Nemes, vencedor do Grande Prêmio do Júri no último Festival de Cannes”.");
        enem10.setRes2("“Ele é Saul (Géza Röhrig), um dos encarregados de conduzir as execuções de judeus […]”.");
        enem10.setRes3("“[…] a câmera está o tempo todo com o personagem, seja por sobre seus ombros, seja com um close […]”.");
        enem10.setRes4("“Saul percorre diferentes divisões de Auschwitz à procura de um rabino que possa conduzir o enterro da criança […]”.");
        enem10.setRes5("“[…] premiar uma abordagem tão ousada e radical como Son of Saul não deixaria  de ser um passo à frente dos votantes”.");
        enem10.setResposta("“[…] premiar uma abordagem tão ousada e radical como Son of Saul não deixaria  de ser um passo à frente dos votantes”.");
        enem10.setUrl("");
        ListaEnem.add(enem10);


        Pergunta enem11 = new Pergunta();
        enem11.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem11.setPergunta("Sinhá  Se a dona se banhou Eu não estava lá Por Deus Nosso Senhor Eu não olhei Sinhá Estava lá na roça Sou de olhar ninguém Não tenho mais cobiça Nem enxergo bem  Para que me pôr no tronco Para que me aleijar Eu juro a vosmecê Que nunca vi Sinhá  [...]  Por que talhar meu corpo Eu não olhei Sinhá Para que que vosmincê Meus olhos vai furar Eu choro em iorubá Mas oro por Jesus Para que que vassuncê Me tira a luz.  CHICO BUARQUE; JOÃO BOSCO. Chico. Rio de Janeiro: Biscoito Fino, 2011 (fragmento).  No fragmento da letra da canção, o vocabulário empregado e a situação retratada são relevantes para o patrimônio linguístico e identitário do país, na medida em que");
        enem11.setRes1("remetem à violência física e simbólica contra os povos escravizados.");
        enem11.setRes2("valorizam as influências da cultura africana sobre a música nacional.");
        enem11.setRes3("relativizam o sincretismo constitutivo das práticas religiosas brasileiras.");
        enem11.setRes4("narram os infortúnios da relação amorosa entre membros de classes sociaisdiferentes.");
        enem11.setRes5("problematizam as diferentes visões de mundo na sociedade durante o período colonial.");
        enem11.setResposta("remetem à violência física e simbólica contra os povos escravizados.");
        enem11.setUrl("");
        ListaEnem.add(enem11);


        Pergunta enem12 = new Pergunta();
        enem12.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem12.setPergunta("Disponível em: www.deskgram.org. Acesso em: 12 dez. 2018 (adaptado).  A associação entre o texto verbal e as imagens da garrafa e do cão configura recurso expressivo que busca");
        enem12.setRes1("estimular denúncias de maus-tratos contra animais.");
        enem12.setRes2("desvincular o conceito de descarte da ideia de negligência.");
        enem12.setRes3("incentivar campanhas de adoção de animais em situação de rua.");
        enem12.setRes4("sensibilizar o público em relação ao abandono de animais domésticos.");
        enem12.setRes5("alertar a população sobre as sanções legais acerca de uma prática criminosa.");
        enem12.setResposta("sensibilizar o público em relação ao abandono de animais domésticos.");
        enem12.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex12.png");
        ListaEnem.add(enem12);


        Pergunta enem13 = new Pergunta();
        enem13.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem13.setPergunta("HENFIL. Disponível em: https://medium.com. Acesso em: 29 out. 2018 (adaptado).  Nessa tirinha, produzida na década de 1970, os recursos verbais e não verbais sinalizam a finalidade de");
        enem13.setRes1("reforçar a luta por direitos civis.");
        enem13.setRes2("explicitar a autonomia feminina.");
        enem13.setRes3("ironizar as condições de igualdade.");
        enem13.setRes4("estimular a abdicação da vida social.");
        enem13.setRes5("criticar as obrigações da maternidade.");
        enem13.setResposta("ironizar as condições de igualdade.");
        enem13.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex13.png");
        ListaEnem.add(enem13);


        Pergunta enem14 = new Pergunta();
        enem14.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem14.setPergunta("A crise dos refugiados imortalizada para sempre no fundo do mar     TAYLOR, J. C. A balsa de Lampedusa. Instalação. Museu Atlântico, Lanzarote, Canárias, 2016 (detalhe).   A balsa de Lampedusa, nome da obra do artista britânico Jason de Caires Taylor, é uma das instalações criadas por ele para compor o acervo do primeiro museu submarino da Europa, o Museu Atlântico, localizado em Lanzarote, uma das ilhas do arquipélago das Canárias. Lampedusa é o nome da ilha italiana onde a grande maioria dos refugiados que saem da África ou de países como Síria, Líbano e Iraque tenta chegar para conseguir asilo no continente europeu. As esculturas do Museu Atlântico ficam a 14 metros de profundidade nas águas cristalinas de Lanzarote. Na balsa, estão dez pessoas. Todas têm no rosto a expressão do abandono. Entre elas, há algumas crianças. Uma delas, uma menina debruçada sobre a beira do bote, olha sem esperança o horizonte. A imagem é tão forte que dispensa qualquer palavra. Exatamente o papel da arte.  Disponível em: http://conexaoplaneta.com.br. Acesso em: 22 jun. 2019 (adaptado).  Além de apresentar ao público a obra A balsa de Lampedusa, essa reportagem cumpre, paralelamente, a função de chamar a atenção para");
        enem14.setRes1("a ilha de Lanzarote, localizada no arquipélago das Canárias, com vocação para o turismo.");
        enem14.setRes2("as muitas vidas perdidas nas travessias marítimas em embarcações precárias ao longo dos séculos.");
        enem14.setRes3("a inovação relativa à construção de um museu no fundo do mar, que só pode ser visitado por mergulhadores.");
        enem14.setRes4("a construção do museu submarino como um memorial para as centenas de imigrantes mortos nas travessias pelo mar.");
        enem14.setRes5("a arte como perpetuadora de episódios marcantes da humanidade que têm de ser relembrados para que não tornem a acontecer.");
        enem14.setResposta("a arte como perpetuadora de episódios marcantes da humanidade que têm de ser relembrados para que não tornem a acontecer.");
        enem14.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex14.png");
        ListaEnem.add(enem14);


        Pergunta enem15 = new Pergunta();
        enem15.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem15.setPergunta("TEXTO I  Correu à sala dos retratos, abriu o piano, sentou-se e espalmou as mãos no teclado. Começou a tocar alguma coisa própria, uma inspiração real e pronta, uma polca, uma polca buliçosa, como dizem os anúncios. Nenhuma repulsa da parte do compositor; os dedos iam arrancando as notas, ligando-as, meneando-as; dir-se-ia que a musa compunha e bailava a um tempo. […] Compunha só, teclando ou escrevendo, sem os vãos esforços da véspera, sem exasperação, sem nada pedir ao céu, sem interrogar os olhos de Mozart. Nenhum tédio. Vida, graça, novidade, escorriam-lhe da alma como de uma fonte perene.  ASSIS, M. Um homem célebre. Disponível em: www.biblio.com.br. Acesso em: 2 jun. 2019.   TEXTO II  Um homem célebre expõe o suplício do músico popular que busca atingir a sublimidade da obra-prima clássica, e com ela a galeria dos imortais, mas que é traído por uma disposição interior incontrolável que o empurra implacavelmente na direção oposta. Pestana, célebre nos saraus, salões, bailes e ruas do Rio de Janeiro por suas composições irresistivelmente dançantes, esconde-se dos rumores à sua volta num quarto povoado de ícones da grande música europeia, mergulha nas sonatas do classicismo vienense, prepara-se para o supremo salto criativo e, quando dá por si, é o autor de mais uma inelutável e saltitante polca.  WISNIK, J. M. Machado maxixe: o caso Pestana. Teresa: revista de literatura brasileira, 2004 (adaptado).  O conto de Machado de Assis faz uma referência velada ao maxixe, gênero musical inicialmente associado à escravidão e à mestiçagem. No Texto II, o conflito do personagem em compor obras do gênero é representativo da");
        enem15.setRes1("pouca complexidade musical das composições ajustadas ao gosto do grande público.");
        enem15.setRes2("prevalência de referências musicais africanas no imaginário da população brasileira.  C   incipiente atribuição de prestígio social a músicas instrumentais feitas para a dança.  D  tensa relação entre o erudito e o popular na constituição da música brasileira.  E  importância atribuída à música clássica na sociedade brasileira do século XIX.  Questão 16 - Linguagens, Códigos e suas Tecnologias  Devagar, devagarinho, Desacelerar é preciso. Acelerar não é preciso. Afobados e voltados para o próprio umbigo, operamos, automatizados, falas robóticas e silêncios glaciais. Ilustra bem esse estado de espírito a música Sinal fechado (1969), de Paulinho da Viola. Trata-se da história de dois sujeitos que se encontram inesperadamente em um sinal de trânsito. A conversa entre ambos, porém, se deu rápida e rasteira. Logo, os personagens se despedem, com a promessa de se verem em outra oportunidade. Percebe-se um registro de comunicação vazia e superficial, cuja tônica foi o contato ligeiro e superficial construído pelos interlocutores: “Olá, como vai? / Eu vou indo, e você, tudo bem? / Tudo bem, eu vou indo correndo, / pegar meu lugar no futuro. E você? / Tudo bem, eu vou indo em busca de um sono / tranquilo, quem sabe? / Quanto tempo… / Pois é, quanto tempo… / Me perdoe a pressa / é a alma dos nossos negócios… / Oh! Não tem de quê. / Eu também só ando a cem”. O culto à velocidade, no contexto apresentado, se coloca como fruto de um imediatismo processual que celebra o alcance dos fins sem dimensionar a qualidade dos meios necessários para atingir determinado propósito. Tal conjuntura favorece a lei do menor esforço — a comodidade — e prejudica a lei do maior esforço — a dignidade. Como modelo alternativo à cultura fast, temos o movimento slow life, cujo propósito, resumidamente, é conscientizar as pessoas de que a pressa é inimiga da perfeição e do prazer, buscando assim reeducar seus sentidos para desfrutar melhor os sabores da vida.  SILVA, M. F. L. Boletim UFMG, n. 1 749, set. 2011 (adaptado).  Nesse artigo de opinião, a apresentação da letra da canção Sinal fechado é uma estratégia argumentativa que visa sensibilizar o leitor porque  A  adverte sobre os riscos que o ritmo acelerado da vida oferece.  B  exemplifica o fato criticado no texto com uma situação concreta.");
        enem15.setRes3("contrapõe situações de aceleração e de serenidade na vida das pessoas.");
        enem15.setRes4("questiona o clichê sobre a rapidez e a aceleração da vida moderna.");
        enem15.setRes5("apresenta soluções para a cultura da correria que as pessoas vivenciam hoje.");
        enem15.setResposta("questiona o clichê sobre a rapidez e a aceleração da vida moderna.");
        enem15.setUrl("");
        ListaEnem.add(enem15);


        Pergunta enem16 = new Pergunta();
        enem16.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem16.setPergunta("A história do futebol brasileiro contém, ao longo de um século, registros de episódios racistas. Eis o paradoxo: se, de um lado, a atividade futebolística era depreciada aos olhos da “boa sociedade” como profissão destinada aos pobres, negros e marginais, de outro, achava-se investida do poder de representar e projetar a nação em escala mundial. A Copa do Mundo no Brasil, em 1950, viria a se constituir, nesse sentido, em uma rara oportunidade. Contudo, na decisão contra o Uruguai sobreveio o inesperado revés. As crônicas esportivas elegiam o goleiro Barbosa e o defensor Bigode como bodes expiatórios, “descarregando nas costas” dos jogadores os “prejuízos” da derrota. Uma chibata moral, eis a sentença proferida no tribunal dos brancos. Nos anos 1970, por não atender às expectativas normativas suscitadas pelo estereótipo do “bom negro”, Paulo César Lima foi classificado como “jogador-problema”. Ele esboçava a revolta da chibata no futebol brasileiro. Enquanto Barbosa e Bigode, sem alternativa, suportaram o linchamento moral na derrota de 1950, Paulo César contra-atacava os que pretendiam condená-lo pelo insucesso de 1974. O jogador assumia as cores e as causas defendidas pela esquadra dos pretos em todas as esferas da vida social. “Sinto na pele esse racismo subjacente”, revelou à imprensa francesa: “Isto é, ninguém ousa pronunciar a palavra ‘racismo’. Mas posso garantir que ele existe, mesmo na Seleção Brasileira”. Sua ousadia consistiu em pronunciar a palavra interdita no espaço simbólico do discurso oficial para reafirmar o mito da democracia racial.  Disponível em: https://observatorioracialfutebol.com.br. Acesso em: 22 jun. 2019 (adaptado).  O texto atribui o enfraquecimento do mito da democracia racial no futebol à");
        enem16.setRes1("responsabilização de jogadores negros pela derrota na final da Copa de 1950.");
        enem16.setRes2("projeção mundial da nação por um esporte antes destinado aos pobres.");
        enem16.setRes3("depreciação de um esporte associado à marginalidade.");
        enem16.setRes4("interdição da palavra “racismo” no contexto esportivo.");
        enem16.setRes5("atitude contestadora de um “jogador-problema”.");
        enem16.setResposta("atitude contestadora de um “jogador-problema”.");
        enem16.setUrl("");
        ListaEnem.add(enem16);


        Pergunta enem17 = new Pergunta();
        enem17.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem17.setPergunta("MEIRELLES, V. Moema. Óleo sobre tela, 129 cm x 190 cm. Masp, São Paulo, 1866.  Disponível em: www.masp.art.br. Acesso em: 13 ago. 2012 (adaptado).  Nessa obra, que retrata uma cena de Caramuru, célebre poema épico brasileiro, a filiação à estética romântica manifesta-se na");
        enem17.setRes1("exaltação do retrato fiel da beleza feminina.");
        enem17.setRes2("tematização da fragilidade humana diante da morte.");
        enem17.setRes3("ressignificação de obras do cânone literário nacional.");
        enem17.setRes4("representação dramática e idealizada do corpo da índia.");
        enem17.setRes5("oposição entre a condição humana e a natureza primitiva.");
        enem17.setResposta("representação dramática e idealizada do corpo da índia.");
        enem17.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex18.png");
        ListaEnem.add(enem17);


        Pergunta enem18 = new Pergunta();
        enem18.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem18.setPergunta("Coincidindo com o Dia Internacional dos Direitos da Infância, foram apresentados diversos trabalhos que mostram as mudanças que afetam a vida das crianças. Um desses estudos compara o que sonham e brincam as crianças hoje em relação às dos anos 1990. E o que se descobriu é que as crianças têm agora menos lazer e estão mais sobrecarregadas por deveres e atividades extracurriculares do que as de 25 anos atrás. As crianças de hoje não só dedicam menos tempo para brincar, como também, quando brincam, a maioria não o faz com outras crianças no parque, na rua ou na praça, mas em casa e muitas vezes sozinhas. E já não brincam tanto com brinquedos, mas com aparelhos eletrônicos, entre os quais predomina o jogo individual com a máquina.  OLIVA, M. P. O direito das crianças ao lazer… e a crescer sem carências. El País, 20 nov. 2015 (adaptado).  O texto indica que as transformações nas experiências lúdicas na infância");
        enem18.setRes1("fomentaram as relações sociais entre as crianças.");
        enem18.setRes2("tornaram o lazer uma prática difundida entre as crianças.");
        enem18.setRes3("incentivaram a criação de novos espaços para se divertir.");
        enem18.setRes4("promoveram uma vivência corporal menos ativa.");
        enem18.setRes5("contribuíram para o aumento do tempo dedicado para brincar.");
        enem18.setResposta("promoveram uma vivência corporal menos ativa.");
        enem18.setUrl("");
        ListaEnem.add(enem18);


        Pergunta enem19 = new Pergunta();
        enem19.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem19.setPergunta("Que tal transformar a internet em palco para a dança?     O coreógrafo e bailarino Didier Mulleras se destaca como um dos criadores que descobriram a dança de outro ponto de vista. Mini@tures é uma experiência emblemática entre movimento, computador, internet e vídeo. Com os recursos da computação gráfica, a dança das miniaturas pode caber na palma da mão. Pelo fato de usar a internet como palco, o processo de criação das miniaturas de dança levou em consideração os limites de tempo de download e o tamanho de arquivo, para que um número maior de “espectadores” pudesse assistir. A graça das miniaturas está justamente na contaminação entre mídias: corpo/dança/computação gráfica/internet. De fato, é a rede que faz a maior diferença nesse grupo. Mini@tures explora uma nova dimensão que descobre o espaço-tempo da web e conquista um novo território para a dança contemporânea. A qualquer hora, dança on-line.  SPANGHERO, M. A dança dos encéfalos acesos. São Paulo: Itaú Cultural, 2003 (adaptado).  Considerado o primeiro projeto de dança contemporânea concebido para a rede, esse trabalho é apresentado como inovador por");
        enem19.setRes1("adotar uma perspectiva conceitual como contraposição à tradição de grandes espetáculos.  B   criar novas formas de financiamento ao utilizar a internet para divulgação das apresentações.  C  privilegiar movimentos gerados por computação gráfica, com a substituição do palco pela tela.  D  produzir uma arte multimodal, com o intuito de ampliar as possibilidades de expressão estética.  E  redefinir a extensão e o propósito do espetáculo para adaptá-lo ao perfil de diferentes usuários.  Questão 21 - Linguagens, Códigos e suas Tecnologias    TEXTO I  O mito da estiagem em São Paulo  Os estoques de água doce são inesgotáveis, na medida em que são alimentados principalmente pelos oceanos, infinitos via evaporação e precipitação, ou seja, pelo ciclo hidrológico, que depende de forças físicas as quais o homem nunca poderá interromper. Enquanto existirem, o ciclo funcionará e os estoques de água doce nos continentes serão repostos indefinidamente. Obviamente que a água não se distribui equitativamente pelo planeta. Há regiões com muita água, normalmente na zona tropical, na qual a evaporação é maior, e regiões áridas, onde, por razões específicas da dinâmica climática, as taxas de evaporação são maiores do que a precipitação, gerando déficit de reposição de estoques de água doce.  Disponível em: www.cartanaescola.com.br. Acesso em: 17 jan. 2015 (adaptado).   TEXTO II  O processo de sedimentação no fundo do lago de um reservatório é um processo lento. Os sedimentos vão formando argila, que é uma rocha impermeável. Então, a água daquele lago não vai alimentar os aquíferos. Mesmo tendo muita quantidade de água superficial, ela não consegue penetrar no solo para alimentar os aquíferos. Se não for usada no consumo, ela vai simplesmente evaporar e vai cair em outro lugar, levada pelas correntes aéreas. Isso é outro motivo pelo qual os aquíferos não conseguem recuperar seu nível, porque não recebem água.  Disponível em: www.jornalopcao.com.br. Acesso em: 17 jan. 2015 (adaptado).  Os textos I e II abordam a situação dos reservatórios de água doce do planeta. Entretanto, a divergência entre eles está na ideia de que é possível    A  manter os estoques de água doce.");
        enem19.setRes2("utilizar a água superficial para o consumo.");
        enem19.setRes3("repor os estoques de água doce em regiões áridas.");
        enem19.setRes4("reduzir as taxas de precipitação e evaporação da água.");
        enem19.setRes5("equalizar a distribuição de água doce nas diferentes regiões.");
        enem19.setResposta("reduzir as taxas de precipitação e evaporação da água.");
        enem19.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex20.png");
        ListaEnem.add(enem19);


        Pergunta enem20 = new Pergunta();
        enem20.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem20.setPergunta("Os linguistas têm notado a expansão do tratamento informal. “Tenho 78 anos e devia ser tratado por senhor, mas meus alunos mais jovens me tratam por você”, diz o professor Ataliba Castilho, aparentemente sem se incomodar com a informalidade, inconcebível em seus tempos de estudante. O você, porém, não reinará sozinho. O tu predomina em Porto Alegre e convive com o você no Rio de Janeiro e em Recife, enquanto você é o tratamento predominante em São Paulo, Curitiba, Belo Horizonte e Salvador. O tu já era mais próximo e menos formal que você nas quase 500 cartas do acervo on-line de uma instituição universitária, quase todas de poetas, políticos e outras personalidades do final do século XIX e início do XX.  Disponível em: http://revistapesquisa.fapesp.br. Acesso em: 21 abr. 2015 (adaptado).  No texto, constata-se que os usos de pronomes variaram ao longo do tempo e que atualmente têm empregos diversos pelas regiões do Brasil. Esse processo revela que");
        enem20.setRes1("a escolha de “você” ou de “tu” está condicionada à idade da pessoa que usa o pronome.");
        enem20.setRes2("a possibilidade de se usar tanto “tu” quanto “você” caracteriza a diversidade da língua.");
        enem20.setRes3("o pronome “tu” tem sido empregado em situações informais por todo o país.");
        enem20.setRes4("a ocorrência simultânea de “tu” e de “você” evidencia a inexistência da distinção entre níveis de formalidade.");
        enem20.setRes5("o emprego de “você” em documentos escritos demonstra que a língua tende a se manter inalterada.");
        enem20.setResposta("a possibilidade de se usar tanto “tu” quanto “você” caracteriza a diversidade da língua.");
        enem20.setUrl("");
        ListaEnem.add(enem20);


        Pergunta enem21 = new Pergunta();
        enem21.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem21.setPergunta("O solo A morte do cisne, criado em 1905 pelo russo Mikhail Fokine a partir da música do compositor francês Camille Saint-Saens, retrata o último voo de um cisne antes de morrer. Na versão original, uma bailarina com figurino impecavelmente branco e na ponta dos pés interpreta toda a agonia da ave se debatendo até desfalecer. Em 2012, John Lennon da Silva, de 20 anos, morador do bairro de São Mateus, na Zona Leste de São Paulo, elaborou um novo jeito de dançar a coreografia imortalizada pela bailarina Anna Pavlova. No lugar de um colã e das sapatilhas, vestiu calça jeans, camiseta e tênis. Em vez de balé, trouxe o estilo popping da street dance. Sua apresentação inovadora de A morte do cisne, que foi ao ar no programa Se ela dança, eu danço, virou hit no YouTube.  Disponível em: www.correiobraziliense.com.br. Acesso em: 18 jun. 2019 (adaptado).  A forma original de John Lennon da Silva reinterpretar a coreografia de A morte do cisne demonstra que");
        enem21.setRes1("a composição da coreografia foi influenciada pela escolha do figurino.");
        enem21.setRes2("a criação artística é beneficiada pelo encontro de modelos oriundos de diferentes realidades socioculturais.");
        enem21.setRes3("a variação entre os modos de dançar uma mesma música evidencia a hierarquia que marca manifestações artísticas.");
        enem21.setRes4("a formação erudita, à qual o dançarino não teve acesso, resulta em artistas que só conhecem a estética da arte popular.");
        enem21.setRes5("a interpretação, por homens, de coreografias originalmente concebidas para mulheres exige uma adaptação complexa.");
        enem21.setResposta("a criação artística é beneficiada pelo encontro de modelos oriundos de diferentes realidades socioculturais.");
        enem21.setUrl("");
        ListaEnem.add(enem21);


        Pergunta enem22 = new Pergunta();
        enem22.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem22.setPergunta("Seus primeiros anos de detento foram difíceis; aos poucos entendeu como o sistema funciona. Apanhou dezenas de vezes, teve o crânio esmagado, o maxilar deslocado, braços e pernas quebrados; por fim, um dia ficou lesionado da perna quando foi jogado da laje de um pavilhão. Nem todas as vezes ele soube por que apanhou, muito menos da última, quando foi deixado para morrer, mas sobreviveu. Seu corpo, moído no inferno, aguarda o fim dos seus dias. Já não questiona mais. Obedece. Cumpre as ordens. Baixa a cabeça e se retira. Apanha, às vezes com motivo, às vezes sem. Por onde passou, derramaram seu sangue. Seu rastro pode ser seguido. Intriga ter sobrevivido durante tantos anos. Pouquíssimos chegaram à terceira idade encarcerados.  MAIA, A. P. Assim na terra como embaixo da terra. Rio de Janeiro: Record, 2017.  A narrativa concentra sua força expressiva no manejo de recursos formais e numa representação ficcional que");
        enem22.setRes1("buscam perpetuar visões do senso comum.");
        enem22.setRes2("trazem à tona atitudes de um estado de exceção.");
        enem22.setRes3("promovem a interlocução com grupos silenciados.");
        enem22.setRes4("inspiram o sentimento de justiça por meio da empatia.");
        enem22.setRes5("recorrem ao absurdo como forma de traduzir a realidade.");
        enem22.setResposta("trazem à tona atitudes de um estado de exceção.");
        enem22.setUrl("");
        ListaEnem.add(enem22);


        Pergunta enem23 = new Pergunta();
        enem23.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem23.setPergunta("– O senhor pensa que só porque o deixaram morar neste país pode logo ir fazendo o que quer? Nunca ouviu falar num troço chamado autoridades constituídas? Não sabe que tem de conhecer as leis do país? Não sabe que existe uma coisa chamada Exército Brasileiro, que o senhor tem de respeitar? Que negócio é esse? [...] Eu ensino o senhor a cumprir a lei, ali no duro: “dura lex”! Seus filhos são uns moleques e outra vez que eu souber que andaram incomodando o General, vai tudo em cana. Morou? Sei como tratar gringos feito o senhor. [...] Foi então que a mulher do vizinho do General interveio: – Era tudo que o senhor tinha a dizer a meu marido? O delegado apenas olhou-a, espantado com o atrevimento. – Pois então fique sabendo que eu também sei tratar tipos como o senhor. Meu marido não é gringo nem meus filhos são moleques. Se por acaso importunaram o General, ele que viesse falar comigo, pois o senhor também está nos importunando. E fique sabendo que sou brasileira, sou prima de um Major do Exército, sobrinha de um Coronel, e filha de um General! Morou? Estarrecido, o delegado só teve força para engolir em seco e balbuciar humildemente: – Da ativa, minha senhora?.  SABINO, F. A mulher do vizinho. In: Os melhores contos. Rio de Janeiro: Record, 1986.  A representação do discurso intimidador engendrada no fragmento é responsável por");
        enem23.setRes1("ironizar atitudes e ideias xenofóbicas.");
        enem23.setRes2("conferir à narrativa um tom anedótico.");
        enem23.setRes3("dissimular o ponto de vista do narrador.");
        enem23.setRes4("acentuar a hostilidade das personagens.");
        enem23.setRes5("exaltar relações de poder estereotipadas.");
        enem23.setResposta("conferir à narrativa um tom anedótico.");
        enem23.setUrl("");
        ListaEnem.add(enem23);


        Pergunta enem24 = new Pergunta();
        enem24.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem24.setPergunta("Os velhos papéis, quando não são consumidos pelo fogo, às vezes acordam de seu sono para contar notícias do passado. É assim que se descobre algo novo de um nome antigo, sobre o qual já se julgava saber tudo, como Machado de Assis. Por exemplo, você provavelmente não sabe que o autor carioca, morto em 1908, escreveu uma letra do hino nacional em 1867 — e não poderia saber mesmo, porque os versos seguiam inéditos. Até hoje. Essa letra acaba de ser descoberta, em um jornal antigo de Florianópolis, pelo pesquisador independente Felipe Rissato. “Das florestas em que habito/ Solto um canto varonil:/ Em honra e glória de Pedro/ O gigante do Brasil”, diz o começo do hino, composto de sete estrofes em redondilhas maiores, ou seja, versos de sete sílabas poéticas. O trecho também é o refrão da música. O Pedro mencionado é o imperador Dom Pedro II. O bruxo do Cosme Velho compôs a letra para o aniversário de 42 anos do monarca, em 2 de dezembro daquele ano — o hino seria apresentado naquele dia no teatro da cidade de Desterro, antigo nome de Florianópolis.  Disponível em: www.revistaprosaversoearte.com. Acesso em: 4 dez. 2018 (adaptado).  Considerando-se as operações de retomada de informações na estruturação do texto, há interdependência entre as expressões");
        enem24.setRes1("“Os velhos papéis” e “É assim”.");
        enem24.setRes2("“algo novo” e 'sobre o qual'.");
        enem24.setRes3("“um nome antigo” e “Por exemplo”.");
        enem24.setRes4("“O gigante do Brasil” e “O Pedro mencionado”.");
        enem24.setRes5("“o imperador Dom Pedro II” e “O bruxo do Cosme Velho”.");
        enem24.setResposta("“O gigante do Brasil” e “O Pedro mencionado”.");
        enem24.setUrl("");
        ListaEnem.add(enem24);


        Pergunta enem25 = new Pergunta();
        enem25.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem25.setPergunta("RODRIGUES, S. Acervo pessoal.   A revolução estética brasiliense empurrou os designers de móveis dos anos 1950 e início dos 1960 para o novo. Induzidos a abandonar o gosto rebuscado pelo colonial, a trocar Ouro Preto por Brasília, eles criaram um mobiliário contemporâneo que ainda hoje vemos nas lojas e nas salas de espera de consultórios e escritórios. Colada no uso de madeiras nobres, como o jacarandá e a peroba, e em materiais de revestimento como o couro e a palhinha, desenvolveu-se uma tendência feita de linhas retas e curvas suaves, nos moldes da capital no Cerrado.  CHAVES, D. Disponível em: www.veja.abril.com.br. Acesso em: 29 jul. 2010.  Na reportagem sobre os 50 anos de Brasília, de Débora Chaves, com a reprodução fotográfica de cadeiras e poltronas de Sérgio Rodrigues, verifica-se que os elementos da estética brasiliense");
        enem25.setRes1("aparecem definidos nas linhas retas dos objetos.");
        enem25.setRes2("expressam o desenho rebuscado por meio das linhas.");
        enem25.setRes3("mostram a expressão assimétrica das linhas curvas suaves.");
        enem25.setRes4("apontam a unidade de matéria-prima utilizada em sua fabricação.");
        enem25.setRes5("surgem na simplificação das informações visuais de cada composição.");
        enem25.setResposta("surgem na simplificação das informações visuais de cada composição.");
        enem25.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex27.png");
        ListaEnem.add(enem25);


        Pergunta enem26 = new Pergunta();
        enem26.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem26.setPergunta("Thumbs Up  Ponto positivo para o Facebook, que vai dar uma ajeitada na casa para, quem sabe, não ser mais conhecido como o espaço da treta. Durante a F8, sua conferência anual, a empresa anunciou a maior mudança de design do serviço em 5 anos. Agora, o polêmico feed de notícias deixa de ser o protagonista, e o queridinho da rede social se torna o segmento de Grupos (é o Orkut fazendo escola?). Segundo Mark Zuckerberg, mais de 1 bilhão de usuários mensais entram nessa aba do aplicativo, e 400 mil deles já estão integrados em grupos de “assuntos significativos”. O objetivo agora é aumentar o tráfego, oferecendo mais sugestões e ferramentas especiais para quem gerencia essas comunidades. Além disso, o Marketplace, que já tem mais de 800 milhões de usuários, vai ganhar mais atenção e integração. Com isso, parece que há um novo padrão se montando na rede social: sai o feed, entra a segmentação, que pode ser uma boa porta para monetização nos próximos anos. No mesmo evento, Zuckerberg também disse que o futuro do Facebook é a privacidade, mas não deu muitos detalhes de como vai proteger seus clientes daqui para frente. Evitar que vazamentos de dados dos usuários aconteçam é um bom começo.  #FicaaDica  Disponível em: https://thebrief.us16.list-manage.com. Acesso em: 3 maio 2019 (adaptado).     O texto relata que uma rede social virtual realizará sua maior mudança de design dos últimos anos. Esse fato revela que as tecnologias de informação e comunicação");
        enem26.setRes1("buscam oferecer mais privacidade.");
        enem26.setRes2("assimilam os comportamentos dos usuários.");
        enem26.setRes3("promovem maior interação em ambientes virtuais.");
        enem26.setRes4("oferecem mais facilidades para obter cada vez mais lucro.");
        enem26.setRes5("evoluem para ficar mais parecidas umas com as outras.");
        enem26.setResposta("assimilam os comportamentos dos usuários.");
        enem26.setUrl("");
        ListaEnem.add(enem26);


        Pergunta enem27 = new Pergunta();
        enem27.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem27.setPergunta("Reaprender a ler notícias  Não dá mais para ler um jornal, revista ou assistir a um telejornal da mesma forma que fazíamos até o surgimento da rede mundial de computadores. O Observatório da Imprensa antecipou isso lá nos idos de 1996 quando cunhou o slogan “Você nunca mais vai ler jornal do mesmo jeito”. De fato, hoje já não basta mais ler o que está escrito ou falado para estar bem informado. É preciso conhecer as entrelinhas e saber que não há objetividade e nem isenção absolutas, porque cada ser humano vê o mundo de uma forma diferente. Ter um pé atrás passou a ser a regra básica número um de quem passa os olhos por uma primeira página, capa de revista ou chamadas de um noticiário na TV. Há uma diferença importante entre desconfiar de tudo e procurar ver o maior número possível de lados de um mesmo fato, dado ou evento. Apenas desconfiar não resolve porque se trata de uma atitude passiva. É claro, tudo começa com a dúvida, mas a partir dela é necessário ser proativo, ou seja, investigar, estudar, procurar os elementos ocultos que sempre existem numa notícia. No começo é um esforço solitário que pode se tornar coletivo à medida que mais pessoas descobrem sua vulnerabilidade informativa.  Disponível em: www.observatoriodaimprensa.com.br. Acesso em: 30 set. 2015 (adaptado).  No texto, os argumentos apresentados permitem inferir que o objetivo do autor é convencer os leitores a");
        enem27.setRes1("buscarem fontes de informação comprometidas com a verdade.");
        enem27.setRes2("privilegiarem notícias veiculadas em jornais de grande circulação.");
        enem27.setRes3("adotarem uma postura crítica em relação às informações recebidas.");
        enem27.setRes4("questionarem a prática jornalística anterior ao surgimento da internet.");
        enem27.setRes5("valorizarem reportagens redigidas com imparcialidade diante dos fatos.");
        enem27.setResposta("adotarem uma postura crítica em relação às informações recebidas.");
        enem27.setUrl("");
        ListaEnem.add(enem27);


        Pergunta enem28 = new Pergunta();
        enem28.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem28.setPergunta("Não que Pelino fosse químico, longe disso; mas era sábio, era gramático. Ninguém escrevia em Tubiacanga que não levasse bordoada do Capitão Pelino, e mesmo quando se falava em algum homem notável lá no Rio, ele não deixava de dizer: “Não há dúvida! O homem tem talento, mas escreve: ‘um outro’, ‘de resto’…” E contraía os lábios como se tivesse engolido alguma cousa amarga. Toda a vila de Tubiacanga acostumou-se a respeitar o solene Pelino, que corrigia e emendava as maiores glórias nacionais. Um sábio… Ao entardecer, depois de ler um pouco o Sotero, o Candido de Figueiredo ou o Castro Lopes, e de ter passado mais uma vez a tintura nos cabelos, o velho mestre-escola saía vagarosamente de casa, muito abotoado no seu paletó de brim mineiro, e encaminhava-se para a botica do Bastos a dar dous dedos de prosa. Conversar é um modo de dizer, porque era Pelino avaro de palavras, limitando-se tão-somente a ouvir. Quando, porém, dos lábios de alguém escapava a menor incorreção de linguagem, intervinha e emendava. “Eu asseguro, dizia o agente do Correio, que…” Por aí, o mestre-escola intervinha com mansuetude evangélica: “Não diga ‘asseguro’, Senhor Bernardes; em português é garanto”. E a conversa continuava depois da emenda, para ser de novo interrompida por uma outra. Por essas e outras, houve muitos palestradores que se afastaram, mas Pelino, indiferente, seguro dos seus deveres, continuava o seu apostolado de vernaculismo.  BARRETO, L. A Nova Califórnia. Disponível em: www.dominiopublico.gov.br. Acesso em: 24 jul. 2019.  Do ponto de vista linguístico, a defesa da norma-padrão pelo personagem caracteriza-se por");
        enem28.setRes1("contestar o ensino de regras em detrimento do conteúdo das informações.");
        enem28.setRes2("resgatar valores patrióticos relacionados às tradições da língua portuguesa.");
        enem28.setRes3("adotar uma perspectiva complacente em relação aos desvios gramaticais.");
        enem28.setRes4("invalidar os usos da língua pautados pelos preceitos da gramática normativa.");
        enem28.setRes5("desconsiderar diferentes níveis de formalidade nas situações de comunicação.");
        enem28.setResposta("desconsiderar diferentes níveis de formalidade nas situações de comunicação.");
        enem28.setUrl("");
        ListaEnem.add(enem28);


        Pergunta enem29 = new Pergunta();
        enem29.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem29.setPergunta("O skate apareceu como forma de vivência no lazer em períodos de baixa nas ondas e ficou conhecido como “surfinho”. No início foram utilizados eixos e rodinhas de patins pregados numa madeira qualquer, para sua composição, sendo as rodas de borracha ou ferro. O grande marco na história do skate ocorreu em 1974, quando o engenheiro químico chamado Frank Nasworthy descobriu o uretano, material mais flexível, que oferecia mais aderência às rodas. A dependência dos skatistas em relação a esse novo material igualmente alavancou o surgimento de novas manobras e possibilitou a um maior número de pessoas inexperientes começar a prática dessa modalidade. O resultado foi a criação de campeonatos, marcas, fábricas e lojas especializadas.  ARMBRUST, I.; LAURO, F. A. A. O skate e suas possibilidades educacionais. Motriz, jul.-set. 2010 (adaptado).  De acordo com o texto, diversos fatores ao longo do tempo");
        enem29.setRes1("contribuíram para a democratização do skate.");
        enem29.setRes2("evidenciaram as demandas comerciais dos skatistas.");
        enem29.setRes3("definiram a carreira de skatista profissional.");
        enem29.setRes4("permitiram que a prática social do skate substituísse o surfe.");
        enem29.setRes5("indicaram a autonomia dos praticantes de skate.");
        enem29.setResposta("contribuíram para a democratização do skate.");
        enem29.setUrl("");
        ListaEnem.add(enem29);


        Pergunta enem30 = new Pergunta();
        enem30.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem30.setPergunta("Estojo escolar  Rio de Janeiro — Noite dessas, ciscando num desses canais a cabo, vi uns caras oferecendo maravilhas eletrônicas, bastava telefonar e eu receberia um notebook capaz de me ajudar a fabricar um navio, uma estação espacial. […] Como pretendo viajar esses dias, habilitei-me a comprar aquilo que os caras anunciavam como o top do top em matéria de computador portátil. No sábado, recebi um embrulho complicado que necessitava de um manual de instruções para ser aberto. […] De repente, como vem acontecendo nos últimos tempos, houve um corte na memória e vi diante de mim o meu primeiro estojo escolar. Tinha 5 anos e ia para o jardim de infância. Era uma caixinha comprida, envernizada, com uma tampa que corria nas bordas do corpo principal. Dentro, arrumados em divisões, havia lápis coloridos, um apontador, uma lapiseira cromada, uma régua de 20 cm e uma borracha para apagar meus erros. […] Da caixinha vinha um cheiro gostoso, cheiro que nunca esqueci e que me tonteava de prazer. […] O notebook que agora abro é negro e, em matéria de cheiro, é abominável. Cheira vilmente a telefone celular, a cabine de avião, a aparelho de ultrassonografia onde outro dia uma moça veio ver como sou por dentro. Acho que piorei de estojo e de vida.  CONY, C. H. Crônicas para ler na escola. São Paulo: Objetiva, 2009 (adaptado).  No texto, há marcas da função da linguagem que nele predomina. Essas marcas são responsáveis por colocar em foco o(a)");
        enem30.setRes1("mensagem, elevando-a à categoria de objeto estético do mundo das artes.");
        enem30.setRes2("código, transformando a linguagem utilizada no texto na própria temática abordada.");
        enem30.setRes3("contexto, fazendo das informações presentes no texto seu aspecto essencial.");
        enem30.setRes4("enunciador, buscando expressar sua atitude em relação ao conteúdo do enunciado.");
        enem30.setRes5("interlocutor, considerando-o responsável pelo direcionamento dado à narrativa Pelo enunciador.");
        enem30.setResposta("enunciador, buscando expressar sua atitude em relação ao conteúdo do enunciado.");
        enem30.setUrl("");
        ListaEnem.add(enem30);


        Pergunta enem31 = new Pergunta();
        enem31.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem31.setPergunta("LEMOS, A. Artistas brasileiras. Belo Horizonte: Miguilim, 2018.  O que assegura o reconhecimento desse texto em quadrinhos como prefácio é o(a)");
        enem31.setRes1("função de apresentação do livro.");
        enem31.setRes2("apelo emocional apoiado nas imagens.");
        enem31.setRes3("descrição do processo criativo da autora.");
        enem31.setRes4("referência à mescla dos trabalhos manual e digital.");
        enem31.setRes5("uso de elementos gráficos voltados para o público-alvo.");
        enem31.setResposta("função de apresentação do livro.");
        enem31.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex33.png");
        ListaEnem.add(enem31);


        Pergunta enem32 = new Pergunta();
        enem32.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem32.setPergunta("Disponível em: https://g1.globo.com. Acesso em: 18 jun. 2019 (adaptado). No texto, os recursos verbais e não verbais empregados têm por objetivo");
        enem32.setRes1("divulgar informações científicas sobre o uso indiscriminado de aparelhos celulares.");
        enem32.setRes2("influenciar o leitor a mudar atitudes e hábitos considerados prejudiciais às crianças.  C   relacionar o uso da tecnologia aos efeitos decorrentes da falta de exercícios físicos.  D   indicar medidas eficazes para desestimular a utilização de telefones pelo público infantil.  E  sugerir aos pais e responsáveis a substituição de dispositivos móveis por atividades lúdicas.  Questão 35 - Linguagens, Códigos e suas Tecnologias  Singular ocorrência Há ocorrências bem singulares. Está vendo aquela dama que vai entrando na igreja da Cruz? Parou agora no adro para dar uma esmola. De preto? Justamente; lá vai entrando; entrou. Não ponha mais na carta. Esse olhar está dizendo que a dama é uma recordação de outro tempo, e não há de ser muito tempo, a julgar pelo corpo: é moça de truz. Deve ter quarenta e seis anos. Ah! conservada. Vamos lá; deixe de olhar para o chão e conte-me tudo. Está viúva, naturalmente? Não. Bem; o marido ainda vive. É velho? Não é casada. Solteira? Assim, assim. Deve chamar-se hoje D. Maria de tal. Em 1860 florescia com o nome familiar de Marocas. Não era costureira, nem proprietária, nem mestra de meninas; vá excluindo as profissões e chegará lá. Morava na Rua do Sacramento. Já então era esbelta, e, seguramente, mais linda do que hoje; modos sérios, linguagem limpa. ASSIS, M. Machado de Assis: seus 30 melhores contos. Rio de Janeiro: Aguilar, 1961. No diálogo, descortinam-se aspectos da condição da mulher em meados do século XIX. O ponto de vista dos personagens manifesta conceitos segundo os quais a mulher  A  encontra um modo de dignificar-se na prática da caridade.  B  preserva a aparência jovem conforme seu estilo de vida.");
        enem32.setRes3("condiciona seu bem-estar à estabilidade do casamento.");
        enem32.setRes4("tem sua identidade e seu lugar referendados pelo homem.");
        enem32.setRes5("renuncia à sua participação no mercado de trabalho.");
        enem32.setResposta("influenciar o leitor a mudar atitudes e hábitos considerados prejudiciais às crianças.  C   relacionar o uso da tecnologia aos efeitos decorrentes da falta de exercícios físicos.  D   indicar medidas eficazes para desestimular a utilização de telefones pelo público infantil.  E  sugerir aos pais e responsáveis a substituição de dispositivos móveis por atividades lúdicas.  Questão 35 - Linguagens, Códigos e suas Tecnologias  Singular ocorrência Há ocorrências bem singulares. Está vendo aquela dama que vai entrando na igreja da Cruz? Parou agora no adro para dar uma esmola. De preto? Justamente; lá vai entrando; entrou. Não ponha mais na carta. Esse olhar está dizendo que a dama é uma recordação de outro tempo, e não há de ser muito tempo, a julgar pelo corpo: é moça de truz. Deve ter quarenta e seis anos. Ah! conservada. Vamos lá; deixe de olhar para o chão e conte-me tudo. Está viúva, naturalmente? Não. Bem; o marido ainda vive. É velho? Não é casada. Solteira? Assim, assim. Deve chamar-se hoje D. Maria de tal. Em 1860 florescia com o nome familiar de Marocas. Não era costureira, nem proprietária, nem mestra de meninas; vá excluindo as profissões e chegará lá. Morava na Rua do Sacramento. Já então era esbelta, e, seguramente, mais linda do que hoje; modos sérios, linguagem limpa. ASSIS, M. Machado de Assis: seus 30 melhores contos. Rio de Janeiro: Aguilar, 1961. No diálogo, descortinam-se aspectos da condição da mulher em meados do século XIX. O ponto de vista dos personagens manifesta conceitos segundo os quais a mulher  A  encontra um modo de dignificar-se na prática da caridade.  B  preserva a aparência jovem conforme seu estilo de vida.");
        enem32.setUrl("");
        ListaEnem.add(enem32);


        Pergunta enem33 = new Pergunta();
        enem33.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem33.setPergunta("TEXTO I     HAZOUMÉ, R. Nanawax. Plástico e tecido. Galerie Gagosian, 2009.  Disponível em: www.actuart.org. Acesso em: 19 jun. 2019.   TEXTO II  As máscaras não foram feitas para serem usadas; elas se concentram apenas nas possibilidades antropomórficas dos recipientes plásticos descartados e, ao mesmo tempo, chamam a atenção para a quantidade de lixo que se acumula em quase todas as cidades ou aldeias africanas.  FARTHING, S. Tudo sobre arte. Rio de Janeiro: Sextante, 2011 (adaptado).  Romuald Hazoumé costuma dizer que sua obra apenas manda de volta ao oeste o refugo de uma sociedade de consumo cada vez mais invasiva. A obra desse artista africano que vive no Benin denota o(a)");
        enem33.setRes1("empobrecimento do valor artístico pela combinação de diferentes matérias-primas.");
        enem33.setRes2("reposicionamento estético de objetos por meio da mudança de função.");
        enem33.setRes3("convite aos espectadores para interagir e completar obras inacabadas.");
        enem33.setRes4("militância com temas da ecologia que marcam o continente africano.");
        enem33.setRes5("realidade precária de suas condições de produção artística.");
        enem33.setResposta("reposicionamento estético de objetos por meio da mudança de função.");
        enem33.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex36.png");
        ListaEnem.add(enem33);


        Pergunta enem34 = new Pergunta();
        enem34.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem34.setPergunta("Comportamento geral  Você deve estampar sempre um ar de alegria E dizer: tudo tem melhorado Você deve rezar pelo bem do patrão E esquecer que está desempregado  Você merece Você merece Tudo vai bem, tudo legal Cerveja, samba, e amanhã, seu Zé Se acabarem com teu carnaval  Você deve aprender a baixar a cabeça E dizer sempre: muito obrigado São palavras que ainda te deixam dizer Por ser homem bem disciplinado  Deve pois só fazer pelo bem da nação Tudo aquilo que for ordenado Pra ganhar um fuscão no juízo final E diploma de bem-comportado  GONZAGUINHA. Luiz Gonzaga Jr. Rio de Janeiro: Odeon, 1973 (fragmento).  Pela análise do tema e dos procedimentos argumentativos utilizados na letra da canção composta por Gonzaguinha na década de 1970, infere-se o objetivo de");
        enem34.setRes1("ironizar a incorporação de ideias e atitudes conformistas.");
        enem34.setRes2("convencer o público sobre a importância dos deveres cívicos.");
        enem34.setRes3("relacionar o discurso religioso à resolução de problemas sociais.");
        enem34.setRes4("questionar o valor atribuído pela população às festas populares.");
        enem34.setRes5("defender uma postura coletiva indiferente aos valores dominantes.");
        enem34.setResposta("ironizar a incorporação de ideias e atitudes conformistas.");
        enem34.setUrl("");
        ListaEnem.add(enem34);


        Pergunta enem35 = new Pergunta();
        enem35.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem35.setPergunta("Se for possível, manda-me dizer: — É lua cheia. A casa está vazia — Manda-me dizer, e o paraíso Há de ficar mais perto, e mais recente Me há de parecer teu rosto incerto. Manda-me buscar se tens o dia Tão longo como a noite. Se é verdade Que sem mim só vês monotonia. E se te lembras do brilho das marés De alguns peixes rosados Numas águas E dos meus pés molhados, manda-me dizer: — É lua nova — E revestida de luz te volto a ver.  HILST, H. Júbilo, memória, noviciado da paixão. São Paulo: Cia. das Letras, 2018.  Falando ao outro, o eu lírico revela-se vocalizando um desejo que remete ao");
        enem35.setRes1("ceticismo quanto à possibilidade do reencontro.");
        enem35.setRes2("tédio provocado pela distância física do ser amado.");
        enem35.setRes3("sonho de autorrealização desenhado pela memória.");
        enem35.setRes4("julgamento implícito das atitudes de quem se afasta.");
        enem35.setRes5("questionamento sobre o significado do amor ausente.");
        enem35.setResposta("sonho de autorrealização desenhado pela memória.");
        enem35.setUrl("");
        ListaEnem.add(enem35);


        Pergunta enem36 = new Pergunta();
        enem36.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem36.setPergunta("Falso moralista  Você condena o que a moçada anda fazendo e não aceita o teatro de revista arte moderna pra você não vale nada e até vedete você diz não ser artista   Você se julga um tanto bom e até perfeito Por qualquer coisa deita logo falação Mas eu conheço bem o seu defeito e não vou fazer segredo não   Você é visto toda sexta no Joá e não é só no Carnaval que vai pros bailes se acabar Fim de semana você deixa a companheira e no bar com os amigos bebe bem a noite inteira   Segunda-feira chega na repartição pede dispensa para ir ao oculista e vai curar sua ressaca simplesmente Você não passa de um falso moralista  NELSON SARGENTO. Sonho de um sambista. São Paulo: Eldorado, 1979.  As letras de samba normalmente se caracterizam por apresentarem marcas informais do uso da língua. Nessa letra de Nelson Sargento, são exemplos dessas marcas");
        enem36.setRes1("“falação” e “pros bailes”.");
        enem36.setRes2("“você” e “teatro de revista”.");
        enem36.setRes3("“perfeito” e “Carnaval”.");
        enem36.setRes4("“bebe bem” e “oculista”.");
        enem36.setRes5("“curar” e “falso moralista”.");
        enem36.setResposta("“falação” e “pros bailes”.");
        enem36.setUrl("");
        ListaEnem.add(enem36);


        Pergunta enem37 = new Pergunta();
        enem37.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem37.setPergunta("Introdução a Alda  Dizem que ninguém mais a ama. Dizem que foi uma boa pessoa. Sua filha de doze anos não a visita nunca e talvez raramente se lembre dela. Puseram-na numa cidade triste de uniformes azuis e jalecos brancos, de onde não pôde mais sair. Lá, todos gritam-lhe irritados, mal se aproxima, ou lhe batem, como se faz com sacos de areia para treinar os músculos. Sei que para todos ela já não é, e ninguém lhe daria uma maçã cheirosa, bem vermelha. Mas não é verdade que alguém não a possa mais amar. Eu amo-a. Amo-a quando a vejo por trás das grades de um palácio, onde se refugiou princesa, chegada pelos caminhos da dor. Quando fora do reino sente o mundo de mil lanças, e selvagem prepara-se, posta no olhar. Amo-a quando criança brinca na areia sem medo. Uns pés descalços, uma mulher sem intenções. Cercada de mundo, às vezes sofrendo-o ainda.  CANÇADO, M. L. O sofredor do ver. Belo Horizonte: Autêntica, 2015.  Ao descrever uma mulher internada em um hospital psiquiátrico, o narrador compõe um quadro que expressa sua percepção");
        enem37.setRes1("irônica quanto aos efeitos do abandono familiar.");
        enem37.setRes2("resignada em face dos métodos terapêuticos em vigor.");
        enem37.setRes3("alimentada pela imersão lírica no espaço da segregação.");
        enem37.setRes4("inspirada pelo universo pouco conhecido da mente humana.");
        enem37.setRes5("demarcada por uma linguagem alinhada à busca da lucidez.");
        enem37.setResposta("alimentada pela imersão lírica no espaço da segregação.");
        enem37.setUrl("");
        ListaEnem.add(enem37);


        Pergunta enem38 = new Pergunta();
        enem38.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem38.setPergunta("O pavão vermelho  Ora, a alegria, este pavão vermelho, está morando em meu quintal agora. Vem pousar como um sol em meu joelho quando é estridente em meu quintal a aurora.  Clarim de lacre, este pavão vermelho sobrepuja os pavões que estão lá fora. É uma festa de púrpura. E o assemelho a uma chama do lábaro da aurora.  É o próprio doge a se mirar no espelho. E a cor vermelha chega a ser sonora neste pavão pomposo e de chavelho.  Pavões lilases possuí outrora. Depois que amei este pavão vermelho, os meus outros pavões foram-se embora.  Costa, S. Poesia completa: Sosígenes Costa. Salvador: Conselho Estadual de Cultura, 2001.  Na construção do soneto, as cores representam um recurso poético que configura uma imagem com a qual o eu lírico");
        enem38.setRes1("revela a intenção de isolar-se em seu espaço.");
        enem38.setRes2("simboliza a beleza e o esplendor da natureza.");
        enem38.setRes3("experimenta a fusão de percepções sensoriais.");
        enem38.setRes4("metaforiza a conquista de sua plena realização.");
        enem38.setRes5("expressa uma visão de mundo mística e espiritualizada.");
        enem38.setResposta("metaforiza a conquista de sua plena realização.");
        enem38.setUrl("");
        ListaEnem.add(enem38);


        Pergunta enem39 = new Pergunta();
        enem39.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem39.setPergunta("LICHTENSTEIN, R. Garota com bola. Óleo sobre tela, 153 cm x 91,9 cm. Museu de Arte Moderna de Nova York, 1961.  Disponível em: www.moma.org. Acesso em: 4 dez. 2018.  A obra, da década de 1960, pertencente ao movimento artístico Pop Art, explora a beleza e a sensualidade do corpo feminino em uma situação de divertimento. Historicamente, a sociedade inventou e continua reinventando o corpo como objeto de intervenções sociais, buscando atender aos valores e costumes de cada época. Na reprodução desses preceitos, a erotização do corpo feminino tem sido constituída pela");
        enem39.setRes1("realização de exercícios físicos sistemáticos e excessivos.");
        enem39.setRes2("utilização de medicamentos e produtos estéticos.");
        enem39.setRes3("educação do gesto, da vontade e do comportamento.");
        enem39.setRes4("construção de espaços para vivência de práticas corporais.");
        enem39.setRes5("promoção de novas experiências de movimento humano no lazer.");
        enem39.setResposta("educação do gesto, da vontade e do comportamento.");
        enem39.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex42.png");
        ListaEnem.add(enem39);


        Pergunta enem40 = new Pergunta();
        enem40.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem40.setPergunta("D’SALETE, M. Cumbe. São Paulo: Veneta, 2018, p. 10-11 (adaptado).  A sequência dos quadrinhos conjuga lirismo e violência ao");
        enem40.setRes1("sugerir a impossibilidade de manutenção dos afetos.");
        enem40.setRes2("revelar os corpos marcados pela brutalidade colonial.");
        enem40.setRes3("representar o abatimento diante da desumanidade vivida.");
        enem40.setRes4("acentuar a resistência identitária dos povos escravizados.");
        enem40.setRes5("expor os sujeitos alijados de sua ancestralidade pelo exílio.");
        enem40.setResposta("acentuar a resistência identitária dos povos escravizados.");
        enem40.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex43.png");
        ListaEnem.add(enem40);


        Pergunta enem41 = new Pergunta();
        enem41.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem41.setPergunta("Naquele tempo, Itaguaí, que, como as demais vilas, arraiais e povoações da colônia, não dispunha de imprensa, tinha dois modos de divulgar uma notícia; ou por meio de cartazes manuscritos e pregados na porta da Câmara, e da matriz; — ou por meio de matraca. Eis em que consistia este segundo uso. Contratava-se um homem, por um ou mais dias, para andar as ruas do povoado, com uma matraca na mão. De quando em quando tocava a matraca, reunia-se gente, e ele anunciava o que lhe incumbiam, — um remédio para sezões, umas terras lavradias, um soneto, um donativo eclesiástico, a melhor tesoura da vila, o mais belo discurso do ano, etc. O sistema tinha inconvenientes para a paz pública; mas era conservado pela grande energia de divulgação que possuía. Por exemplo, um dos vereadores desfrutava a reputação de perfeito educador de cobras e macacos, e aliás nunca domesticara um só desses bichos; mas tinha o cuidado de fazer trabalhar a matraca todos os meses. E dizem as crônicas que algumas pessoas afirmavam ter visto cascavéis dançando no peito do vereador; afirmação perfeitamente falsa, mas só devida à absoluta confiança no sistema. Verdade, verdade, nem todas as instituições do antigo regímen mereciam o desprezo do nosso século.  ASSIS, M. O alienista. Disponível em: www.dominiopubico.gov.br. Acesso em: 2 jun. 2019 (adaptado).  O fragmento faz uma referência irônica a formas de divulgação e circulação de informações em uma localidade sem imprensa. Ao destacar a confiança da população no sistema da matraca, o narrador associa esse recurso à disseminação de");
        enem41.setRes1("campanhas políticas.");
        enem41.setRes2("anúncios publicitários.");
        enem41.setRes3("notícias de apelo popular.");
        enem41.setRes4("informações não fidedignas.");
        enem41.setRes5("serviços de utilidade pública.");
        enem41.setResposta("informações não fidedignas.");
        enem41.setUrl("");
        ListaEnem.add(enem41);


        Pergunta enem42 = new Pergunta();
        enem42.setCategoria("Linguagens, Códigos e suas Tecnologias");
        enem42.setPergunta("No ano em que o maior clarinetista que o Brasil conheceu, Abel Ferreira, faria 100 anos, o choro dá mostras de vivacidade. É quase um paradoxo que essa riquíssima manifestação da genuína alma brasileira seja forte o suficiente para driblar a falta de incentivos oficiais, a insensibilidade dos meios de comunicação e a amnésia generalizada. “Ele trazia a alma brasileira derramada em sua sonoridade ímpar. Artur da Távola, seguramente seu maior admirador, foi quem melhor o definiu, ‘alma sertaneja, toque mozarteano’”. O acervo do músico autodidata nascido na mineira Coromandel, autor de 50 músicas, entre as quais Chorando baixinho (1942), que o consagrou, amigo e parceiro de Pixinguinha, com quem gravou Ingênuo (1958), permanece com os herdeiros à espera de compilação adequada. O Museu da Imagem e do Som do Rio de Janeiro tem a guarda do sax e do clarinete, doados em 1995. Na avaliação de Leonor Bianchi, editora da Revista do Choro, “a música instrumental fica apartada do que é popular porque não vai à sala de concerto. O público em geral tem interesse em samba, pagode e axé”. Ela atribui essa situação à falta de conhecimento e à pouca divulgação do gênero nas escolas.  FERRAZ, A. Disponível em: www.cartacapital.com.br. Acesso em: 22 abr. 2015 (adaptado).  Considerando-se o contexto, o gênero e o público-alvo, os argumentos trazidos pela autora do texto buscam");
        enem42.setRes1("atribuir o desconhecimento da obra de Abel Ferreira ao ensino de música nas A escolas.");
        enem42.setRes2("reivindicar mais investimentos estatais para a preservação do acervo musical nacional.");
        enem42.setRes3("destacar a relevância histórica e a riqueza estética do choro no cenário musical brasileiro.");
        enem42.setRes4("apresentar ao leitor dados biográficos pouco conhecidos sobre a trajetória de Abel Ferreira.");
        enem42.setRes5("constatar a impopularidade do choro diante da preferência do público por músicas populares.  Redação Instruções Redação    INSTRUÇÕES PARA A REDAÇÃO  1. O rascunho da redação deve ser feito no espaço apropriado. 2. O texto definitivo deve ser escrito à tinta preta, na folha própria, em até 30 linhas. 3. A redação que apresentar cópia dos textos da Proposta de Redação ou do Caderno de Questões terá o número de linhas copiadas desconsiderado para a contagem de linhas. 4. Receberá nota zero, em qualquer das situações expressas a seguir, a redação que: 4.1. tiver até 7 (sete) linhas escritas, sendo considerada “texto insuficiente”; 4.2. fugir ao tema ou que não atender ao tipo dissertativo-argumentativo; 4.3. apresentar parte do texto deliberadamente desconectada do tema proposto; 4.4. apresentar nome, assinatura, rubrica ou outras formas de identificação no espaço destinado ao texto. Proposta de Redação Redação    TEXTOS MOTIVADORES  TEXTO I  Toda sexta-feira, o ônibus azul e branco estacionado no pátio da Vara da Infância e da Juventude, na Praça Onze, Centro do Rio, sacoleja com o entra e sai de gente a partir das 9h. Do lado de fora, nunca menos de 50 pessoas, todas pobres ou muito pobres, quase todas negras, cercam o veículo, perguntam, sentam e levantam, perguntam de novo e esperam sem reclamar o tempo que for preciso. Adultos, velhos e crianças estão ali para conseguir o que, no Brasil, é oficialmente reconhecido como o primeiro documento da vida – a certidão de nascimento. [...] Ao longo do discurso desses entrevistados, fica clara a forma como os usuários se definem: “zero à esquerda”, “cachorro”, “um nada”, “pessoa que não existe”, entre outras, todas são expressões que conformam claramente a ideia da pessoa sem registro de nascimento sobre si mesma como uma pessoa sem valor, cuja existência nunca foi oficialmente reconhecida pelo Estado.  ESCÓSSIA, F. M. Invisíveis: uma etnografia sobre identidade, direitos e cidadania nas trajetórias de brasileiros sem documento. Tese (Doutorado em História, Política e Bens Culturais). Fundação Getúlio Vargas. Rio de Janeiro, 2019.  TEXTO II  A Lei Nº 9 534 de 1997 tornou o registro de nascimento gratuito no Brasil. Só que o problema persiste, mostrando que essa exclusão é complexa e não se explica apenas pela dificuldade financeira em pagar pelo registro, por exemplo.     Disponível em: https://estudio.r7.com/. Acesso em: 22 jul. 2021 (adaptado).     TEXTO III  A certidão de nascimento é o primeiro e o mais importante documento do cidadão. Com ele, a pessoa existe oficialmente para o Estado e a sociedade. Só de posse da certidão é possível retirar outros documentos civis, como a carteira de trabalho, a carteira de identidade, o título de eleitor e o Cadastro de Pessoa Física (CPF). Além disso, para matricular uma criança na escola e ter acesso a benefícios sociais, a apresentação do documento é obrigatória.  Disponível em: http://www.senado.leg.br/. Acesso em: 21 jul. 2021.     TEXTO IV     Disponível em: https://www.ufrgs.br/humanista. Acesso em: 26 jul. 2021 (adaptado).     PROPOSTA DE REDAÇÃO  A partir da leitura dos textos motivadores e com base nos conhecimentos construídos ao longo de sua formação, redija texto dissertativo-argumentativo em modalidade escrita formal da língua portuguesa sobre o tema “Invisibilidade e registro civil: garantia de acesso à cidadania no Brasil”, apresentando proposta de intervenção que respeite os direitos humanos. Selecione, organize e relacione, de forma coerente e coesa, argumentos e fatos para a defesa de seu ponto de vista. Ciências Humanas e suas Tecnologias");
        enem42.setResposta("destacar a relevância histórica e a riqueza estética do choro no cenário musical brasileiro.");
        enem42.setUrl("");
        ListaEnem.add(enem42);


        Pergunta enem43 = new Pergunta();
        enem43.setCategoria("Ciências Humanas e suas Tecnologias");
        enem43.setPergunta("Seu turno de trabalho acabou, você já está em casa e é hora do jantar da família. Mas, em vez de relaxar, você começa a pensar na possibilidade de ter recebido alguma mensagem importante no e-mail profissional ou no grupo de WhatsApp da empresa. Imediatamente, você fica distante. Momentos depois, com alguns toques na tela do celular, você está de volta ao ambiente de trabalho. O jantar e a família ficaram em segundo plano.  A simples vontade de checar mensagens do trabalho pós-expediente prejudica sua saúde — e a de sua família. Disponível em: www.bbc.com. Acesso em: 4 dez. 2018.  O texto indica práticas nas relações cotidianas do trabalho que causam para o indivíduo a");
        enem43.setRes1("proteção da vida privada.");
        enem43.setRes2("ampliação de atividades extras.");
        enem43.setRes3("elevação de etapas burocráticas.");
        enem43.setRes4("diversificação do lazer recreativo.");
        enem43.setRes5("desobrigação de afazeres domésticos.");
        enem43.setResposta("ampliação de atividades extras.");
        enem43.setUrl("");
        ListaEnem.add(enem43);


        Pergunta enem44 = new Pergunta();
        enem44.setCategoria("Ciências Humanas e suas Tecnologias");
        enem44.setPergunta("Quando a taxa de remuneração do capital excede substancialmente a taxa de crescimento da economia, pela lógica, a riqueza herdada aumenta mais rápido do que a renda e a produção. Então, basta aos herdeiros poupar uma parte limitada da renda de seu capital para que ele cresça mais rápido do que a economia como um todo. Sob essas condições, é quase inevitável que a riqueza herdada supere a riqueza constituída durante uma vida de trabalho, e que a concentração do capital atinja níveis muito altos.  PIKETTY, T. O capital no século XXI. Rio de Janeiro: Intrínseca, 2014 (adaptado).  Considerando os princípios que legitimam as democracias liberais, a lógica econômica descrita no texto enfraquece o(a)");
        enem44.setRes1("ideologia do mérito.");
        enem44.setRes2("direito de nascimento.");
        enem44.setRes3("eficácia da legislação.");
        enem44.setRes4("ganho das financeiras.");
        enem44.setRes5("eficiência dos mercados.");
        enem44.setResposta("ideologia do mérito.");
        enem44.setUrl("");
        ListaEnem.add(enem44);


        Pergunta enem45 = new Pergunta();
        enem45.setCategoria("Ciências Humanas e suas Tecnologias");
        enem45.setPergunta("Atualmente, o Programa de Melhoramento 'Uvas do Brasil' utiliza métodos clássicos de melhoramento, como seleção massal, seleção clonal e hibridações. Ações de ajuste de manejo de seleções avançadas vêm sendo desenvolvidas paralelamente ao Programa de Melhoramento, no sentido de viabilização desses materiais. Ao longo dos seus 40 anos, uma grande equipe técnica trabalhou para executar projetos de pesquisa para atender às necessidades e às demandas de diferentes atores da vitivinicultura nacional, incluindo produtores de uvas de mesa para exportação do semiárido nordestino, viticultores interessados em produzir sucos em regiões tropicais ou pequenos produtores familiares da região da Serra Gaúcha, interessados em melhorar a qualidade do vinho artesanal que produzem.  Programa de Melhoramento Genético 'Uvas do Brasil'. Disponível em: www.embrapa.br. Acesso em: 24 nov. 2018 (adaptado).  Para melhorar a produção agrícola nas regiões mencionadas, as técnicas referidas no texto buscaram adaptar o cultivo aos(às)");
        enem45.setRes1("espécies nativas ameaçadas.");
        enem45.setRes2("cadeias econômicas autônomas.");
        enem45.setRes3("estruturas fundiárias tradicionais.");
        enem45.setRes4("elementos ambientais singulares.");
        enem45.setRes5("mercados consumidores internos.");
        enem45.setResposta("elementos ambientais singulares.");
        enem45.setUrl("");
        ListaEnem.add(enem45);


        Pergunta enem46 = new Pergunta();
        enem46.setCategoria("Ciências Humanas e suas Tecnologias");
        enem46.setPergunta("TEXTO I  Portadoras de mensagem espiritual do passado, as obras monumentais de cada povo perduram no presente como o testemunho vivo de suas tradições seculares. A humanidade, cada vez mais consciente da unidade dos valores humanos, as considera um bem comum e, perante as gerações futuras, se reconhece solidariamente responsável por preservá-las, impondo a si mesma o dever de transmiti-las na plenitude de sua autenticidade.  Carta de Veneza, 31 de maio de 1964. Disponível em: www.iphan.gov.br. Acesso em: 7 out. 2019.   TEXTO II  Os sistemas tradicionais de proteção se mostram cada vez menos eficientes diante do processo acelerado de urbanização e transformação de nossa sociedade. A legislação de proteção peca por considerar o monumento, até certo ponto, desvinculado da realidade socioeconômica. O tombamento, ao decretar a imutabilidade do monumento, provoca a redução de seu valor venal e o abandono, o que é uma causa, ainda que lenta, de destruição inevitável.  TELLES, L. S. Manual do patrimônio histórico. Porto Alegre; Caxias do Sul: Escola Superior de Teologia São Lourenço de Brindes, 1977 (adaptado).  Escritos em temporalidade histórica aproximada, os textos se distanciam ao apresentarem pontos de vista diferentes sobre a(s)");
        enem46.setRes1("ampliação do comércio de imagens sacras.");
        enem46.setRes2("substituição de materiais de valor artístico.");
        enem46.setRes3("políticas de conservação de bens culturais.");
        enem46.setRes4("defesa da privatização de sítios arqueológicos.");
        enem46.setRes5("medidas de salvaguarda de peças museológicas.");
        enem46.setResposta("políticas de conservação de bens culturais.");
        enem46.setUrl("");
        ListaEnem.add(enem46);


        Pergunta enem47 = new Pergunta();
        enem47.setCategoria("Ciências Humanas e suas Tecnologias");
        enem47.setPergunta("TEXTO I  Em 2016, foram gerados 44,7 milhões de toneladas de resíduos eletrônicos, um aumento de 8% na comparação com 2014. Especialistas previram um crescimento de mais 17%, para 52,2 milhões de toneladas, até 2021.  Disponível em: https://nacoesunidas.org. Acesso em: 12 out. 2019 (adaptado).   TEXTO II  Há ainda quem exporte deliberadamente lixo eletrônico para o Gana. É mais caro reciclar devidamente os resíduos no mundo industrializado, onde até existem os recursos e a tecnologia. Um negócio muito mais lucrativo é vender o lixo eletrônico a negociantes locais, que o importam alegando tratar-se de material usado. Os negociantes depois vendem o lixo aos jovens no mercado, ou noutro lado, que o desmantelam e extraem os fios de cobre. Estes são derretidos em lareiras ao ar livre, poluindo o ar e, muitas vezes, intoxicando diretamente os próprios jovens.  KALEDZI, I.; SOUZA, G. Disponível em: www.dw.com. Acesso em: 12 out. 2019 (adaptado).  No contexto das discussões ambientais, as práticas descritas nos textos refletem um padrão de relações derivado do(a):");
        enem47.setRes1("Exercício pleno da cidadania.");
        enem47.setRes2("Divisão internacional do trabalho.");
        enem47.setRes3("Gestão empresarial do toyotismo.");
        enem47.setRes4("Concepção sustentável da economia.");
        enem47.setRes5("Protecionismo alfandegário dos Estados.");
        enem47.setResposta("Divisão internacional do trabalho.");
        enem47.setUrl("");
        ListaEnem.add(enem47);


        Pergunta enem48 = new Pergunta();
        enem48.setCategoria("Ciências Humanas e suas Tecnologias");
        enem48.setPergunta("Preços justos e autorizações de uso da água devem garantir de forma adequada que a retirada de água, bem como o retorno de efluentes, mantenham operações eficientes e ambientalmente sustentáveis, de maneira que sejam adaptáveis às peculiaridades e necessidades da indústria e da irrigação em larga escala, bem como às atividades da agricultura em pequena escala e de subsistência.  UNESCO. Relatório Mundial das Nações Unidas sobre Desenvolvimento dos Recursos Hídricos. Água para um mundo sustentável. Unesco, 2015.  Considerando o debate sobre segurança hídrica, a proposta apresentada no texto está pautada no(a)");
        enem48.setRes1("distribuição equitativa do abastecimento.");
        enem48.setRes2("monitoramento do fornecimento urbano.");
        enem48.setRes3("racionamento da capacidade fluvial.");
        enem48.setRes4("revitalização gradativa de solos.");
        enem48.setRes5("geração de produtos recicláveis.");
        enem48.setResposta("distribuição equitativa do abastecimento.");
        enem48.setUrl("");
        ListaEnem.add(enem48);


        Pergunta enem49 = new Pergunta();
        enem49.setCategoria("Ciências Humanas e suas Tecnologias");
        enem49.setPergunta("Durante os anos de 1854-55, o governo brasileiro — por meio de sua representação diplomática em Londres — e os livre-cambistas ingleses — nas colunas do Daily News e na Câmara dos Comuns — aumentaram a pressão pela revogação da Lei Aberdeen. O governo britânico, entretanto, ainda receava que, sem um tratado anglo-brasileiro satisfatório para substituí-la, não haveria nada que impedisse os brasileiros de um dia voltarem aos seus velhos hábitos.  BETHELL, L. A abolição do comércio brasileiro de escravos. Brasília: Senado Federal, 2002 (adaptado).  As tensões diplomáticas expressas no texto indicam o interesse britânico em");
        enem49.setRes1("estabelecer jurisdição conciliadora.");
        enem49.setRes2("compartilhar negócios marítimos.");
        enem49.setRes3("fomentar políticas higienistas.");
        enem49.setRes4("manter a proibição comercial.");
        enem49.setRes5("promover o negócio familiar.");
        enem49.setResposta("manter a proibição comercial.");
        enem49.setUrl("");
        ListaEnem.add(enem49);


        Pergunta enem50 = new Pergunta();
        enem50.setCategoria("Ciências Humanas e suas Tecnologias");
        enem50.setPergunta("Famoso por ser o encantador de viúvas da cidade de Cabaceiras, na Paraíba, Zé de Sila é um contador de histórias parecido com o personagem Chicó, do Auto da Compadecida. Ele defende veementemente que a oração da avó sustentava mais a chuva. “Quando era pequeno e chovia por aqui, ajudava minha avó colocando os pratos emborcados no terreiro para diminuir o vento. Ela fazia isso e rezava para a chuva durar mais”, diz Zé de Sila.  GALDINO, V.; BARBOSA, R. C. Artistas por um dia? João Pessoa: Editora Universitária, 2009.  Ao destacar expressões e vivências populares do cotidiano, o texto mobiliza os seguintes aspectos da diversidade regional:");
        enem50.setRes1("Alianças afetivas conectadas ao ritual matrimonial.");
        enem50.setRes2("Práticas místicas associadas ao patrimônio cultural.");
        enem50.setRes3("Manifestações teatrais atreladas ao imaginário político.");
        enem50.setRes4("Narrativas fílmicas relacionadas às intempéries climáticas.");
        enem50.setRes5("Argumentações literárias interligadas às catástrofes ambientais.");
        enem50.setResposta("Práticas místicas associadas ao patrimônio cultural.");
        enem50.setUrl("");
        ListaEnem.add(enem50);


        Pergunta enem51 = new Pergunta();
        enem51.setCategoria("Ciências Humanas e suas Tecnologias");
        enem51.setPergunta("O uso de novas tecnologias envolve a assimilação de uma cultura empresarial na qual haja a integração entre as propostas de modernização tecnológica e a racionalização. Nem sempre o uso de novas tecnologias é apenas um processo técnico na medida em que pressupõe uma nova orientação no controle do capital, no processo produtivo e na qualificação da mão de obra. Dos diversos efeitos que derivaram dessa orientação, a terceirização, a precarização e a flexibilização aparecem com constância como características do paradigma flexível, em substituição ao modelo taylorista-fordista.  HERÉDIA, V. Novas tecnologias nos processos de trabalho: efeitos da reestruturação produtiva. Scripta Nova, n. 170, ago. 2004 (adaptado).  O uso de novas tecnologias relacionado ao controle empresarial é criticado no texto em razão da");
        enem51.setRes1("operacionalização da tarefa laboral.");
        enem51.setRes2("capacitação de profissionais liberais.");
        enem51.setRes3("fragilização das relações de trabalho.");
        enem51.setRes4("hierarquização dos cargos executivos.");
        enem51.setRes5("aplicação dos conhecimentos da ciência.");
        enem51.setResposta("fragilização das relações de trabalho.");
        enem51.setUrl("");
        ListaEnem.add(enem51);


        Pergunta enem52 = new Pergunta();
        enem52.setCategoria("Ciências Humanas e suas Tecnologias");
        enem52.setPergunta("A categoria de refugiado carrega em si as noções de transitoriedade, provisoriedade e temporalidade. Os refugiados situam-se entre o país de origem e o país de destino. Ao transitarem entre os dois universos, ocupam posição marginal, tanto em termos identitários — assentada na falta de pertencimento pleno enquanto membros da comunidade receptora e nos vínculos introjetados por códigos partilhados com a comunidade de origem — quanto em termos jurídicos, ao deixarem de exercitar, ao menos em caráter temporário, o status de cidadãos no país de origem e portar o status de refugiados no país receptor.  MOREIRA, J. B. Refugiados no Brasil: reflexões acerca do processo de integração local. REMHU, n. 43, jul.-dez. 2014 (adaptado).  A condição de transitoriedade dos refugiados no Brasil, conforme abordada no texto, é provocada pela associação entre");
        enem52.setRes1("ascensão social e burocracia estatal.");
        enem52.setRes2("miscigenação étnica e limites fronteiriços.");
        enem52.setRes3("desqualificação profissional e ação policial.");
        enem52.setRes4("instabilidade financeira e crises econômicas.");
        enem52.setRes5("desenraizamento cultural e insegurança legal.");
        enem52.setResposta("desenraizamento cultural e insegurança legal.");
        enem52.setUrl("");
        ListaEnem.add(enem52);


        Pergunta enem53 = new Pergunta();
        enem53.setCategoria("Ciências Humanas e suas Tecnologias");
        enem53.setPergunta("Mulheres naturalistas raramente figuraram na corrida por conhecer terras exóticas. No século XIX, mulheres como Lady Charlotte Canning eventualmente coletavam espécimes botânicos, mas quase sempre no papel de esposas coloniais, viajando para locais onde seus maridos as levavam e não em busca de seus próprios projetos científicos.  SOMBRIO, M. M. O. Em busca pelo campo — Mulheres em expedições científicas no Brasil em meados do século XX. Cadernos Pagu, n. 48, 2016.  No contexto do século XIX, a relação das mulheres com o campo científico, descrita no texto, é representativa da");
        enem53.setRes1("afirmação da igualdade de gênero.");
        enem53.setRes2("transformação dos espaços de lazer.");
        enem53.setRes3("superação do pensamento patriarcal.");
        enem53.setRes4("incorporação das estratificações sociais.");
        enem53.setRes5("substituição das atividades domésticas.");
        enem53.setResposta("incorporação das estratificações sociais.");
        enem53.setUrl("");
        ListaEnem.add(enem53);


        Pergunta enem54 = new Pergunta();
        enem54.setCategoria("Ciências Humanas e suas Tecnologias");
        enem54.setPergunta("Nos setores mais altamente desenvolvidos da sociedade contemporânea, o transplante de necessidades sociais para individuais é de tal modo eficaz que a diferença entre elas parece puramente teórica. As criaturas se reconhecem em suas mercadorias; encontram sua alma em seu automóvel, casa em patamares, utensílios de cozinha.  MARCUSE, H. A ideologia da sociedade industrial: o homem unidimensional. Rio de Janeiro: Zahar, 1979.  O texto indica que, no capitalismo, a satisfação dos desejos pessoais é influenciada por");
        enem54.setRes1("políticas estatais de divulgação.");
        enem54.setRes2("incentivos controlados de consumo.");
        enem54.setRes3("prescrições coletivas de organização.");
        enem54.setRes4("mecanismos subjetivos de identificação.");
        enem54.setRes5("repressões racionalizadas do narcisismo.");
        enem54.setResposta("mecanismos subjetivos de identificação.");
        enem54.setUrl("");
        ListaEnem.add(enem54);


        Pergunta enem55 = new Pergunta();
        enem55.setCategoria("Ciências Humanas e suas Tecnologias");
        enem55.setPergunta("A vida das pessoas se modifica com a mesma rapidez com que se reproduz a cidade. O lugar da festa, do encontro quase desaparecem; o número de brincadeiras infantis nas ruas diminui — as crianças quase não são vistas; os pedaços da cidade são vendidos, no mercado, como mercadorias; árvores são destruídas, praças transformadas em concreto. Por outro lado, os habitantes parecem perder na cidade suas próprias referências. A imagem de uma grande cidade hoje é tão mutante que se assemelha à de um grande guindaste, aliás, a presença maciça destes, das britadeiras, das betoneiras nos dão o limite do processo de transformação diária ao qual está submetida a cidade.  CARLOS, A. F. A. A cidade. São Paulo: Contexto, 2011 (adaptado).  No contexto das grandes cidades brasileiras, a situação apresentada no texto vem ocorrendo como consequência da");
        enem55.setRes1("manutenção dos modos de convívio social.");
        enem55.setRes2("preservação da essência do espaço público.");
        enem55.setRes3("ampliação das normas de controle ambiental.");
        enem55.setRes4("flexibilização das regras de participação política.");
        enem55.setRes5("alteração da organização da paisagem geográfica.");
        enem55.setResposta("alteração da organização da paisagem geográfica.");
        enem55.setUrl("");
        ListaEnem.add(enem55);


        Pergunta enem56 = new Pergunta();
        enem56.setCategoria("Ciências Humanas e suas Tecnologias");
        enem56.setPergunta("No semiárido brasileiro, o sertanejo desenvolveu uma acuidade detalhada para a observação dos fenômenos, ao longo dos tempos, presenciados na natureza, em especial para a previsão do tempo e do clima, utilizando como referência a posição dos astros, constelação e nuvens. Conforme os sertanejos, a estação vai ser chuvosa quando a primeira lua cheia de janeiro “sair vermelha, por detrás de uma barra de nuvens”, mas “se surgir prateada, é sinal de seca”.  MAIA, D.; MAIA, A. C. A utilização dos ditos populares e da observação do tempo para a climatologia escolar no ensino fundamental II. GeoTextos, n. 1, jul. 2010 (adaptado).  O texto expõe a produção de um conhecimento que se constitui pela");
        enem56.setRes1("técnica científica.");
        enem56.setRes2("experiência perceptiva.");
        enem56.setRes3("negação das tradições.");
        enem56.setRes4("padronização das culturas.");
        enem56.setRes5("uniformização das informações.");
        enem56.setResposta("experiência perceptiva.");
        enem56.setUrl("");
        ListaEnem.add(enem56);


        Pergunta enem57 = new Pergunta();
        enem57.setCategoria("Ciências Humanas e suas Tecnologias");
        enem57.setPergunta("Vocês que fazem parte dessa massa Que passa nos projetos do futuro É duro tanto ter que caminhar E dar muito mais do que receber Ê, ô, ô, vida de gado Povo marcado Ê, povo feliz!  ZÉ RAMALHO. A peleja do diabo com o dono do céu. Rio de Janeiro: Sony, 1979 (fragmento).  Qual comportamento coletivo é criticado no trecho da letra da canção lançada em 1979?");
        enem57.setRes1("Militância política.");
        enem57.setRes2("Passividade social.");
        enem57.setRes3("Altruísmo religioso.");
        enem57.setRes4("Autocontrole moral.");
        enem57.setRes5("Inconformismo eleitoral.");
        enem57.setResposta("Passividade social.");
        enem57.setUrl("");
        ListaEnem.add(enem57);


        Pergunta enem58 = new Pergunta();
        enem58.setCategoria("Ciências Humanas e suas Tecnologias");
        enem58.setPergunta("Desde 2009, a área portuária carioca vem sofrendo grandes transformações realizadas no escopo da operação urbana consorciada conhecida como Porto Maravilha. Parte importante na tentativa de tornar o Rio de Janeiro um polo de serviços internacional, a “revitalização” urbana deveria deixar para trás uma paisagem geográfica que ainda recordava a cidade do início do século passado para abrir espaço, em seu lugar, à instalação de modernas torres comerciais, espaços de consumo e lazer inéditos e cerca de cem mil novos moradores, uma nova configuração socioespacial capaz de alçar a área portuária do Rio de Janeiro ao patamar dos waterfronts de Baltimore, Barcelona e Buenos Aires.  LACERDA, L.; WERNECK, M.; RIBEIRO, B. Cortiços de hoje na cidade do amanhã. E-metropolis, n. 30, set. 2017.  As intervenções urbanas descritas derivam de um processo socioespacial que busca a");
        enem58.setRes1("intensificação da participação na competitividade global.");
        enem58.setRes2("contenção da especulação no mercado imobiliário.");
        enem58.setRes3("democratização da habitação popular.");
        enem58.setRes4("valorização das funções tradicionais.");
        enem58.setRes5("priorização da gestão participativa.");
        enem58.setResposta("intensificação da participação na competitividade global.");
        enem58.setUrl("");
        ListaEnem.add(enem58);


        Pergunta enem59 = new Pergunta();
        enem59.setCategoria("Ciências Humanas e suas Tecnologias");
        enem59.setPergunta("Constatou-se uma ínfima inserção da indústria brasileira nas novas tecnologias ancoradas na microeletrônica, capazes de acarretar elevação da produtividade nacional de forma sustentada. Os motores do crescimento nacional, há décadas, são os grupos relacionados a commodities agroindustriais e à indústria representativa do antigo padrão fordista de produção, esta última também limitada pela baixa potencialidade futura de desencadear inovações tecnológicas capazes de proporcionar elevação sustentada da produtividade.  AREND, M. A industrialização do Brasil ante a nova divisão internacional do trabalho. Disponível em: www.ipea.gov.br. Acesso em: 16 jul. 2015 (adaptado).  Um efeito desse cenário para a sociedade brasileira tem sido o(a)");
        enem59.setRes1("barateamento da cesta básica.");
        enem59.setRes2("retorno à estatização econômica.");
        enem59.setRes3("ampliação do poder de consumo.");
        enem59.setRes4("subordinação aos fluxos globais.");
        enem59.setRes5("incentivo à política de modernização.");
        enem59.setResposta("subordinação aos fluxos globais.");
        enem59.setUrl("");
        ListaEnem.add(enem59);


        Pergunta enem60 = new Pergunta();
        enem60.setCategoria("Ciências Humanas e suas Tecnologias");
        enem60.setPergunta("As atividades mineradoras têm criado conflitos com extrativistas, quilombolas, pequenos agricultores, ribeirinhos, pescadores artesanais e povos indígenas. Em geral, estes sujeitos têm encontrado grande dificuldade de reproduzir suas dinâmicas territoriais depois da instalação da atividade mineradora, nem sempre com reconhecimento do impacto ao seu território pelo Estado e pela empresa, ficando sem qualquer tipo de compensação econômica. Em outros casos, nem a compensação econômica tem sido capaz de evitar o esgarçamento das relações sociais destes grupos que sofrem com a reconstrução abrupta das suas identidades e de suas dinâmicas territoriais.  PALHETA, J. M. et al. Conflitos pelo uso do território na Amazônia mineral. Mercator, n. 16, 2017.  O texto apresenta uma relação entre atividade econômica e organização social marcada pelo(a)");
        enem60.setRes1("escassez de incentivo cultural.");
        enem60.setRes2("rompimento de vínculos locais.");
        enem60.setRes3("carência de investimento financeiro.");
        enem60.setRes4("estabelecimento de práticas agroecológicas.");
        enem60.setRes5("enriquecimento das comunidades autóctones.");
        enem60.setResposta("rompimento de vínculos locais.");
        enem60.setUrl("");
        ListaEnem.add(enem60);


        Pergunta enem61 = new Pergunta();
        enem61.setCategoria("Ciências Humanas e suas Tecnologias");
        enem61.setPergunta("Por maioria, nós não entendemos uma quantidade relativa maior, mas a determinação de um estado ou de um padrão em relação ao qual tanto as quantidades maiores quanto as menores serão ditas minoritárias. Maioria supõe um estado de dominação. É nesse sentido que as mulheres, as crianças e também os animais são minoritários.  DELEUZE, G.; GUATTARI, F. Mil platôs. São Paulo: Editora 34, 2012 (adaptado).  No texto, a caracterização de uma minoria decorre da existência de");
        enem61.setRes1("ameaças de extinção social.");
        enem61.setRes2("políticas de incentivos estatais.");
        enem61.setRes3("relações de natureza arbitrária.");
        enem61.setRes4("valorações de conexões simétricas.");
        enem61.setRes5("hierarquizações de origem biológica.");
        enem61.setResposta("relações de natureza arbitrária.");
        enem61.setUrl("");
        ListaEnem.add(enem61);


        Pergunta enem62 = new Pergunta();
        enem62.setCategoria("Ciências Humanas e suas Tecnologias");
        enem62.setPergunta("Ao mesmo tempo, graças às amplas possibilidades que tive de observar a classe média, vossa adversária, rapidamente concluí que vós tendes razão, inteira razão, em não esperar dela qualquer ajuda. Seus interesses são diametralmente opostos aos vossos, mesmo que ela procure incessantemente afirmar o contrário e vos queira persuadir que sente a maior simpatia por vossa sorte. Mas seus atos desmentem suas palavras.  ENGELS, F. A situação da classe trabalhadora na Inglaterra. São Paulo: Boitempo, 2010.  No texto, o autor apresenta delineamentos éticos que correspondem ao(s)");
        enem62.setRes1("conceito de luta de classes.");
        enem62.setRes2("alicerce da ideia de mais-valia.");
        enem62.setRes3("fundamentos do método científico.");
        enem62.setRes4("paradigmas do processo indagativo.");
        enem62.setRes5("domínios do fetichismo da mercadoria.");
        enem62.setResposta("conceito de luta de classes.");
        enem62.setUrl("");
        ListaEnem.add(enem62);


        Pergunta enem63 = new Pergunta();
        enem63.setCategoria("Ciências Humanas e suas Tecnologias");
        enem63.setPergunta("Houve crescimento de 74% da população brasileira encarcerada entre 2005 e 2012. As análises possibilitaram identificar o perfil da população que está nas prisões do país: homens, jovens (abaixo de 29 anos), negros, com ensino fundamental incompleto, acusados de crimes patrimoniais e, no caso dos presos adultos, condenados e cumprindo regime fechado e, majoritariamente, com penas de quatro até oito anos.  BRASIL. Mapa do encarceramento: os jovens do Brasil. Brasília: Presidência da República, 2015.  Nesse contexto, as políticas públicas para minimizar a problemática descrita devem privilegiar a");
        enem63.setRes1("flexibilização do Código Civil.");
        enem63.setRes2("promoção da inclusão social.");
        enem63.setRes3("redução da maioridade penal.");
        enem63.setRes4("contenção da corrupção política.");
        enem63.setRes5("expansão do período de reclusão.");
        enem63.setResposta("promoção da inclusão social.");
        enem63.setUrl("");
        ListaEnem.add(enem63);


        Pergunta enem64 = new Pergunta();
        enem64.setCategoria("Ciências Humanas e suas Tecnologias");
        enem64.setPergunta("Nem guerras, nem revoltas. Os incêndios eram o mais frequente tormento da vida urbana no Regnum Italicum. Entre 880 e 1080, as cidades estiveram constantemente entregues ao apetite das chamas. A certa altura, a documentação parece vencer pela insistência do vocabulário, levando até o leitor mais crítico a cogitar que os medievais tinham razão ao tratar aqueles acontecimentos como castigos que antecediam o julgamento final. Como um quinto cavaleiro apocalíptico, o incêndio agia ao feitio da peste ou da fome: vagando mundo afora, retornava de tempos em tempos e expurgava justos e pecadores num tormento derradeiro, como insistiam os textos do século X. O impacto acarretado sobre as relações sociais era imediato e prolongava-se para além da destruição material. As medidas proclamadas pelas autoridades faziam mais do que reparar os danos e reconstruir a paisagem: elas convertiam a devastação em uma ocasião para alterar e expandir não só a topografia urbana, mas as práticas sociais até então vigentes.  RUST, L. D. Uma calamidade insaciável. Rev. Bras. Hist., n. 72, maio-ago. 2016 (adaptado).  De acordo com o texto, a catástrofe descrita impactava as sociedades medievais por proporcionar a");
        enem64.setRes1("correção dos métodos preventivos e das regras sanitárias.");
        enem64.setRes2("revelação do descaso público e das degradações ambientais.");
        enem64.setRes3("transformação do imaginário popular e das crenças religiosas.");
        enem64.setRes4("remodelação dos sistemas políticos e das administrações locais.");
        enem64.setRes5("reconfiguração dos espaços ocupados e das dinâmicas comunitárias.");
        enem64.setResposta("reconfiguração dos espaços ocupados e das dinâmicas comunitárias.");
        enem64.setUrl("");
        ListaEnem.add(enem64);


        Pergunta enem65 = new Pergunta();
        enem65.setCategoria("Ciências Humanas e suas Tecnologias");
        enem65.setPergunta("O protagonismo indígena vem optando por uma estratégia de “des-invisibilização”, valendo-se da dinâmica das novas tecnologias. Em outubro de 2012, após receberem uma liminar lhes negando o direito a permanecer em suas terras, os Guarani de Pyelito Kue divulgaram uma carta na qual se dispunham a morrer, mas não a sair de suas terras. Esse fato foi amplamente divulgado, gerando uma grande mobilização na internet, que levou milhares de pessoas a escolherem seu lado, divulgando a hashtag “#somostodosGuarani-Kaiowá” ou acrescentando o sobrenome Guarani-Kaiowá a seus nomes nos perfis das principais redes sociais.  CAPIBERIBE, A.; BONILLA, O. A ocupação do Congresso: contra o que lutam os índios? Estudos Avançados, n. 83, 2015 (adaptado).  A estratégia comunicativa adotada pelos indígenas, no contexto em pauta, teve por efeito");
        enem65.setRes1("enfraquecer as formas de militância política.");
        enem65.setRes2("abalar a identidade de povos tradicionais.");
        enem65.setRes3("inserir as comunidades no mercado global.");
        enem65.setRes4("distanciar os grupos de culturas locais.");
        enem65.setRes5("angariar o apoio de segmentos étnicos externos.");
        enem65.setResposta("angariar o apoio de segmentos étnicos externos.");
        enem65.setUrl("");
        ListaEnem.add(enem65);


        Pergunta enem66 = new Pergunta();
        enem66.setCategoria("Ciências Humanas e suas Tecnologias");
        enem66.setPergunta("O governo Vargas, principalmente durante o Estado Novo (1937-1945), pretendeu construir um Estado capaz de criar uma nova sociedade. Uma dimensão-chave desse projeto tinha no território seu foco principal. Não por acaso, foram criadas então instituições encarregadas de fornecer dados confiáveis para a ação do governo, como o Conselho Nacional de Geografia, o Conselho Nacional de Cartografia, o Conselho Nacional de Estatística e o Instituto Brasileiro de Geografia e Estatística (IBGE), este de 1938.  LIPPI, L. A conquista do Oeste. Disponível em: http://cpdoc.fgv.br. Acesso em: 7 nov. 2014 (adaptado).  A criação dessas instituições pelo governo Vargas representava uma estratégia política de");
        enem66.setRes1("levantar informações para a preservação da paisagem dos sertões.");
        enem66.setRes2("controlar o crescimento exponencial da população brasileira.");
        enem66.setRes3("obter conhecimento científico das diversidades regionais.");
        enem66.setRes4("conter o fluxo migratório do campo para a cidade.");
        enem66.setRes5("propor a criação de novas unidades da federação.");
        enem66.setResposta("obter conhecimento científico das diversidades regionais.");
        enem66.setUrl("");
        ListaEnem.add(enem66);


        Pergunta enem67 = new Pergunta();
        enem67.setCategoria("Ciências Humanas e suas Tecnologias");
        enem67.setPergunta("Foram esses cientistas Xavante que esclareceram os mistérios da germinação de cada uma das sementes. Eles tinham o conhecimento para quebrar a dormência. O fogo era fundamental para muitas; para outras, o caminho para despertar passava pelo sistema digestivo dos animais silvestres. “Essa planta nasce depois que fazemos a caçada com fogo, diziam eles, esta outra quando a anta caga a semente, aquela precisa ser comida pelo lobo”. Aliando os conhecimentos dos cientistas da aldeia e da cidade, essa área do Cerrado foi recuperada totalmente.  PAPPIANI, A. Tecnologias indígenas: esplendor e captura. Disponível em: https://outraspalavras.net. Acesso em: 10 out. 2019 (adaptado).  No texto, a relação socioespacial dos indígenas evidencia a importância do(a)");
        enem67.setRes1("prática agrícola para a logística nacional.");
        enem67.setRes2("cultivo de hortaliças para o consumo urbano.");
        enem67.setRes3("saber tradicional para a conservação ambiental.");
        enem67.setRes4("criação de gado para o aprimoramento genético.");
        enem67.setRes5("reflorestamento comercial para a produção orgânica.");
        enem67.setResposta("saber tradicional para a conservação ambiental.");
        enem67.setUrl("");
        ListaEnem.add(enem67);


        Pergunta enem68 = new Pergunta();
        enem68.setCategoria("Ciências Humanas e suas Tecnologias");
        enem68.setPergunta("Desde os primórdios da formação da crosta terrestre até os dias de hoje, as rochas formadas vêm sendo continuamente destruídas. Os produtos resultantes da destruição das rochas são transportados pela água, vento e gelo a toda superfície terrestre, acionados pelo calor e pela gravidade. Cessada a energia transportadora, são depositados nas regiões mais baixas da crosta, podendo formar pacotes rochosos.  LEINZ, V. Geologia geral. São Paulo: Editora Nacional, 1989.  As transformações na superfície terrestre, conforme descritas no texto, compõem o seguinte processo geomorfológico:");
        enem68.setRes1("Ciclo sedimentar.");
        enem68.setRes2("Instabilidade sísmica.");
        enem68.setRes3("Intemperismo biológico.");
        enem68.setRes4("Derramamento basáltico.");
        enem68.setRes5("Compactação superficial.");
        enem68.setResposta("Ciclo sedimentar.");
        enem68.setUrl("");
        ListaEnem.add(enem68);


        Pergunta enem69 = new Pergunta();
        enem69.setCategoria("Ciências Humanas e suas Tecnologias");
        enem69.setPergunta("A participação social no planejamento e na gestão urbanos ganhou impulso a partir do Estatuto da Cidade (Lei n. 10.257/2001), que estabeleceu condições para elaboração de planos diretores participativos, instrumentos esses indutores da expansão urbana e do ordenamento territorial que, a princípio, devem buscar representar os interesses dos diversos segmentos da sociedade. No entanto, é notório o limite à representação dos interesses das camadas sociais menos favorecidas nesse processo. Este rumo deve ser corrigido e deve-se continuar buscando mecanismos de inclusão dos interesses de toda a sociedade.  Caderno Objetivos de Desenvolvimento Sustentável — ODS n. 11: tornar as cidades e os assentamentos humanos inclusivos, seguros, resilientes e sustentáveis. Brasília: Ipea, 2019.  Qual medida promove a participação social descrita no texto?");
        enem69.setRes1("Redução dos impostos municipais.");
        enem69.setRes2("Privatização dos espaços públicos.");
        enem69.setRes3("Adensamento das áreas de comércio.");
        enem69.setRes4("Valorização dos condomínios fechados.");
        enem69.setRes5("Fortalecimento das associações de bairro.");
        enem69.setResposta("Fortalecimento das associações de bairro.");
        enem69.setUrl("");
        ListaEnem.add(enem69);


        Pergunta enem70 = new Pergunta();
        enem70.setCategoria("Ciências Humanas e suas Tecnologias");
        enem70.setPergunta("Quando Getúlio Vargas se suicidou, em agosto de 1954, o país parecia à beira do caos. Acuado por uma grave crise política, o velho líder preferiu uma bala no peito à humilhação de aceitar uma nova deposição, como a que sofrera em outubro de 1945. Entretanto, ao contrário do que imaginavam os inimigos, ao ruído do estampido não se seguiu o silêncio que cerca a derrota.  REIS FILHO, D. A. O Estado à sombra de Vargas. Revista Nossa História, n. 7, maio 2004.  O evento analisado no texto teve como repercussão imediata na política nacional a");
        enem70.setRes1("reação popular.");
        enem70.setRes2("intervenção militar.");
        enem70.setRes3("abertura democrática.");
        enem70.setRes4("campanha anticomunista.");
        enem70.setRes5("radicalização oposicionista.");
        enem70.setResposta("reação popular.");
        enem70.setUrl("");
        ListaEnem.add(enem70);


        Pergunta enem71 = new Pergunta();
        enem71.setCategoria("Ciências Humanas e suas Tecnologias");
        enem71.setPergunta("Eu, Dom João, pela graça de Deus, faço saber a V. Mercê que me aprouve banir para essa cidade vários ciganos — homens, mulheres e crianças — devido ao seu escandaloso procedimento neste reino. Tiveram ordem de seguir em diversos navios destinados a esse porto, e, tendo eu proibido, por lei recente, o uso da sua língua habitual, ordeno a V. Mercê que cumpra essa lei sob ameaça de penalidades, não permitindo que ensinem dita língua a seus filhos, de maneira que daqui por diante o seu uso desapareça.  TEIXEIRA, R. C. História dos ciganos no Brasil. Recife: Núcleo de Estudos Ciganos, 2008.  A ordem emanada da Coroa portuguesa para sua colônia americana, em 1718, apresentava um tratamento da identidade cultural pautado em");
        enem71.setRes1("converter grupos infiéis à religião oficial.");
        enem71.setRes2("suprimir formas divergentes de interação social.");
        enem71.setRes3("evitar envolvimento estrangeiro na economia local.");
        enem71.setRes4("reprimir indivíduos engajados em revoltas nativistas.");
        enem71.setRes5("controlar manifestações artísticas de comunidades autóctones.");
        enem71.setResposta("suprimir formas divergentes de interação social.");
        enem71.setUrl("");
        ListaEnem.add(enem71);


        Pergunta enem72 = new Pergunta();
        enem72.setCategoria("Ciências Humanas e suas Tecnologias");
        enem72.setPergunta("De um lado, ancorados pela prática médica europeia, por outro, pela terapêutica indígena, com seu amplo uso da flora nativa, os jesuítas foram os reais iniciadores do exercício de uma medicina híbrida que se tornou marca do Brasil colonial. Alguns religiosos vinham de Portugal já versados nas artes de curar, mas a maioria aprendeu na prática diária as funções que deveriam ser atribuídas a um físico, cirurgião, barbeiro ou boticário.  GURGEL, C. Doenças e curas: o Brasil nos primeiros séculos. São Paulo: Contexto, 2010 (adaptado).  Conforme o texto, o que caracteriza a construção da prática medicinal descrita é a");
        enem72.setRes1("adoção de rituais místicos.");
        enem72.setRes2("rejeição dos dogmas cristãos.");
        enem72.setRes3("superação da tradição popular.");
        enem72.setRes4("imposição da farmacologia nativa.");
        enem72.setRes5("conjugação de saberes empíricos.");
        enem72.setResposta("conjugação de saberes empíricos.");
        enem72.setUrl("");
        ListaEnem.add(enem72);


        Pergunta enem73 = new Pergunta();
        enem73.setCategoria("Ciências Humanas e suas Tecnologias");
        enem73.setPergunta("Desde o século XII que a cristandade ocidental era agitada pelo desafio lançado pela cultura profana — a dos romances de cavalaria, mas também a cultura folclórica dos camponeses e igualmente a dos citadinos, de caráter mais jurídico — à cultura eclesiástica, cujo veículo era o latim. Francisco de Assis veio alterar a situação, propondo aos seus ouvintes uma mensagem acessível a todos e, simultaneamente, enobrecendo a língua vulgar através do seu uso na religião.  VAUCHEZ, A. A espiritualidade da Idade Média Ocidental, séc. VIII-XIII. Lisboa: Estampa, 1995.  O comportamento desse religioso demonstra uma preocupação com as características assumidas pela Igreja e com as desigualdades sociais compartilhada no seu tempo pelos(as)");
        enem73.setRes1("senhores feudais.");
        enem73.setRes2("movimentos heréticos.");
        enem73.setRes3("integrantes das Cruzadas.");
        enem73.setRes4("corporações de ofícios.");
        enem73.setRes5("universidades medievais.");
        enem73.setResposta("movimentos heréticos.");
        enem73.setUrl("");
        ListaEnem.add(enem73);


        Pergunta enem74 = new Pergunta();
        enem74.setCategoria("Ciências Humanas e suas Tecnologias");
        enem74.setPergunta("Por que o Brasil continuou um só enquanto a América espanhola se dividiu em vários países?  Para o historiador brasileiro José Murilo de Carvalho, no Brasil, parte da sociedade era muito mais coesa ideologicamente do que a espanhola. Carvalho argumenta que isso se deveu à tradição burocrática portuguesa. “Portugal nunca permitiu a criação de universidades em sua colônia”. Por outro lado, na América espanhola, entre 1772 e 1872, 150 mil estudantes se formaram em universidades locais. Para o historiador mexicano Alfredo Ávila Rueda, as universidades na América espanhola eram, em sua maioria, reacionárias. Nesse sentido, o historiador mexicano diz acreditar que a livre circulação de impressos (jornais, livros e panfletos) na América espanhola, que não era permitida na América portuguesa (a proibição só foi revertida em 1808), teve função muito mais importante na construção de regionalismos do que propriamente as universidades.  BARRUCHO, L. Disponível em: www.bbc.com. Acesso em: 8 set. 2019 (adaptado).  Os pontos de vista dos historiadores referidos no texto são divergentes em relação ao");
        enem74.setRes1("papel desempenhado pelas instituições de ensino na criação das múltiplas identidades.");
        enem74.setRes2("controle exercido pelos grupos de imprensa na centralização das esferas administrativas.");
        enem74.setRes3("abandono sofrido pelas comunidades de docentes na concepção de coletividades políticas.");
        enem74.setRes4("lugar ocupado pelas associações de acadêmicos no fortalecimento das agremiações estudantis.");
        enem74.setRes5("protagonismo assumido pelos meios de comunicação no desenvolvimento das nações alfabetizadas.");
        enem74.setResposta("papel desempenhado pelas instituições de ensino na criação das múltiplas identidades.");
        enem74.setUrl("");
        ListaEnem.add(enem74);


        Pergunta enem75 = new Pergunta();
        enem75.setCategoria("Ciências Humanas e suas Tecnologias");
        enem75.setPergunta("TEXTO I  Macaulay enfatizou o glorioso acontecimento representado pela luta do Parlamento contra Carlos I em prol da liberdade política e religiosa do povo inglês; significou o primeiro confronto entre a liberdade e a tirania real, primeiro combate em favor do Iluminismo e do Liberalismo.  ARRUDA, J. J. A. Perspectivas da Revolução Inglesa. Rev. Bras. Hist., n. 7, 1984 (adaptado).   TEXTO II  A Revolução Inglesa, como todas as revoluções, foi causada pela ruptura da velha sociedade, e não pelos desejos da velha burguesia. Na década de 1640, camponeses se revoltaram contra os cercamentos, tecelões contra a miséria resultante da depressão e os crentes contra o Anticristo a fim de instalar o reino de Cristo na Terra.  HILL, C. Uma revolução burguesa? Rev. Bras. Hist., n. 7, 1984 (adaptado).  A concepção da Revolução Inglesa apresentada no Texto II diferencia-se da do Texto I ao destacar a existência de");
        enem75.setRes1("pluralidade das demandas sociais.");
        enem75.setRes2("homogeneidade das lutas religiosas.");
        enem75.setRes3("unicidade das abordagens históricas.");
        enem75.setRes4("superficialidade dos interesses políticos.");
        enem75.setRes5("superioridade dos aspectos econômicos.");
        enem75.setResposta("pluralidade das demandas sociais.");
        enem75.setUrl("");
        ListaEnem.add(enem75);


        Pergunta enem76 = new Pergunta();
        enem76.setCategoria("Ciências Humanas e suas Tecnologias");
        enem76.setPergunta("As grandes empresas seriam, certamente, representação de um exercício de poder, ante o grau de autonomia de ação de que dispõem. O que se pretende salientar é a ideia de enclave: plantas industriais que estabelecem relações escassas com o entorno, mas exercem grande influência na economia extralocal.  DAVIDOVICH, F. Estado do Rio de Janeiro: o urbano metropolitano. Hipóteses e questões. GeoUERJ, n. 21, 2010.  Que tipo de ação tomada por empresas reflete a forma de territorialização da produção industrial apresentada no texto?");
        enem76.setRes1("Criação de vilas operárias.");
        enem76.setRes2("Promoção de eventos comunitários.");
        enem76.setRes3("Recuperação de áreas degradadas.");
        enem76.setRes4("Incorporação de saberes tradicionais.");
        enem76.setRes5("Importação de mão de obra qualificada.");
        enem76.setResposta("Importação de mão de obra qualificada.");
        enem76.setUrl("");
        ListaEnem.add(enem76);


        Pergunta enem77 = new Pergunta();
        enem77.setCategoria("Ciências Humanas e suas Tecnologias");
        enem77.setPergunta("Numa sociedade em transição, a marcha da mudança, em diferentes graus, está impressa em todos os aspectos da ordem social, especialmente no jogo político, que nessas sociedades sempre apresenta padrões característicos de ambivalência, cujas raízes sociais se encontram na coexistência de dois padrões de estrutura social: o padrão tradicional, em declínio, e o novo, emergente, em expansão. Em tais situações, é possível encontrar, simultaneamente, apoio para uma orientação política ou para outra que seja exatamente o seu oposto. O padrão ambivalente do processo político, nas sociedades em desenvolvimento, é o que explica um dos seus traços mais salientes, e que consiste na tendência ao adiamento das grandes decisões. Resulta daí que a inércia política ou a convulsão política podem se suceder uma à outra em períodos surpreendentemente curtos.  PINTO, L. A. C. Sociologia e desenvolvimento. Rio de Janeiro: Civilização Brasileira, 1975 (adaptado).  De acordo com a perspectiva apresentada, central no pensamento social brasileiro dos anos 1950 e 1960, o desenvolvimento do país foi marcado por");
        enem77.setRes1("radicalidade nas agendas de reforma das elites dirigentes.");
        enem77.setRes2("anomalias na execução dos planos econômicos ortodoxos.");
        enem77.setRes3("descompassos na construção de quadros institucionais modernos.");
        enem77.setRes4("ilegitimidade na atuação dos movimentos de representação classista.");
        enem77.setRes5("vagarosidade na dinâmica de aperfeiçoamento dos programas partidários.");
        enem77.setResposta("descompassos na construção de quadros institucionais modernos.");
        enem77.setUrl("");
        ListaEnem.add(enem77);


        Pergunta enem78 = new Pergunta();
        enem78.setCategoria("Ciências Humanas e suas Tecnologias");
        enem78.setPergunta("Manifesto dos Pioneiros da Educação Nova — 1932  A Educação Nova, alargando a sua finalidade para além dos limites das classes, assume, com uma feição mais humana, a sua verdadeira função social, preparando-se para formar “a hierarquia democrática” pela “hierarquia das capacidades”, recrutadas em todos os grupos sociais, a que se abrem as mesmas oportunidades de educação. Ela tem, por objeto, organizar e desenvolver os meios de ação durável com o fim de “dirigir os desenvolvimentos natural e integral do ser humano em cada uma das etapas de seu crescimento”, de acordo com uma certa concepção do mundo.  Disponível em: www.histedbr.fe.unicamp.br. Acesso em: 7 out. 2015.  Os autores do manifesto citado procuravam contrapor-se ao caráter oligárquico da sociedade brasileira. Nesse sentido, o trecho propõe uma relação necessária entre");
        enem78.setRes1("ensino técnico e mercado de trabalho.");
        enem78.setRes2("acesso à escola e valorização do mérito.");
        enem78.setRes3("ampliação de vagas e formação de gestores.");
        enem78.setRes4("disponibilidade de financiamento e pesquisa avançada.");
        enem78.setRes5("remuneração de professores e extinção do analfabetismo.");
        enem78.setResposta("acesso à escola e valorização do mérito.");
        enem78.setUrl("");
        ListaEnem.add(enem78);


        Pergunta enem79 = new Pergunta();
        enem79.setCategoria("Ciências Humanas e suas Tecnologias");
        enem79.setPergunta("Sócrates: “Quem não sabe o que uma coisa é, como poderia saber de que tipo de coisa ela é? Ou te parece ser possível alguém que não conhece absolutamente quem é Mênon, esse alguém saber se ele é belo, se é rico e ainda se é nobre? Parece-te ser isso possível? Assim, Mênon, que coisa afirmas ser a virtude?”.  PLATÃO. Mênon. Rio de Janeiro: PUC-Rio; São Paulo: Loyola, 2001 (adaptado).  A atitude apresentada na interlocução do filósofo com Mênon é um exemplo da utilização do(a)");
        enem79.setRes1("escrita epistolar.");
        enem79.setRes2("método dialético.");
        enem79.setRes3("linguagem trágica.");
        enem79.setRes4("explicação fisicalista.");
        enem79.setRes5("suspensão judicativa.");
        enem79.setResposta("método dialético.");
        enem79.setUrl("");
        ListaEnem.add(enem79);


        Pergunta enem80 = new Pergunta();
        enem80.setCategoria("Ciências Humanas e suas Tecnologias");
        enem80.setPergunta("No seio de diversos povos africanos, nomeadamente no antigo Reino do Congo, existem testemunhos gráficos de que a escrita tomava várias formas. Exemplo disso são as tampas de panela esculpidas em baixo-relevo do povo Woyo (região de Cabinda), com cenas e provérbios do cotidiano, desenhos na terra ou areia, imagens gravadas ou inscritas nos bastões de chefe ou em pedras sagradas, mas, sobretudo, movimentos do corpo humano inscritos num gestual familiar. Entre os Woyo existia o costume de os pais oferecerem aos filhos testos ou tampas de panelas entalhados, transmitindo uma espécie de recado, com signos codificados que traduziam orientações para conseguir uma boa relação conjugal, ter sensatez na escolha do cônjuge e estar alerta para as dificuldades do casamento.  RODRIGUES, M. R. A. M.; TAVARES, A. C. P. Singularidades museológicas de uma tábua com esculturas em diálogo: do alambamento ao casamento em Cabinda (Angola). Anais do Museu Paulista, n. 2, maio-ago. 2017 (adaptado).  Para o povo Woyo, os artefatos culturais mencionados no texto cumprem a função de uma");
        enem80.setRes1("pedagogia dos costumes sociais.");
        enem80.setRes2("imposição das formas de comunicação.");
        enem80.setRes3("desvalorização dos comportamentos da juventude.");
        enem80.setRes4("destituição dos valores do matrimônio.");
        enem80.setRes5("etnografia das celebrações religiosas.");
        enem80.setResposta("pedagogia dos costumes sociais.");
        enem80.setUrl("");
        ListaEnem.add(enem80);


        Pergunta enem81 = new Pergunta();
        enem81.setCategoria("Ciências Humanas e suas Tecnologias");
        enem81.setPergunta("O torém dependia de organização familiar, sendo brincado por pessoas com vínculos de parentesco e afinidade que viviam no local. Era visto como uma brincadeira, um entretenimento feito para os próprios participantes e seus conhecidos. O tempo do caju era o pretexto para sua realização, sendo chamadas várias pessoas da região a fim de tomar mocororó, bebida fermentada do caju.  VALLE, C. G. O. Torém/Toré: tradições e invenção no quadro de multiplicidade étnica do Ceará contemporâneo. In: GRÜNEWALD, R. A. (Org.). Toré: regime encantado dos índios do Nordeste. Recife: Fundaj-Massangana, 2005.  O ritual mencionado no texto atribui à manifestação cultural de grupos indígenas do Nordeste brasileiro a função de");
        enem81.setRes1("celebrar a história oficial.");
        enem81.setRes2("estimular a coesão social.");
        enem81.setRes3("superar a atividade artesanal.");
        enem81.setRes4("manipular a memória individual.");
        enem81.setRes5("modernizar o comércio tradicional.");
        enem81.setResposta("estimular a coesão social.");
        enem81.setUrl("");
        ListaEnem.add(enem81);


        Pergunta enem82 = new Pergunta();
        enem82.setCategoria("Ciências Humanas e suas Tecnologias");
        enem82.setPergunta("Escravo fugido. Jornal Correio Paulistano, 13 de abril de 1879. Disponível em: http://bndigital.bn.gov.br. Acesso em: 2 ago. 2019 (adaptado).  No anúncio publicado na segunda metade do século XIX, qual a estratégia de resistência escrava apresentada?");
        enem82.setRes1("Criação de relações de trabalho.");
        enem82.setRes2("Fundação de territórios quilombolas.");
        enem82.setRes3("Suavização da aplicação de normas.");
        enem82.setRes4("Regularização das funções remuneradas.");
        enem82.setRes5("Constituição de economia de subsistência.");
        enem82.setResposta("Criação de relações de trabalho.");
        enem82.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex85.png");
        ListaEnem.add(enem82);


        Pergunta enem83 = new Pergunta();
        enem83.setCategoria("Ciências Humanas e suas Tecnologias");
        enem83.setPergunta("A filosofia é como uma árvore, cujas raízes são a metafísica; o tronco, a física, e os ramos que saem do tronco são todas as outras ciências, que se reduzem a três principais: a medicina, a mecânica e a moral, entendendo por moral a mais elevada e a mais perfeita porque pressupõe um saber integral das outras ciências, e é o último grau da sabedoria.  DESCARTES, R. Princípios da filosofia. Lisboa: Edições 70, 1997 (adaptado).  Essa construção alegórica de Descartes, acerca da condição epistemológica da filosofia, tem como objetivo");
        enem83.setRes1("sustentar a unidade essencial do conhecimento.");
        enem83.setRes2("refutar o elemento fundamental das crenças.");
        enem83.setRes3("impulsionar o pensamento especulativo.");
        enem83.setRes4("recepcionar o método experimental.");
        enem83.setRes5("incentivar a suspensão dos juízos.");
        enem83.setResposta("sustentar a unidade essencial do conhecimento.");
        enem83.setUrl("");
        ListaEnem.add(enem83);


        Pergunta enem84 = new Pergunta();
        enem84.setCategoria("Ciências Humanas e suas Tecnologias");
        enem84.setPergunta("Minha fórmula para o que há de grande no indivíduo é amor fati: nada desejar além daquilo que é, nem diante de si, nem atrás de si, nem nos séculos dos séculos. Não se contentar em suportar o inelutável, e ainda menos dissimulá-lo, mas amá-lo.  NIETZSCHE apud FERRY, L. Aprender a viver: filosofia para os novos tempos. Rio de Janeiro: Objetiva, 2010 (adaptado).  Essa fórmula indicada por Nietzsche consiste em uma crítica à tradição cristã que");
        enem84.setRes1("combate as práticas sociais de cunho afetivo.");
        enem84.setRes2("impede o avanço científico no contexto moderno.");
        enem84.setRes3("associa os cultos pagãos à sacralização da natureza.");
        enem84.setRes4("condena os modelos filosóficos da Antiguidade Clássica.");
        enem84.setRes5("consagra a realização humana ao campo transcendental.");
        enem84.setResposta("consagra a realização humana ao campo transcendental.");
        enem84.setUrl("");
        ListaEnem.add(enem84);


        Pergunta enem85 = new Pergunta();
        enem85.setCategoria("Ciências Humanas e suas Tecnologias");
        enem85.setPergunta("É preciso usar de violência e rebater varonilmente os apetites dos sentidos sem atender ao que a carne quer ou não quer, mas trabalhando por sujeitá-la ao espírito, ainda que se revolte. Cumpre castigá-la e curvá-la à sujeição, a tal ponto que esteja disposta para tudo, sabendo contentar-se com pouco e deleitar-se com a simplicidade, sem resmungar por qualquer incômodo.  KEMPIS, T. Imitação de Cristo. Petrópolis: Vozes, 2015.  Qual característica do ascetismo medieval é destacada no texto?");
        enem85.setRes1("Exaltação do ritualismo litúrgico.");
        enem85.setRes2("Afirmação do pensamento racional.");
        enem85.setRes3("Desqualificação da atividade laboral.");
        enem85.setRes4("Condenação da alimentação impura.");
        enem85.setRes5("Desvalorização da materialidade corpórea.");
        enem85.setResposta("Desvalorização da materialidade corpórea.");
        enem85.setUrl("");
        ListaEnem.add(enem85);


        Pergunta enem86 = new Pergunta();
        enem86.setCategoria("Ciências Humanas e suas Tecnologias");
        enem86.setPergunta("Movimento de translação da Terra     Disponível em: www.cdcc.usp.br. Acesso em: 27 jul. 2010 (adaptado).  Considerando as informações apresentadas, o prédio do Congresso Nacional, em Brasília, no dia 21 de junho, às 12 horas, projetará sua sombra para a direção");
        enem86.setRes1("norte.");
        enem86.setRes2("sul.");
        enem86.setRes3("leste.");
        enem86.setRes4("oeste.");
        enem86.setRes5("nordeste.");
        enem86.setResposta("sul.");
        enem86.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex89.png");
        ListaEnem.add(enem86);


        Pergunta enem87 = new Pergunta();
        enem87.setCategoria("Ciências Humanas e suas Tecnologias");
        enem87.setPergunta("TEXTO I     EIGENHEER, E. M. Lixo: a limpeza urbana através dos tempos. Porto Alegre: Gráfica Palloti, 2009.  TEXTO II  A repugnante tarefa de carregar lixo e os dejetos da casa para as praças e praias era geralmente destinada ao único escravo da família ou ao de menor status ou valor. Todas as noites, depois das dez horas, os escravos conhecidos popularmente como “tigres” levavam tubos ou barris de excremento e lixo sobre a cabeça pelas ruas do Rio.  KARASCH, M. C. A vida dos escravos no Rio de Janeiro, 1808-1850. Rio de Janeiro: Cia. das Letras, 2000.  A ação representada na imagem e descrita no texto evidencia uma prática do cotidiano nas cidades no Brasil nos séculos XVIII e XIX caracterizada pela");
        enem87.setRes1("valorização do trabalho braçal.");
        enem87.setRes2("reiteração das hierarquias sociais.");
        enem87.setRes3("sacralização das atividades laborais.");
        enem87.setRes4("superação das exclusões econômicas.");
        enem87.setRes5("ressignificação das heranças religiosas.");
        enem87.setResposta("reiteração das hierarquias sociais.");
        enem87.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex90.png");
        ListaEnem.add(enem87);


        Pergunta enem88 = new Pergunta();
        enem88.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem88.setPergunta("No cultivo por hidroponia, são utilizadas soluções nutritivas contendo macronutrientes e micronutrientes essenciais. Além dos nutrientes, o pH é um parâmetro de extrema importância, uma vez que ele afeta a preparação da solução nutritiva e a absorção dos nutrientes pelas plantas. Para o cultivo de alface, valores de pH entre 5,5 e 6,5 são ideais para o seu desenvolvimento. As correções de pH são feitas pela adição de compostos ácidos ou básicos, mas não devem introduzir elementos nocivos às plantas. Na tabela, são apresentados alguns dados da composição da solução nutritiva de referência para esse cultivo. Também é apresentada a composição de uma solução preparada por um produtor de cultivo hidropônico.     LENZI, E.; FAVERO, L. O. B.; LUCHESE, E. B. Introdução à química da água: ciência, vida e sobrevivência.  Rio de Janeiro: LTC, 2012 (adaptado).  Para correção do pH da solução nutritiva preparada, esse produtor pode empregar uma solução de");
        enem88.setRes1("ácido fosfórico, H3PO4.");
        enem88.setRes2("sulfato de cálcio, CaSO4.");
        enem88.setRes3("óxido de alumínio, Al2O3.");
        enem88.setRes4("cloreto de ferro(II), FeCl2.");
        enem88.setRes5("hidróxido de potássio, KOH.");
        enem88.setResposta("hidróxido de potássio, KOH.");
        enem88.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex91.png");
        ListaEnem.add(enem88);


        Pergunta enem89 = new Pergunta();
        enem89.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem89.setPergunta("O sino dos ventos é composto por várias barras metálicas de mesmo material e espessura, mas de comprimentos diferentes, conforme a figura.     Considere f1 e v1, respectivamente, como a frequência fundamental e a velocidade de propagação do som emitido pela barra de menor comprimento, e f2 e v2 são essas mesmas grandezas para o som emitido pela barra de maior comprimento.  As relações entre as frequências fundamentais e entre as velocidades de propagação são, respectivamente,");
        enem89.setRes1("f1 < f2 e v1 < v2.");
        enem89.setRes2("f1 < f2 e v1 = v2.");
        enem89.setRes3("f1 < f2 e v1 > v2.");
        enem89.setRes4("f1 > f2 e v1 = v2.");
        enem89.setRes5("f1 > f2 e v1 > v2.");
        enem89.setResposta("f1 > f2 e v1 = v2.");
        enem89.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex92.png");
        ListaEnem.add(enem89);


        Pergunta enem90 = new Pergunta();
        enem90.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem90.setPergunta("O polvo mimético apresenta padrões cromáticos e comportamentos muito curiosos. Frequentemente, muda a orientação de seus tentáculos, assemelhando-se a alguns animais. As imagens 1, 3 e 5 apresentam polvos mimetizando, respectivamente, um peixe-linguado (2), um peixe-leão (4) e uma serpente-marinha (6).     NORMAN, M. D.; FINN, J.; TREGENZA, T. Dynamic mimicry in an Indo-Malayan octopus. In: Proceedings of the Royal Society B: Biological Sciences, n. 268, out. 2001. Disponível em: www.researchgate.net. Acesso em: 15 mar. 2014 (adaptado).  Do ponto de vista evolutivo, a capacidade apresentada se estabeleceu porque os polvos");
        enem90.setRes1("originaram-se do mesmo ancestral que esses animais.");
        enem90.setRes2("passaram por mutações similares a esses organismos.");
        enem90.setRes3("observaram esses animais em seus nichos ecológicos.");
        enem90.setRes4("resultaram de convergência adaptativa com essas espécies.");
        enem90.setRes5("sobreviveram às pressões seletivas com esses comportamentos.");
        enem90.setResposta("sobreviveram às pressões seletivas com esses comportamentos.");
        enem90.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex93.png");
        ListaEnem.add(enem90);


        Pergunta enem91 = new Pergunta();
        enem91.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem91.setPergunta("A figura foi extraída de um antigo jogo para computadores, chamado Bang! Bang!     No jogo, dois competidores controlam os canhões A e B, disparando balas alternadamente com o objetivo de atingir o canhão do adversário; para isso, atribuem valores estimados para o módulo da velocidade inicial de disparo ( ) e para o ângulo de disparo (θ).  Em determinado momento de uma partida, o competidor B deve disparar; ele sabe que a bala disparada anteriormente, θ = 53°, passou tangenciando o ponto P.  No jogo, é igual a 10 m/s2. Considere sen 53° = 0,8, cos 53° = 0,6 e desprezível a ação de forças dissipativas.  Disponível em: http://mebdownloads.butzke.net.br. Acesso em: 18 abr. 2015 (adaptado).  Com base nas distâncias dadas e mantendo o último ângulo de disparo, qual deveria ser, aproximadamente, o menor valor de que permitiria ao disparo efetuado pelo canhão B atingir o canhão A?");
        enem91.setRes1("30 m/s.");
        enem91.setRes2("35 m/s.");
        enem91.setRes3("40 m/s.");
        enem91.setRes4("45 m/s.");
        enem91.setRes5("50 m/s.");
        enem91.setResposta("40 m/s.");
        enem91.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex94.png");
        ListaEnem.add(enem91);


        Pergunta enem92 = new Pergunta();
        enem92.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem92.setPergunta("Os pesticidas organoclorados foram amplamente empregados na agricultura, contudo, em razão das suas elevadas toxicidades e persistências no meio ambiente, eles foram banidos. Considere a aplicação de 500 g de um pesticida organoclorado em uma cultura e que, em certas condições, o tempo de meia-vida do pesticida no solo seja de 5 anos.  A massa do pesticida no decorrer de 35 anos será mais próxima de");
        enem92.setRes1("3,9 g.");
        enem92.setRes2("31,2 g.");
        enem92.setRes3("62,5 g.");
        enem92.setRes4("125,0 g.");
        enem92.setRes5("250,0 g.");
        enem92.setResposta("3,9 g.");
        enem92.setUrl("");
        ListaEnem.add(enem92);


        Pergunta enem93 = new Pergunta();
        enem93.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem93.setPergunta("A sequência de nucleotídeos do RNA mensageiro presentes em um gene de um fungo, constituída de sete códons, está escrita a seguir.     Pesquisadores submeteram a sequência a mutações independentes. Sabe-se que os códons UAG e UAA são terminais, ou seja, indicam a interrupção da tradução.    Qual mutação produzirá a menor proteína?");
        enem93.setRes1("Deleção de G no códon 3.");
        enem93.setRes2("Substituição de C por U no códon 4.");
        enem93.setRes3("Substituição de G por C no códon 6.");
        enem93.setRes4("Substituição de A por G no códon 7.");
        enem93.setRes5("Deleção dos dois primeiros nucleotídeos no códon 5.");
        enem93.setResposta("Substituição de C por U no códon 4.");
        enem93.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex96.png");
        ListaEnem.add(enem93);


        Pergunta enem94 = new Pergunta();
        enem94.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem94.setPergunta("A simples atitude de não jogar direto no lixo ou no ralo da pia o óleo de cozinha usado pode contribuir para a redução da poluição ambiental. Mas o que fazer com o óleo vegetal que não será mais usado? Não existe um modelo ideal de descarte, mas uma alternativa simples tem sido reaproveitá-lo para fazer sabão. Para isso, são necessários, além do próprio óleo, água e soda cáustica.  LOBO, I. Sabão feito com óleo de cozinha. Disponível em: http://pga.pgr.mpf.gov.br.  Acesso em: 29 fev. 2012 (adaptado).  Com base no texto, a reação química que permite o reaproveitamento do óleo vegetal é denominada");
        enem94.setRes1("redução.");
        enem94.setRes2("epoxidação.");
        enem94.setRes3("substituição.");
        enem94.setRes4("esterificação.");
        enem94.setRes5("saponificação.");
        enem94.setResposta("saponificação.");
        enem94.setUrl("");
        ListaEnem.add(enem94);


        Pergunta enem95 = new Pergunta();
        enem95.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem95.setPergunta("Durante o desenvolvimento embrionário humano ocorre uma comunicação entre os átrios direito e esquerdo através do forame oval (ou forame de Botal). Essa comunicação não causa prejuízos à circulação do bebê em formação, exceto se ela perdurar após o nascimento.  Os prejuízos no período embrionário são evitados porque a circulação fetal se assemelha à dos(as)");
        enem95.setRes1("aves, porque a pequena circulação e a grande circulação estão presentes.");
        enem95.setRes2("répteis, porque a mistura de sangue é minimizada por um metabolismo lento.");
        enem95.setRes3("crocodilianos, porque a separação dos ventrículos impede a mistura sanguínea.   peixes, porque a circulação é simples, ocorrendo uma passagem única pelo");
        enem95.setRes4("oração.   anfíbios, porque pressões diferenciais isolam temporalmente o sangue venoso do");
        enem95.setRes5("rterial.");
        enem95.setResposta("oração.   anfíbios, porque pressões diferenciais isolam temporalmente o sangue venoso do");
        enem95.setUrl("");
        ListaEnem.add(enem95);


        Pergunta enem96 = new Pergunta();
        enem96.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem96.setPergunta("Na cidade de São Paulo, as ilhas de calor são responsáveis pela alteração da direção do fluxo da brisa marítima que deveria atingir a região de mananciais. Mas, ao cruzar a ilha de calor, a brisa marítima agora encontra um fluxo de ar vertical, que transfere para ela energia térmica absorvida das superfícies quentes da cidade, deslocando-a para altas altitudes. Dessa maneira, há condensação e chuvas fortes no centro da cidade, em vez de na região de mananciais. A imagem apresenta os três subsistemas que trocam energia nesse fenômeno.     No processo de fortes chuvas no centro da cidade de São Paulo, há dois mecanismos dominantes de transferência de calor: entre o Sol e a ilha de calor, e entre a ilha de calor e a brisa marítima.  VIVEIROS, M. Ilhas de calor afastam chuvas de represas. Disponível em: www2.feis.unesp.br.  Acesso em: 3 dez. 2019 (adaptado).  Esses mecanismos são, respectivamente,");
        enem96.setRes1("irradiação e convecção.");
        enem96.setRes2("irradiação e irradiação.");
        enem96.setRes3("condução e irradiação.");
        enem96.setRes4("convecção e irradiação.");
        enem96.setRes5("convecção e convecção.");
        enem96.setResposta("irradiação e convecção.");
        enem96.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex99.png");
        ListaEnem.add(enem96);


        Pergunta enem97 = new Pergunta();
        enem97.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem97.setPergunta("No seu estudo sobre a queda dos corpos, Aristóteles afirmava que se abandonarmos corpos leves e pesados de uma mesma altura, o mais pesado chegaria mais rápido ao solo. Essa ideia está apoiada em algo que é difícil de refutar, a observação direta da realidade baseada no senso comum.  Após uma aula de física, dois colegas estavam discutindo sobre a queda dos corpos, e um tentava convencer o outro de que tinha razão:  Colega A: “O corpo mais pesado cai mais rápido que um menos pesado, quando largado de uma mesma altura. Eu provo, largando uma pedra e uma rolha. A pedra chega antes. Pronto! Tá provado!”.  Colega B: “Eu não acho! Peguei uma folha de papel esticado e deixei cair. Quando amassei, ela caiu mais rápido. Como isso é possível? Se era a mesma folha de papel, deveria cair do mesmo jeito. Tem que ter outra explicação!”.  HÜLSENDEGER, M. Uma análise das concepções dos alunos sobre a queda dos corpos. Caderno Brasileiro de Ensino de Física, n. 3, dez. 2004 (adaptado).  O aspecto físico comum que explica a diferença de comportamento dos corpos em queda nessa discussão é o(a)");
        enem97.setRes1("peso dos corpos.");
        enem97.setRes2("resistência do ar.");
        enem97.setRes3("massa dos corpos.");
        enem97.setRes4("densidade dos corpos.");
        enem97.setRes5("aceleração da gravidade.");
        enem97.setResposta("resistência do ar.");
        enem97.setUrl("");
        ListaEnem.add(enem97);


        Pergunta enem98 = new Pergunta();
        enem98.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem98.setPergunta("A obtenção de etanol utilizando a cana-de-açúcar envolve a fermentação dos monossacarídeos formadores da sacarose contida no melaço. Um desses formadores é a glicose (C6 H12 O6), cuja fermentação produz cerca de 50 g de etanol a partir de 100 g de glicose, conforme a equação química descrita.     Em uma condição específica de fermentação, obtém-se 80% de conversão em etanol que, após sua purificação, apresenta densidade igual a 0,80 g/mL. O melaço utilizado apresentou 50 kg de monossacarídeos na forma de glicose.  O volume de etanol, em litro, obtido nesse processo é mais próximo de");
        enem98.setRes1("16.");
        enem98.setRes2("20.");
        enem98.setRes3("25.");
        enem98.setRes4("64.");
        enem98.setRes5("100.");
        enem98.setResposta("25.");
        enem98.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex101.png");
        ListaEnem.add(enem98);


        Pergunta enem99 = new Pergunta();
        enem99.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem99.setPergunta("Um técnico analisou um lote de analgésicos que supostamente estava fora das especificações. A composição prevista era 100 mg de ácido acetilsalicílico por comprimido (princípio ativo, cuja estrutura está apresentada na figura), além do amido e da celulose (componentes inertes). O técnico realizou os seguintes testes:  1) obtenção da massa do comprimido;  2) medição da densidade do comprimido;  3) verificação do pH com papel indicador;  4) determinação da temperatura de fusão do comprimido;  5) titulação com solução aquosa de NaOH.  Após a realização dos testes, o lote do medicamento foi reprovado porque a quantidade de ácido acetilsalicílico por comprimido foi de apenas 40% da esperada.     O teste que permitiu reprovar o lote de analgésicos foi o de número");
        enem99.setRes1("1.");
        enem99.setRes2("2.");
        enem99.setRes3("3.");
        enem99.setRes4("4.");
        enem99.setRes5("5.");
        enem99.setResposta("5.");
        enem99.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex103.png");
        ListaEnem.add(enem99);


        Pergunta enem100 = new Pergunta();
        enem100.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem100.setPergunta("O rompimento da barragem de rejeitos de mineração no município mineiro de Mariana e o derramamento de produtos tóxicos nas águas do Rio Doce, ocorridos em 2015, ainda têm consequências para os organismos que habitam o Parque Nacional Marinho de Abrolhos, localizado a mais de 1 000 quilômetros de distância. Esse desastre ambiental afetou o fitoplâncton, as esponjas, as algas macroscópicas, os peixes herbívoros e os golfinhos.  FRAINER, G.; SICILIANO, S.; TAVARES, D. C. Franciscana calls for help: [...]. International Whaling Commission, Conference Paper, jun. 2016 (adaptado).  Concentrações mais elevadas dos compostos citados são encontradas em");
        enem100.setRes1("esponjas.");
        enem100.setRes2("golfinhos.");
        enem100.setRes3("fitoplâncton.");
        enem100.setRes4("peixes herbívoros.");
        enem100.setRes5("algas macroscópicas.");
        enem100.setResposta("golfinhos.");
        enem100.setUrl("");
        ListaEnem.add(enem100);


        Pergunta enem101 = new Pergunta();
        enem101.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem101.setPergunta("A icterícia, popularmente conhecida por amarelão, é uma patologia frequente em recém-nascidos. Um bebê com icterícia não consegue metabolizar e excretar de forma eficiente a bilirrubina. Com isso, o acúmulo dessa substância deixa-o com a pele amarelada. A fototerapia é um tratamento da icterícia neonatal, que consiste na irradiação de luz no bebê. Na presença de luz, a bilirrubina é convertida no seu isômero lumirrubina que, por ser mais solúvel em água, é excretada pela bile ou pela urina. A imagem ilustra o que ocorre nesse tratamento.  MOREIRA, M. et al. O recém-nascido de alto risco: teoria e prática do cuidar [on-line].  Rio de Janeiro: Fiocruz, 2004 (adaptado).     WANG,J.et.al.Challenges of phototherapy for neonatal hyperbilirubinemia (Review). Experimental and Therapeutic Medicine, n. 21, 2021 (adaptado).  Na fototerapia, a luz provoca a conversão da bilirrubina no seu isômero");
        enem101.setRes1("ótico.");
        enem101.setRes2("funcional.");
        enem101.setRes3("de cadeia.");
        enem101.setRes4("de posição.");
        enem101.setRes5("geométrico.");
        enem101.setResposta("de cadeia.");
        enem101.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex106.png");
        ListaEnem.add(enem101);


        Pergunta enem102 = new Pergunta();
        enem102.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem102.setPergunta("Analisando a ficha técnica de um automóvel popular, verificam-se algumas características em relação ao seu desempenho. Considerando o mesmo automóvel em duas versões, uma delas funcionando a álcool e outra, a gasolina, tem-se os dados apresentados no quadro, em relação ao desempenho de cada motor.     Considerando desprezível a resistência do ar, qual versão apresenta a maior potência?    Como a versão a gasolina consegue a maior aceleração, esta é a que desenvolve");
        enem102.setRes1("maior potência.   Como a versão a gasolina atinge o maior valor de energia cinética, esta é a que");
        enem102.setRes2("esenvolve a maior potência.   Como a versão a álcool apresenta a maior taxa de variação de energia cinética,");
        enem102.setRes3("sta é a que desenvolve a maior potência.   Como ambas as versões apresentam a mesma variação de velocidade no cálculo");
        enem102.setRes4("a aceleração, a potência desenvolvida é a mesma.   Como a versão a gasolina fica com o motor trabalhando por mais tempo para");
        enem102.setRes5("tingir os 100 km/h, esta é a que desenvolve a maior potência.");
        enem102.setResposta("sta é a que desenvolve a maior potência.   Como ambas as versões apresentam a mesma variação de velocidade no cálculo");
        enem102.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex107.png");
        ListaEnem.add(enem102);


        Pergunta enem103 = new Pergunta();
        enem103.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem103.setPergunta("TEXTO I  No cordel intitulado Senhor dos Anéis, de autoria de Gonçalo Ferreira da Silva, lê-se a sextilha:  A distância em relação  Ao nosso planeta amado  Pouco menos que a do Sol  Ele está distanciado  E menos denso que a água  Quando no normal estado  MEDEIROS, A.; AGRA, J. T. M., A astronomia na literatura de cordel, Física na Escola, n. 1, abr. 2010 (fragmento).   TEXTO II  Distâncias médias dos planetas ao Sol e suas densidades médias     Características dos planetas. Disponível em: www.astronoo.com. Acesso em: 8 nov. 2019 (adaptado).  Considerando os versos da sextilha e as informações da tabela, a qual planeta o cordel faz referência?");
        enem103.setRes1("Mercúrio.");
        enem103.setRes2("Júpiter.");
        enem103.setRes3("Urano.");
        enem103.setRes4("Saturno.");
        enem103.setRes5("Netuno.");
        enem103.setResposta("Saturno.");
        enem103.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex108.png");
        ListaEnem.add(enem103);


        Pergunta enem104 = new Pergunta();
        enem104.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem104.setPergunta("Cientistas da Universidade de New South Wales, na Austrália, demonstraram em 2012 que a Lei de Ohm é válida mesmo para fios finíssimos, cuja área da seção reta compreende alguns poucos átomos. A tabela apresenta as áreas e comprimentos de alguns dos fios construídos (respectivamente com as mesmas unidades de medida). Considere que a resistividade mantém-se constante para todas as geometrias (uma aproximação confirmada pelo estudo).     WEBER, S. B. et al. Ohm’s Law Survives to the Atomic Scale. Science, n. 335, jan. 2012 (adaptado).   As resistências elétricas dos fios, em ordem crescente, são");
        enem104.setRes1("R1 < R2 < R3 < R4.");
        enem104.setRes2("R2 < R1 < R3 < R4.");
        enem104.setRes3("R2 < R3 < R1 < R4.");
        enem104.setRes4("R4 < R1 < R3 < R2.");
        enem104.setRes5("R4 < R3 < R2 < R1.");
        enem104.setResposta("R2 < R3 < R1 < R4.");
        enem104.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex109.png");
        ListaEnem.add(enem104);


        Pergunta enem105 = new Pergunta();
        enem105.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem105.setPergunta("Organismos autótrofos e heterótrofos realizam processos complementares que associam os ciclos do carbono e do oxigênio. O carbono fixado pela energia luminosa ou a partir de compostos inorgânicos é eventualmente degradado pelos organismos, resultando em fontes de carbono como metano ou gás carbônico. Ainda, outros compostos orgânicos são catabolizados pelos seres, com menor rendimento energético, produzindo compostos secundários (subprodutos) que podem funcionar como combustíveis ambientais.  O processo metabólico associado à expressão combustíveis ambientais é a");
        enem105.setRes1("fotossíntese.");
        enem105.setRes2("fermentação.");
        enem105.setRes3("quimiossíntese.");
        enem105.setRes4("respiração aeróbica.");
        enem105.setRes5("fosforilação oxidativa.");
        enem105.setResposta("fermentação.");
        enem105.setUrl("");
        ListaEnem.add(enem105);


        Pergunta enem106 = new Pergunta();
        enem106.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem106.setPergunta("Uma escola iniciou o processo educativo para implantação da coleta seletiva e destino de materiais recicláveis. Para atingir seus objetivos, a instituição planejou:  1) sensibilizar a comunidade escolar, desenvolvendo atividades em sala e extraclasse de maneira contínua; 2) capacitar o pessoal responsável pela limpeza da escola quanto aos novos procedimentos adotados com a coleta seletiva; e 3) distribuir coletores de materiais recicláveis específicos nas salas, pátio e outros ambientes para acondicionamento dos resíduos.  Para completar a ação proposta no ambiente escolar, o que falta ser inserido no planejamento?    Realizar campanhas educativas de sensibilização em bairros vizinhos para");
        enem106.setRes1("ortalecer a coleta seletiva.   Firmar parceria com a prefeitura ou cooperativa de catadores para recolhimento");
        enem106.setRes2("os materiais recicláveis e destinação apropriada.   Organizar visitas ao lixão ou aterro local para identificar aspectos importantes");
        enem106.setRes3("obre a disposição final do lixo.   Divulgar na rádio local, no jornal impresso e nas redes sociais que a escola está");
        enem106.setRes4("ealizando a coleta seletiva.   Colocar recipientes coletores de lixo reciclável fora da escola para entrega");
        enem106.setRes5("oluntária pela população.");
        enem106.setResposta("os materiais recicláveis e destinação apropriada.   Organizar visitas ao lixão ou aterro local para identificar aspectos importantes");
        enem106.setUrl("");
        ListaEnem.add(enem106);


        Pergunta enem107 = new Pergunta();
        enem107.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem107.setPergunta("Os búfalos são animais considerados rústicos pelos criadores e, por isso, são deixados no campo sem controle reprodutivo. Por causa desse tipo de criação, a consanguinidade é favorecida, proporcionando o aparecimento de enfermidades, como o albinismo, defeitos cardíacos, entre outros. Separar os animais de forma adequada minimizaria a ocorrência desses problemas.  DAMÉ, M. C. F.; RIET-CORREA, F.; SCHILD, A. L. Pesq. Vet. Bras, n. 7, 2013 (adaptado).  Qual procedimento biotecnológico prévio é recomendado nessa situação?");
        enem107.setRes1("Transgenia.");
        enem107.setRes2("Terapia gênica.");
        enem107.setRes3("Vacina de DNA.");
        enem107.setRes4("Clonagem terapêutica.");
        enem107.setRes5("Mapeamento genético.");
        enem107.setResposta("Mapeamento genético.");
        enem107.setUrl("");
        ListaEnem.add(enem107);


        Pergunta enem108 = new Pergunta();
        enem108.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem108.setPergunta("O ciclo do cobre é um experimento didático em que o cobre metálico é utilizado como reagente de partida. Após uma sequência de reações (I, II, III, IV e V), o cobre retorna ao seu estado inicial ao final do ciclo.     A reação de redução do cobre ocorre na etapa");
        enem108.setRes1("I.");
        enem108.setRes2("II.");
        enem108.setRes3("III.");
        enem108.setRes4("IV.");
        enem108.setRes5("V.");
        enem108.setResposta("V.");
        enem108.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex113.png");
        ListaEnem.add(enem108);


        Pergunta enem109 = new Pergunta();
        enem109.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem109.setPergunta("Um dos exames clínicos mais tradicionais para medir a capacidade reflexa dos indivíduos é o exame do reflexo patelar. Esse exame consiste na estimulação da patela, um pequeno osso localizado na parte anterior da articulação do joelho, com um pequeno martelo. A resposta reflexa ao estímulo é caracterizada pelo levantamento da perna em que o estímulo foi aplicado.  Qual região específica do sistema nervoso coordena essa resposta?");
        enem109.setRes1("Ponte.");
        enem109.setRes2("Medula.");
        enem109.setRes3("Cerebelo.");
        enem109.setRes4("Hipotálamo.");
        enem109.setRes5("Neuro-hipófise.");
        enem109.setResposta("Medula.");
        enem109.setUrl("");
        ListaEnem.add(enem109);


        Pergunta enem110 = new Pergunta();
        enem110.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem110.setPergunta("Na montagem de uma cozinha para um restaurante, a escolha do material correto para as panelas é importante, pois a panela que conduz mais calor é capaz de cozinhar os alimentos mais rapidamente e, com isso, há economia de gás. A taxa de condução do calor depende da condutividade k do material, de sua área A, da diferença de temperatura  ΔT e da espessura d do material, sendo dada pela relação . Em panelas    com dois materiais, a taxa de condução é dada por , em que d1 e d2 são   as espessuras dos dois materiais, e k1 e k2 são as condutividades de cada material. Os materiais mais comuns no mercado para panelas são o alumínio (k = 20 W/m K), o ferro (k = 8 W/m K) e o aço (k = 5 W/m K) combinado com o cobre (k = 40 W/m K).  Compara-se uma panela de ferro, uma de alumínio e uma composta de da  espessura em cobre e da espessura em aço, todas com a mesma espessura total e  com a mesma área de fundo.  A ordem crescente da mais econômica para a menos econômica é");
        enem110.setRes1("cobre-aço, alumínio e ferro.");
        enem110.setRes2("alumínio, cobre-aço e ferro.");
        enem110.setRes3("cobre-aço, ferro e alumínio.");
        enem110.setRes4("alumínio, ferro e cobre-aço.");
        enem110.setRes5("ferro, alumínio e cobre-aço.");
        enem110.setResposta("alumínio, cobre-aço e ferro.");
        enem110.setUrl("");
        ListaEnem.add(enem110);


        Pergunta enem111 = new Pergunta();
        enem111.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem111.setPergunta("As águas subterrâneas têm sido contaminadas pelo uso de pesticidas na agricultura. Entre as várias substâncias usualmente encontradas, algumas são apresentadas na figura. A distinção dessas substâncias pode ser feita por meio de uma análise química qualitativa, ou seja, determinando sua presença mediante a adição de um reagente específico. O hidróxido de sódio é capaz de identificar a presença de um desses pesticidas pela reação ácido-base de Brönsted-Lowry.     O teste positivo será observado com o pesticida");
        enem111.setRes1("I.");
        enem111.setRes2("II.");
        enem111.setRes3("III.");
        enem111.setRes4("IV.");
        enem111.setRes5("V.");
        enem111.setResposta("III.");
        enem111.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex116.png");
        ListaEnem.add(enem111);


        Pergunta enem112 = new Pergunta();
        enem112.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem112.setPergunta("Com o aumento da população de suínos no Brasil, torna-se necessária a adoção de métodos para reduzir o potencial poluidor dos resíduos dessa agroindústria, uma vez que, comparativamente ao esgoto doméstico, os dejetos suínos são 200 vezes mais poluentes. Sendo assim, a utilização desses resíduos como matéria-prima na obtenção de combustíveis é uma alternativa que permite diversificar a matriz energética nacional, ao mesmo tempo em que parte dos recursos hídricos do país são preservados.  BECK, A. M. Resíduos suínos como alternativa energética sustentável. XXVII Encontro Nacional de Engenharia de Produção. Anais ENEGEP, Foz do Iguaçu, 2007 (adaptado).  O biocombustível a que se refere o texto é o");
        enem112.setRes1("etanol.");
        enem112.setRes2("biogás.");
        enem112.setRes3("butano.");
        enem112.setRes4("metanol.");
        enem112.setRes5("biodiesel.");
        enem112.setResposta("biogás.");
        enem112.setUrl("");
        ListaEnem.add(enem112);


        Pergunta enem113 = new Pergunta();
        enem113.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem113.setPergunta("A curcumina, uma das substâncias que confere a cor alaranjada ao açafrão, pode auxiliar no combate à dengue quando adicionada à água de criadouros do mosquito transmissor. Essa substância acumula-se no intestino do inseto após ser ingerida com a água do criadouro e, quando ativada pela luz, induz a produção de espécies reativas de oxigênio que danificam de forma fatal o tecido do tubo digestório.  TOLEDO, K. Corante extraído do açafrão pode ser útil no combate à dengue. Disponível em: http://agencia.fapesp.br. Acesso em: 25 abr. 2015 (adaptado).  A forma de combate relatada tem como atividade o(a)");
        enem113.setRes1("morte do indivíduo adulto.");
        enem113.setRes2("redução da eclosão dos ovos.");
        enem113.setRes3("comprometimento da metamorfose.");
        enem113.setRes4("impedimento do desenvolvimento da larva.");
        enem113.setRes5("repelência da forma transmissora da doença.");
        enem113.setResposta("impedimento do desenvolvimento da larva.");
        enem113.setUrl("");
        ListaEnem.add(enem113);


        Pergunta enem114 = new Pergunta();
        enem114.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem114.setPergunta("Com o objetivo de identificar a melhor espécie produtora de madeira para construção (com resistência mecânica e à degradação), foram analisadas as estruturas anatômicas de cinco espécies, conforme o quadro.     Qual espécie corresponde ao objetivo proposto?");
        enem114.setRes1("1");
        enem114.setRes2("2");
        enem114.setRes3("3");
        enem114.setRes4("4");
        enem114.setRes5("5");
        enem114.setResposta("1");
        enem114.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex119.png");
        ListaEnem.add(enem114);


        Pergunta enem115 = new Pergunta();
        enem115.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem115.setPergunta("No outono, as folhas das árvores mudam de cor, de verde para tons de amarelo, castanho, laranja e vermelho. A cor verde das folhas deve-se ao pigmento clorofila. Nas plantas de folhas caducas, a produção de clorofila diminui e o tom verde desvanece, permitindo assim que outros pigmentos, como o caroteno, de coloração amarelo-alaranjado, e a antocianina, de tons avermelhados, passem a dominar a tonalidade das folhas. A coloração observada se dá em função da interação desses pigmentos com a radiação solar.  Conforme apresentado no espectro de absorção, as moléculas de clorofila absorvem a radiação solar nas regiões do azul e do vermelho, assim a luz refletida pelas folhas tem falta desses dois tons e as vemos na cor verde. Já as antocianinas absorvem a luz desde o azul até o verde. Nesse caso, a luz refletida pelas folhas que contêm antocianinas aparece conforme as cores complementares, ou seja, vermelho-alaranjado.     Disponível em: https://vidauniversoydemas.wordpress.com. Acesso em: 6 dez. 2017 (adaptado).  Em qual faixa do espectro visível os carotenos absorvem majoritariamente?");
        enem115.setRes1("Entre o violeta e o azul.");
        enem115.setRes2("Entre o azul e o verde.");
        enem115.setRes3("Entre o verde e o amarelo.");
        enem115.setRes4("Entre o amarelo e o laranja.");
        enem115.setRes5("Entre o laranja e o vermelho.");
        enem115.setResposta("Entre o violeta e o azul.");
        enem115.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex120.png");
        ListaEnem.add(enem115);


        Pergunta enem116 = new Pergunta();
        enem116.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem116.setPergunta("Entre 2014 e 2016, as regiões central e oeste da África sofreram uma grave epidemia de febre hemorrágica causada pelo vírus ebola, que se manifesta em até 21 dias após a infecção e cuja taxa de letalidade (enfermos que vão a óbito) pode chegar a 90%. Em regiões de clima tropical e subtropical, um outro vírus também pode causar febre hemorrágica: o vírus da dengue, que, embora tenha período de incubação menor (até 10 dias), apresenta taxa de letalidade abaixo de 1%.  Disponível em: www.who.int. Acesso em: 1 fev. 2017 (adaptado).  Segundo as informações do texto e aplicando princípios de evolução biológica às relações do tipo patógeno-hospedeiro, qual dos dois vírus infecta seres humanos há mais tempo?    Ebola, pois o maior período de incubação reflete duração mais longa do processo");
        enem116.setRes1("e coevolução patógeno-hospedeiro.   Dengue, pois o menor período de incubação reflete duração mais longa do");
        enem116.setRes2("rocesso de coevolução patógeno-hospedeiro.   Ebola, cuja alta letalidade indica maior eficiência do vírus em parasitar seus");
        enem116.setRes3("ospedeiros, estabelecida ao longo de sua evolução.   Ebola, cujos surtos epidêmicos concentram-se no continente africano,");
        enem116.setRes4("econhecido como berço da origem evolutiva dos seres humanos.   Dengue, cuja baixa letalidade indica maior eficiência do vírus em parasitar seus");
        enem116.setRes5("ospedeiros, estabelecida ao longo da coevolução patógeno-hospedeiro.");
        enem116.setResposta("ospedeiros, estabelecida ao longo da coevolução patógeno-hospedeiro.");
        enem116.setUrl("");
        ListaEnem.add(enem116);


        Pergunta enem117 = new Pergunta();
        enem117.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem117.setPergunta("A imagem apresenta as etapas do funcionamento de uma estação individual para tratamento do esgoto residencial.     TAVARES, K. Estações de tratamento de esgoto individuais permitem a reutilização da água. Disponível em: https://extra.globo.com. Acesso em: 18 nov. 2014 (adaptado).  Em qual etapa decanta-se o lodo a ser separado do esgoto residencial?");
        enem117.setRes1("1");
        enem117.setRes2("2");
        enem117.setRes3("3");
        enem117.setRes4("5");
        enem117.setRes5("6");
        enem117.setResposta("3");
        enem117.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex122.png");
        ListaEnem.add(enem117);


        Pergunta enem118 = new Pergunta();
        enem118.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem118.setPergunta("O plantio por estaquia é um método de propagação de plantas no qual partes de um espécime são colocadas no solo para produzir novas gerações. Na floricultura, é comum utilizar o caule das roseiras para estaquia, pois a propagação da planta é positiva em razão da aplicação de auxinas na porção inferior do caule.  A utilização de auxinas no método de estaquia das roseiras contribui para");
        enem118.setRes1("floração da planta.");
        enem118.setRes2("produção de gemas laterais.");
        enem118.setRes3("formação de folhas maiores.");
        enem118.setRes4("formação de raízes adventícias.");
        enem118.setRes5("produção de compostos energéticos.");
        enem118.setResposta("formação de raízes adventícias.");
        enem118.setUrl("");
        ListaEnem.add(enem118);


        Pergunta enem119 = new Pergunta();
        enem119.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem119.setPergunta("O emprego de células de combustível a hidrogênio pode ser uma tecnologia adequada ao transporte automotivo. O quadro apresenta características de cinco tecnologias mais proeminentes de células de combustível.     Testes operacionais com esses tipos de células têm indicado que as melhores alternativas para veículos são as que operam em baixos níveis de energia térmica, são formadas por membranas de eletrólitos poliméricos e ocorrem em meio ácido.  THOMAS, S; ZALBOWITZ, M. Full cells: green power. Los Alamos National Laboratory.  Los Alamos, NM, 1999 (adaptado).  A tecnologia testada mais adequada para o emprego em veículos automotivos é a célula de combustível");
        enem119.setRes1("AFC.");
        enem119.setRes2("MSFC.");
        enem119.setRes3("PEM.");
        enem119.setRes4("PAFC.");
        enem119.setRes5("SOFC.");
        enem119.setResposta("PEM.");
        enem119.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex124.png");
        ListaEnem.add(enem119);


        Pergunta enem120 = new Pergunta();
        enem120.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem120.setPergunta("Considere a tirinha, na situação em que a temperatura do ambiente é inferior à temperatura corporal dos personagens.     WATTERSON, B. Disponível em: https://novaescola.org.br. Acesso em: 11 ago. 2014.  O incômodo mencionado pelo personagem da tirinha deve-se ao fato de que, em dias úmidos,");
        enem120.setRes1("a temperatura do vapor-d’água presente no ar é alta.");
        enem120.setRes2("o suor apresenta maior dificuldade para evaporar do corpo.");
        enem120.setRes3("a taxa de absorção de radiação pelo corpo torna-se maior.");
        enem120.setRes4("o ar torna-se mau condutor e dificulta o processo de liberação de calor.");
        enem120.setRes5("o vapor-d’água presente no ar condensa-se ao entrar em contato com a pele.");
        enem120.setResposta("o suor apresenta maior dificuldade para evaporar do corpo.");
        enem120.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex125.png");
        ListaEnem.add(enem120);


        Pergunta enem121 = new Pergunta();
        enem121.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem121.setPergunta("Estudo aponta que a extinção de preguiças-gigantes, cuja base da dieta eram frutos e sementes, provocou impactos consideráveis na vegetação do Pantanal brasileiro. A flora, embora não tenha desaparecido, tornou-se menos abundante que no passado, além de ocupar áreas mais restritas.  BICUDO, F. Jardineiros da pesada. Ecologia. Pesquisa Fapesp, ed. 231, maio 2015 (adaptado).  O evento descrito com a flora ocorreu em razão da redução");
        enem121.setRes1("da produção de flores.");
        enem121.setRes2("do tamanho das plantas.");
        enem121.setRes3("de fatores de disseminação das sementes.");
        enem121.setRes4("da quantidade de sementes por fruto.");
        enem121.setRes5("dos hábitats disponíveis para as plantas.");
        enem121.setResposta("de fatores de disseminação das sementes.");
        enem121.setUrl("");
        ListaEnem.add(enem121);


        Pergunta enem122 = new Pergunta();
        enem122.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem122.setPergunta("Carros elétricos estão cada vez mais baratos, no entanto, os órgãos governamentais e a indústria se preocupam com o tempo de recarga das baterias, que é muito mais lento quando comparado ao tempo gasto para encher o tanque de combustível. Portanto, os usuários de transporte individual precisam se conscientizar dos ganhos ambientais dessa mudança e planejar com antecedência seus percursos, pensando em pausas necessárias para recargas.  Após realizar um percurso de 110 km, um motorista pretende recarregar as baterias de seu carro elétrico, que tem um desempenho médio de 5,0 km/kWh, usando um carregador ideal que opera a uma tensão de 220 V e é percorrido por uma corrente de 20 A.  Quantas horas são necessárias para recarregar a energia utilizada nesse percurso?");
        enem122.setRes1("0,005");
        enem122.setRes2("0,125");
        enem122.setRes3("2,5");
        enem122.setRes4("5,0");
        enem122.setRes5("8,0");
        enem122.setResposta("5,0");
        enem122.setUrl("");
        ListaEnem.add(enem122);


        Pergunta enem123 = new Pergunta();
        enem123.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem123.setPergunta("Nas angiospermas, além da fertilização da oosfera, existe uma segunda fertilização que resulta num tecido triploide.  Essa segunda fertilização foi importante evolutivamente, pois viabilizou a formação de um tecido de");
        enem123.setRes1("nutrição para o fruto.");
        enem123.setRes2("reserva para o embrião.");
        enem123.setRes3("revestimento para a semente.");
        enem123.setRes4("proteção para o megagametófito.");
        enem123.setRes5("vascularização para a planta jovem.");
        enem123.setResposta("reserva para o embrião.");
        enem123.setUrl("");
        ListaEnem.add(enem123);


        Pergunta enem124 = new Pergunta();
        enem124.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem124.setPergunta("Com o objetivo de proporcionar aroma e sabor a diversos alimentos, a indústria alimentícia se utiliza de flavorizantes. Em geral, essas substâncias são ésteres, como as apresentadas no quadro.     O aroma do flavorizante derivado do ácido etanoico e que apresenta cadeia carbônica saturada é de");
        enem124.setRes1("kiwi.");
        enem124.setRes2("banana.");
        enem124.setRes3("pêssego.");
        enem124.setRes4("rum.");
        enem124.setRes5("uva.");
        enem124.setResposta("banana.");
        enem124.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex130.png");
        ListaEnem.add(enem124);


        Pergunta enem125 = new Pergunta();
        enem125.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem125.setPergunta("O eletrocardiograma é um exame cardíaco que mede a intensidade dos sinais elétricos advindos do coração. A imagem apresenta o resultado típico obtido em um paciente saudável e a intensidade do sinal (VEC) em função do tempo.     De acordo com o eletrocardiograma apresentado, qual foi o número de batimentos cardíacos por minuto desse paciente durante o exame?");
        enem125.setRes1("30");
        enem125.setRes2("60");
        enem125.setRes3("100");
        enem125.setRes4("120");
        enem125.setRes5("180");
        enem125.setResposta("60");
        enem125.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex131.png");
        ListaEnem.add(enem125);


        Pergunta enem126 = new Pergunta();
        enem126.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem126.setPergunta("A deficiência de lipase ácida lisossômica é uma doença hereditária associada a um gene do cromossomo 10. Os pais dos pacientes podem não saber que são portadores dos genes da doença até o nascimento do primeiro filho afetado. Quando ambos os progenitores são portadores, existe uma chance, em quatro, de que seu bebê possa nascer com essa doença.  ANDERSON, R. A. et. al. In: Situ Localization of the Genetic Locus Encoding the Lysosomal Acid Lipase/Cholesteryl Esterase (LIPA) Deficient in Wolman Disease to Chromosome 10q23.2-q23.3. Genomics, n. 1, jan. 1993 (adaptado).  Essa é uma doença hereditária de caráter");
        enem126.setRes1("recessivo.");
        enem126.setRes2("dominante.");
        enem126.setRes3("codominante.");
        enem126.setRes4("poligênico.");
        enem126.setRes5("polialélico.");
        enem126.setResposta("recessivo.");
        enem126.setUrl("");
        ListaEnem.add(enem126);


        Pergunta enem127 = new Pergunta();
        enem127.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem127.setPergunta("O quadro lista alguns dispositivos eletrônicos que estão presentes no dia a dia, bem como a faixa de força eletromotriz necessária ao seu funcionamento.     Considere que uma bateria é construída pela associação em série de três pilhas de lítio-iodo, nas condições-padrão, conforme as semiequações de redução apresentadas.     Essa bateria é adequada para o funcionamento de qual dispositivo eletrônico?");
        enem127.setRes1("I");
        enem127.setRes2("II");
        enem127.setRes3("III");
        enem127.setRes4("IV");
        enem127.setRes5("V");
        enem127.setResposta("IV");
        enem127.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex133.png");
        ListaEnem.add(enem127);


        Pergunta enem128 = new Pergunta();
        enem128.setCategoria("Ciências da Natureza e suas Tecnologias");
        enem128.setPergunta("O alcoolômetro Gay Lussac é um instrumento destinado a medir o teor de álcool, em porcentagem de volume (v/v), de soluções de água e álcool na faixa de 0 °GL a 100 °GL, com divisões de 0,1 °GL. A concepção do alcoolômetro se baseia no princípio de flutuabilidade de Arquimedes, semelhante ao funcionamento de um densímetro. A escala do instrumento é aferida a 20 °C, sendo necessária a correção da medida, caso a temperatura da solução não esteja na temperatura de aferição. É apresentada parte da tabela de correção de um alcoolômetro, com a temperatura.     Manual alcoolômetro Gay Lussac. Disponível em: www.incoterm.com.br.  Acesso em: 4 dez. 2018 (adaptado).  É necessária a correção da medida do instrumento, pois um aumento na temperatura promove o(a)");
        enem128.setRes1("aumento da dissociação da água.");
        enem128.setRes2("aumento da densidade da água e do álcool.");
        enem128.setRes3("mudança do volume dos materiais por dilatação.");
        enem128.setRes4("aumento da concentração de álcool durante a medida.");
        enem128.setRes5("alteração das propriedades químicas da mistura álcool e água.");
        enem128.setResposta("mudança do volume dos materiais por dilatação.");
        enem128.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex134.png");
        ListaEnem.add(enem128);


        Pergunta enem129 = new Pergunta();
        enem129.setCategoria("Matemática e suas Tecnologias");
        enem129.setPergunta("Um segmento de reta está dividido em duas partes na proporção áurea quando o todo está para uma das partes na mesma razão em que essa parte está para a outra. Essa constante de proporcionalidade é comumente representada pela letra grega φ, e seu valor é dado pela solução positiva da equação φ2 = φ + 1.  Assim como a potência φ2, as potências superiores de φ podem ser expressas da forma aφ + b, em que a e b são inteiros positivos, como apresentado no quadro.     A potência φ7, escrita na forma aφ + b (a e b são inteiros positivos), é");
        enem129.setRes1("5φ + 3");
        enem129.setRes2("7φ + 2");
        enem129.setRes3("9φ + 6");
        enem129.setRes4("11φ + 7");
        enem129.setRes5("13φ + 8");
        enem129.setResposta("13φ + 8");
        enem129.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex136.png");
        ListaEnem.add(enem129);


        Pergunta enem130 = new Pergunta();
        enem130.setCategoria("Matemática e suas Tecnologias");
        enem130.setPergunta("Uma rede de hamburgueria tem três franquias em cidades distintas. Visando incluir um novo tipo de lanche no cardápio, o gerente de marketing da rede sugeriu que fossem colocados à venda cinco novos tipos de lanche, em edições especiais. Os lanches foram oferecidos pelo mesmo período de tempo em todos os franqueados. O tipo que apresentasse a maior média por franquia seria incluído definitivamente no cardápio. Terminado o período de experiência, a gerência recebeu um relatório descrevendo as quantidades vendidas, em unidade, de cada um dos cinco tipos de lanche nas três franquias.     Com base nessas informações, a gerência decidiu incluir no cardápio o lanche de tipo");
        enem130.setRes1("I.");
        enem130.setRes2("II.");
        enem130.setRes3("III.");
        enem130.setRes4("IV.");
        enem130.setRes5("V.");
        enem130.setResposta("V.");
        enem130.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex139.png");
        ListaEnem.add(enem130);


        Pergunta enem131 = new Pergunta();
        enem131.setCategoria("Matemática e suas Tecnologias");
        enem131.setPergunta("Uma grande rede de supermercados adota um sistema de avaliação dos faturamentos de suas filiais, considerando a média de faturamento mensal em milhão. A matriz da rede paga uma comissão para os representantes dos supermercados que atingirem uma média de faturamento mensal (M), conforme apresentado no quadro.     Um supermercado da rede obteve os faturamentos num dado ano, conforme apresentado no quadro.     Nas condições apresentadas, os representantes desse supermercado avaliam que receberão, no ano seguinte, a comissão de tipo");
        enem131.setRes1("I.");
        enem131.setRes2("II.");
        enem131.setRes3("III.");
        enem131.setRes4("IV.");
        enem131.setRes5("V.");
        enem131.setResposta("II.");
        enem131.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex140.png");
        ListaEnem.add(enem131);


        Pergunta enem132 = new Pergunta();
        enem132.setCategoria("Matemática e suas Tecnologias");
        enem132.setPergunta("O gráfico apresenta o nível de ocupação dos cinco reservatórios de água que abasteciam uma cidade em 2 de fevereiro de 2015.     Nessa data, o reservatório com o maior volume de água era o");
        enem132.setRes1("I.");
        enem132.setRes2("II.");
        enem132.setRes3("III.");
        enem132.setRes4("IV.");
        enem132.setRes5("V.");
        enem132.setResposta("IV.");
        enem132.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex143.png");
        ListaEnem.add(enem132);


        Pergunta enem133 = new Pergunta();
        enem133.setCategoria("Matemática e suas Tecnologias");
        enem133.setPergunta("Uma pessoa realizou uma pesquisa com alguns alunos de uma escola, coletando suas idades, e organizou esses dados no gráfico.     Qual é a média das idades, em ano, desses alunos?");
        enem133.setRes1("9");
        enem133.setRes2("12");
        enem133.setRes3("18");
        enem133.setRes4("19");
        enem133.setRes5("27");
        enem133.setResposta("19");
        enem133.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex144.png");
        ListaEnem.add(enem133);


        Pergunta enem134 = new Pergunta();
        enem134.setCategoria("Matemática e suas Tecnologias");
        enem134.setPergunta("Em um estudo realizado pelo IBGE em quatro estados e no Distrito Federal, com mais de 5 mil pessoas com 10 anos ou mais, observou-se que a leitura ocupa, em média, apenas seis minutos do dia de cada pessoa. Na faixa de idade de 10 a 24 anos, a média diária é de três minutos. No entanto, no grupo de idades entre 24 e 60 anos, o tempo médio diário dedicado à leitura é de 5 minutos. Entre os mais velhos, com 60 anos ou mais, a média é de 12 minutos.  A quantidade de pessoas entrevistadas de cada faixa de idade seguiu a distribuição percentual descrita no quadro.     Disponível em: www.oglobo.globo.com. Acesso em: 16 ago. 2013 (adaptado).   Os valores de x e y do quadro são, respectivamente, iguais a");
        enem134.setRes1("10 e 80.");
        enem134.setRes2("10 e 90.");
        enem134.setRes3("20 e 60.");
        enem134.setRes4("20 e 80.");
        enem134.setRes5("25 e 50.");
        enem134.setResposta("20 e 60.");
        enem134.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex145.png");
        ListaEnem.add(enem134);


        Pergunta enem135 = new Pergunta();
        enem135.setCategoria("Matemática e suas Tecnologias");
        enem135.setPergunta("Um zootecnista pretende testar se uma nova ração para coelhos é mais eficiente do que a que ele vem utilizando atualmente. A ração atual proporciona uma massa média de 10 kg por coelho, com um desvio padrão de 1 kg, alimentado com essa ração durante um período de três meses.  O zootecnista selecionou uma amostra de coelhos e os alimentou com a nova ração pelo mesmo período de tempo. Ao final, anotou a massa de cada coelho, obtendo um desvio padrão de 1,5 kg para a distribuição das massas dos coelhos dessa amostra.  Para avaliar a eficiência dessa ração, ele utilizará o coeficiente de variação (CV ) que  é uma medida de dispersão definida por , em que s representa o desvio padrão  e , a média das massas dos coelhos que foram alimentados com uma determinada ração.  O zootecnista substituirá a ração que vinha utilizando pela nova, caso o coeficiente de variação da distribuição das massas dos coelhos que foram alimentados com a nova ração for menor do que o coeficiente de variação da distribuição das massas dos coelhos que foram alimentados com a ração atual.  A substituição da ração ocorrerá se a média da distribuição das massas dos coelhos da amostra, em quilograma, for superior a");
        enem135.setRes1("5,0.");
        enem135.setRes2("9,5.");
        enem135.setRes3("10,0.");
        enem135.setRes4("10,5.");
        enem135.setRes5("15,0.");
        enem135.setResposta("15,0.");
        enem135.setUrl("");
        ListaEnem.add(enem135);


        Pergunta enem136 = new Pergunta();
        enem136.setCategoria("Matemática e suas Tecnologias");
        enem136.setPergunta("A Cifra de César é um exemplo de um método de codificação de mensagens usado por Júlio César para se comunicar com seus generais.  No método, cada letra era trocada por uma letra que aparecia no alfabeto um número fixo de casas adiante (ou atrás) de forma cíclica. A seguir temos um exemplo em que cada letra é substituída pela que vem três posições à frente.     Para quebrar um código como esse, a análise de frequências das letras de um texto é uma ferramenta importante.  Uma análise do texto do romance O guarani, de José de Alencar, que é composto por 491 631 letras, gerou o seguinte gráfico de frequências:     Disponível em: www.dominiopublico.gov.br. Acesso em: 7 fev. 2015.   Após codificar esse texto com a regra do exemplo fornecido, faz-se nova análise de frequência no texto codificado.  As quatro letras mais frequentes, em ordem decrescente de frequência, do texto codificado são");
        enem136.setRes1("A, E, O e S.");
        enem136.setRes2("D, E, F e G.");
        enem136.setRes3("D, H, R e V.");
        enem136.setRes4("R, L, B e X.");
        enem136.setRes5("X, B, L e P.");
        enem136.setResposta("D, H, R e V.");
        enem136.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex147.png");
        ListaEnem.add(enem136);


        Pergunta enem137 = new Pergunta();
        enem137.setCategoria("Matemática e suas Tecnologias");
        enem137.setPergunta("O quadro apresenta o número de terremotos de magnitude maior ou igual a 7, na escala Richter, ocorridos em nosso planeta nos anos de 2000 a 2011.     Disponível em: https://earthquake.usgs.gov/earthquakes/browse/m7-world.php.  Acesso em: 13 ago. 2012 (adaptado)   Um pesquisador acredita que a mediana representa bem o número anual típico de terremotos em um período.  Segundo esse pesquisador, o número anual típico de terremotos de magnitude maior ou igual a 7 é");
        enem137.setRes1("11.");
        enem137.setRes2("15.");
        enem137.setRes3("15,5.");
        enem137.setRes4("15,7.");
        enem137.setRes5("17,5.");
        enem137.setResposta("15,5.");
        enem137.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex148.png");
        ListaEnem.add(enem137);


        Pergunta enem138 = new Pergunta();
        enem138.setCategoria("Matemática e suas Tecnologias");
        enem138.setPergunta("A receita R de uma empresa ao final de um mês é o dinheiro captado com a venda de mercadorias ou com a prestação de serviços nesse mês, e a despesa D é todo o dinheiro utilizado para pagamento de salários, contas de água e luz, impostos, entre outros. O lucro mensal obtido ao final do mês é a diferença entre a receita e a despesa registradas no mês. O gráfico apresenta as receitas e despesas, em milhão de real, de uma empresa ao final dos cinco primeiros meses de um dado ano.     A previsão para os próximos meses é que o lucro mensal não seja inferior ao maior lucro obtido até o mês de maio.  Nessas condições, o lucro mensal para os próximos meses deve ser maior ou igual ao do mês de");
        enem138.setRes1("janeiro.");
        enem138.setRes2("fevereiro.");
        enem138.setRes3("março.");
        enem138.setRes4("abril.");
        enem138.setRes5("maio.");
        enem138.setResposta("fevereiro.");
        enem138.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex149.png");
        ListaEnem.add(enem138);


        Pergunta enem139 = new Pergunta();
        enem139.setCategoria("Matemática e suas Tecnologias");
        enem139.setPergunta("A depressão caracteriza-se por um desequilíbrio na química cerebral. Os neurônios de um deprimido não respondem bem aos estímulos dos neurotransmissores. Os remédios que combatem a depressão têm o objetivo de restabelecer a química cerebral. Com o aumento gradativo de casos de depressão, a venda desses medicamentos está em crescente evolução, conforme ilustra o gráfico.     Veja, 10 fev. 2010 (adaptado).  No período de 2005 a 2009, o aumento percentual no volume de vendas foi de");
        enem139.setRes1("45,4.");
        enem139.setRes2("54,5.");
        enem139.setRes3("120.");
        enem139.setRes4("220.");
        enem139.setRes5("283,2.");
        enem139.setResposta("120.");
        enem139.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex150.png");
        ListaEnem.add(enem139);


        Pergunta enem140 = new Pergunta();
        enem140.setCategoria("Matemática e suas Tecnologias");
        enem140.setPergunta("Um casal está planejando comprar um apartamento de dois quartos num bairro de uma cidade e consultou a página de uma corretora de imóveis, encontrando 105 apartamentos de dois quartos à venda no bairro desejado. Eles usaram um aplicativo da corretora para gerar a distribuição dos preços do conjunto de imóveis selecionados.  O gráfico ilustra a distribuição de frequências dos preços de venda dos apartamentos dessa lista (em mil reais), no qual as faixas de preço são dadas por ]300, 400], ]400, 500], ]500, 600], ]600, 700], ]700, 800], ]800, 900], ]900, 1 000], ]1 000, 1 100], ]1 100, 1 200] e ]1 200, 1 300].  A mesma corretora anuncia que cerca de 50% dos apartamentos de dois quartos nesse bairro, publicados em sua página, têm preço de venda inferior a 550 mil reais. No entanto, o casal achou que essa última informação não era compatível com o gráfico obtido.     Com base no gráfico obtido, o menor preço, p (em mil reais), para o qual pelo menos 50% dos apartamentos apresenta preço inferior a p é");
        enem140.setRes1("600.");
        enem140.setRes2("700.");
        enem140.setRes3("800.");
        enem140.setRes4("900.");
        enem140.setRes5("1 000.");
        enem140.setResposta("800.");
        enem140.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex151.png");
        ListaEnem.add(enem140);


        Pergunta enem141 = new Pergunta();
        enem141.setCategoria("Matemática e suas Tecnologias");
        enem141.setPergunta("Um parque temático brasileiro construiu uma réplica em miniatura do castelo de Liechtenstein. O castelo original, representado na imagem, está situado na Alemanha e foi reconstruído entre os anos de 1840 e 1842, após duas destruições causadas por guerras.     O castelo possui uma ponte de 38,4 m de comprimento e 1,68 m de largura. O artesão que trabalhou para o parque produziu a réplica do castelo, em escala. Nessa obra, as medidas do comprimento e da largura da ponte eram, respectivamente, 160 cm e 7 cm.  A escala utilizada para fazer a réplica é");
        enem141.setRes1("1 : 576");
        enem141.setRes2("1 : 240");
        enem141.setRes3("1 : 24");
        enem141.setRes4("1 : 4,2");
        enem141.setRes5("1 : 2,4");
        enem141.setResposta("1 : 24");
        enem141.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex153.png");
        ListaEnem.add(enem141);


        Pergunta enem142 = new Pergunta();
        enem142.setCategoria("Matemática e suas Tecnologias");
        enem142.setPergunta("A demografia médica é o estudo da população de médicos no Brasil nos aspectos quantitativo e qualitativo, sendo um dos seus objetivos fazer projeções sobre a necessidade da formação de novos médicos. Um desses estudos gerou um conjunto de dados que aborda a evolução do número de médicos e da população brasileira por várias décadas. O quadro apresenta parte desses dados.     Segundo uma projeção estatística, a variação do número de médicos e o da população brasileira de 2010 para 2020 será a média entre a variação de 1990 para 2000 e a de 2000 para 2010. Com o resultado dessa projeção, determina-se o número de médicos por mil habitantes no ano de 2020.  Disponível em: www.cremesp.org.br. Acesso em: 24 jun. 2015 (adaptado).  O número, com duas casas na parte decimal, mais próximo do número de médicos por mil habitantes no ano de 2020 seria de");
        enem142.setRes1("0,17.");
        enem142.setRes2("0,49.");
        enem142.setRes3("1,71.");
        enem142.setRes4("2,06.");
        enem142.setRes5("3,32.");
        enem142.setResposta("2,06.");
        enem142.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex154.png");
        ListaEnem.add(enem142);


        Pergunta enem143 = new Pergunta();
        enem143.setCategoria("Matemática e suas Tecnologias");
        enem143.setPergunta("Um atleta produz sua própria refeição com custo fixo de R$ 10,00. Ela é composta por 400 g de frango, 600 g de batata-doce e uma hortaliça. Atualmente, os preços dos produtos para essa refeição são:     Em relação a esses preços, haverá um aumento de 50% no preço do quilograma de batata-doce, e os outros preços não serão alterados. O atleta deseja manter o custo da refeição, a quantidade de batata-doce e a hortaliça. Portanto, terá que reduzir a quantidade de frango.  Qual deve ser a redução percentual da quantidade de frango para que o atleta alcance seu objetivo?");
        enem143.setRes1("12,5");
        enem143.setRes2("28,0");
        enem143.setRes3("30,0");
        enem143.setRes4("50,0");
        enem143.setRes5("70,0");
        enem143.setResposta("30,0");
        enem143.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex155.png");
        ListaEnem.add(enem143);


        Pergunta enem144 = new Pergunta();
        enem144.setCategoria("Matemática e suas Tecnologias");
        enem144.setPergunta("Uma mola é solta da posição distendida conforme a figura. A figura à direita representa o gráfico da posição P (em cm) da massa m em função do tempo t (em segundo) em um sistema de coordenadas cartesianas. Esse movimento periódico é descrito por uma expressão do tipo P(t) = ± A cos (ωt) ou P(t) = ± A sen (ωt), em que A > 0 é a amplitude de deslocamento máximo e ω é a frequência, que se relaciona com o período T pela fórmula ω = .  Considere a ausência de quaisquer forças dissipativas.     A expressão algébrica que representa as posições P(t) da massa m, ao longo do tempo, no gráfico, é");
        enem144.setRes1("– 3 cos (2t)");
        enem144.setRes2("– 3 sen (2t)");
        enem144.setRes3("3 cos (2t)");
        enem144.setRes4("– 6 cos (2t)");
        enem144.setRes5("6 sen (2t)");
        enem144.setResposta("– 3 cos (2t)");
        enem144.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex156.png");
        ListaEnem.add(enem144);


        Pergunta enem145 = new Pergunta();
        enem145.setCategoria("Matemática e suas Tecnologias");
        enem145.setPergunta("Uma construtora, pretendendo investir na construção de imóveis em uma metrópole com cinco grandes regiões, fez uma pesquisa sobre a quantidade de famílias que mudaram de uma região para outra, de modo a determinar qual região foi o destino do maior fluxo de famílias, sem levar em consideração o número de famílias que deixaram a região. Os valores da pesquisa estão dispostos em uma matriz A = [aij], i, j ∈ {1,2,3,4,5}, em que o elemento aij corresponde ao total de famílias (em dezena) que se mudaram da região i para a região j durante um certo período, e o elemento aii é considerado nulo, uma vez que somente são consideradas mudanças entre regiões distintas. A seguir, está apresentada a matriz com os dados da pesquisa.     Qual região foi selecionada para o investimento da construtora?");
        enem145.setRes1("1");
        enem145.setRes2("2");
        enem145.setRes3("3");
        enem145.setRes4("4");
        enem145.setRes5("5");
        enem145.setResposta("5");
        enem145.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex157.png");
        ListaEnem.add(enem145);


        Pergunta enem146 = new Pergunta();
        enem146.setCategoria("Matemática e suas Tecnologias");
        enem146.setPergunta("Para realizar um voo entre duas cidades que distam 2 000 km uma da outra, uma companhia aérea utilizava um modelo de aeronave A, capaz de transportar até 200 passageiros. Quando uma dessas aeronaves está lotada de passageiros, o consumo de combustível é de 0,02 litro por quilômetro e por passageiro. Essa companhia resolveu trocar o modelo de aeronave A pelo modelo de aeronave B, que é capaz de transportar 10% de passageiros a mais do que o modelo A, mas consumindo 10% menos combustível por quilômetro e por passageiro.  A quantidade de combustível consumida pelo modelo de aeronave B, em relação à do modelo de aeronave A, em um voo lotado entre as duas cidades, é");
        enem146.setRes1("10% menor.");
        enem146.setRes2("1% menor.");
        enem146.setRes3("igual.");
        enem146.setRes4("1% maior.");
        enem146.setRes5("11% maior.");
        enem146.setResposta("1% menor.");
        enem146.setUrl("");
        ListaEnem.add(enem146);


        Pergunta enem147 = new Pergunta();
        enem147.setCategoria("Matemática e suas Tecnologias");
        enem147.setPergunta("Em uma corrida automobilística, os carros podem fazer paradas nos boxes para efetuar trocas de pneus. Nessas trocas, o trabalho é feito por um grupo de três pessoas em cada pneu. Considere que os grupos iniciam o trabalho no mesmo instante, trabalham à mesma velocidade e cada grupo trabalha em um único pneu. Com os quatro grupos completos, são necessários 4 segundos para que a troca seja efetuada. O tempo gasto por um grupo para trocar um pneu é inversamente proporcional ao número de pessoas trabalhando nele. Em uma dessas paradas, um dos trabalhadores passou mal, não pôde participar da troca e nem foi substituído, de forma que um dos quatro grupos de troca ficou reduzido.  Nessa parada específica, com um dos grupos reduzido, qual foi o tempo gasto, em segundo, para trocar os quatro pneus?");
        enem147.setRes1("6,0");
        enem147.setRes2("5,7");
        enem147.setRes3("5,0");
        enem147.setRes4("4,5");
        enem147.setRes5("4,4");
        enem147.setResposta("6,0");
        enem147.setUrl("");
        ListaEnem.add(enem147);


        Pergunta enem148 = new Pergunta();
        enem148.setCategoria("Matemática e suas Tecnologias");
        enem148.setPergunta("Um nutricionista verificou, na dieta diária do seu cliente, a falta de 800 mg do mineral A, de 1 000 mg do mineral B e de 1 200 mg do mineral C. Por isso, recomendou a compra de suplementos alimentares que forneçam os minerais faltantes e informou que não haveria problema se consumisse mais desses minerais do que o recomendado.  O cliente encontrou cinco suplementos, vendidos em sachês unitários, cujos preços e as quantidades dos minerais estão apresentados a seguir:  Suplemento I: contém 50 mg do mineral A, 100 mg do mineral B e 200 mg do mineral C e custa R$ 2,00; Suplemento II: contém 800 mg do mineral A, 250 mg do mineral B e 200 mg do mineral C e custa R$ 3,00; Suplemento III: contém 250 mg do mineral A, 1 000 mg do mineral B e 300 mg do mineral C e custa R$ 5,00; Suplemento IV: contém 600 mg do mineral A, 500 mg do mineral B e 1 000 mg do mineral C e custa R$ 6,00; Suplemento V: contém 400 mg do mineral A, 800 mg do mineral B e 1 200 mg do mineral C e custa R$ 8,00.  O cliente decidiu comprar sachês de um único suplemento no qual gastasse menos dinheiro e ainda suprisse a falta de minerais indicada pelo nutricionista, mesmo que consumisse alguns deles além de sua necessidade.  Nessas condições, o cliente deverá comprar sachês do suplemento");
        enem148.setRes1("I.");
        enem148.setRes2("II.");
        enem148.setRes3("III.");
        enem148.setRes4("IV.");
        enem148.setRes5("V.");
        enem148.setResposta("IV.");
        enem148.setUrl("");
        ListaEnem.add(enem148);


        Pergunta enem149 = new Pergunta();
        enem149.setCategoria("Matemática e suas Tecnologias");
        enem149.setPergunta("A relação de Newton-Laplace estabelece que o módulo volumétrico de um fluido é diretamente proporcional ao quadrado da velocidade do som (em metro por segundo) no fluido e à sua densidade (em quilograma por metro cúbico), com uma constante de proporcionalidade adimensional.  Nessa relação, a unidade de medida adequada para o módulo volumétrico é");
        enem149.setRes1("kg⋅m−2⋅s−1");
        enem149.setRes2("kg⋅m−1⋅s−2");
        enem149.setRes3("kg⋅m−5⋅s2");
        enem149.setRes4("kg−1⋅m1 ⋅s2");
        enem149.setRes5("kg−1⋅m5 ⋅s−2");
        enem149.setResposta("kg⋅m−1⋅s−2");
        enem149.setUrl("");
        ListaEnem.add(enem149);


        Pergunta enem150 = new Pergunta();
        enem150.setCategoria("Matemática e suas Tecnologias");
        enem150.setPergunta("Uma pessoa pretende viajar por uma companhia aérea que despacha gratuitamente uma mala com até 10 kg.  Em duas viagens que realizou, essa pessoa utilizou a mesma mala e conseguiu 10 kg com as seguintes combinações de itens:     Para ter certeza de que sua bagagem terá massa de 10 kg, ela decide levar essa mala com duas calças, um sapato e o máximo de camisetas, admitindo que itens do mesmo tipo têm a mesma massa.  Qual a quantidade máxima de camisetas que essa pessoa poderá levar?");
        enem150.setRes1("22");
        enem150.setRes2("24");
        enem150.setRes3("26");
        enem150.setRes4("33");
        enem150.setRes5("39");
        enem150.setResposta("24");
        enem150.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex164.png");
        ListaEnem.add(enem150);


        Pergunta enem151 = new Pergunta();
        enem151.setCategoria("Matemática e suas Tecnologias");
        enem151.setPergunta("Um automóvel apresenta um desempenho médio de 16 km/L. Um engenheiro desenvolveu um novo motor a combustão que economiza, em relação ao consumo do motor anterior, 0,1 L de combustível a cada 20 km percorridos.  O valor do desempenho médio do automóvel com o novo motor, em quilômetro por litro, expresso com uma casa decimal, é");
        enem151.setRes1("15,9.");
        enem151.setRes2("16,1.");
        enem151.setRes3("16,4.");
        enem151.setRes4("17,4.");
        enem151.setRes5("18,0.");
        enem151.setResposta("17,4.");
        enem151.setUrl("");
        ListaEnem.add(enem151);


        Pergunta enem152 = new Pergunta();
        enem152.setCategoria("Matemática e suas Tecnologias");
        enem152.setPergunta("O projeto de um contêiner, em forma de paralelepípedo reto retangular, previa a pintura dos dois lados (interno e externo) de cada uma das quatro paredes com tinta acrílica e a pintura do piso interno com tinta epóxi. O construtor havia pedido, a cinco fornecedores diferentes, orçamentos das tintas necessárias, mas, antes de iniciar a obra, resolveu mudar o projeto original, alterando o comprimento e a largura para o dobro do originalmente previsto, mantendo inalterada a altura. Ao pedir novos orçamentos aos fornecedores, para as novas dimensões, cada um deu uma resposta diferente sobre as novas quantidades de tinta necessárias.  Em relação ao previsto para o projeto original, as novas quantidades de tinta necessárias informadas pelos fornecedores foram as seguintes:  Fornecedor I: “O dobro, tanto para as paredes quanto para o piso.” Fornecedor II: “O dobro para as paredes e quatro vezes para o piso.” Fornecedor III: “Quatro vezes, tanto para as paredes quanto para o piso.” Fornecedor IV: “Quatro vezes para as paredes e o dobro para o piso.” Fornecedor V: “Oito vezes para as paredes e quatro vezes para o piso.”  Analisando as informações dos fornecedores, o construtor providenciará a quantidade adequada de material. Considere a porta de acesso do contêiner como parte de uma das paredes. Qual dos fornecedores prestou as informações adequadas, devendo ser o escolhido pelo construtor para a aquisição do material?");
        enem152.setRes1("I");
        enem152.setRes2("II");
        enem152.setRes3("III");
        enem152.setRes4("IV");
        enem152.setRes5("V");
        enem152.setResposta("II");
        enem152.setUrl("");
        ListaEnem.add(enem152);


        Pergunta enem153 = new Pergunta();
        enem153.setCategoria("Matemática e suas Tecnologias");
        enem153.setPergunta("Um povoado com 100 habitantes está passando por uma situação de seca prolongada e os responsáveis pela administração pública local decidem contratar a construção de um reservatório. Ele deverá ter a forma de um cilindro circular reto, cuja base tenha 5 metros de diâmetro interno, e atender à demanda de água da população por um período de exatamente sete dias consecutivos. No oitavo dia, o reservatório vazio é completamente reabastecido por carros-pipa.  Considere que o consumo médio diário por habitante é de 120 litros de água. Use 3 como aproximação para .  Nas condições apresentadas, o reservatório deverá ser construído com uma altura interna mínima, em metro, igual a");
        enem153.setRes1("1,12.");
        enem153.setRes2("3,10.");
        enem153.setRes3("4,35.");
        enem153.setRes4("4,48.");
        enem153.setRes5("5,60.");
        enem153.setResposta("4,48.");
        enem153.setUrl("");
        ListaEnem.add(enem153);


        Pergunta enem154 = new Pergunta();
        enem154.setCategoria("Matemática e suas Tecnologias");
        enem154.setPergunta("Num octaedro regular, duas faces são consideradas opostas quando não têm nem arestas, nem vértices em comum. Na figura, observa-se um octaedro regular e uma de suas planificações, na qual há uma face colorida na cor cinza escuro e outras quatro faces numeradas.     Qual(is) face(s) ficará(ão) oposta(s) à face de cor cinza escuro, quando o octaedro for reconstruído a partir da planificação dada?");
        enem154.setRes1("1, 2, 3 e 4");
        enem154.setRes2("1e3");
        enem154.setRes3("1");
        enem154.setRes4("2");
        enem154.setRes5("4");
        enem154.setResposta("4");
        enem154.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex168.png");
        ListaEnem.add(enem154);


        Pergunta enem155 = new Pergunta();
        enem155.setCategoria("Matemática e suas Tecnologias");
        enem155.setPergunta("O instrumento de percussão conhecido como triângulo é composto por uma barra fina de aço, dobrada em um formato que se assemelha a um triângulo, com uma abertura e uma haste, conforme ilustra a Figura 1.     Uma empresa de brindes promocionais contrata uma fundição para a produção de miniaturas de instrumentos desse tipo. A fundição produz, inicialmente, peças com o formato de um triângulo equilátero de altura h, conforme ilustra a Figura 2. Após esse processo, cada peça é aquecida, deformando os cantos, e cortada em um dos vértices, dando origem à miniatura. Assuma que não ocorram perdas de material no processo de produção, de forma que o comprimento da barra utilizada seja igual ao perímetro do triângulo equilátero representado na Figura 2.  Considere 1,7 como valor aproximado para .  Nessas condições, o valor que mais se aproxima da medida do comprimento da barra, em centímetro, é");
        enem155.setRes1("9,07.");
        enem155.setRes2("13,60.");
        enem155.setRes3("20,40.");
        enem155.setRes4("27,18.");
        enem155.setRes5("36,24.");
        enem155.setResposta("27,18.");
        enem155.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex169.png");
        ListaEnem.add(enem155);


        Pergunta enem156 = new Pergunta();
        enem156.setCategoria("Matemática e suas Tecnologias");
        enem156.setPergunta("Uma pessoa comprou uma caneca para tomar sopa, conforme ilustração.     Sabe-se que 1 cm3 = 1 mL e que o topo da caneca é uma circunferência de diâmetro (D) medindo 10 cm, e a base é um círculo de diâmetro (d) medindo 8 cm. Além disso, sabe-se que a altura (h) dessa caneca mede 12 cm (distância entre o centro das circunferências do topo e da base).  Utilize 3 como aproximação para π.  Qual é a capacidade volumétrica, em mililitro, dessa caneca?");
        enem156.setRes1("216");
        enem156.setRes2("408");
        enem156.setRes3("732");
        enem156.setRes4("2 196");
        enem156.setRes5("2 928");
        enem156.setResposta("732");
        enem156.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex170.png");
        ListaEnem.add(enem156);


        Pergunta enem157 = new Pergunta();
        enem157.setCategoria("Matemática e suas Tecnologias");
        enem157.setPergunta("O dono de uma loja pretende usar cartões imantados para a divulgação de sua loja. A empresa que fornecerá o serviço lhe informa que o custo de fabricação do cartão é de R$ 0,01 por centímetro quadrado e que disponibiliza modelos tendo como faces úteis para impressão:  um triângulo equilátero de lado 12 cm; um quadrado de lado 8 cm; um retângulo de lados 11 cm e 8 cm; um hexágono regular de lado 6 cm; um círculo de diâmetro 10 cm.  O dono da loja está disposto a pagar, no máximo, R$ 0,80 por cartão. Ele escolherá, dentro desse limite de preço, o modelo que tiver maior área de impressão.  Use 3 como aproximação para e use 1,7 como aproximação para .  Nessas condições, o modelo que deverá ser escolhido tem como face útil para impressão um");
        enem157.setRes1("triângulo.");
        enem157.setRes2("quadrado.");
        enem157.setRes3("retângulo.");
        enem157.setRes4("hexágono.");
        enem157.setRes5("círculo.");
        enem157.setResposta("círculo.");
        enem157.setUrl("");
        ListaEnem.add(enem157);


        Pergunta enem158 = new Pergunta();
        enem158.setCategoria("Matemática e suas Tecnologias");
        enem158.setPergunta("Um ciclista amador de 61 anos de idade utilizou um monitor cardíaco para medir suas frequências cardíacas em quatro diferentes tipos de trechos do percurso. Os resultados das frequências cardíacas máximas alcançadas nesses trechos foram:     Sabe-se que a faixa aeróbica ideal para o ganho de condicionamento físico é entre 65% e 85% da frequência cardíaca máxima (Fc máx.), que, por sua vez, é determinada pela fórmula:  Fc máx. = 220 – idade,  em que a idade é dada em ano e Fc máx. é dada em bpm (batimento por minuto).  Os trechos do percurso nos quais esse ciclista se mantém dentro de sua faixa aeróbica ideal, para o ganho de condicionamento físico, são");
        enem158.setRes1("leve no plano, forte no plano, subida moderada e subida forte.");
        enem158.setRes2("leve no plano, forte no plano e subida moderada.");
        enem158.setRes3("forte no plano, subida moderada e subida forte.");
        enem158.setRes4("forte no plano e subida moderada.");
        enem158.setRes5("leve no plano e subida forte.");
        enem158.setResposta("forte no plano e subida moderada.");
        enem158.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex172.png");
        ListaEnem.add(enem158);


        Pergunta enem159 = new Pergunta();
        enem159.setCategoria("Matemática e suas Tecnologias");
        enem159.setPergunta("Um lava-rápido oferece dois tipos de lavagem de veículos: lavagem simples, ao preço de R$ 20,00, e lavagem completa, ao preço de R$ 35,00. Para cobrir as despesas com produtos e funcionários, e não ter prejuízos, o lava-rápido deve ter uma receita diária de, pelo menos, R$ 300,00.  Para não ter prejuízo, o menor número de lavagens diárias que o lava-rápido deve efetuar é");
        enem159.setRes1("6.");
        enem159.setRes2("8.");
        enem159.setRes3("9.");
        enem159.setRes4("15.");
        enem159.setRes5("20.");
        enem159.setResposta("9.");
        enem159.setUrl("");
        ListaEnem.add(enem159);


        Pergunta enem160 = new Pergunta();
        enem160.setCategoria("Matemática e suas Tecnologias");
        enem160.setPergunta("Após consulta médica, um paciente deve seguir um tratamento composto por três medicamentos: X, Y e Z. O paciente, para adquirir os três medicamentos, faz um orçamento em três farmácias diferentes, conforme o quadro.     Dessas farmácias algumas oferecem descontos:  na compra dos medicamentos X e Y na Farmácia 2, recebe-se um desconto de 20% em ambos os produtos, independentemente da compra do medicamento Z, e não há desconto para o medicamento Z; na compra dos 3 medicamentos na Farmácia 3, recebe-se 20% de desconto no valor total da compra.  O paciente deseja efetuar a compra de modo a minimizar sua despesa com os medicamentos.  De acordo com as informações fornecidas, o paciente deve comprar os medicamentos da seguinte forma:");
        enem160.setRes1("X, Y e Z na Farmácia 1.");
        enem160.setRes2("X e Y na Farmácia 1, e Z na Farmácia 3.");
        enem160.setRes3("X e Y na Farmácia 2, e Z na Farmácia 3.");
        enem160.setRes4("X na Farmácia 2, e Y e Z na Farmácia 3.");
        enem160.setRes5("X, Y e Z na Farmácia 3.");
        enem160.setResposta("X e Y na Farmácia 2, e Z na Farmácia 3.");
        enem160.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex174.png");
        ListaEnem.add(enem160);


        Pergunta enem161 = new Pergunta();
        enem161.setCategoria("Matemática e suas Tecnologias");
        enem161.setPergunta("Muitos brinquedos que frequentemente são encontrados em praças e parques públicos apresentam formatos de figuras geométricas bidimensionais e tridimensionais. Uma empresa foi contratada para desenvolver uma nova forma de brinquedo. A proposta apresentada pela empresa foi de uma estrutura formada apenas por hastes metálicas, conectadas umas às outras, como apresentado na figura. As hastes de mesma tonalidade e espessura são congruentes.     Com base na proposta apresentada, quantas figuras geométricas planas de cada tipo são formadas pela união das hastes?");
        enem161.setRes1("12 trapézios isósceles e 12 quadrados.");
        enem161.setRes2("24 trapézios isósceles e 12 quadrados.");
        enem161.setRes3("12 paralelogramos e 12 quadrados.");
        enem161.setRes4("8 trapézios isósceles e 12 quadrados.");
        enem161.setRes5("12 trapézios escalenos e 12 retângulos.");
        enem161.setResposta("12 trapézios isósceles e 12 quadrados.");
        enem161.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex175.png");
        ListaEnem.add(enem161);


        Pergunta enem162 = new Pergunta();
        enem162.setCategoria("Matemática e suas Tecnologias");
        enem162.setPergunta("O sistema de numeração romano ainda é utilizado na indicação de capítulos e volumes de livros, na designação de séculos e, em ordem cronológica, de papas e reis de mesmo nome. São utilizadas sete letras do alfabeto: Quatro fundamentais: I (vale 1); X (vale 10); C (vale 100) e M (vale 1 000). Três secundárias: V (vale 5); L (vale 50) e D (vale 500).  As regras para escrever números romanos são:  1. Não existe símbolo correspondente ao zero;  2. Os símbolos fundamentais podem ser repetidos até três vezes e seus valores são adicionados. Exemplo: XXX = 30;  3. Uma letra posta à esquerda de outra de maior valor indica subtração dos respectivos valores. Exemplo: IX = 10 – 1 = 9;  4. Uma letra posta à direita de outra de maior valor indica adição dos respectivos valores. Exemplo: XI = 10 + 1 = 11.  Em uma cidade europeia há uma placa indicando o ano de sua fundação: MCDLXIX.  Quantos anos de fundação essa cidade comemorará em 2050?");
        enem162.setRes1("379");
        enem162.setRes2("381");
        enem162.setRes3("579");
        enem162.setRes4("581");
        enem162.setRes5("601");
        enem162.setResposta("581");
        enem162.setUrl("");
        ListaEnem.add(enem162);


        Pergunta enem163 = new Pergunta();
        enem163.setCategoria("Matemática e suas Tecnologias");
        enem163.setPergunta("Uma das bases mais utilizadas para representar um número é a base decimal. Entretanto, os computadores trabalham com números na base binária. Nessa base, qualquer número natural é representado usando apenas os algarismos 0 e 1. Por exemplo, as representações dos números 9 e 12, na base binária, são 1001 e 1100, respectivamente. A operação de adição, na base binária, segue um algoritmo similar ao utilizado na base decimal, como detalhado no quadro:     Por exemplo, na base binária, a soma dos números 10 e 10 é 100, como apresentado:     Considerando as informações do texto, o resultado da adição 9 + 12 será representado, na base binária, por");
        enem163.setRes1("101.");
        enem163.setRes2("1101.");
        enem163.setRes3("1111.");
        enem163.setRes4("10101.");
        enem163.setRes5("11001.");
        enem163.setResposta("10101.");
        enem163.setUrl("https://runed-puffs.000webhostapp.com/imagens-provas/prova2021-ex177.png");
        ListaEnem.add(enem163);


        Pergunta enem164 = new Pergunta();
        enem164.setCategoria("Matemática e suas Tecnologias");
        enem164.setPergunta("Uma unidade de medida comum usada para expressar áreas de terrenos de grandes dimensões é o hectare, que equivale a 10 000 m2. Um fazendeiro decide fazer um loteamento utilizando 3 hectares de sua fazenda, dos quais 0,9 hectare será usado para a construção de ruas e calçadas e o restante será dividido em terrenos com área de 300 m2 cada um. Os 20 primeiros terrenos vendidos terão preços promocionais de R$ 20 000,00 cada, e os demais, R$ 30 000,00 cada.  Nas condições estabelecidas, o valor total, em real, obtido pelo fazendeiro com a venda de todos os terrenos será igual a");
        enem164.setRes1("700 000.");
        enem164.setRes2("1 600 000.");
        enem164.setRes3("1 900 000.");
        enem164.setRes4("2 200 000.");
        enem164.setRes5("2 800 000.");
        enem164.setResposta("1 900 000.");
        enem164.setUrl("");
        ListaEnem.add(enem164);


        Pergunta enem165 = new Pergunta();
        enem165.setCategoria("Matemática e suas Tecnologias");
        enem165.setPergunta("Os diretores de uma escola precisam construir um laboratório para uso dos alunos. Há duas possibilidades:  (i) um laboratório do tipo A, com capacidade para 100 usuários, a um custo de 180 mil reais e gastos de 60 mil reais por ano para manutenção;  (ii) um laboratório do tipo B, com capacidade para 80 usuários, a um custo de 120 mil reais e gastos com manutenção de 16 mil reais por ano.  Considera-se que, em qualquer caso, o laboratório implantado será utilizado na totalidade de sua capacidade.  A economia da escola, na utilização de um laboratório tipo B, em vez de um laboratório tipo A, num período de 4 anos, por usuário, será de");
        enem165.setRes1("1,31 mil reais.");
        enem165.setRes2("1,90 mil reais.");
        enem165.setRes3("2,30 mil reais.");
        enem165.setRes4("2,36 mil reais.");
        enem165.setRes5("2,95 mil reais.");
        enem165.setResposta("1,90 mil reais.");
        enem165.setUrl("");
        ListaEnem.add(enem165);
    }
}
