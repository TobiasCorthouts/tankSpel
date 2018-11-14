/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import java.util.Iterator;

/**
 *
 * @author Corthouts
 */
public class Spel {
    // data members
    private Tank tank1;
    private Tank tank2;
    private Landschap landschap;
    private Kogel kogel;

    public Spel(Tank tank1, Tank tank2, Landschap landschap) {
        this.tank1 = tank1;
        this.tank2 = tank2;
        this.landschap = landschap;
    }
        
    public void rechts(Tank tank){
        if (landschap.getMaxBreedte() > tank.getX()){
            double x = tank.getX()+1;
            double y = landschap.gety(x);
            tank.rechts(y);
        }
    }
    
    public void links(Tank tank){
        if (0 < tank.getX()){
            double x = tank.getX()-1;
            double y = landschap.gety(x);
            tank.links(y);
        }
    }
    
    public void veranderBeurd(){
        if (tank1.isAanDeBeurd() == true){
            tank1.setAanDeBeurd(false);
            tank2.setAanDeBeurd(true);
            tank1.setBrandstof(75);
        }
        else if (tank2.isAanDeBeurd() == true){
            tank2.setAanDeBeurd(false);
            tank1.setAanDeBeurd(true);
            tank2.setBrandstof(75);
        }
    }

    public Tank getTankAanDeBeurt(){
        if (tank1.isAanDeBeurd() == true){
            return tank1;
        }
        else {
            return tank2;
        }
    }
    
    public void voegKogelToe(double snelheid, double richting, double beginX, double beginY){
        kogel = new Kogel(snelheid, richting, beginX, beginY);
    }
    
    /**
     * @return the tank1
     */
    public Tank getTank1() {
        return tank1;
    }

    /**
     * @return the tank2
     */
    public Tank getTank2() {
        return tank2;
    }

    /**
     * @return the landschap
     */
    public Landschap getLandschap() {
        return landschap;
    }

    /**
     * @return the kogel
     */
    public Kogel getKogel() {
        return kogel;
    }

    /**
     * @param kogel the kogel to set
     */
    public void setKogel(Kogel kogel) {
        this.kogel = kogel;
    }
    
    
      
}
