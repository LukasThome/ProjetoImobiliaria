package projetoimob.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author fschi
 */
public class FXMLTelaPrincipalController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private AnchorPane apMenuEsquerdo;
    @FXML
    private Button btnHome;
    @FXML
    private AnchorPane apMenuDireito;
    @FXML
    private Button btnAtendimentos;
    @FXML
    private Button btnAgendamentos;
    @FXML
    private Button btnCadastros;
    @FXML
    private Button btnPesquisas;
    @FXML
    private Button btnRelatorios;
    @FXML
    private Button btnPagamentos;
    @FXML
    private Button btnSair;
    @FXML
    private VBox vbMenuEsquerdo;
    
    

    /**
     * Initializes the controller class.Método de inicialização do FXMLTelaPrincipal
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        abrirComHome();
    }    

        private void btnHome(ActionEvent event) 
    {   
        abrirComHome();
        
    }
    private void btnAtendimentos (ActionEvent event) 
    {   
        abrirAtendimentos();
        
    }
    private void btnAgendamentos (ActionEvent event) 
    {   
        abrirAgendamentos();
        
    }
    private void btnCadastros(ActionEvent event) 
    {   
        abrirCadastros();
        
    }
    private void btnPesquisas (ActionEvent event) 
    {   
        abrirPesquisas();
        
    }
    private void btnRelatorios (ActionEvent event) 
    {   
        abrirRelatorios();
        
    }
    private void btnPagamentos (ActionEvent event) 
    {   
        abrirPagamentos();
        
    }
    private void btnSair (ActionEvent event) 
    {   
        fecharAplicacao();
        
    }
    
    //método para inicializar o FXMLTelaPrincipal com o FXMLHome ativo
    //ou seja, para abrir o programa na tela home
    public void corBotaoSelecionado(String btnH, String btnAt, String btnAg, String btnCa, String btnPe, 
            String btnRe, String btnPa)
    {
        btnHome.setStyle("-fx-background-color:" + btnH + ";"); 
        btnAtendimentos.setStyle("-fx-background-color:" + btnAt + ";");
        btnAgendamentos.setStyle("-fx-background-color:" + btnAg + ";");        
        btnCadastros.setStyle("-fx-background-color:" + btnCa + ";");
        btnPesquisas.setStyle("-fx-background-color:" + btnPe + ";");         
        btnRelatorios.setStyle("-fx-background-color:" + btnRe + ";");
        btnPagamentos.setStyle("-fx-background-color:" + btnPa + ";");
    } 
    @FXML
    public void abrirComHome()
    {
        try
        {
            //colocando no objeto 'a' o FXMLHome
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
            //deixar o AnchorPane FXMLHome  fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLMDI01
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #9a0000", " #808080", " #808080", " #808080", " #808080", " #808080", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
     public void abrirAtendimentos()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLAtendimentos.fxml"));
            //deixar o AnchorPane do FXMLAtendimentos fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLAtendimentos
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #9a0000", " #808080", " #808080", " #808080", " #808080", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
     public void abrirAgendamentos()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLAgendamentos.fxml"));
            //deixar o AnchorPane do FXMLAgendamentos fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLAgendamentos
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #808080", " #9a0000", " #808080", " #808080", " #808080", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
      public void abrirCadastros()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLCadastros.fxml"));
            //deixar o AnchorPane do FXMLAgendamentos fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLCadastros
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #808080", " #808080", " #9a0000", " #808080", " #808080", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
       public void abrirPesquisas()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLPesquisas.fxml"));
            //deixar o AnchorPane do FXMLPesquisas fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLPesquisas
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #808080", " #808080", " #808080", " #9a0000", " #808080", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
        public void abrirRelatorios()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLRelatorios.fxml"));
            //deixar o AnchorPane do FXMLRelatorios fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLRelatorios
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #808080", " #808080", " #808080", " #808080", " #9a0000", " #808080");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
        public void abrirPagamentos()
    {
        try
        {
            //colocando no objeto 'a' ao apMenuDireito
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLPagamentos.fxml"));
            //deixar o AnchorPane do FXMLPagamentos fluido ou ancorado em todos os lados
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);
            //chamar dentro do apMenuEsquerdo o FXMLPagamentos
            apMenuDireito.getChildren().setAll(a);
            corBotaoSelecionado(" #808080", " #808080", " #808080", " #808080", " #808080", " #808080", " #9a0000");
           
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
        public void fecharAplicacao()
    {       System.exit(0);
        
    }
         
         
}
