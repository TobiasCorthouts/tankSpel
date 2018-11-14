/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.scene.paint.Color;

/**
 *
 * @author Corthouts
 */
public class Pixel {
     private double x,y;
    private boolean bovenstePixel;
    private Color kleur;

    /**
     * maak een nieuwe pixel aan
     * @param x
     * @param y 
     */    
    public Pixel(double x,double y){
        this.x = x;
        this.y = y;
        bovenstePixel = false;
        randomKleur();
    }

    /**
     * geeft één van de twee kleuren van het landschap aan de pixel
     */
    public void randomKleur(){
        int i = (int)(Math.random()*1);
        if (bovenstePixel == true){
            kleur = Color.BROWN;
        }
        if (i == 0){
            kleur = Color.OLIVE;
        }
        else{
            kleur = Color.DARKOLIVEGREEN;
        }
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return of een pixel een bovenste pixel is
     */
    public boolean isBovenstePixel() {
        return bovenstePixel;
    }

    /**
     * @param bovenstePixel true als de pixel een bovenste pixel is
     * false als dit niet het geval is
     */
    public void setBovenstePixel(boolean bovenstePixel) {
        this.bovenstePixel = bovenstePixel;
    }

    /**
     * @return the kleur
     */
    public Color getKleur() {
        return kleur;
    }

    /**
     * @param kleur the kleur to set
     */
    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }
}
