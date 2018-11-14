/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

/**
 *
 * @author Corthouts
 */
public class FunctieGenerator {
    // data memebers
    private double amplitude;
    private double a,b,c,d;
    
    /**
     * maakt een nieuwe functie aan
     * @param maxHoogte
     */
    public FunctieGenerator(double maxHoogte){
        this.amplitude = maxHoogte/4;
        a = (35-(int)(Math.random()*19)+1)*20;
        b = (35-(int)(Math.random()*19)+1)*20;
        c = (35-(int)(Math.random()*19)+1)*20;
        d = (35-(int)(Math.random()*19)+1)*20;
    }
    
    /**
     * geeft de y waarde van de functie terug voor een opgegeven x waarde
     * de functie is van de vorm: y(x)=(sin(2*pi/a)+sin(2*pi/b)+sin(2*pi/c)+sin(2*pi/d))*((amplitude/4)-20)+amplitude
     * @param x de xwaarde
     * @return  de y waarde van de functie voor de opgegeven x waarde
     */
    public double getY(double x){
        double y = (Math.sin((2*Math.PI*x)/a)+Math.sin((2*Math.PI*x)/b)+Math.sin((2*Math.PI*x)/c)+Math.sin((2*Math.PI*x)/d))*((amplitude/4)-20)+2*amplitude;
        return y;
    }

    /**
     * @return the amplitude
     */
    public double getAmplitude() {
        return amplitude;
    }
    
    /**
     * @param maxHoogte de nieuwe maximale hoogte van de functie
     */
    public void setAmplitude(double maxHoogte) {
        amplitude = (maxHoogte/4);
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
    
}
