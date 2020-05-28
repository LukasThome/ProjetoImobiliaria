/*

 */
package projetoimob.view;

import com.jfoenix.controls.JFXTabPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * FXML Controller class
 *
 * @author thome
 */
public class FXMLCadastrosController implements Initializable {

    @FXML
    private Button btnCadPF;
    @FXML
    private Button btnCadIU;
    @FXML
    private Button btnCadCorretores;
    @FXML
    private Button btnCadFuncionarios;
    @FXML
    private Button btnCadLogin;
    @FXML
    private Button btnCadBairros;
    @FXML
    private Button btnCadEstados;
    @FXML
    private Button btnCadPJ;
    @FXML
    private Button btnCadIR;
    @FXML
    private Button btnCadImobiliarias;
    @FXML
    private Button btnCadPS;
    @FXML
    private Button btnCadLogradouros;
    @FXML
    private Button btnCadCidades;
    @FXML
    private AnchorPane apPrincipal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void abrirFXMLCadPF(ActionEvent event) {
        try
        {
            Stage stage = new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("FXMLCadPF.fxml"));
            
            Scene scene = new Scene(root);
            
            stage.initStyle(StageStyle.UNDECORATED);
            
            stage.setScene(scene);
            
            stage.show();
            
            
        }
        catch (IOException ex)
        {    
            Logger.getLogger(FXMLCadPFController.class.getName()).log(Level.SEVERE, null, ex);
             
        }
    }

    @FXML
    private void abrirFXMLCadPJ(ActionEvent event) {
        try
        {
            Stage stage = new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("FXMLCadPJ.fxml"));
            
            Scene scene = new Scene(root);
            
            stage.initStyle(StageStyle.UNDECORATED);
            
            stage.setScene(scene);
            
            stage.show();
            
            
        }
        catch (IOException ex)
        {    
            Logger.getLogger(FXMLCadPFController.class.getName()).log(Level.SEVERE, null, ex);
             
        }
    }

    @FXML
    private void abrirFXMLCadIU(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadCO(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadPFFC(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadLogin(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadBairros(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadEstados(ActionEvent event) {
        try
        {
            Stage stage = new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("FXMLCadEstados.fxml"));
            
            Scene scene = new Scene(root);
            
            stage.initStyle(StageStyle.UNDECORATED);
            
            stage.setScene(scene);
            
            stage.show();
            
            
        }
        catch (IOException ex)
        {    
            Logger.getLogger(FXMLCadPFController.class.getName()).log(Level.SEVERE, null, ex);
             
        }
    }

    @FXML
    private void abrirFXMLCadIR(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadIM(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadPS(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadLO(ActionEvent event) {
    }

    @FXML
    private void abrirFXMLCadCidades(ActionEvent event) {
         try
        {
            Stage stage = new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("FXMLCadCidades.fxml"));
            
            Scene scene = new Scene(root);
            
            stage.initStyle(StageStyle.UNDECORATED);
            
            stage.setScene(scene);
            
            stage.show();
            
            
        }
        catch (IOException ex)
        {    
            Logger.getLogger(FXMLCadPFController.class.getName()).log(Level.SEVERE, null, ex);
             
        }
    
    }
    
        
          
}
