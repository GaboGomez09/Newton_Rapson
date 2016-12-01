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
      double x = 3.0;
      double fx = derivador.Evaluar(derivador.getFuncionPolinomial(),x);
      double dfx = derivador.Evaluar(derivador.Derivar(),x);
      System.out.println("F("+x+"): "+fx);
      System.out.println("F'("+x+"): "+dfx);
      
    }
}
