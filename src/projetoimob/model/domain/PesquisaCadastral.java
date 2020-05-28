package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class PesquisaCadastral extends Emails {
    
    //atributos
    private int id_Pesquisa_Cadastral;
    private int id_Codigo_Pesquisa_Cadastral;
    private int codigo_Cliente;
    private Date data_Pesquisa;
    private Date data_Proxima_Pesquisa;
    private String situacao_Pesquisa;
    
    //contrutor

    
    //get e set

    public int getId_Pesquisa_Cadastral() {
        return id_Pesquisa_Cadastral;
    }

    public void setId_Pesquisa_Cadastral(int id_Pesquisa_Cadastral) {
        this.id_Pesquisa_Cadastral = id_Pesquisa_Cadastral;
    }

    public int getId_Codigo_Pesquisa_Cadastral() {
        return id_Codigo_Pesquisa_Cadastral;
    }

    public void setId_Codigo_Pesquisa_Cadastral(int id_Codigo_Pesquisa_Cadastral) {
        this.id_Codigo_Pesquisa_Cadastral = id_Codigo_Pesquisa_Cadastral;
    }

    public int getCodigo_Cliente() {
        return codigo_Cliente;
    }

    public void setCodigo_Cliente(int codigo_Cliente) {
        this.codigo_Cliente = codigo_Cliente;
    }

    public Date getData_Pesquisa() {
        return data_Pesquisa;
    }

    public void setData_Pesquisa(Date data_Pesquisa) {
        this.data_Pesquisa = data_Pesquisa;
    }

    public Date getData_Proxima_Pesquisa() {
        return data_Proxima_Pesquisa;
    }

    public void setData_Proxima_Pesquisa(Date data_Proxima_Pesquisa) {
        this.data_Proxima_Pesquisa = data_Proxima_Pesquisa;
    }

    public String getSituacao_Pesquisa() {
        return situacao_Pesquisa;
    }

    public void setSituacao_Pesquisa(String situacao_Pesquisa) {
        this.situacao_Pesquisa = situacao_Pesquisa;
    }
    
}
