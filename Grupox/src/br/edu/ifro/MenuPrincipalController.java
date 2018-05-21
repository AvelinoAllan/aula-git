/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 01312440279
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField textnumero1;
    @FXML
    private TextField textnumero2;
    @FXML
    private TextField resulttext;
    @FXML
    private Button btnSoma;
 
    @FXML
    private void soma(ActionEvent event) {
       Double num1 = Double.parseDouble(textnumero1.getText());
       Double num2 = Double.parseDouble(textnumero2.getText());
       Double resultado = num1+num2 ;
       resulttext.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
