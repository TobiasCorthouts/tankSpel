/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Corthouts
 */
public class TankView extends Region{
    private Tank tank;

    public TankView(Tank tank) {
        this.tank = tank;
       
    }

    void update(int x) {
        getChildren().clear();
        
        if (x==1){
            ImageView tank1Figuur = new ImageView("tank1.png");
            tank1Figuur.setX(tank.getX()-50);
            tank1Figuur.setY(tank.getY()-40);
            getChildren().addAll(tank1Figuur);
        }
        else{
            ImageView tank2Figuur = new ImageView("tank2.png");
            tank2Figuur.setX(tank.getX()-50);
            tank2Figuur.setY(tank.getY()-40);
            getChildren().addAll(tank2Figuur);
        }        
        
        if (tank.isAanDeBeurd() == true){
            int brandstofWaarde = (int)(tank.getBrandstof());
            Text brandstof = new Text(200, 90, "Het brandstof niveau is: " + brandstofWaarde );
            Rectangle brandstofIndicator = new Rectangle(200, 100,brandstofWaarde*2, 20);
            brandstofIndicator.setFill(Color.RED);

            getChildren().addAll(brandstof, brandstofIndicator);
        }        
    }
    
    
}
