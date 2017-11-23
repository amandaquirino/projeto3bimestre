package atividade3bimestre;

/**Classe teste calculadora, onde será feito os testes das quatro operações básicas matemáticas
 * 
 * @author arthur, amanda, yasmim
 * @version 1.0
 * @since 22/11/2017
 * 
 */

public class TesteCalculadora {
    
    Calculadora c = new Calculadora();
    
    /** Método para testar o metodo de soma da classe calculadora
     *   @return void - retornar soma de x e y
     * 
     */
    public void testarSoma(){
    c.soma();
    }
    
    /** Método para testar o metodo de subtracao da classe calculadora
     *   @return void - retornar subtracao de x e y
     * 
     */
    public void testarSub(){
    c.subtracao();
    }
    
    /** Método para testar o metodo de multiplicacao da classe calculadora
     *   @return void - retornar multiplicacao de x e y
     * 
     */
    public void testarMult(){
    c.multiplicacao();
    }
    
    /** Método para testar o metodo de divisao da classe calculadora
     *   @return void - retornar divisao de x e y
     * 
     */
    public void testarDiv(){
    c.divisao();
    }
    
    /** Executa a classe teste calculadora*/
    
    public static void main(String[] args) {
        TesteCalculadora t = new TesteCalculadora();
        
        t.testarSoma();
        t.testarSub();
        t.testarMult();
        t.testarDiv();
    }
    
}
