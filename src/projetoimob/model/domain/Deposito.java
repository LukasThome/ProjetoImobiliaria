package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Deposito extends Pagamentos {
    
    private int id_Deposito;
    private int id_Codigo_Deposito;
    private int id_Cliente;
    private Date data_Deposito;
    private String codigo_Identificacao;
    private String tipo_Deposito;
    private double valor_Deposito;
    private String confirmacao_Deposito;
    private String deposito_Realizado;
    private String anotacoes;
    
    //get e set

    public int getId_Deposito() {
        return id_Deposito;
    }

    public void setId_Deposito(int id_Deposito) {
        this.id_Deposito = id_Deposito;
    }

    public int getId_Codigo_Deposito() {
        return id_Codigo_Deposito;
    }

    public void setId_Codigo_Deposito(int id_Codigo_Deposito) {
        this.id_Codigo_Deposito = id_Codigo_Deposito;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Date getData_Deposito() {
        return data_Deposito;
    }

    public void setData_Deposito(Date data_Deposito) {
        this.data_Deposito = data_Deposito;
    }

    public String getCodigo_Identificacao() {
        return codigo_Identificacao;
    }

    public void setCodigo_Identificacao(String codigo_Identificacao) {
        this.codigo_Identificacao = codigo_Identificacao;
    }

    public String getTipo_Deposito() {
        return tipo_Deposito;
    }

    public void setTipo_Deposito(String tipo_Deposito) {
        this.tipo_Deposito = tipo_Deposito;
    }

    public double getValor_Deposito() {
        return valor_Deposito;
    }

    public void setValor_Deposito(double valor_Deposito) {
        this.valor_Deposito = valor_Deposito;
    }

    public String getConfirmacao_Deposito() {
        return confirmacao_Deposito;
    }

    public void setConfirmacao_Deposito(String confirmacao_Deposito) {
        this.confirmacao_Deposito = confirmacao_Deposito;
    }

    public String getDeposito_Realizado() {
        return deposito_Realizado;
    }

    public void setDeposito_Realizado(String deposito_Realizado) {
        this.deposito_Realizado = deposito_Realizado;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    
}
