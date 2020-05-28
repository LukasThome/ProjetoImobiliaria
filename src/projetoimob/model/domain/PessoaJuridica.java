package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class PessoaJuridica extends PesquisaCadastral{
    

    //atributos
    private int id_PessoaPJ;
    private int id_Codigo_PessoaPJ;
    private String razao_Social;
    private String nome_Fantasia;
    private String cnpj;
    private String inscricao_Estadual;
    private String isento_Inscricao_E;
    private String atividade_Principal;
    private String atividades_Secundarias;
    private Date daata_Abertura_Empresa;
    private String anotacoes;
    private String status_Cadastro;
    
    //contrutor

    
    
    
    //get e set
    public int getId_PessoaPJ() {
        return id_PessoaPJ;
    }

    public void setId_PessoaPJ(int id_PessoaPJ) {
        this.id_PessoaPJ = id_PessoaPJ;
    }

    public int getId_Codigo_PessoaPJ() {
        return id_Codigo_PessoaPJ;
    }

    public void setId_Codigo_PessoaPJ(int id_Codigo_PessoaPJ) {
        this.id_Codigo_PessoaPJ = id_Codigo_PessoaPJ;
    }

    public String getRazao_Social() {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        this.razao_Social = razao_Social;
    }

    public String getNome_Fantasia() {
        return nome_Fantasia;
    }

    public void setNome_Fantasia(String nome_Fantasia) {
        this.nome_Fantasia = nome_Fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    public void setInscricao_Estadual(String inscricao_Estadual) {
        this.inscricao_Estadual = inscricao_Estadual;
    }

    public String getIsento_Inscricao_E() {
        return isento_Inscricao_E;
    }

    public void setIsento_Inscricao_E(String isento_Inscricao_E) {
        this.isento_Inscricao_E = isento_Inscricao_E;
    }

    public String getAtividade_Principal() {
        return atividade_Principal;
    }

    public void setAtividade_Principal(String atividade_Principal) {
        this.atividade_Principal = atividade_Principal;
    }

    public String getAtividades_Secundarias() {
        return atividades_Secundarias;
    }

    public void setAtividades_Secundarias(String atividades_Secundarias) {
        this.atividades_Secundarias = atividades_Secundarias;
    }

    public Date getDaata_Abertura_Empresa() {
        return daata_Abertura_Empresa;
    }

    public void setDaata_Abertura_Empresa(Date daata_Abertura_Empresa) {
        this.daata_Abertura_Empresa = daata_Abertura_Empresa;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getStatus_Cadastro() {
        return status_Cadastro;
    }

    public void setStatus_Cadastro(String status_Cadastro) {
        this.status_Cadastro = status_Cadastro;
    }
    
    
    
}
