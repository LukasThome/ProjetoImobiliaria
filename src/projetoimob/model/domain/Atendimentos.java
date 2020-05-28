
package projetoimob.model.domain;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author thome
 */
public class Atendimentos {
    
    private int id_Atendimento;
    private int id_Codigo_Atendimento;
    private Date data_Atendimento;
    private Time hora_Atendimento;
    private  String nome;
    private String telefone;
    private String status_Atendimento;
    private String anotacoes;

    public String getStatus_Atendimento() {
        return status_Atendimento;
    }

    public void setStatus_Atendimento(String status_Atendimento) {
        this.status_Atendimento = status_Atendimento;
    }
    
    

    public int getId_Atendimento() {
        return id_Atendimento;
    }

    public void setId_Atendimento(int id_Atendimento) {
        this.id_Atendimento = id_Atendimento;
    }

    public int getId_Codigo_Atendimento() {
        return id_Codigo_Atendimento;
    }

    public void setId_Codigo_Atendimento(int id_Codigo_Atendimento) {
        this.id_Codigo_Atendimento = id_Codigo_Atendimento;
    }

    public Date getData_Atendimento() {
        return data_Atendimento;
    }

    public void setData_Atendimento(Date data_Atendimento) {
        this.data_Atendimento = data_Atendimento;
    }

    public Time getHora_Atendimento() {
        return hora_Atendimento;
    }

    public void setHora_Atendimento(Time hora_Atendimento) {
        this.hora_Atendimento = hora_Atendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    
    
}
