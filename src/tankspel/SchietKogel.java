/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.application.Platform;

/**
 *
 * @author Corthouts */
public class SchietKogel implements Runnable {
    //data memebers
    private Kogel kogel;
    private FXMLTankSpelController controller;
    private double tijd;

    public SchietKogel(Kogel model, FXMLTankSpelController controller) {
        this.kogel = model;
        this.controller = controller;
        tijd = 0;
    }
    
        @Override
    public void run() {
        while(true) {
            kogel.xInFunctieVanTijd(tijd);
            kogel.yInFunctieVanTijd(tijd);
            tijd = tijd + 0.1;
            Platform.runLater(() -> controller.verplaatsKogel(kogel) );
            
            try{
                Thread.sleep(10);
                
            }catch ( InterruptedException ex){
                
            }
        }
    }
}
