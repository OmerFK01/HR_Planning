/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_planning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Omer Khan
 */
public class FXML_HR_PlanningController implements Initializable {
    
    @FXML TextField txtVal1, txtVal2;
    @FXML Label lblResult;
    @FXML Button btnMultiply, btnDivide, btnAdd, btnSubtract;
    @FXML ComboBox dropDown;
    
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @FXML 
    private void calculate (ActionEvent event){
        /*double n1 = Double.parseDouble(txtVal1.getText());
        double n2 = Double.parseDouble(txtVal2.getText());
        if(event.getSource()== btnMultiply){
            lblResult.setText("" + (n1*n2));
        }else if(event.getSource() == btnDivide){
            lblResult.setText("" + (n1/n2));
        }*/
    }
    
    @FXML 
    private void record(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException{
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("assignments.ser"))) 
     {
         AssgnRecordSerializable record;
         
         record = new AssgnRecordSerializable(1, "Name", "Group Lead", 0.1);
         output.writeObject(record);
         
         ObjectInputStream input = new ObjectInputStream(new FileInputStream("assignments.ser"));
         record = (AssgnRecordSerializable) input.readObject();
         
         System.out.printf("%-10d%-12s%-12s%10.2f\n", record.getAssgn_id(), record.getName(), record
                 .getGroupLead(), record.getCost());
     }
  }
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          dropDown.getItems().setAll(EmployeeEnum.values());
    }    
    
}
