/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_planning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Omer Khan
 */
public class HR_Planning extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_HR_Planning.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("EMPLOYEE & ASSIGNMENT/TASK INVENTORY");
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
