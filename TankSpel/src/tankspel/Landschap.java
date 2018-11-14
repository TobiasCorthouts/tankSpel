/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.paint.Color;

/**
 *
 * @author Corthouts
 */
public class Landschap {
    private double maxBreedte;
    private double maxHoogte;
    private ArrayList<Pixel> pixels;
    private ArrayList<Pixel> bovenstePixels;
    private FunctieGenerator functie;

    public Landschap(double maxBreedte, double maxHoogte) {
        this.maxBreedte = maxBreedte;
        this.maxHoogte = maxHoogte;
        functie = new FunctieGenerator(maxHoogte);
        pixels = new ArrayList<Pixel>();
        bovenstePixels = new ArrayList<Pixel>();
        voegPixelsToe();
        setBovenstePixels();
    }

    
    public void voegPixelsToe(){
        for (double x = 0 ; x <= maxBreedte; x = x+5){
            double yx = getFunctie().getY(x);
            for(double y = yx ; y <= maxHoogte; y = y+4){
                Pixel p = new Pixel(x, y);
                pixels.add(p);
            }
        }
    }
    
    
    public void setBovenstePixels(){
        ArrayList<Pixel> controlePixels = new ArrayList<Pixel>();
        controlePixels.addAll(pixels);        
        for (double x = 0 ; x <= getMaxBreedte(); x = x+5){
            ArrayList<Pixel> kolom = new ArrayList<Pixel>();
            Pixel bovenstePixel = null;
            double yBovenstePixel = getMaxHoogte();
            for(Pixel p : controlePixels){
                if (p.getX() == x && p.getY() < yBovenstePixel){
                    yBovenstePixel = p.getY();
                    bovenstePixel = p;                  
                }
                kolom.add(p);
            }
            bovenstePixel.setKleur(Color.BROWN);
            controlePixels.remove(kolom);
            bovenstePixels.add(bovenstePixel);
        }
    
    }

        public void gat(double x){
        double straal = 30;
        double y = getFunctie().getY(x);
        ArrayList<Pixel> teVerweiderenPixels = new ArrayList<Pixel>();
        
        for(Pixel p : pixels){
            double afstand = Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY()- y, 2));
            if (afstand <= straal){
                teVerweiderenPixels.add(p);
            }
        }  
        pixels.removeAll(teVerweiderenPixels);
        bovenstePixels.clear();
        setBovenstePixels();      
        
    }
        
    /**
     * geef de y waarde voor de bijhoorende x waarde
     * @param x
     * @return 
     */
    public double gety(double x){
        for(Pixel p : bovenstePixels){
            if (p.getX()<=x+5 && p.getX()> x){
                return p.getY(); 
            }
            
        }
        return 0;
    }

    /**
     * @return the functie
     */
    public FunctieGenerator getFunctie() {
        return functie;
    }

    /**
     * @param functie the functie to set
     */
    public void setFunctie(FunctieGenerator functie) {
        this.functie = functie;
    }

    Iterator<Pixel> getBovenstePixels() {
        return bovenstePixels.iterator();
    }
    
    Iterator<Pixel> getPixels() {
        return pixels.iterator();
    }
    
        public ArrayList<Pixel> getPixels2() {
        return pixels;
    }

    /**
     * @return the maxBreedte
     */
    public double getMaxBreedte() {
        return maxBreedte;
    }

    /**
     * @param maxBreedte the maxBreedte to set
     */
    public void setMaxBreedte(double maxBreedte) {
        this.maxBreedte = maxBreedte;
    }

    /**
     * @return the maxHoogte
     */
    public double getMaxHoogte() {
        return maxHoogte;
    }

    /**
     * @param maxHoogte the maxHoogte to set
     */
    public void setMaxHoogte(double maxHoogte) {
        this.maxHoogte = maxHoogte;
    }
    
    
        
        
    
}
