/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package practicasiete;

import java.util.*;

public class PracticaSiete{
    public static void main(String[] args) {
      System.out.println("Grado de polimonio:");
      Scanner scan = new Scanner(System.in);
      int polinomioGrado = scan.nextInt();
      double C[] = new double[polinomioGrado+1];
      for (int i = 0;i < polinomioGrado+1; i++) {
        System.out.println("Coeficiente del termino grado " +  (polinomioGrado-i) +  ":");
        C[i] = scan.nextDouble();
      }

      double D[] = new double[C.length-1];
      for(int i = 0; i < C.length-1; i++){
        D[i] = C[i]*(C.length-i-1);
      }
      System.out.println(Arrays.toString(C));
      System.out.println(Arrays.toString(D));
    }
}
