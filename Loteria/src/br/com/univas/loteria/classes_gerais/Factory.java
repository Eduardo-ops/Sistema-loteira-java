
package br.com.univas.loteria.classes_gerais;


public class Factory {
    
    public static Loterias criarJogo (int opcao) {// Método Factory sendo utilizada para criar objetos dos jogos especificos.
       
       if (opcao == 1) {
           return new  MegaSena();
       }else if (opcao == 2) {
           return new Quina();
       }else {
           return new Lotofacil();
       }
   }
    
}
