/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasiete;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class NewtonRaphson {
    private Derivador derivador;
    private int iteraciones;
    private double x0;

    public NewtonRaphson() {
        derivador = new Derivador();
        iteraciones = 0;
        x0 = 0;
    }

    public NewtonRaphson(Derivador derivador, int iteraciones, double x0) {
        this.derivador = new Derivador(derivador);
        this.iteraciones = iteraciones;
        this.x0 = x0;
    }
    

    public NewtonRaphson(Derivador derivador) {
        this.derivador = new Derivador(derivador);
        iteraciones = 0;
        x0 = 0;
    }
    
    public NewtonRaphson(NewtonRaphson nr){
        this.derivador = new Derivador(nr.derivador);
        this.iteraciones = nr.iteraciones;
        this.x0 = nr.x0;
    }
    
    public Derivador getDerivador() {
        return derivador;
    }

    public void setDerivador(Derivador derivador) {
        this.derivador = new Derivador(derivador);
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public void setIteraciones(){
        System.out.println("Cuantas veces desea iterar?");
        Scanner scan = new Scanner(System.in);
        iteraciones = scan.nextInt();
    }    
    
    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }
    
    public void setX0(){
        System.out.println("Con que valor desea inicializar X0?");
        Scanner scan = new Scanner(System.in);
        x0 = scan.nextDouble();
    }
    
    
    public int Evaluar(double expresion[], double x){
        int Fx = 0;
        for(int i = 0; i <expresion.length; i++){
            Fx += Math.pow(x,expresion.length-1-i)*expresion[i];
        }
        return Fx;
    }
 
    public void Converge(){
        double temp, factor = 0, A, B;
        for(int contador = 0; contador<iteraciones; contador++){
            temp = x0;
            A = Evaluar(derivador.getFuncionPolinomial(),temp);
            B = Evaluar(derivador.Derivar(),temp);
            if(B == 0){
                int cero = 0;
                factor = (int) (A/cero);
            }else{
                factor = A/B;
            }
            x0 = temp - factor;
            
        }
        System.out.println("X =  " + x0);
    }
   
}
