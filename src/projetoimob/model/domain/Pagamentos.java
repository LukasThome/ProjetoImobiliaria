package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Pagamentos {
    private int id_Pagamento;
    private int id_Codigo_Pagamento;
    private Date data_Pagamento;
    private Date data_Vencimento_Pagamento;
    private double juros_Mensais;
    private double juros_Multa;
    private int id_Codigo_Cliente;
    private String forma_Pagamento;
    private double valor_Pagamento;
    private double valor_Desconto;
    private double valor_Total_Pagamento;
    private int numero_Documento_Pagamento;
    private int id_Cliente;
    private int id_Imovel;
    
    //get e set

    public int getId_Pagamento() {
        return id_Pagamento;
    }

    public void setId_Pagamento(int id_Pagamento) {
        this.id_Pagamento = id_Pagamento;
    }

    public int getId_Codigo_Pagamento() {
        return id_Codigo_Pagamento;
    }

    public void setId_Codigo_Pagamento(int id_Codigo_Pagamento) {
        this.id_Codigo_Pagamento = id_Codigo_Pagamento;
    }

    public Date getData_Pagamento() {
        return data_Pagamento;
    }

    public void setData_Pagamento(Date data_Pagamento) {
        this.data_Pagamento = data_Pagamento;
    }

    public Date getData_Vencimento_Pagamento() {
        return data_Vencimento_Pagamento;
    }

    public void setData_Vencimento_Pagamento(Date data_Vencimento_Pagamento) {
        this.data_Vencimento_Pagamento = data_Vencimento_Pagamento;
    }

    public double getJuros_Mensais() {
        return juros_Mensais;
    }

    public void setJuros_Mensais(double juros_Mensais) {
        this.juros_Mensais = juros_Mensais;
    }

    public double getJuros_Multa() {
        return juros_Multa;
    }

    public void setJuros_Multa(double juros_Multa) {
        this.juros_Multa = juros_Multa;
    }

    public int getId_Codigo_Cliente() {
        return id_Codigo_Cliente;
    }

    public void setId_Codigo_Cliente(int id_Codigo_Cliente) {
        this.id_Codigo_Cliente = id_Codigo_Cliente;
    }

    public String getForma_Pagamento() {
        return forma_Pagamento;
    }

    public void setForma_Pagamento(String forma_Pagamento) {
        this.forma_Pagamento = forma_Pagamento;
    }

    public double getValor_Pagamento() {
        return valor_Pagamento;
    }

    public void setValor_Pagamento(double valor_Pagamento) {
        this.valor_Pagamento = valor_Pagamento;
    }

    public double getValor_Desconto() {
        return valor_Desconto;
    }

    public void setValor_Desconto(double valor_Desconto) {
        this.valor_Desconto = valor_Desconto;
    }

    public double getValor_Total_Pagamento() {
        return valor_Total_Pagamento;
    }

    public void setValor_Total_Pagamento(double valor_Total_Pagamento) {
        this.valor_Total_Pagamento = valor_Total_Pagamento;
    }

    public int getNumero_Documento_Pagamento() {
        return numero_Documento_Pagamento;
    }

    public void setNumero_Documento_Pagamento(int numero_Documento_Pagamento) {
        this.numero_Documento_Pagamento = numero_Documento_Pagamento;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_Imovel() {
        return id_Imovel;
    }

    public void setId_Imovel(int id_Imovel) {
        this.id_Imovel = id_Imovel;
    }
    
    
}
