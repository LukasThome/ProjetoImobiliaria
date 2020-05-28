package projetoimob.model.domain;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author thome
 */
public class LoginSistema extends PessoaFisica{
    private int id_Login;
    private String usuario;
    private String senha;
    private String permissao;
    private Date data_Login;
    private Time time_Login;


    //get e set

    public int getId_Login() {
        return id_Login;
    }

    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Date getData_Login() {
        return data_Login;
    }

    public void setData_Login(Date data_Login) {
        this.data_Login = data_Login;
    }

    public Time getTime_Login() {
        return time_Login;
    }

    public void setTime_Login(Time time_Login) {
        this.time_Login = time_Login;
    }
    
}
