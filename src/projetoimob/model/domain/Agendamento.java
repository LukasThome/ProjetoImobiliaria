
package projetoimob.model.domain;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author thome
 */
public class Agendamento {
    
    private int id_Agendamento;
    private int id_Codigo_Agendamento;
    private Date data_Agendamento;
    private Time hora_Agendamento;
    private String status;
    private String reagendamento;
    private Date data_Reagendamento;
    private Time hora_Reagendamento;
    private String tipo_Agendamento;
    private int id_Cliente;
    private int id_Imovel;       
    private String anotacoes;
    
    
    //get e set

    public int getId_Agendamento() {
        return id_Agendamento;
    }

    public void setId_Agendamento(int id_Agendamento) {
        this.id_Agendamento = id_Agendamento;
    }

    public int getId_Codigo_Agendamento() {
        return id_Codigo_Agendamento;
    }

    public void setId_Codigo_Agendamento(int id_Codigo_Agendamento) {
        this.id_Codigo_Agendamento = id_Codigo_Agendamento;
    }

    public Date getData_Agendamento() {
        return data_Agendamento;
    }

    public void setData_Agendamento(Date data_Agendamento) {
        this.data_Agendamento = data_Agendamento;
    }

    public Time getHora_Agendamento() {
        return hora_Agendamento;
    }

    public void setHora_Agendamento(Time hora_Agendamento) {
        this.hora_Agendamento = hora_Agendamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReagendamento() {
        return reagendamento;
    }

    public void setReagendamento(String reagendamento) {
        this.reagendamento = reagendamento;
    }

    public Date getData_Reagendamento() {
        return data_Reagendamento;
    }

    public void setData_Reagendamento(Date data_Reagendamento) {
        this.data_Reagendamento = data_Reagendamento;
    }

    public Time getHora_Reagendamento() {
        return hora_Reagendamento;
    }

    public void setHora_Reagendamento(Time hora_Reagendamento) {
        this.hora_Reagendamento = hora_Reagendamento;
    }

    public String getTipo_Agendamento() {
        return tipo_Agendamento;
    }

    public void setTipo_Agendamento(String tipo_Agendamento) {
        this.tipo_Agendamento = tipo_Agendamento;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
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
