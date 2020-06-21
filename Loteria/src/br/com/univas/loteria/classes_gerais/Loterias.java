
package br.com.univas.loteria.classes_gerais;
import java.util.ArrayList;
import java.util.List;


public interface Loterias {// Classe interface.

    // Atributos
   
    // Métodos
   
   public abstract boolean validacao(int valida); //verifica se números digitados estão dentro dos parâmetros
   public abstract void setDezenas(int dezenas); //seta as dezenas
   public abstract int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo); //Confere o jogo do apostador
   public abstract void randomicos();// Realiza um jogo aleatório para o jogador.
   public abstract void cincoMais(ArrayList<Integer> vet);// Verifica e apresenta os cinco números que mais saíram de todos os jogos até um determinado momento de um determinado tipo de loteria.
   public abstract void cincoMenos(ArrayList<Integer> vet);// Verifica e apresenta os cinco números que menos saíram de todos os jogos até um determinado momento de um determinado tipo de loteria.
   public abstract ArrayList<Integer> getDezenas();// Acessa a alguma determinanda dezenas de um determinado jogo da loteria.
}
