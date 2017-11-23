package atividade3bimestre;
import javax.swing.JOptionPane;


/**Classe AltamenteInternacional, onde será mostrado uma saudação em idiomas distintos 
 * 
 * @author arthur, amanda, yasmim
 * @version 1.0
 * @since 22/11/2017
 * 
 */

public class AltamenteInternacional {
    
    /** Método para retornar Olá Mundo em inglês 
     *   @return void - Hello World */
    public void ingles(){
        System.out.println("Hello World");
    }
    /** Método para retornar Olá Mundo em portugues 
     *   @return void - Olá Mundo */
    public void portugues(){
        System.out.println("Olá Mundo");
    }
    /** Método para retornar Olá Mundo em espanhol 
     *   @return void - Hola Mundo */
    public void espanhol(){
        System.out.println("Hola Mundo");
    }
    
    /** Executar a classe AltamenteInternacional e de acordo com o idioma escolhido pelo usuario */
    public static void main(String[] args) {
        AltamenteInternacional f = new AltamenteInternacional();
        String lingua;
    /** Caixa de dialogo que armazena a resposta do usuario quanto ao idioma na variavel lingua */
        lingua = JOptionPane.showInputDialog("Digite: ingles,portugues ou espanhol");
    /** @return String - saudação inglês 
     * @param ingles */
        if (lingua.equals("ingles")) {
            f.ingles();
        }
     /** @return String - saudação portugues 
     * @param portugues */
        else if(lingua.equals("portugues")){
            f.portugues();
        }
    /** @return String - saudação espanhol 
     * @param espanhol */
        else if(lingua.equals("espanhol")){
        f.espanhol();
        }
        
    }
}