/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    @FXML
    private void AbrirCadastroAluno(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/aluno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900,682);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Aluno");
        stage.setScene(scene);
        stage.show();
    }

     @FXML
    private void AbrirListagem(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/ListagemAluno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900,682);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Aluno");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void FecharProjeto(ActionEvent event) {
    }
    
}
