/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasiete;

import java.util.*;

public class PracticaSiete{
    public static void main(String[] args) {
      Derivador derivador = new Derivador();
      derivador.setPolinomioGrado();
      derivador.setFuncionPolinomial();
      System.out.println("F(x): "+Arrays.toString(derivador.getFuncionPolinomial()));
      System.out.println("F'(x): "+Arrays.toString(derivador.Derivar()));
      System.out.println("F("+3.0+"): "+derivador.Evaluar(derivador.getFuncionPolinomial(),2));
      System.out.println("F'("+3.0+"): "+derivador.Evaluar(derivador.Derivar(),2));
      
    }
}
