/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;

/**
 *
 * @author Corthouts
 */
public class KogelView extends Region {
    //data memebers
    private Kogel kogel;

    public KogelView(Kogel kogel) {
        this.kogel = kogel;
    }
    
    public void update(){
        getChildren().clear();
        
        Circle k = new Circle(kogel.getX(), kogel.getY(), kogel.getStraal());
        getChildren().addAll(k);
    }
    
}
