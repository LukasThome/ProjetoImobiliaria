
package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Cheque extends Pagamentos{
    
    private int id_Cheque;
    private int id_Codigo_Cheque;
    private String banco;
    private int id_Cliente;
    private String numero_Cheque;
    private String referente_Pagamento;
    private String a_vista;
    private String parcelado;
    private int quantidade_Vezes;
    private String compensado;
    private Date data_Cheque;
    private Date data_Recebimento;
    private Date data_Abertura_Conta;
    private String anotacoes;
    
    
    //get e set

    public int getId_Cheque() {
        return id_Cheque;
    }

    public void setId_Cheque(int id_Cheque) {
        this.id_Cheque = id_Cheque;
    }

    public int getId_Codigo_Cheque() {
        return id_Codigo_Cheque;
    }

    public void setId_Codigo_Cheque(int id_Codigo_Cheque) {
        this.id_Codigo_Cheque = id_Codigo_Cheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNumero_Cheque() {
        return numero_Cheque;
    }

    public void setNumero_Cheque(String numero_Cheque) {
        this.numero_Cheque = numero_Cheque;
    }

    public String getReferente_Pagamento() {
        return referente_Pagamento;
    }

    public void setReferente_Pagamento(String referente_Pagamento) {
        this.referente_Pagamento = referente_Pagamento;
    }

    public String getA_vista() {
        return a_vista;
    }

    public void setA_vista(String a_vista) {
        this.a_vista = a_vista;
    }

    public String getParcelado() {
        return parcelado;
    }

    public void setParcelado(String parcelado) {
        this.parcelado = parcelado;
    }

    public int getQuantidade_Vezes() {
        return quantidade_Vezes;
    }

    public void setQuantidade_Vezes(int quantidade_Vezes) {
        this.quantidade_Vezes = quantidade_Vezes;
    }

    public String getCompensado() {
        return compensado;
    }

    public void setCompensado(String compensado) {
        this.compensado = compensado;
    }

    public Date getData_Cheque() {
        return data_Cheque;
    }

    public void setData_Cheque(Date data_Cheque) {
        this.data_Cheque = data_Cheque;
    }

    public Date getData_Recebimento() {
        return data_Recebimento;
    }

    public void setData_Recebimento(Date data_Recebimento) {
        this.data_Recebimento = data_Recebimento;
    }

    public Date getData_Abertura_Conta() {
        return data_Abertura_Conta;
    }

    public void setData_Abertura_Conta(Date data_Abertura_Conta) {
        this.data_Abertura_Conta = data_Abertura_Conta;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
}
