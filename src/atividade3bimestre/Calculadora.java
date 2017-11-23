package atividade3bimestre;

import java.util.Scanner;

/**Classe calculadora, onde será feito as quatro operações básicas matemáticas
 * 
 * @author arthur, amanda, yasmim
 * @version 1.0
 * @since 22/11/2017
 * 
 */
 
public class Calculadora {
    private int x = 10;
    private int y = 20;
    
    /** Método para retorno da soma
     *   @return void - retornar soma de x e y*/
  
    public void soma (){
        System.out.println("A soma de x + y é " + (x + y));
    }
     /** Método para retorno da subtração
     *   @return void - retornar subtração de x e y*/
    
    public void subtracao (){
        System.out.println("A subtração de x - y é " + (x - y));
    }
    
    /** Método para retorno da multiplicacao
     *   @return void - retornar multiplicacao de x e y*/

    public void multiplicacao (){
        System.out.println("A multiplicacao de x * y é " + (x *y));
    }
    
    /** Método para retorno da divisao
     *   @return void - retornar divisao de x e y*/

    public void divisao(){
        System.out.println("A divisao de x / y é " + (x / y));
    }

   
}
