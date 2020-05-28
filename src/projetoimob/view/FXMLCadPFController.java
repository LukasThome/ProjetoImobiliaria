/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thome
 */
public class FXMLCadPFController implements Initializable {

    @FXML
    private Pane pnSuperior;
    @FXML
    private Button btnSalvar;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXTextField txtCodigoCliente;
    @FXML
    private JFXComboBox<String> cmbSexo;
    @FXML
    private JFXTextField txtNomeCliente;
    @FXML
    private JFXTextField txtSobrenomeCliente;
    @FXML
    private Tab tbDadosPessoais;
    @FXML
    private JFXTextField txtCpfCliente;
    @FXML
    private JFXTextField txtRgCliente;
    @FXML
    private JFXComboBox<String> cmbEstadoCivil;
    @FXML
    private JFXComboBox<String> cmbRegimeBens;
    @FXML
    private JFXTextField txtNaturalidade;
    @FXML
    private JFXComboBox<String> cmbEstado;
    @FXML
    private JFXComboBox<String> cmbEscolaridade;
    @FXML
    private JFXTextField txtProfissao;
    @FXML
    private JFXTextField txtNomePai;
    @FXML
    private JFXTextField txtNomeMae;
    @FXML
    private Label lblFecharCadastroPF;
    @FXML
    private Tab tbEnderecoReseidencial;
    @FXML
    private JFXTextField txtLatitude;
    @FXML
    private JFXTextField txtLogradouro;
    @FXML
    private JFXTextField txtNumeroAp;
    @FXML
    private JFXTextField txtCep;
    @FXML
    private JFXTextField txtComplemento;
    @FXML
    private JFXTextField txtNumero;
    @FXML
    private JFXTextField txtAndarAp;
    @FXML
    private JFXTextField txtBlocoAp;
    @FXML
    private JFXTextField txtLongitude;
    @FXML
    private JFXTextArea txtReferencias;
    @FXML
    private JFXComboBox<String> cmbLogradouro;
    @FXML
    private JFXTextField txtCidade;
    @FXML
    private JFXComboBox<String> cmbEstadoLogradouro;
    @FXML
    private JFXTextField txtTelefoneResidencial;
    @FXML
    private JFXTextField txtTelefoneComercial;
    @FXML
    private JFXTextField txtCelularPessoal01;
    @FXML
    private JFXTextField txtCelularPessoal02;
    @FXML
    private JFXTextField txtEmailPessoal01;
    @FXML
    private JFXTextField txtEmailPessoal02;
    @FXML
    private JFXTextField txtSite;
    @FXML
    private Label lblPreferencias;
    @FXML
    private Label lblApartamento;
    @FXML
    private Label lblCasaTerrea;
    @FXML
    private JFXComboBox<String> cmbApartamento;
    @FXML
    private JFXComboBox<String> cmbCasaTerrea;
    @FXML
    private Label lblSobrado;
    @FXML
    private JFXComboBox<String> cmbSobrado;
    @FXML
    private Label lblCondominio;
    @FXML
    private JFXComboBox<String> cmbCondominio;
    @FXML
    private AnchorPane apPrincipal;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // prencher o combo box Sexo
        cmbSexo.getItems().add("MASCULINO");
        cmbSexo.getItems().add("FEMININO");
        
        // prencher o combo box Estado Civil
        cmbEstadoCivil.getItems().add("SOLTEIRO");
        cmbEstadoCivil.getItems().add("CASADO");
        cmbEstadoCivil.getItems().add("DIVORCIADO");
        cmbEstadoCivil.getItems().add("SEPPARADO");
        cmbEstadoCivil.getItems().add("VIÚVO");
        
        // prencher o combo box Comunhão de Bens
        cmbRegimeBens.getItems().add("COMUNHÃO PARCIAL DE BENS");
        cmbRegimeBens.getItems().add("COMUNHÃO UNIVERSAL DE BENS");
        cmbRegimeBens.getItems().add("SEPARAÇÃO TOTAL DE BENS");
        cmbRegimeBens.getItems().add("NENHUM");
        
        // prencher o combo box Estado Civil
        cmbEscolaridade.getItems().add("FUNDAMENTAL - COMPLETO");
        cmbEscolaridade.getItems().add("FUNDAMENTAL - INCOMPLETO");
        cmbEscolaridade.getItems().add("MÉDIO - COMPLETO");
        cmbEscolaridade.getItems().add("MÉDIO - INCOMPLETO");
        cmbEscolaridade.getItems().add("SUPERIOR - COMPLETO");
        cmbEscolaridade.getItems().add("SUPERIOR - INCOMPLETO");
        cmbEscolaridade.getItems().add("PÓS GRADUAÇÃO - COMPLETO");
        cmbEscolaridade.getItems().add("PÓS GRADUAÇÃO - INCOMPLETO");
        
         // prencher o combo box Logradouro
        cmbLogradouro.getItems().add("RUA");
        cmbLogradouro.getItems().add("AVENIDA");
        cmbLogradouro.getItems().add("ALAMEDA");
        cmbLogradouro.getItems().add("JARDIM"); 
        cmbLogradouro.getItems().add("AEROPORTO");         
        cmbLogradouro.getItems().add("ÁREA");          
        cmbLogradouro.getItems().add("CAMPO");
        cmbLogradouro.getItems().add("CHÁCARA");
        cmbLogradouro.getItems().add("COLÔNIA"); 
        cmbLogradouro.getItems().add("CONDOMÍNIO");
        cmbLogradouro.getItems().add("CONJUNTO");
        cmbLogradouro.getItems().add("DISTRITO");
        cmbLogradouro.getItems().add("ESPLANADA"); 
        cmbLogradouro.getItems().add("ESTAÇÃO");
        cmbLogradouro.getItems().add("ESTRADA");
        cmbLogradouro.getItems().add("FAVELA"); 
        cmbLogradouro.getItems().add("FEIRA"); 
        cmbLogradouro.getItems().add("JARDIM");         
        cmbLogradouro.getItems().add("LADEIRA"); 
        cmbLogradouro.getItems().add("LAGO");
        cmbLogradouro.getItems().add("LAGOA");
        cmbLogradouro.getItems().add("LARGO"); 
        cmbLogradouro.getItems().add("LOTEAMENTO");
        cmbLogradouro.getItems().add("MORRO");
        cmbLogradouro.getItems().add("NÚCLEO"); 
        cmbLogradouro.getItems().add("PARQUE");
        cmbLogradouro.getItems().add("PASSARELA");
        cmbLogradouro.getItems().add("PÁTIO"); 
        cmbLogradouro.getItems().add("PRAÇA"); 
        cmbLogradouro.getItems().add("QUADRA"); 
        cmbLogradouro.getItems().add("RECANTO");
        cmbLogradouro.getItems().add("RESIDENCIAL");
        cmbLogradouro.getItems().add("RODOVIA");        
        cmbLogradouro.getItems().add("SETOR"); 
        cmbLogradouro.getItems().add("SÍTIO");
        cmbLogradouro.getItems().add("TRAVESSA");
        cmbLogradouro.getItems().add("TRECHO");
        cmbLogradouro.getItems().add("TREVO");
        cmbLogradouro.getItems().add("VALE"); 
        cmbLogradouro.getItems().add("VEREDA"); 
        cmbLogradouro.getItems().add("VIA"); 
        cmbLogradouro.getItems().add("VIADUTO");
        cmbLogradouro.getItems().add("VIELA"); 
        cmbLogradouro.getItems().add("VILA"); 
        
        cmbEstado.getItems().add("RS");
        
        cmbEstadoLogradouro.getItems().add("RS");
        
        
        
        
        
        //combobox da aba Preferências
        //Aqui vai ter todos os campos dos combobox para o usuário
        //escolher como se fosse um questionário, onde será usado 
        //para filtrar o imóvel desejado
        
        cmbApartamento.getItems().add("SIM");
        cmbApartamento.getItems().add("NÂO");
        cmbCasaTerrea.getItems().add("SIM");
        cmbCasaTerrea.getItems().add("NÂO");
        cmbSobrado.getItems().add("SIM");
        cmbSobrado.getItems().add("NÂO");
        cmbCondominio.getItems().add("SIM");
        cmbCondominio.getItems().add("NÂO");
        

   
    }    

    @FXML
    private void fecharCadastro(MouseEvent event) {
        Stage st = (Stage) lblFecharCadastroPF.getScene().getWindow();//obtem a janela atual
        st.close();//fecha o stage
    }   
    
}
