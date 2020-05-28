
package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class PessoaFisica extends PesquisaCadastral{
    
    //atributos
    private int id_PessoaF;
    private int id_Codigo_PessoaF;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Date data_Nascimento;
    private String sexo;
    private String estado_Civil;
    private String regime_Bens;
    private String naturalidade;
    private String estado_Naturalidade;
    private String escolaridade;
    private String profissao;
    private String nome_Pai;
    private String nome_Mae;
    private String status_Cadastro;
    private String pesquisa_Cadastral_Situacao;
    private Date data_Pesquisa_Cadastral; 
    private String anotacoes;
    
    //get e set
    public int getId_PessoaF() {
        return id_PessoaF;
    }

    public void setId_PessoaF(int id_PessoaF) {
        this.id_PessoaF = id_PessoaF;
    }

    public int getId_Codigo_PessoaF() {
        return id_Codigo_PessoaF;
    }

    public void setId_Codigo_PessoaF(int id_Codigo_PessoaF) {
        this.id_Codigo_PessoaF = id_Codigo_PessoaF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(Date data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String getRegime_Bens() {
        return regime_Bens;
    }

    public void setRegime_Bens(String regime_Bens) {
        this.regime_Bens = regime_Bens;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstado_Naturalidade() {
        return estado_Naturalidade;
    }

    public void setEstado_Naturalidade(String estado_Naturalidade) {
        this.estado_Naturalidade = estado_Naturalidade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getNome_Pai() {
        return nome_Pai;
    }

    public void setNome_Pai(String nome_Pai) {
        this.nome_Pai = nome_Pai;
    }

    public String getNome_Mae() {
        return nome_Mae;
    }

    public void setNome_Mae(String nome_Mae) {
        this.nome_Mae = nome_Mae;
    }

    public String getStatus_Cadastro() {
        return status_Cadastro;
    }

    public void setStatus_Cadastro(String status_Cadastro) {
        this.status_Cadastro = status_Cadastro;
    }

    public String getPesquisa_Cadastral_Situacao() {
        return pesquisa_Cadastral_Situacao;
    }

    public void setPesquisa_Cadastral_Situacao(String pesquisa_Cadastral_Situacao) {
        this.pesquisa_Cadastral_Situacao = pesquisa_Cadastral_Situacao;
    }

    public Date getData_Pesquisa_Cadastral() {
        return data_Pesquisa_Cadastral;
    }

    public void setData_Pesquisa_Cadastral(Date data_Pesquisa_Cadastral) {
        this.data_Pesquisa_Cadastral = data_Pesquisa_Cadastral;
    }
    
    
}
