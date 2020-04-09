package menu;

import java.awt.AWTException;                                                   //Está sendo usado no método limparSaida
import java.awt.Robot;                                                          //Está sendo usado no método limparSaida
import java.awt.event.KeyEvent;                                                 //Está sendo usado no método limparSaida
import java.util.Scanner;                                                       //Está sendo usado nas entradas do código inteiro
import java.util.Random;

public class Menu {

    public static void instrucoes() {
        //Instruções de como jogar o jogo.

        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-------------------------------------* I N S T R U Ç Õ E S *------------------------------------- ");
        System.out.println(" ");
        System.out.println("Você escolheu visualizar as instruções do jogo. ");
        System.out.println(" ");
        System.out.println(
                "Descrição:\n"
                + "Consulting and Thinking™ © é um jogo com caráter de RPG de Texto, a história é baseada em na história de uma empresa prestes a declarar falência que em busca da prosperidade dela, encontra uma consultoria. Essa consultoria tem a missão de ajudar a empresa a prosperar.\n"
                + "\n"
                + "Definições:\n"
                + "O jogo é composto por três personagens, o consultor, o gerente de projetos e o dono da empresa.\n"
                + "É um quiz que avalia suas decisões durante todo o percurso, resultando no destino das empresas.\n"
                + "O jogo é baseado nos fundamentos da Administração Clássica apresentadas na Disciplina de Adm. pela profª Kelly Cristine.\n"
                + "\n"
                + "Regras básicas:\n"
                + "As únicas respostas permitidas são números. [1-4]\n"
                + "Após selecionado, não é possível voltar a tela anterior.\n"
                + "Em caso de qualquer tipo diferente de caractere além de números você não irá avançar de fase.\n"
                + "\n"
                + "Instruções:\n"
                + "Será apresentado um breve enunciado e logo após, as decisões. O jogador deverá selecionar a decisão que achar correta e após selecionar todas, ela apresentará o futuro da empresa.\n"
                + "Em caso de dúvidas, pressione F12 no teclado, a tela de instruções será aberta novamente.\n"
                + "\n"
                + "Pressione Enter no teclado para continuar.");

        entrada.nextLine();                                                                                         //Pressione Enter no teclado para continuar.
        limparSaida();                                                                                              //Chama método para limpar o Console do Java.
        System.out.println(" ");
    }

    public static void creditos() {
        //Créditos do Projeto.

        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-------------------------------------* C R É D I T O S *------------------------------------- ");
        System.out.println(" ");
        System.out.println("Consulting and Thinking™ © 2019 Senac - Serviço Nacional de Aprendizagem Comercial. Publicado pelo grupo 5 do curso de TADS na matéria de PI – Projeto Integrador.\n"
                + "\n"
                + "Desenvolvimento:\n"
                + "Estrutura do menu e código 		Leonardo Lopes Ventura\n"
                + "Fases - - - 				Jefferson Monteiro\n"
                + "Fases - - - 				Lucas Noé da Silva\n"
                + "Fases - - - 				Antony Raphael\n"
                + "\n"
                + "Escrito por\n"
                + "História inicial			Leonardo Lopes Ventura\n"
                + "Desenvolvimento da história		Jefferson Monteiro\n"
                + "\n"
                + "Idealizado por\n"
                + "Ideia inicial do projeto		Leonardo Lopes Ventura\n"
                + "Desenvolvimento da história		Lucas Noé da Silva\n"
                + "\n"
                + "Criação\n"
                + "Arte da empresa 			Leonardo Lopes Ventura	\n"
                + "Nome da empresa				Lucas Noé da Silva\n"
                + "Apresentação do projeto			Antony Raphael\n"
                + "História				Leonardo Lopes Ventura\n"
                + "					Jefferson Monteiro\n"
                + "\n"
                + "Revisado e testado\n"
                + "Revisado por				Takeo\n"
                + "Testado por				Leonardo Lopes Ventura\n"
                + "					Lucas Noé da Silva\n"
                + "					Jefferson Monteiro	\n"
                + "					Antony Raphael\n"
                + "\n"
                + "Aprovação final\n"
                + "Aprovação do conteúdo apresentado 		Profª Kelly Cristine\n"
                + "	\n"
                + "\n"
                + "Pressione Enter no teclado para continuar.");
        entrada.nextLine();                                                                                         //Pressione Enter no teclado para continuar.
        limparSaida();                                                                                              //Chama método para limpar o Console do Java.
        System.out.println(" ");

    }

    public static double f1(String nome) {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, ent1, cond = 4;
        double n1;
        do {
            System.out.println("Olá " + nome + ".");
//História Fersol
            System.out.println("No final de 1995, depois de três tentativas de reerguer sua empresa por meio de processos de reengenharia, Michel Haradom recebeu um abraço comovido do \n"
                    + "consultor Jabob Grajew, um dos mais respeitados do mercado, que pronunciou a seguinte sentença: “Desista, meu caro. A Fersol está morta - só falta deitar”. Dito isso, \n"
                    + "o consultor retirou-se deixando Haradom com uma dívida de dez milhões de dólares, uma empresa falida, um sócio querendo abandonar o barco e um sentimento de profunda \n"
                    + "solidão. Haradom saiu para caminhar por sua empresa, a Fersol, uma fábrica de defensivos agrícolas, que a essa altura já dava sinais de decadência em suas instalações \n"
                    + "maltratadas. Perguntava-se se haveria alguém a quem apelar, alguém que ainda se importasse com o futuro da companhia e tivesse alguma disposição para ajudar. Foi \n"
                    + "quando olhou para seus funcionários e percebeu que para eles o destino da Fersol fazia toda a diferença...");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
//Inicio da consultoria            
            System.out.println("Olá " + nome + ", estamos com uma consulta agendada na empresa Fersol Indústria e Comércio S/A do proprietário Michael Haradom, a Fersol era apenas uma \n"
                    + "importadora de defensivos agrícolas e em 1983 passou a desenvolver os produtos. O mercado era bem promissor e até 1990, época em que a Fersol vendia 30 milhões \n"
                    + "de dólares por mês. A fábrica da Fersol, localizada na cidade de Mairinque (SP), foi adquirida ainda em 1980. Com o intuito de expandir os seus negócios, a Fersol \n"
                    + "adquiriu a Estação Fazenda Experimental de Itapetininga (SP), equipada com laboratórios, maquinários agrícolas e um aparato completo para testes de produtos. Na época \n"
                    + "o mercado de defensores agrícolas movimentava 1 bilhão de dólares. A chegada do Plano Collor (conjunto de medidas econômicas implantadas pelo ex-presidente Fernando \n"
                    + "Collor de Melo) abalou as estruturas econômicas de várias empresas, e com a Fersol não foi diferente. O Plano desestabilizou as finanças da empresa e essa situação \n"
                    + "se agravou em 1995, após a chegada do Plano Real. A Fersol fechou o ano com uma dívida de 10 milhões de dólares. \n"
                    + "Com esse problema a diretoria da Fersol buscou soluções com uma outra consutoria que, após realizar uma avaliação criteriosa, disse que a Fersol estava morta. A empresa \n"
                    + "não tinha condições financeiras e estruturais para implantar nenhuma das soluções apresentadas pelo consultor, e sua única alternativa era decretar falência. \n"
                    + "A sua missão é provar com medidas administrativas como a Fersol deve se comportar para conseguir se reerguer no mercado. \n"
                    + "Lembre-se, caso você falhe nas medidas adotadas na empresa, você irá causar a falência e a demissão de inúmeros funcionários da empresa, boa sorte! \n");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
            System.out.println("*******************************************- Capitulo 1 - Prospectar os dados da empresa -******************************************* \n");
            System.out.println("Ao chegar na empresa, você buscou as informações da empresa que são:  60 colaboradores em seu quadro de funcionários. Nenhum deles estão sabendo da atual \n"
                    + " situação da empresa, Haradom está para se reunir com eles para contar a verdade sobre a empresa e pedir ajuda para os funcionários. Haradom já te informou que \n"
                    + " para os que ficarem na empresa ele irá recompensar no futuro. Na sua opinião, o que ele deveria fazer? \n");
            System.out.println("Pressione Enter para continuar...");
//Perguntas            
            System.out.println("1 - Ele deveria contar para os funcionários, para que todos saibam a real situação da empresa e sejam compreensivos com os interesses do fundador.");
            System.out.println(" ");
            System.out.println("2 - Ele deve omitir a verdade dos funcionários, assim enganando eles para que continuem trabalhando como se houvesse um futuro na empresa.");
            System.out.println(" ");
            System.out.println("3 - Ele deve declarar a falência da empresa conforme o outro consultor informou.");
            System.out.println(" ");
            System.out.println("4 - Nenhuma das opções acima. ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();
//Switch para valores de cada resposta
            switch (ent) {
                case '1':
                    n1 = 0;
                    break;
                case '2':
                    n1 = 2;
                    break;
                case '3':
                    n1 = 1;
                    break;
                default:
                    n1 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > 4);
//Retorna valor do método
        return n1;

    }

    public static double f2() {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, cond = 3;
        double n2;
        do {
            System.out.println("*******************************************- Capitulo 2 - Salários -*******************************************\n");
//História           
            System.out.print("Alguns funcionários pediram que fossem dispensados por não concordarem com os interesses da empresa. Para os que ficaram, \n"
                    + "você informou que haveriam recompensas no futuro; caso a empresa se reerguesse. ");
            System.out.println("Ao chegar na empresa para uma reunião com Haradom, você veio a questionar sobre salários da empresa, na sua opinião, o que deveria ser feito.\n");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
//Perguntas            
            System.out.println("1 - Buscar um meio de reavaliar os salários e o que é retirado mensalmente por Haradom.");
            System.out.println(" ");
            System.out.println("2 - Continuar pagando o salário que os funcionários recebem.");
            System.out.println(" ");
            System.out.println("3 - Ele deve dar um aumento para todos, visto que eles trabalham muito");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();
//Switch para dar valor as respostas
            switch (ent) {
                case 1:
                    n2 = 2;
                    break;
                case 2:
                    n2 = 1;
                    break;
                default:
                    n2 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > cond);
//Retorna valor das respostas        
        return n2;
    }

    public static double f3() {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, cond = 3;
        double n3;
        do {
            System.out.println("*******************************************- Capitulo 3 - Competências -*******************************************\n");
            System.out.print(" ");
            System.out.println("Como a maioria dos colaboradores optou por ficar,\n"
                    + "foi preciso analisar as competências e habilidades de cada um para designar novas tarefas. E, para a sua surpresa e de Haradom, foi identificado que muitos\n"
                    + "colaboradores não sabiam ler ou escrever. Para reverter este quadro o que ele deve fazer?\n");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
            System.out.println("1 - Investir em educação: após o expediente e usar o refeitório para se transformar numa grande sala de aula.");
            System.out.println(" ");
            System.out.println("2 - Não fazer nada.");
            System.out.println(" ");
            System.out.println("3 - Fazer uma varredura e demitir todos da área.");
            System.out.print(" ");
            System.out.println("4 - Nenhuma das opções acima. ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();

            switch (ent) {
                case 1:
                    n3 = 2;
                    break;
                case 2:
                    n3 = 1;
                    break;
                default:
                    n3 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > cond);
        return n3;
    }

    public static double f4() {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, cond = 3;
        double n4;
        do {
            System.out.println("Para reverter este quadro de problemas educativos, Haradom decidiu investir em educação: após o expediente, o refeitório se transformava numa grande sala de aula.\n"
                    + "A receptividade desta medida não foi positiva, e muitos colaboradores se negava a continuar estudando. Diante disso, o que Michael Haradom deveria fazer?\n");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
            System.out.println("1 - Implantar uma política de incentivos financeiros para que os colaboradores tivessem maior interesse");
            System.out.println(" ");
            System.out.println("2 - Mandar embora quem não concorda com a iniciativa do fundador.");
            System.out.println(" ");
            System.out.println("3 - Ofereça uma plataforma de feedback anonima. Este conceito de anonimato na comunicação é crucial para considerar em todos os ambientes de trabalho. Geralmente, os funcionários não compartilham feedback com seus gerentes porque hesitam em fazer uma reclamação ou em compartilhar seus sentimentos abertamente. E o recurso anônimo facilita o processo de compartilhar sentimentos.");
            System.out.println(" ");
            System.out.println("4 - Nenhuma das opções acima. ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();

            switch (ent) {
                case 1:
                    n4 = 2;
                    break;
                case 2:
                    n4 = 0;
                    break;
                case 3:
                    n4 = 1;
                    break;
                default:
                    n4 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > cond);
        return n4;
    }

    public static double f5() {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, cond = 3;
        double n5;
        do {
            System.out.println("*******************************************- Capitulo 4 - Comprometimento de Haradom -*******************************************\n");
            System.out.println("Ao chegar na sua terceira visita, você recebeu a informação que a Fersol havia saído do vermelho e lucrado. E com isso, você questionou Michael Haradom\n"
                    + "sobre o compromentimento dele com a empresa e seus colaboradores. Você acredita que eles deveriam ser recompensados?\n");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
            System.out.println("1 - Sim,  deveriam ser recompensados com 30% das ações da empresa. Mas que só seja entregue aos colaboradores que tenham mais de dois anos de trabalho na organização.");
            System.out.println(" ");
            System.out.println("2 - Não, afinal os interesses do fundador são as prioridades hoje.");
            System.out.println(" ");
            System.out.println("3 - O reconhecimento deve ser uma prioridade. Reconhecer os colaboradores que desempenharam bem as suas funções é o segredo do sucesso para a composição de/n"
                    + "equipes inteiras extremamente produtivas, e isso pode ser feito por meio de ajustes salariais e prêmios específicos, entre outros incentivos.");
            System.out.println(" ");
            System.out.println("4 - Nenhuma das opções acima. ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();

            switch (ent) {
                case 1:
                    n5 = 2;
                    break;
                case 2:
                    n5 = 0;
                    break;
                case 3:
                    n5 = 1;
                    break;
                default:
                    n5 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > cond);
        return n5;
    }

    public static double f6() {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        int ent, cond = 3;
        double n6;
        do {
            System.out.println("Ao chegar em sua quarta visita, Michael decidiu abrir o jogo e com isso te informou que a empresa voltou a crescer. Na sua opinião, o que ele deveria fazer?");
            System.out.println("Pressione Enter para continuar...");
            entrada.nextLine();
            System.out.println("1 - Vender a empresa antes que tenha problemas novamente.");
            System.out.println(" ");
            System.out.println("2 - Continuar com a empresa visto que ela vem apresentandos bons resultados comparado ao começo do projeto.");
            System.out.println(" ");
            System.out.println("3 - Fazer pequenos investimentos em novas tecnologias, caso o investimento dê lucros a porcentagem a ser investida pode aumentar gradativamente.");
            System.out.println(" ");
            System.out.println("4 - Nenhuma das opções acima. ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
            ent = entrada.nextInt();

            switch (ent) {
                case 1:
                    n6 = 0;
                    break;
                case 2:
                    n6 = 2;
                    break;
                case 3:
                    n6 = 1;
                    break;
                default:
                    n6 = 0;
                    System.out.print(" ");
                    break;
            }

        } while (ent > cond);
        return n6;
    }

    public static String[] criandoVetorDeQuestoes() {
        Scanner entrada = new Scanner(System.in);
        String[] questao = new String[6];
        limparSaida();
        questao[0] = "Questão 01";
        entrada.nextLine();
        questao[1] = "Questão 02";
        questao[2] = "Questão 03";
        questao[3] = "Questão 04";
        questao[4] = "Questão 05";
        questao[5] = "Questão 06";

        return questao;
    }

    public static String[][] criandoMatrizDeAlternativas() {
        String[][] alternativas = new String[6][4];
        alternativas[0][0] = "Focar nas reclamações e insatisfações dos clientes e dar um bônus aos mesmos para que as relações não sejam cortadas e assim a empresa não perde lucro.";
        alternativas[0][1] = "Montar pareceria com uma transportadora , onde as entregas seriam mais planejadas agilizadas ,fazendo com que as reclamações diminuissem e a conficaça dos clientes retornassem, porem isso poderia gerar um deficit para a empresa ja que necessitaria de custos para isso";
        alternativas[0][2] = "Implementação da gestão de processos, a gestão de processos de negócio nada mais é do que uma forma sistematizada de identificar os pontos de melhoria, desenhar a maneira como estes serão organizados, executar este planejamento e consequentemente acompanhar, monitorar, medir e controlar os processos de negócios de uma empresa, para que assim seja possível atender às expectativas dos clientes, entregando cada vez mais melhores resultados e alcançando constantemente os objetivos de crescimento da organização.  ";

        alternativas[1][0] = "Não fazer nada e deixar as coisas como estavam ";
        alternativas[1][1] = "-Realizar reuniões, com o objetivo de unificar os dois lados , focar no lado pessoal e verificar as divergencias de ideias que ambos possuem , para assim reorganizar a empresa ";
        alternativas[1][2] = "Realizar reuniões, com o objetivo de organizar ou de elaborar novas estratégias de crescimento,entender o que é, e como funcionam os processos de sua empresa, para que esta esteja sempre organizada ";

        alternativas[2][0] = "Fazer uma varredura e demitir todos da área , ja que o setor financeiro é um dos que mais da problemas e prejuízos ";
        alternativas[2][1] = "Demitir alguns funcionarios que não estão dando resultado no setor financeiro e contratar novos para que haja uma melhora no desempenho";
        alternativas[2][2] = "Contratar um gestor especializado em finanças ,seu trabalho é monitorar custos de todas os processos e tarefas realizadas dentro da empresa, monitorar o tempo que é gasto em cada uma das atividades executadas, o valor que entra na empresa e os valores que saem, entre muitos outros custos que impactam diretamente na organização de um negócio";

        alternativas[3][0] = "Não se comunique demais , após o horário de expediente, mantenha o número de e-mails que você envia aos funcionários ao mínimo. Embora sua comunicação seja provavelmente muito importante, ela também pode esperar até o dia seguinte.";
        alternativas[3][1] = "Estabeleça uma via de mão dupla, a comunicação nunca deve ser apenas de cima para baixo ou apenas de um jeito. Independentemente dos meios pelos quais você está se comunicando, sempre solicite que seus funcionários compartilhem seus pensamentos, ofereçam feedback e se envolvam em uma discussão.";
        alternativas[3][2] = "Ofereça uma plataforma de feedback anonima. Este conceito de anonimato na comunicação é crucial para considerar em todos os ambientes de trabalho. Geralmente, os funcionários não compartilham feedback com seus gerentes porque hesitam em fazer uma reclamação ou em compartilhar seus sentimentos abertamente. E o recurso anônimo facilita o processo de compartilhar sentimentos";

        alternativas[4][0] = "Dar feedbacks apontando os pontos negativos de cada funcionário , fazendo com que ele melhore ";
        alternativas[4][1] = "-Crie jogos em equipe. Atividades de formação de equipes e jogos quebra-gelo são sempre boas maneiras de incentivar a comunicação em equipe.Não apenas os membros da equipe se conhecem além do contexto de trabalho (não falam sobre assuntos relacionados ao trabalho), mas eles também se divertem e conseguem quebrar o gelo";
        alternativas[4][2] = "O reconhecimento deve ser uma prioridade. Reconhecer os colaboradores que desempenharam bem as suas funções é o segredo do sucesso para a composição de equipes inteiras extremamente produtivas, e isso pode ser feito por meio de ajustes salariais e prêmios específicos, entre outros incentivos";
        alternativas[4][3] = "Aposte na capacitação. Investir no desenvolvimento de funcionários é importante tanto para motivar como para reciclar colaboradores, e quando a capacitação vem acompanhada de um bom plano de carreira, a obtenção de ótimos resultados é praticamente garantida";

        alternativas[5][0] = "Continuar investindo em tecnologia pois é uma área que esta crescendo muito , e o lucro pode chegar a longo prazo ";
        alternativas[5][1] = "-Fazer pequenos investimentos em novas tecnologias ,ao invés de investir uma grande quantidade é necessario apenas uma pequena quantia a curto prazo , caso o investimento dê lucros a porcentagem a ser investida pode aumentar gradativamente ";
        alternativas[5][2] = "Fazer reuniões de negócios com pessoas especializadas na área , uma boa admnistração e alguem que entenda de negócios seria uma boa ideia para a empresa não perder mais com investimentos que ela julga ser uma otima escolha ";

        return alternativas;
    }

    public static int lendoAlternativa(String[][] matriz, int questao) {
        System.out.println("length para saber o tamanho da matriz: " + matriz.length);

        System.out.println("Alternativas da questao: " + questao);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == questao) {
                    System.out.println(j + ") " + matriz[i][j]);
                }
            }
        }
        Scanner entrada = new Scanner(System.in);
        System.out.print("sua escolha: ");
        int a = entrada.nextInt();
        return a;
    }

    static void Historia(String nome) {
        limparSaida();
        Scanner entrada = new Scanner(System.in);
        System.out.println("A história começa com um jovem investidor de sucesso chamado Agostinho Carrara que decidiu experimentar novos ares e expandir seus negócios,\n"
                + "após vários anos trabalhando na bolsa de valores percebeu que estava cansado de seu trabalho  que  era muito cansativo e exaustivo e que sempre era \n"
                + "muito cobrado para ter bons números e resultados, ele percebe que  não exercia sua função com a mesma qualidade e eficiência do que 7 anos atrás \n"
                + "que foi quando ele entrou no mercado de ações,  quando percebeu isso já não estava em um bom momento da carreira e não estava tão feliz, e foi \n"
                + "quando decidiu sair de seu emprego para tirar um mês sabático para se reinventar e se redescobrir.  \n"
                + "\n"
                + "No seu mês sabático, Agostinho descansou bastante e após sair da bolsa conseguiu passar mais tempo com sua mulher e seus filhos. E em uma noite \n"
                + "enquanto jantava se lembrou da comida que sua mãe fizera para ele e que ela fazia com amor e gostava muito de cozinhar para ele, se lembrou também\n"
                + "que ela tinha um sonho um dia de abrir um restaurante mas nunca conseguiu porque anos atrás ela não tinha condições e nem dinheiro para realizar \n"
                + "tal feito, e atualmente ela não conseguira porque a natureza decidiu que era hora dela partir, muito emocionado com as lembranças da mãe AGOSTINHO\n"
                + "decidiu realizar o antigo sonho de sua mãe, após anos trabalhando e ganhando bem  e já ter estabilizado sua vida ele decidiu que estava mais que \n"
                + "na hora de começar um novo marco na sua carreira, e que honraria o nome de sua mãe mas infelizmente ela não estaria presente para ver.  \n"
                + "\n"
                + "Então AGOSTINHO já havia decidido o nome do restaurante que será o Pé De Fava, só que então ele percebe que não é tão fácil e simples assim abrir\n"
                + "um novo negócio quanto ele pensava, que havia muita burocracia, taxas, encargos  e licenças para tirar e percebe que sozinho não iria dar conta \n"
                + "de tudo, então ele decide chamar uma ajuda para que ele consiga abrir sua empresa, e após essa decisão ele decide nos chama a Consulting and Thinkng,\n"
                + "para juntos acharmos uma solução para seus problemas. \n"
                + "\n"
                + "Então vamos nos encontrar com o Sr. CARRARA, e ele nos passa o seu orçamento que é R$ 70.000,00 reais e nos que não sabe quais primeiros passos ele\n"
                + "deve tomar para abrir seu restaurante e conta com a Consulting and Thinkng para o ajudar, e nós contamos com você " + nome + ".");
        System.out.println(" ");
        System.out.print("Pressione Enter no teclado para continuar...");
        System.out.println(" ");
        entrada.nextLine();
    }

    public static double passo1(String nome) {
        Scanner sc = new Scanner(System.in);
        int r;
        double n1 = 0;

        do {

            System.out.println(" ");
            System.out.println("Então " + nome + " de primeiro momento qual o primeiro passo devemos tomar para ajudar o Sr. AGOSTINHO a montar o seu restaurante? \n");
            System.out.println("1 - Analisar o mercador e analisar o locar onde ficara o restaurante, e conversar com diversos funcionários da área para ver como esse \n"
                    + "ramo funciona, e depois ver quem são seus concorrentes.");
            System.out.println(" ");
            System.out.println("2 - Primeiramente começar montando uma equipe de planejamento, analisar o mercado e o local onde ficara localizado o restaurante, e depois\n"
                    + "verificar seu público alvo e verificar o que sua empresa pode oferecer de diferente, caso contrário será só mais uma empresa qualquer.\n");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            r = sc.nextInt();

            switch (r) {
                case 1:
                    n1 = 1;
                    break;
                case 2:
                    n1 = 2;
                    break;
            }

        } while (r != 2 && r != 1);

        return n1;

    }

    public static double passo2() {
        Scanner sc = new Scanner(System.in);
        int r2;
        double n2 = 0;

        do {
            limparSaida();
            System.out.println("Agora criamos a nossa equipe de planejamento, devemos começar a contratar o nosso quadro de funcionários que irá trabalhar conosco na\n"
                    + "empresa. ");
            System.out.println(" ");
            System.out.println("1 - primeiramente iremos contratar a parte de cima da pirâmide (Sendo os líderes e os gerentes trazendo pessoas renomadas) primeiro e\n"
                    + "depois contratar a parte operaria da equipe com o dinheiro que sobrasse sendo os (garçons, os cozinheiros, os barmen etc..) você gastara bastante\n"
                    + "dinheiro, mas terá uma equipe de líderes excelente.\n");
            System.out.println("2 - Contratar primeiro a parte da equipe operaria e depois contratar os seus chefs com base na sua equipe, fazendo assim você\n"
                    + "economizaria uma boa quantidade de dinheiro.\n");
            System.out.println("3 - Contratar uma equipe de modo geral como um todo equilibrado e as finanças da empresa continuará equilibrada.\n");
            System.out.println("4 - designar essa função de contratar para outra pessoa.\n");
            System.out.print("Digite a opção desejada: ");
            r2 = sc.nextInt();

            switch (r2) {
                case 1:
                    n2 = 1;
                    break;
                case 2:
                    n2 = 1;
                    break;
                case 3:
                    n2 = 2;
                    break;
                default:
                    n2 = 0;

            }

        } while (r2 != 1 && r2 != 2 && r2 != 3 && r2 != 4);
        return n2;
    }

    public static double passo3(String nome) {
        double n3 = 0;
        int r3;
        Scanner sc = new Scanner(System.in);

        Random radon = new Random();
        int x = radon.nextInt();
        for (int i = 0; x < 50000; i++) {

        }
        do {
            limparSaida();
            System.out.println(" ");
            System.out.println(nome + " Agora que já fizemos o planejamento e já montamos a equipe chegou a hora de nós compramos os maquinários e precisamos de sua\n"
                    + "ajuda para isso nosso orçamento para comprar os equipamentos é de " + x + ".");
            System.out.println(" ");
            System.out.println("1 - Você e sua equipe de planejamento vão comprar os equipamentos. ");
            System.out.println(" ");
            System.out.println("2 - Você compra tudo sozinho sem se comunicar com sua equipe de planejamento.");
            System.out.println(" ");
            System.out.println("3 - Você leva todos os seus funcionários para comprar os equipamentos.");
            System.out.println(" ");
            System.out.println("4 - Deixar sua equipe comprar sem você");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            r3 = sc.nextInt();

            switch (r3) {

                case 1:
                    n3 = 2;
                    break;
                case 2:
                    n3 = 0;
                    break;
                case 3:
                    n3 = 0.5;
                    break;
                case 4:
                    n3 = 0;
                    break;

            }

        } while (r3 != 1 && r3 != 2 && r3 != 3 && r3 != 4);

        return n3;
    }

    public static double passo4() {
        int r4;
        double n4 = 0;
        Scanner sc = new Scanner(System.in);

        do {
            limparSaida();
            System.out.println(" ");
            System.out.println("Após comprar os equipamentos, o Sr. CARRARA percebe que suas contas estão no vermelho e precisa de mais dinheiro para continuar o sonho\n"
                    + "de sua mãe que era abrir seu negócio. O que você o aconselha a fazer?\n");
            System.out.println("");
            System.out.println("1 - Vai no banco e pega dinheiro emprestado pagando poucas taxas e juros. ");
            System.out.println(" ");
            System.out.println("2 - Encontrar um investidor que acredita no nosso projeto e pode agregar não só dinheiro como também conhecimento. ");
            System.out.println(" ");
            System.out.println("3 - Pede emprestado para uns amigos e fala que paga o quanto antes.");
            System.out.println(" ");
            System.out.println("4 - Falar com os funcionários que irá atrasar o salário deles, mas só nos 2 primeiros meses que é para ajudar a empresa a equilibrar as\n"
                    + " contas ");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            r4 = sc.nextInt();

            switch (r4) {
                case 1:
                    n4 = 1;
                    break;
                case 2:
                    n4 = 1;
                    break;
                case 3:
                    n4 = 0.5;
                    break;
                case 4:
                    n4 = 0;
                    break;
            }

        } while (r4 != 1 && r4 != 2 && r4 != 3 && r4 != 4);
        return n4;
    }

    public static double passo5(String nome) {
        int r5;
        double n5 = 0;
        Scanner sc = new Scanner(System.in);

        do {
            limparSaida();
            System.out.println(" ");
            System.out.println("Agora que os preparativos para a abertura do restaurante já estão chegando em suas fases finais, precisamos pensar em como iremos "
                    + "divulga-la, qual método devemos utilizar? ");
            System.out.println(" ");
            System.out.println("1 - Ir a uma praça bem movimentada, para entregar panfletos para as pessoas que estão passando. ");
            System.out.println(" ");
            System.out.println("2 - Montar um site na internet para poder compartilhar nas redes sociais.");
            System.out.println(" ");
            System.out.println("3 - Contratar um serviço de um “carro de som” para divulgar pela região. ");
            System.out.println(" ");
            System.out.println("4 - Publicar seu anuncio em um outdoor. ");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            r5 = sc.nextInt();

            switch (r5) {
                case 1:
                    n5 = 2;
                    break;
                case 2:
                    n5 = 1;
                    break;
                case 3:
                    n5 = 0.5;
                    break;
                case 4:
                    n5 = 1;
                    break;

            }

        } while (r5 != 1 && r5 != 2 && r5 != 3 && r5 != 4);
        System.out.println("Após isso o Pé De Fava conseguiu abrir suas portas, no 1° ano foi um sucesso total de vendas e o dono ficou muito satisfeito com o nosso trabalho da Consulting and Thinkng... bom trabalho " + nome + "!!! ");
        return n5;
    }

    static void PeDeFava() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Após o 1° ano da abertura do Pé De Fava e de toda sua boa repercussão, o Pé De Fava começou a passar por apuros em suas vendas que antes e\n"
                + "stavam maravilhosas. \n"
                + "Começaram a cair de produção, o feedback dos clientes começou a piorar, clientes saiam do restaurante insatisfeitos e o Pé De Fava recontratou a\n"
                + " nossa consultoria de novo para nos ajudarmos eles com esses problemas... \n"
                + "\n"
                + "Dessa vez a Consulting and Thinkng agiu de uma forma diferente chamamos um chef especializado na área da gastronomia, O Chef Nightmare.  \n"
                + "\n"
                + "No seu primeiro dia o chef fez uma vistoria por todo o restaurante, e constatou que provavelmente o problema estava na cozinha. \n"
                + "\n"
                + "Então no dia seguinte o chef NIGHTMARE foi fazer um treinamento com os cozinheiros e observou a forma que os funcionários trabalhavam, e de repente\n"
                + "aparece o Edimilson carregando um saco de batatas pelo restaurante. O chef ficou surpreso com a presença de Edimilson, ainda mais carregando um saco\n"
                + " de batatas pelo restaurante.  \n"
                + "\n"
                + "Então o chef pergunta a Edimilson: ");
        System.out.println(" ");
        System.out.println(" - O que você está fazendo aqui ? você trabalha aqui ? por que eu não tinha te visto antes? ");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println("E Edimilson responde:");
        System.out.println("- Sou Edimilson o quebra galho, as vezes eu dou uma sumida mais estou sempre pela área.");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println(" ");
        System.out.println("O chef ficou com aquela cena de Edimilson na cabeça, então decide acompanhar Edimilson ir guardar aquelas batatas no estoque e aproveita\n"
                + "para dar uma olhada no estoque e o gerente do Pé De Fava, o gerente que se chama FABIO vai junto para fazer companhia para o chef. \n"
                + "\n"
                + "Então quando chegou no estoque o chef pediu para EDIMILSON abrir o freezer para ele dar uma olhada, para sua surpresa quando EDIMILSON abriu o\n"
                + "freezer subiu um cheiro de podre inacreditável e ele viu que a carne estava descongelada, então o chef fica furioso e começa a discutir com o FABIO.");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println("- Você sabia disso? Disse Nightmare.");
        System.out.println("- A culpa é do Edimilson ele que arruma o estoque. Respondeu o gerente...");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println(" ");
        System.out.println("Nesse momento Edimilson interrompe o gerente e começa a falar. ");
        System.out.println("- A culpa é minha, mas o responsável pelo restaurante é você, sabe chef e que ele desliga o freezer a noite para economizar energia ele\n"
                + " deixa a noite desligado e só liga de novo pela manhã. Disse Edimilson. ");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println("NIGHTMARE fica louco de raiva. ");
        System.out.println(" ");
        System.out.println("- Você sabia disso e me deixar cozinhar aqui, você é o que maluco pra fazer isso, você só pode estar de brincadeira comigo, você está sendo\n"
                + "pago pra fazer isso comigo? Disse o chef. ");
        System.out.println("Pressione enter para continuar o diálogo...");
        entrada.nextLine();
        System.out.println(" ");
        System.out.println("Fabio tenta se explicar falando que fazia isso para equilibrar as contas da empresa, no mesmo momento NIGHTMARE o interrompe e fala:");
        System.out.println("- Cala boca! Cala a sua boca! Você é a vergonha da profissão. ");
        System.out.println(" ");
        System.out.println("Então NIGHTMARE vai nervoso pra frente do restaurante e manda todos os clientes saírem do Pé De Fava que será melhor para saúde deles, e\n"
                + "então o chef fecha o restaurante. \n"
                + "\n"
                + "Então o chef nos chama para uma reunião no mesmo dia e nos conta a situação da Pé De Fava. ");
        System.out.println("Pressione enter para continuar...");
        entrada.nextLine();

    }

    public static double passo6(String nome) {
        int r6;
        double n6 = 0;
        Scanner sc = new Scanner(System.in);

        do {
            limparSaida();
            PeDeFava();
            System.out.println(" ");
            System.out.println("Então " + nome + " o que devemos fazer diante dessa situação? ");
            System.out.println(" ");
            System.out.println("1 - devemos mandar todo mundo embora e contratar outros funcionários e também trocar a mercadoria. ");
            System.out.println(" ");
            System.out.println("2 - devemos mandar só o gerente embora e troca a mercadoria.");
            System.out.println(" ");
            System.out.println("3 - não mandar embora ninguém e apenas trocar a mercadoria e descontar do salário do gerente e manter esse caso abafado.");
            System.out.println(" ");
            System.out.println("4 - denunciar o gerente.");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
            r6 = sc.nextInt();

            switch (r6) {

                case 1:
                    n6 = 1;
                    break;
                case 2:
                    n6 = 2;
                    break;
                case 3:
                    n6 = 0;
                    break;
                case 4:
                    n6 = 0.5;
                    break;

            }

        } while (r6 != 1 && r6 != 2 && r6 != 3 && r6 != 4);
        return n6;
    }

    public final static void limparSaida() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }

    public static String nome() {
        Scanner entrada = new Scanner(System.in);

        String nome;

        System.out.print("Favor inserir o nome do seu personagem: ");
        nome = entrada.next();
        return nome;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String result1 = "a", ent_text, nome;
        int ent, ent2;
        double fn1, fn2, fn3, fn4, fn5, fn6, result, ps1, ps2, ps3, ps4, ps5, ps6, resultadof;

        do {
//Cabeçalho            
            System.out.println("   #####         ##         ####### \n"
                    + " #     #       #  #           #    \n"
                    + " #              ##            #    \n"
                    + " #             ###            #    \n"
                    + " #            #   # #         #    \n"
                    + " #     #      #    #          #    \n"
                    + "  #####        ###  #         #    \n"
                    + "                                    "
                    + "");
//Inicio do MENU
            System.out.println("Olá, Sejá bem vindo.");
            System.out.println(" ");
            System.out.println("Favor escolher uma das opções abaixo.");
            System.out.println(" ");
            System.out.println("1 – Instruções");
            System.out.println("2 – Jogar");
            System.out.println("3 – Créditos");
            System.out.println("4 – Sair");
            System.out.println(" ");
            System.out.print(" ");
            System.out.print("Favor informar a opção selecionada: ");
            System.out.print(" ");
//Seleciona a opção
            ent = entrada.nextInt();
//Switch das opções
            switch (ent) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    System.out.println("Você escolheu jogar. ");
                    System.out.println(" ");
                    nome = nome();
                    entrada.nextLine();
                    System.out.println("Você deseja visualizar as instruções de como jogar? ");
                    System.out.println("1 - Sim. ");
                    System.out.println("2 - Não. ");
                    ent = entrada.nextInt();
                    System.out.println(" ");
                    if (ent == 1) {
                        instrucoes();
                    } else {
// História Leonardo Lopes
                        fn1 = f1(nome);
                        fn2 = f2();
                        fn3 = f3();
                        fn4 = f4();
                        fn5 = f5();
                        fn6 = f6();
                        result = fn1 + fn2 + fn3 + fn4 + fn5 + fn6;
                        if (result >= 8) {
                            result1 = "Parabéns, a empresa lucrou e não faliu.";
                            System.out.println("Num feedback geral sobre a sua consultoria, Michael nos trouxe o seguinte feedback: “A soma da capacitação dos colaboradores à junção de forças\n"
                                    + "em prol do mesmo ideal, aliando comprometimento e honestidade, foi essencial para que a Fersol saísse de uma possível falência e encontrasse estabilidade\n"
                                    + "financeira. Muito mais do que acreditar que é possível reverter um quadro como este, acreditar na capacidade e lealdade dos colaboradores foi fundamental\n"
                                    + "para a Fersol se restabelecer no mercado de defensivos agrícolas, obrigado.”\n");
                            System.out.println("Você liberou um novo nível, deseja jogar?");
                            System.out.println("1 - Sim.");
                            System.out.println("2 - Não.");
                            ent2 = entrada.nextInt();
                            if (ent2 == 1) {
//História Jefferson Monteiro
                            }

                        } else if (result >= 5 && result <= 7) {
                            result1 = "A empresa não faliu e não gerou lucros";
                            System.out.println("Pressione enter para continuar...");
                            entrada.nextLine();
                        } else if (result < 5) {
                            result1 = "A empresa não faliu e não gerou lucros";
                            System.out.println("Pressione enter para continuar...");
                            entrada.nextLine();

// História Lucas Noé/Antony Raphael
                            Historia(nome);
                            ps1 = passo1(nome);
                            ps2 = passo2();
                            ps3 = passo3(nome);
                            ps4 = passo4();
                            ps5 = passo5(nome);
                            ps6 = passo6(nome);

                            resultadof = ps1 + ps2 + ps3 + ps4 + ps5 + ps6;

                            if (resultadof >= 9) {
                                System.out.println("Parabéns! A empresa cresceu e teve lucros.");

                            }
                            if (resultadof >= 6 && resultadof <= 8) {
                                System.out.println("A empresa continua aberta, mas não esta tendo lucros.");
                            }
                            if (resultadof <= 5) {
                                System.out.println("Game over. A empresa faliu. ");
                            }
                        }
                        break;

                    }
                case 3:
                    creditos();
                    break;
                default:
                    System.out.println("Você escolheu sair. ");
                    System.out.print(" ");
                    break;
            }

        } while (ent != 4);

    }

}


        