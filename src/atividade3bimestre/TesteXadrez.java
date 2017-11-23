
package atividade3bimestre;

/**Classe teste Xadrez para mostrar os movimentos das peças 
 * 
 * @author arthur, amanda, yasmim
 * @version 1.0
 * @since 22/11/2017
 * 
 */

public class TesteXadrez {
    Xadrez p = new Xadrez();
    
    /** Método para testar o método peão da classe Xadrez 
     *   @return void - movimento do peão: Andar para frente*/
    public void testarPeao(){
    p.peao();
    }
    /** Método para testar o método cavalo da classe Xadrez 
     *   @return void - movimento do cavalo: Andar em L*/
    public void testarCavalo(){
    p.cavalo();
    }
     /** Método para testar o método Bispo da classe Xadrez 
     *   @return void - movimento do Bispo: Andar na diagonal*/
    public void testarBispo(){
    p.bispo();
    }
    
     /** Executa a classe teste Xadrez*/
    
    
    public static void main(String[] args) {
       
       TesteXadrez t = new TesteXadrez();
       
       t.testarPeao();
       t.testarCavalo();
       t.testarBispo();
      
       
       
       
       
    }
}
