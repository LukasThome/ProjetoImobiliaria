/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thome
 */
public class FXMLCadPJController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private Pane pnPrincipal;
    @FXML
    private Label lblFecharCadastroPJ;
    @FXML
    private Label lblCadastroPessoaJuridica;
    @FXML
    private AnchorPane tpCadastroPessoaJuridica;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXButton btnSalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fecharCadastro(MouseEvent event) {
        Stage st = (Stage) lblFecharCadastroPJ.getScene().getWindow();//obtem a janela atual
        st.close();//fecha o stage
        
    }
    
}
