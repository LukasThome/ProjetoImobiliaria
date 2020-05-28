/*
    Controlador da FXMLCadCidades.fxml
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
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
import javafx.stage.Stage;
import projetoimob.model.dao.CidadesDAO;
import projetoimob.model.dao.EstadosDAO;
import projetoimob.model.database.Database;
import projetoimob.model.database.DatabaseFactory;
import projetoimob.model.domain.Cidades;
import projetoimob.model.domain.Estados;

/**
 * FXML Controller class
 *
 * @author thome
 */
public class FXMLCadCidadesController implements Initializable {
    /*
      
      ////////////////////////////////  
     *  *  *  Componentes   *   *   *
    ///////////////////////////////                        
    
    */
    
    @FXML
    private Label lblCadastrodeCidades;
    @FXML
    private Label lblFecharCadCidades;
    @FXML
    private TableView<Cidades> tbCidades;
    @FXML
    private TableColumn<Cidades, Integer> colunaCodigoCidade;
    @FXML
    private TableColumn<Cidades, String> colunaNomeCidade;
    @FXML
    private TableColumn<Cidades, String> colunaEstadoCidade;
    @FXML
    private JFXTextField txtCodigoCidade;
    @FXML
    private JFXTextField txtNomeCidade;
    @FXML
    private JFXComboBox<Estados> cmbEstadoCidade;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXButton btnDeletarDados;
    @FXML
    private JFXButton btnAtualizarDados;
    @FXML
    private JFXButton btnInserir;

    private Label lblCodigoEstado;
    
    /*
      
      ////////////////////////////////  
     *  *  *  BANCO DE DADOS  *  *  *
    ///////////////////////////////                        
    
    */

    //buscar os dados do banco de dados com um List
    private List<Cidades> listCidades;
    //jogar  na ViemTable com o ObservableList, é necessário usar
    private ObservableList<Cidades> observableCidades;
    //buscar os dados do banco de dados com um List
    private List<Estados> listEstados;
    //jogar  na ViemTable com o ObservableList, é necessário usar
    private ObservableList<Estados> observableEstados;
    
    //Atributos para manipulação de Banco de Dados e variaveis globais
    private final Database database = DatabaseFactory.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final CidadesDAO cidadesDAO = new CidadesDAO();
    
    EstadosDAO estadosDAO = new EstadosDAO();
    
    private List<String> listCidade = new ArrayList<>();
    private ObservableList<String> obsCidades;
    

      /*
      
      ////////////////////////////////  
     *  *  *  INITIALIZE   *   *   *
    ///////////////////////////////                        
    
    */
    //Ações ao iniciar o FXMLCadCidades
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //conexão com o banco de dados
        estadosDAO.setConnection(connection); 
        cidadesDAO.setConnection(connection);
        //método para povoar o cmbEstado
        carregarEstadosNoCmbEstadoCidade();
        //método para povoar a ViewTable
        carregaCidadesNaTableView();
    }    

    /*
      
      ////////////////////////////////  
     *  *  *  * Métodos    *   *   *
    ///////////////////////////////                        
    
    */

    //método para poder trabalhar com as Cidades no banco
    public void carregaCidadesNaTableView()
    {
        colunaCodigoCidade.setCellValueFactory(new PropertyValueFactory<>("id_Cidade"));
        colunaNomeCidade.setCellValueFactory(new PropertyValueFactory<>("nome_Cidade"));
        colunaEstadoCidade.setCellValueFactory(new PropertyValueFactory<>("sigla_Estado"));
  
        //executa o metodo listaCidadesEstados que está declarado no CidadesDAO.java que contém o inner join
        listCidades = cidadesDAO.listaCidadesEsatdos();
        observableCidades = FXCollections.observableArrayList(listCidades);
        tbCidades.setItems(observableCidades);
        
    } //limpa os campos de codigo, nome e combo box   
    public void limparCampos()
    {
        Estados est = new Estados();
        
        txtCodigoCidade.setText("");
        txtNomeCidade.setText("");  
        cmbEstadoCidade.setValue(null);
        cmbEstadoCidade.setPromptText("Estados");

    }//faz com que o combo box EstadoCidades busque os estados cadastrados direto do banco de dados da tb_estados
    public void carregarEstadosNoCmbEstadoCidade()
    {      
       
       listEstados = estadosDAO.lista();
       
       observableEstados = FXCollections.observableArrayList(listEstados);
       
       cmbEstadoCidade.setItems(observableEstados);
    }
    /*
      
      ////////////////////////////////  
     *  *  ACTION EVENTS   *   *   *
    ///////////////////////////////                        
    
    */
    //fecha o stage
    @FXML
    private void fecharCadastro(MouseEvent event) {
        Stage st = (Stage) lblFecharCadCidades.getScene().getWindow();//obtem a janela atual
        st.close();
    }

    
    @FXML
    private void limparDados(ActionEvent event) {
        limparCampos();
        carregaCidadesNaTableView();
        
    }

    //deleta a linha selecionada
    @FXML
    private void deletarDados(ActionEvent event) {
        Cidades cidades = new Cidades();
        
        cidades.setId_Cidade(Integer.parseInt(txtCodigoCidade.getText()));
        
        
        cidadesDAO.remover(cidades);
        
        carregaCidadesNaTableView();
        
        limparCampos();
        
    }

    //método para alterar os dados da linha selecionada, ativada pelo botao atualiar
    @FXML//método para alterar os dados da linha selecionada, ativada pelo botao atualiar
    private void atualizarDados(ActionEvent event) {
        Cidades cidades = new Cidades();

        cidades.setNome_Cidade(txtNomeCidade.getText());       
        cidades.setId_Estado(cmbEstadoCidade.getValue().getId_Estado());
        cidades.setId_Cidade(Integer.parseInt(txtCodigoCidade.getText()));
        
        cidadesDAO.alterar(cidades);
        
        carregaCidadesNaTableView();
        limparCampos();
        
    }

    //metodo para inserir os dados ao clicar o botao "inserir"
    @FXML
    private void inserirDados(ActionEvent event) {
        Cidades cidades = new Cidades();

        cidades.setNome_Cidade(txtNomeCidade.getText());
        cidades.setId_Estado(cmbEstadoCidade.getValue().getId_Estado());
        cidadesDAO.inserir(cidades);

        limparCampos();

        carregaCidadesNaTableView();
    }
   
    //metodo que ao selecionar a linha, preenche automaticamente os campos
    @FXML
    private void selecionarLinhaViewTable(MouseEvent event) {
        
        txtCodigoCidade.setText(String.valueOf(tbCidades.getSelectionModel().getSelectedItem().getId_Cidade()));
        txtNomeCidade.setText(tbCidades.getSelectionModel().getSelectedItem().getNome_Cidade()); 
        cmbEstadoCidade.setPromptText(tbCidades.getSelectionModel().getSelectedItem().getSigla_Estado());
        lblCodigoEstado.setText(String.valueOf(tbCidades.getSelectionModel().getSelectedItem().getId_Estado()));
        
    }
}
