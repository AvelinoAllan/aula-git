/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.modelo.aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 01312440279
 */
public class AlunoController implements Initializable {

    @FXML
    private AnchorPane txtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Salvar(ActionEvent event) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = enf.createEntityManager();
        aluno aluno1 = new aluno();
        aluno1.setNome(txtNome.getAccessibleText());
        
        em.getTransaction().begin();
        em.persist(aluno1);
        em.getTransaction().commit();
    }

    @FXML
    private void Fechar(ActionEvent event) {
   Stage stage = (Stage)  txtNome.getScene().getWindow();
    stage.close();
}
    }
    

