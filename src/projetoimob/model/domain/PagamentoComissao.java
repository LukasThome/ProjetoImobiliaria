
package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class PagamentoComissao extends Pagamentos {
    
    private int id_Pag_Comissao;
    private Date data_Venda_Locacao;
    private Date data_Pagamento;
    private int codigo_Corretor_Imobiliaria;
    private int codgigo_Pagador_Comissao;
    private String condicoes;
    private String status;
    private String numero_Nota_Recibo;
    private String documentacao_Venda_Locacao;
    private String anotacoes;
    
    
    //get e set

    public int getId_Pag_Comissao() {
        return id_Pag_Comissao;
    }

    public void setId_Pag_Comissao(int id_Pag_Comissao) {
        this.id_Pag_Comissao = id_Pag_Comissao;
    }

    public Date getData_Venda_Locacao() {
        return data_Venda_Locacao;
    }

    public void setData_Venda_Locacao(Date data_Venda_Locacao) {
        this.data_Venda_Locacao = data_Venda_Locacao;
    }

    public Date getData_Pagamento() {
        return data_Pagamento;
    }

    public void setData_Pagamento(Date data_Pagamento) {
        this.data_Pagamento = data_Pagamento;
    }

    public int getCodigo_Corretor_Imobiliaria() {
        return codigo_Corretor_Imobiliaria;
    }

    public void setCodigo_Corretor_Imobiliaria(int codigo_Corretor_Imobiliaria) {
        this.codigo_Corretor_Imobiliaria = codigo_Corretor_Imobiliaria;
    }

    public int getCodgigo_Pagador_Comissao() {
        return codgigo_Pagador_Comissao;
    }

    public void setCodgigo_Pagador_Comissao(int codgigo_Pagador_Comissao) {
        this.codgigo_Pagador_Comissao = codgigo_Pagador_Comissao;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumero_Nota_Recibo() {
        return numero_Nota_Recibo;
    }

    public void setNumero_Nota_Recibo(String numero_Nota_Recibo) {
        this.numero_Nota_Recibo = numero_Nota_Recibo;
    }

    public String getDocumentacao_Venda_Locacao() {
        return documentacao_Venda_Locacao;
    }

    public void setDocumentacao_Venda_Locacao(String documentacao_Venda_Locacao) {
        this.documentacao_Venda_Locacao = documentacao_Venda_Locacao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
}
