/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankspel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Corthouts
 */
public class TankSpelMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setMaximized(true);                                                   //http://www.java2s.com/Code/Java/JavaFX/GetScreensize.htm
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();    //
        stage.setWidth(primaryScreenBounds.getWidth());                             //
        stage.setHeight(primaryScreenBounds.getHeight());                           //
        
        //Controller
        FXMLLoader loader = new FXMLLoader(); 
        loader.setLocation(getClass().getResource("FXMLTankSpel.fxml"));
        Parent root = (Parent) loader.load();
        FXMLTankSpelController controller = loader.getController();
        
        //Model
        Tank tank1 = new Tank(50);
        Tank tank2 = new Tank(1800);
        Landschap landschap = new Landschap(primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
        Spel model = new Spel(tank1, tank2, landschap);
        controller.setModel(model);
        
        //View
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
