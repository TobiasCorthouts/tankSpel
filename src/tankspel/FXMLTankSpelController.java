/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class FXMLTankSpelController {

    private Spel model;
    private SpelView view;
    
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane grafischeView;
    
    
    @FXML
    private Slider snelheidSlider;

    @FXML
    private Slider richtingSlider;
    
    @FXML
    private Button schietButton;
    
    @FXML
    private Button next;

    @FXML
    void initialize() {
        grafischeView.setFocusTraversable(true);
        richtingSlider.setFocusTraversable(false);
        snelheidSlider.setFocusTraversable(false);
        schietButton.setFocusTraversable(false);
        next.setFocusTraversable(false);
        
        grafischeView.setOnKeyPressed(this::beweegToets);
        schietButton.setOnAction(e -> schiet());
        next.setOnAction(e -> veranderBeurt());
        
    }

    void setModel(Spel model) {
        this.model = model;
        this.view = new SpelView(model);        
        grafischeView.getChildren().add(view);
        update();
    }

    public void update() {
        view.updateAll();
    }
    
    public void beweegToets(KeyEvent e){
    switch (e.getCode()) {
        case LEFT:
            links();
            break;
        case RIGHT:
             rechts();
             break;
        }
    }
    
    public void rechts(){
        if (model.getTank1().isAanDeBeurd() == true){
            model.rechts(model.getTank1());
        }
        else {
            model.rechts(model.getTank2());
        }
        view.updateTank();
    }
    
    public void links(){
        if (model.getTank1().isAanDeBeurd() == true){
            model.links(model.getTank1());
        }
        else {   
            model.links(model.getTank2());
        }
        view.updateTank();
    }
    
    public void schiet(){
        model.voegKogelToe(15,0.78, model.getTankAanDeBeurt().getX(), model.getTankAanDeBeurt().getY());
                
        SchietKogel verplaatsKogel = new SchietKogel(model.getKogel(), this);
        Thread t = new Thread(verplaatsKogel);
        t.setDaemon(true);
        t.start();       
    }
    
    public void verplaatsKogel(Kogel kogel){
        view.setKogelView(kogel);
        view.updateKogel();
    }

    private void veranderBeurt() {
        model.veranderBeurd();
        view.updateTank();
    }
    
    
    
}
