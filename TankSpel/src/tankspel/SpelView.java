/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.scene.layout.Region;

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
    private Spel model;
    
    
    public SpelView(Spel model) {
        this.model = model;
        this.tank1 = model.getTank1();
        this.tank2 = model.getTank2();
        this.tankView1 = new TankView(model.getTank1()); 
        this.tankView2 = new TankView(model.getTank2()); 
        this.landschap = model.getLandschap();
        this.landschapView = new LandschapView(model.getLandschap());
        getChildren().addAll(tankView1, tankView2, landschapView);
    }
    
    public void update(){
        tankView1.update();
        tankView2.update();
        landschapView.update();
    }
}
