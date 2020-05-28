package projetoimob.model.domain;

import java.sql.Date;

/**
 *
 * @author thome
 */
public class Avista extends Pagamentos {
    
    private int id_Avista;
    private int id_Codigo_Avista;
    private int  id_Cliente;
    private Date data_Pagamento;
    
    //get e set

    public int getId_Avista() {
        return id_Avista;
    }

    public void setId_Avista(int id_Avista) {
        this.id_Avista = id_Avista;
    }

    public int getId_Codigo_Avista() {
        return id_Codigo_Avista;
    }

    public void setId_Codigo_Avista(int id_Codigo_Avista) {
        this.id_Codigo_Avista = id_Codigo_Avista;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Date getData_Pagamento() {
        return data_Pagamento;
    }

    public void setData_Pagamento(Date data_Pagamento) {
        this.data_Pagamento = data_Pagamento;
    }
    
    
}
