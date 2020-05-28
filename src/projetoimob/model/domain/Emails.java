package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class Emails extends Telefones{
    
    private int id_Email;
    private int id_Codigo_Email;
    private String tipo_Email;
    private String email;
    
    //get e set

    public int getId_Email() {
        return id_Email;
    }

    public void setId_Email(int id_Email) {
        this.id_Email = id_Email;
    }

    public int getId_Codigo_Email() {
        return id_Codigo_Email;
    }

    public void setId_Codigo_Email(int id_Codigo_Email) {
        this.id_Codigo_Email = id_Codigo_Email;
    }

    public String getTipo_Email() {
        return tipo_Email;
    }

    public void setTipo_Email(String tipo_Email) {
        this.tipo_Email = tipo_Email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
