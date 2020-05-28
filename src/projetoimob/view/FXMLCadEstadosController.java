/*
 
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import projetoimob.model.dao.EstadosDAO;
import projetoimob.model.database.Database;
import projetoimob.model.database.DatabaseFactory;
import projetoimob.model.domain.Estados;

/**
 * FXML Controller class
 *
 * @author thome
 */
public class FXMLCadEstadosController implements Initializable {

    @FXML
    private Label lblCadastrodeEstados;
    @FXML
    private Label lblFecharCadEstados;
    @FXML
    private TableView<Estados> tbEstados;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnDeletar;
    @FXML
    private JFXButton btnAtualizar;
    @FXML
    private AnchorPane apTableView;
    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private JFXTextField txtCodigoEstado;
    @FXML
    private JFXTextField txtNomeEstado;
    @FXML
    private JFXTextField txtSiglaEstado;
    @FXML
    private TableColumn<Estados, Integer> colunaCodigoEstado;
    @FXML
    private TableColumn<Estados, String> colunaNomeEstado;
    @FXML
    private TableColumn<Estados, String> colunaSiglaEstado;
    @FXML
    private Pane pnCadastroEstados;
    
    
    /*
     * Initializes the controller class.
     */
    
    
    //buscar os dados do banco de dados com um List
    private List<Estados> listEstados;
    //jogar  na ViemTable com o ObservableList, é necessário usar
    private ObservableList<Estados> observableEstados;
    
    //Atributos para manipulação de Banco de Dados
    private final Database database = DatabaseFactory.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final EstadosDAO estadosDAO = new EstadosDAO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //conexão com o banco de dados
        estadosDAO.setConnection(connection);
        
        carregaEstadosNaTableView();
        
    }   
    
    //método para poder trabalhar com os Estados no banco
    public void carregaEstadosNaTableView()
    {
        colunaCodigoEstado.setCellValueFactory(new PropertyValueFactory<>("id_Estado"));
        colunaNomeEstado.setCellValueFactory(new PropertyValueFactory<>("nome_Estado"));
        colunaSiglaEstado.setCellValueFactory(new PropertyValueFactory<>("sigla_Estado"));
        
        listEstados = estadosDAO.lista();
        observableEstados = FXCollections.observableArrayList(listEstados);
        tbEstados.setItems(observableEstados);
        
    }    
    public void limparCampos()
        {
            txtCodigoEstado.setText("");
            txtNomeEstado.setText("");
            txtSiglaEstado.setText("");
        }
    @FXML
    private void inserirDadosNoBancoDados(ActionEvent event) 
    {
        Estados estados = new Estados();

        estados.setNome_Estado(txtNomeEstado.getText());
        estados.setSigla_Estado(txtSiglaEstado.getText());

        estadosDAO.inserir(estados);

        limparCampos();

        carregaEstadosNaTableView();
    }

    //método para  fechar o cadastro de Estados
    @FXML
    private void fecharCadastro(MouseEvent event) {
        Stage st = (Stage) lblFecharCadEstados.getScene().getWindow();//obtem a janela atual
        st.close();//fecha o stage

    }

    @FXML
    private void atualizarDados(ActionEvent event) {
        Estados estados = new Estados();

        estados.setNome_Estado(txtNomeEstado.getText());
        estados.setSigla_Estado(txtSiglaEstado.getText());
        estados.setId_Estado(Integer.parseInt(txtCodigoEstado.getText()));

        estadosDAO.alterar(estados);

        limparCampos();
        
        carregaEstadosNaTableView();
    }
    
    @FXML
    private void limparDados(ActionEvent event) {
        limparCampos();
    }
    
    @FXML
    private void selecionarLinhaViewTable(MouseEvent event) {
        
        txtCodigoEstado.setText(String.valueOf(tbEstados.getSelectionModel().getSelectedItem().getId_Estado()));
        txtNomeEstado.setText(tbEstados.getSelectionModel().getSelectedItem().getNome_Estado());
        txtSiglaEstado.setText(tbEstados.getSelectionModel().getSelectedItem().getSigla_Estado());
        
    }

    @FXML
    private void deletarDadosSelecionados(ActionEvent event) {
        Estados estados = new Estados();
        
        estados.setId_Estado(Integer.parseInt(txtCodigoEstado.getText()));
             
        estadosDAO.remover(estados);
            
        limparCampos();
        
        carregaEstadosNaTableView();
 
    }
    
}
