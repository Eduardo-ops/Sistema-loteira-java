
package br.com.univas.loteria.area_de_trabalho;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import br.com.univas.loteria.classes_gerais.Factory;
import br.com.univas.loteria.classes_gerais.Jogo;
import br.com.univas.loteria.classes_gerais.Loterias;
import br.com.univas.loteria.classes_gerais.Lotofacil;
import br.com.univas.loteria.classes_gerais.MegaSena;
import br.com.univas.loteria.classes_gerais.Quina;

public class area_de_trabalho {
    
    public static void main (String[]args) throws FileNotFoundException {
        
        Scanner leia = new Scanner(System.in);
        
        //Fazendo leitura dos arquivos CSV
        File megaCSV = new File("C:\\Users\\eduar\\OneDrive\\Documentos\\Faculdade\\3°° Semestre\\Técnicas de programação-III\\Trabalho 2\\2020-lab3-master\\trabalho\\mega.csv");
        File quinaCSV = new File("C:\\Users\\eduar\\OneDrive\\Documentos\\Faculdade\\3°° Semestre\\Técnicas de programação-III\\Trabalho 2\\2020-lab3-master\\trabalho\\quina.csv");
        File lotofacilCSV = new File("C:\\Users\\eduar\\OneDrive\\Documentos\\Faculdade\\3°° Semestre\\Técnicas de programação-III\\Trabalho 2\\2020-lab3-master\\trabalho\\lotofacil.csv");
        BufferedReader buffMega = new BufferedReader(new FileReader(megaCSV));
        BufferedReader buffLotofacil = new BufferedReader(new FileReader(lotofacilCSV));
        BufferedReader buffQuina = new BufferedReader(new FileReader(quinaCSV));
        
        ArrayList<Jogo> mList = new ArrayList(); //Array de Objetos do tipo Jogos MegaSena
        ArrayList<Jogo> qList = new ArrayList(); //Array de Objetos do tipo Jogos Quina
        ArrayList<Jogo> lList = new ArrayList(); //Array de Objetos do tipo Jogos Lotofacil
        String line = "";
        
        //Split nas linhas do CSV, salvando no objeto e carregando lista de objetos MegaSena
                try {
           while((line = buffMega.readLine()) != null){
                
                Jogo mega = new Jogo();
                String[] c = line.split(","); //Array de String para separar cada linha do arquivo CSV
                mega.setConcurso(Integer.parseInt(c[0]));
                mega.setData(c[1]);
                for(int i = 2; i < 8; i++){
                mega.adcionar(Integer.parseInt(c[i]));
                }                       
                mList.add(mega); 
            }
      } catch (Exception e) {
          
       }
                
                //Split nas linhas do CSV, salvando no objeto e carregando lista de objetos Lotofacil
                try {
           while((line = buffLotofacil.readLine()) != null){
                
                Jogo lotofacil = new Jogo();
                String[] e = line.split(","); //Array de String para separar cada linha do arquivo CSV
                lotofacil.setConcurso(Integer.parseInt(e[0]));
                lotofacil.setData(e[1]);
                for(int i = 2; i < 17; i++){
                lotofacil.adcionar(Integer.parseInt(e[i]));
                }                       
                lList.add(lotofacil);
            }
      } catch (Exception e) {
       }
                
                //Split nas linhas do CSV, salvando no objeto e carregando lista de objetos Quina
                try {
           while((line = buffQuina.readLine()) != null){
                
                Jogo quina = new Jogo();
                String[] d = line.split(","); //Array de String para separar cada linha do arquivo CSV
                quina.setConcurso(Integer.parseInt(d[0]));
                quina.setData(d[1]);
                for(int i = 2; i < 7; i++){
                quina.adcionar(Integer.parseInt(d[i]));
                }                       
                qList.add(quina);
            }
      } catch (Exception e) {
       }
        
                
        int opcao = 0;
        int opcao2 = 0;
        boolean a;

        do {
            
            System.out.println("1. Mega-Sena");
            System.out.println("2. Quina");
            System.out.println("3. Lotofácil");
            System.out.println("9. Sair");
            System.out.printf("\n");
            
            opcao = leia.nextInt();
            System.out.printf("\n");
            
            if (opcao == 1) {// Opção de realizar um jogo específico
                
                Loterias jogo = Factory.criarJogo(opcao);// Usando factory para criar o objeto da classe e jogo específico.

                System.out.println("1. 5 números que mais saíram");
                System.out.println("2. 5 números que menos saíram");
                System.out.println("3. Gerar números randômicos");
                System.out.println("4. Escolher minhas dezenas");
                System.out.printf("\n");
                
                opcao2 = leia.nextInt();
                System.out.printf("\n");
                
                // 5 números que mais saíram.
                if (opcao2 == 1) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < mList.size();j++){
                        for (int i = 0;i < 6;i++) {
                            
                            vet.add(aux,mList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMais(vet);
         
                }
                
                // 5 menos saíram
                if (opcao2 == 2) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < mList.size();j++){
                        for (int i = 0;i < 6;i++) {
                            
                            vet.add(aux,mList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMenos(vet);
                     
                }
                
                // Jogo randômico
                if (opcao2 == 3) {
                    
                    jogo.randomicos();
            
                }
                
                // Fazendo o próprio jogo e verificando em qual teria ganhado.
                if (opcao2 == 4) {
                    
                   int aux = 0;
                   
                    System.out.println("ATENÇÃO: AS DEZENAS DEVEM ESTAR ENTRE 1 E 60");

                    for (int i = 0;i < 6;i++) {
                        System.out.println("Escolha a " + (i + 1) + "° dezena:");
                        
                        aux = leia.nextInt();
                        a = jogo.validacao(aux);
                        
                        if (a == false) {
                            System.out.println("sua dezenas devem estar entre 1 e 60");
                            System.out.println("Informe novamente a dezena:");
                            i--;
                        }
                        jogo.setDezenas(aux);
                        
                        System.out.println(jogo.getDezenas());
                    }
                    
                    int acerto = 0; 
                    for(int i = 0; i < mList.size(); i++){
                        acerto = jogo.confere(jogo.getDezenas(), mList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 4:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUADRA!!");
                            System.out.println("");
                            break;
                            case 5:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUINA!!");
                            System.out.println("");
                            break;
                            case 6:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na MEGA!!");
                            System.out.println("");
                            break;
                    }
                }  
            }
        }
            
            if (opcao == 2) {// Opção de realizar um jogo Quina
          
                Loterias jogo = Factory.criarJogo(opcao);// Usando factory para criar o objeto da classe e jogo específico.

                System.out.println("1. 5 números que mais saíram");
                System.out.println("2. 5 números que menos saíram");
                System.out.println("3. Gerar números randômicos");
                System.out.println("4. Escolher minhas dezenas");
                System.out.printf("\n");
                
                opcao2 = leia.nextInt();
                System.out.printf("\n");
                
                // 5 números que mais saíram
                if (opcao2 == 1) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < qList.size();j++){
                        for (int i = 0;i < 5;i++) {
                            
                            vet.add(aux,qList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMais(vet);
                    
                }
                
                // 5 números menos saíram
                if (opcao2 == 2) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < qList.size();j++){
                        for (int i = 0;i < 5;i++) {
                            
                            vet.add(aux,qList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMenos(vet);
                     
                }
                
                // Jogo randômico
                if (opcao2 == 3) {
                    
                    jogo.randomicos();
                    
                }
                
                 // Fazendo o próprio jogo e verificando em qual teria ganhado.
                if (opcao2 == 4) {
                    
                   int aux = 0;
                   
                    System.out.println("ATENÇÃO: AS DEZENAS DEVEM ESTAR ENTRE 1 E 80");

                    for (int i = 0;i < 5;i++) {
                        System.out.println("Escolha a " + (i + 1) + "° dezena:");
                        
                        aux = leia.nextInt();
                        a = jogo.validacao(aux);
                        
                        if (a == false) {
                            System.out.println("sua dezenas devem estar entre 1 e 80");
                            System.out.println("Informe novamente a dezena:");
                            i--;
                        }
                        jogo.setDezenas(aux);
                        
                        System.out.println(jogo.getDezenas());
                    }
                    
                    int acerto = 0; 
                    for(int i = 0; i < qList.size(); i++){
                        acerto = jogo.confere(jogo.getDezenas(), qList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 2:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na DUQUE!!");
                            System.out.println("");
                            break;
                            case 3:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na TERNO!!");
                            System.out.println("");
                            break;
                            case 4:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUADRA!!");
                            System.out.println("");
                            break;
                            case 5:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou na QUINA!!");
                            System.out.println("");
                            break;
                    }
                }  
            }
        }
            
            if (opcao == 3) {// Opção de realizar um jogo Lotofacil
          
                Loterias jogo = Factory.criarJogo(opcao);// Usando factory para criar o objeto da classe e jogo específico.

                System.out.println("1. 5 números que mais saíram");
                System.out.println("2. 5 números que menos saíram");
                System.out.println("3. Gerar números randômicos");
                System.out.println("4. Escolher minhas dezenas");
                System.out.printf("\n");
                
                opcao2 = leia.nextInt();
                System.out.printf("\n");
                
                // 5 números que mais saíram
                if (opcao2 == 1) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < lList.size();j++){
                        for (int i = 0;i < 15;i++) {
                            
                            vet.add(aux,lList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMais(vet);
                    
                }
                
                // 5 menos saíram
                if (opcao2 == 2) {
                    
                    ArrayList<Integer> vet = new ArrayList();
                    int aux = 0;
                    
                    for ( int j = 0;j < lList.size();j++){
                        for (int i = 0;i < 15;i++) {
                            
                            vet.add(aux,lList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMenos(vet);
                     
                }
                
                // Jogo randômico
                if (opcao2 == 3) {
                    
                    jogo.randomicos();
                    
                }
                
                
                if (opcao2 == 4) {
                    
                   int aux = 0;
                   
                    System.out.println("ATENÇÃO: AS DEZENAS DEVEM ESTAR ENTRE 1 E 25");

                    for (int i = 0;i < 15;i++) {
                        System.out.println("Escolha a " + (i + 1) + "° dezena:");
                        
                        aux = leia.nextInt();
                        a = jogo.validacao(aux);
                        
                        if (a == false) {
                            System.out.println("sua dezenas devem estar entre 1 e 25");
                            System.out.println("Informe novamente a dezena:");
                            i--;
                        }
                        jogo.setDezenas(aux);
                        
                        System.out.println(jogo.getDezenas());
                    }
                    
                    int acerto = 0; 
                    for(int i = 0; i < lList.size(); i++){
                        acerto = jogo.confere(jogo.getDezenas(), lList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 11:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou!!");
                            System.out.println("");
                            break;
                            case 12:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou!!");
                            System.out.println("");
                            break;
                            case 13:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou!!");
                            System.out.println("");
                            break;
                            case 14:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou!!");
                            System.out.println("");
                            break;
                            case 15:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " dezenas, e ganhou!!");
                            System.out.println("");
                            break;
                    }
                }  
            }
        }

            if (opcao == 9) {
                System.out.println("Obrigado!!!");
            }
            
        }while(opcao != 9);
        
        }
    }
    
        
        
        

        
        
    

