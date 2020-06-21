
package br.com.univas.loteria.classes_gerais;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Jogo {
    
    // Atributos
    
    private int concurso; // Número do concurso de algum determinado jogo de loteria.
    private String data; // Data de um determinado jogo de loteria.
    public ArrayList<Integer> dezenas = new ArrayList();// Dezena de um determinado jogo de loteria.
   
    //METODOS

    public int getConcurso() {
        return concurso;
    }

    public void setConcurso(int concurso) {
        this.concurso = concurso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }  

    public ArrayList<Integer> getDezenas() {
        return dezenas;
    }

    public void setDezenas(ArrayList<Integer> dezenas) {
        this.dezenas = dezenas;
    }
    public void adcionar(Integer x){
        this.dezenas.add(x);
    }  
}



