
package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class ImovelGeral {
    
    private int id_Imovel;
    private int id_Codigo_Imovel;
    private String numero_Matricula;
    private int area_Total;
    private String status_Venda;
    private String status_Locacao;
    private String tipo_Imovel;
    private String fotos;
    private String qualidade_Localizacao;
    private String qualidade_Acesso;;
    private String anotacoes;
    
    
    //get e set

    public int getId_Imovel() {
        return id_Imovel;
    }

    public void setId_Imovel(int id_Imovel) {
        this.id_Imovel = id_Imovel;
    }

    public int getId_Codigo_Imovel() {
        return id_Codigo_Imovel;
    }

    public void setId_Codigo_Imovel(int id_Codigo_Imovel) {
        this.id_Codigo_Imovel = id_Codigo_Imovel;
    }

    public String getNumero_Matricula() {
        return numero_Matricula;
    }

    public void setNumero_Matricula(String numero_Matricula) {
        this.numero_Matricula = numero_Matricula;
    }

    public int getArea_Total() {
        return area_Total;
    }

    public void setArea_Total(int area_Total) {
        this.area_Total = area_Total;
    }

    public String getStatus_Venda() {
        return status_Venda;
    }

    public void setStatus_Venda(String status_Venda) {
        this.status_Venda = status_Venda;
    }

    public String getStatus_Locacao() {
        return status_Locacao;
    }

    public void setStatus_Locacao(String status_Locacao) {
        this.status_Locacao = status_Locacao;
    }

    public String getTipo_Imovel() {
        return tipo_Imovel;
    }

    public void setTipo_Imovel(String tipo_Imovel) {
        this.tipo_Imovel = tipo_Imovel;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String getQualidade_Localizacao() {
        return qualidade_Localizacao;
    }

    public void setQualidade_Localizacao(String qualidade_Localizacao) {
        this.qualidade_Localizacao = qualidade_Localizacao;
    }

    public String getQualidade_Acesso() {
        return qualidade_Acesso;
    }

    public void setQualidade_Acesso(String qualidade_Acesso) {
        this.qualidade_Acesso = qualidade_Acesso;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    
    
}
