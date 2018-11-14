/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import java.util.Iterator;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Corthouts
 */
public class LandschapView extends Region{
  private Landschap landschap;
  
  public LandschapView(Landschap landschap){
      this.landschap = landschap;
  }
    
    public void update(){
            
        Iterator <Pixel> pixels = landschap.getPixels();
        while(pixels.hasNext()){
            Pixel p = pixels.next();
            Rectangle rechthoek = new Rectangle(p.getX(), p.getY(), 5, 5);
            rechthoek.setFill(p.getKleur());
            getChildren().addAll(rechthoek);
        }
        
        Iterator <Pixel> bovenstePixels = landschap.getBovenstePixels();
        while(bovenstePixels.hasNext()){
            Pixel p = bovenstePixels.next();
            Rectangle rechthoek = new Rectangle(p.getX(), p.getY(), 5, 5);
            rechthoek.setFill(p.getKleur());
            getChildren().addAll(rechthoek);
        }
    }
}




