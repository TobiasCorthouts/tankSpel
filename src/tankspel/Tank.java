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
public class Tank {
    // data members
    private double x ,y;
    private boolean aanDeBeurd;
    private double brandstof;
    private double health;
    

    /**
     * maak een nieuwe tank aan
     * de tank is aan de beurd
     * de maximum breedte = 1000
     * de tank heeft 50 brandstof
     * @param x 
     */
    public Tank(double x){
        this.x = x;
        y = 0;
        aanDeBeurd = true;
        brandstof = 75;
        health = 100;
    }
    
    public void rechts(double y){
        if (getBrandstof() > 0){
            x++;
        verminderBrandstof();
        this.y = y;
        }
    }
    
    
    public void links(double y){
        if (getBrandstof() > 0){
            x--;
        verminderBrandstof();
        this.y = y;
        }
    }
    
    
    public void verminderBrandstof(){
        brandstof--;     //brandstof moet verminder worden met totale afstand (dus agelegde weg)(sqrt(dx^2+dy^2))    
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
     * @return the aanDeBeurd
     */
    public boolean isAanDeBeurd() {
        return aanDeBeurd;
    }

    /**
     * @param aanDeBeurd the aanDeBeurd to set
     */
    public void setAanDeBeurd(boolean aanDeBeurd) {
        this.aanDeBeurd = aanDeBeurd;
    }

    /**
     * @return the brandstof
     */
    public double getBrandstof() {
        return brandstof;
    }

    /**
     * @param brandstof the brandstof to set
     */
    public void setBrandstof(double brandstof) {
        this.brandstof = brandstof;
    }

    /**
     * @return the health
     */
    public double getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(double health) {
        this.health = health;
    }
    
    
        
    }
