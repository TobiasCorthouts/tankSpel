/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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
    void initialize() {
        assert grafischeView != null : "fx:id=\"grafischeView\" was not injected: check your FXML file 'FXMLTankSpel.fxml'.";

    }


    void setModel(Spel model) {
        this.model = model;
        this.view = new SpelView(model);        
        grafischeView.getChildren().add(view);
        update();
    }

    private void update() {
        view.update();
    }
    
}
