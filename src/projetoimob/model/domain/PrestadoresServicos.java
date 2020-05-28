package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class PrestadoresServicos extends PessoaJuridica{
    
    private int id_Prestador;
    private int id_Codigo_Prestador;
    private int id_Codigo_Servico;
    private String tipo_Servico_Prestado;
    private Date data_Inicial;
    private Date data_Final;
    private String anotacoes;
    
    //construtor

   
    //get e set

    public int getId_Prestador() {
        return id_Prestador;
    }

    public void setId_Prestador(int id_Prestador) {
        this.id_Prestador = id_Prestador;
    }

    public int getId_Codigo_Prestador() {
        return id_Codigo_Prestador;
    }

    public void setId_Codigo_Prestador(int id_Codigo_Prestador) {
        this.id_Codigo_Prestador = id_Codigo_Prestador;
    }

    public int getId_Codigo_Servico() {
        return id_Codigo_Servico;
    }

    public void setId_Codigo_Servico(int id_Codigo_Servico) {
        this.id_Codigo_Servico = id_Codigo_Servico;
    }

    public String getTipo_Servico_Prestado() {
        return tipo_Servico_Prestado;
    }

    public void setTipo_Servico_Prestado(String tipo_Servico_Prestado) {
        this.tipo_Servico_Prestado = tipo_Servico_Prestado;
    }

    public Date getData_Inicial() {
        return data_Inicial;
    }

    public void setData_Inicial(Date data_Inicial) {
        this.data_Inicial = data_Inicial;
    }

    public Date getData_Final() {
        return data_Final;
    }

    public void setData_Final(Date data_Final) {
        this.data_Final = data_Final;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
}
