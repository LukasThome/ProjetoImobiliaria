
package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Cartao extends Pagamentos{
    
    private int id_Cartao;
    private int id_Codigo_Cartao;
    private int id_Cliente;
    private long numero_Cartao;
    private Date data_Vencimento_Cartao;
    private Date data_Recebimento;
    private String tipo_Cartao;
    private double valor_Recebimento;
    private String anotacoes;
    
    //get e set

    public int getId_Cartao() {
        return id_Cartao;
    }

    public void setId_Cartao(int id_Cartao) {
        this.id_Cartao = id_Cartao;
    }

    public int getId_Codigo_Cartao() {
        return id_Codigo_Cartao;
    }

    public void setId_Codigo_Cartao(int id_Codigo_Cartao) {
        this.id_Codigo_Cartao = id_Codigo_Cartao;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public long getNumero_Cartao() {
        return numero_Cartao;
    }

    public void setNumero_Cartao(long numero_Cartao) {
        this.numero_Cartao = numero_Cartao;
    }

    public Date getData_Vencimento_Cartao() {
        return data_Vencimento_Cartao;
    }

    public void setData_Vencimento_Cartao(Date data_Vencimento_Cartao) {
        this.data_Vencimento_Cartao = data_Vencimento_Cartao;
    }

    public Date getData_Recebimento() {
        return data_Recebimento;
    }

    public void setData_Recebimento(Date data_Recebimento) {
        this.data_Recebimento = data_Recebimento;
    }

    public String getTipo_Cartao() {
        return tipo_Cartao;
    }

    public void setTipo_Cartao(String tipo_Cartao) {
        this.tipo_Cartao = tipo_Cartao;
    }

    public double getValor_Recebimento() {
        return valor_Recebimento;
    }

    public void setValor_Recebimento(double valor_Recebimento) {
        this.valor_Recebimento = valor_Recebimento;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    
    
}
