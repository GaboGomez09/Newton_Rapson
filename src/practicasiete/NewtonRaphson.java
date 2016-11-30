/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasiete;

/**
 *
 * @author Gabriel
 */
public class NewtonRaphson {
    private Derivador derivador;
    private int iteraciones;
    private int x0;

    public NewtonRaphson() {
        derivador = new Derivador();
        iteraciones = 0;
        x0 = 0;
    }

    public NewtonRaphson(Derivador derivador, int iteraciones, int x0) {
        this.derivador = new Derivador(derivador);
        this.iteraciones = iteraciones;
        this.x0 = x0;
    }
    
    public NewtonRaphson(NewtonRaphson nr){
        this.derivador = new Derivador(nr.derivador);
        this.iteraciones = nr.iteraciones;
        this.x0 = nr.x0;
    }
    
    public double Evaluar(double expresion[], double x){
        double Fx = 0;
        for(int i = 0; i <expresion.length; i++){
            Fx += Math.pow(x,expresion.length-1)*expresion[i];
        }
        return Fx;
    }
    
    
    public void Converge(){
        for(int contador = 0; contador<iteraciones; contador++){
            
        }
    }
    
    
}
