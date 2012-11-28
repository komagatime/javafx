/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author koma
 */
public class FXMLTableView extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("FXML TableView Example");
        primaryStage.setScene((Scene)FXMLLoader.load(getClass().getResource("fxml_tableview.fxml")));        
        primaryStage.show();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
