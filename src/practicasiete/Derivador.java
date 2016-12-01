/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasiete;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Derivador {
    private int polinomioGrado;
    private double funcionPolinomial[];
    
    public Derivador() {
        polinomioGrado = 1;
        funcionPolinomial = new double[polinomioGrado+1];
    }

    public Derivador(int polinomioGrado, double[] funcionPolinomial) {
        this.polinomioGrado = polinomioGrado;
        funcionPolinomial = new double[polinomioGrado+1];
        for(int contador = 0; contador <polinomioGrado+1; contador++){
            this.funcionPolinomial[contador] = funcionPolinomial[contador];
        }   
    }
        
    public Derivador(Derivador d){
        polinomioGrado = d.polinomioGrado;
        funcionPolinomial = new double[polinomioGrado+1];
        for(int contador = 0; contador <polinomioGrado+1; contador++){
            this.funcionPolinomial[contador] = d.funcionPolinomial[contador];
        }
    }

    public int getPolinomioGrado() {
        return polinomioGrado;
    }

    public void setPolinomioGrado(int polinomioGrado) {
        this.polinomioGrado = polinomioGrado;
    }

    public double[] getFuncionPolinomial() {
        return funcionPolinomial;
    }

    public void setFuncionPolinomial(double[] funcionPolinomial) {
        funcionPolinomial = new double[polinomioGrado+1];;
        for(int contador = 0; contador <polinomioGrado+1; contador++){
            this.funcionPolinomial[contador] = funcionPolinomial[contador];
        }   
    }
    
    public void setPolinomioGrado(){
        System.out.println("Grado de polimonio:");
        Scanner scan = new Scanner(System.in);
        polinomioGrado = scan.nextInt();
    }
    
    public void setFuncionPolinomial(){
        funcionPolinomial = new double[polinomioGrado+1];
        Scanner scan = new Scanner(System.in);
        for (int i = 0;i < polinomioGrado+1; i++) {
            System.out.println("Coeficiente del termino grado " +  (polinomioGrado-i) +  ":");
            funcionPolinomial[i] = scan.nextDouble();
        }
    }
    
    
    public double[] Derivar(){
      double funcionDerivada[] = new double[funcionPolinomial.length-1];
      for(int i = 0; i < funcionPolinomial.length-1; i++){
        funcionDerivada[i] = funcionPolinomial[i]*(funcionPolinomial.length-i-1);
      }
      return funcionDerivada;
    }
    
    
}
