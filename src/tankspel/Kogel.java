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
public class Kogel {
    private double snelheid;
    private double richting;
    private double straal;
    private double x, y;
    private double beginX, beginY;

    public Kogel(double snelheid, double richting, double beginX, double beginY) {
        this.snelheid = snelheid;
        this.richting = richting;
        this.beginX = beginX;
        this.beginY = beginY;
        straal = 10;
    }

    /**
     * @return the snelheid
     */
    public double getSnelheid() {
        return snelheid;
    }

    /**
     * @param snelheid the snelheid to set
     */
    public void setSnelheid(double snelheid) {
        this.snelheid = snelheid;
    }

    /**
     * @return the richting
     */
    public double getRichting() {
        return richting;
    }

    /**
     * @param richting the richting to set
     */
    public void setRichting(double richting) {
        this.richting = richting;
    }

    /**
     * @return the straal
     */
    public double getStraal() {
        return straal;
    }

    /**
     * @param straal the straal to set
     */
    public void setStraal(double straal) {
        this.straal = straal;
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
     * @return the beginX
     */
    public double getBeginX() {
        return beginX;
    }

    /**
     * @param beginX the beginX to set
     */
    public void setBeginX(double beginX) {
        this.beginX = beginX;
    }

    /**
     * @return the beginY
     */
    public double getBeginY() {
        return beginY;
    }

    /**
     * @param beginY the beginY to set
     */
    public void setBeginY(double beginY) {
        this.beginY = beginY;
    }
    
    public void yInFunctieVanTijd(double tijd){
        double zwaartekracht = 1.1;
        y = -(-1.5*zwaartekracht*tijd*tijd+snelheid*Math.sin(richting)*tijd-beginY);
    }
    
    public void xInFunctieVanTijd(double tijd){
        x = 10*(snelheid*Math.cos(richting)*tijd)+beginX;
    }
    

    
    
    
}
