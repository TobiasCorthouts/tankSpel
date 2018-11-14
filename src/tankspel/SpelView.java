/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Corthouts
 */
public class SpelView extends Region{
    private Tank tank1;
    private Tank tank2;
    private TankView tankView1;
    private TankView tankView2;
    private Landschap landschap;
    private LandschapView landschapView;
    private KogelView kogelView;
    private Spel model;
    
    
    public SpelView(Spel model) {
        this.model = model;
        this.tank1 = model.getTank1();
        this.tank2 = model.getTank2();
        this.landschap = model.getLandschap();
        this.landschapView = new LandschapView(model.getLandschap());
        tank1.setY(landschap.gety(tank1.getX()));
        tank2.setY(landschap.gety(tank2.getX()));
        this.tankView1 = new TankView(tank1); 
        this.tankView2 = new TankView(tank2); 
        getChildren().addAll(landschapView, tankView1, tankView2);
    }
    
    public void updateAll(){
        tankView1.update(1);
        tankView2.update(2);
        landschapView.update();
        
    }
    
    public void updateTank(){
        tankView1.update(1);
        tankView2.update(2);
    }

    /**
     * @param kogelView the kogelView to set
     */
    public void setKogelView(Kogel kogel) {
        kogelView = new KogelView(kogel);
    }
    
    public void updateKogel(){
        kogelView.update();
        getChildren().addAll(kogelView);
    }
    
}
    

