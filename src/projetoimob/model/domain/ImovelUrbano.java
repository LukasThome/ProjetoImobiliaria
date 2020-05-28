
package projetoimob.model.domain;

/**
 *
 * @author thome
 */
public class ImovelUrbano extends ImovelGeral{
    
    private int id_ImovelU;
    private String numero_Iptu;
    private int area_Total;
    private int  area_Constuida;
    private int qtd_Banheiros;
    private int qtd_Dormitorios;
    private int qtd_Salas;
    private int qtd_Suites;
    private int qtd_Carros;
    private String tem_Garagem;
    private String tem_Churrasqueira;
    
    
    //get e set
    public int getId_ImovelU() {
        return id_ImovelU;
    }

    public void setId_ImovelU(int id_ImovelU) {
        this.id_ImovelU = id_ImovelU;
    }

    public String getNumero_Iptu() {
        return numero_Iptu;
    }

    public void setNumero_Iptu(String numero_Iptu) {
        this.numero_Iptu = numero_Iptu;
    }

    public int getArea_Total() {
        return area_Total;
    }

    public void setArea_Total(int area_Total) {
        this.area_Total = area_Total;
    }

    public int getArea_Constuida() {
        return area_Constuida;
    }

    public void setArea_Constuida(int area_Constuida) {
        this.area_Constuida = area_Constuida;
    }

    public int getQtd_Banheiros() {
        return qtd_Banheiros;
    }

    public void setQtd_Banheiros(int qtd_Banheiros) {
        this.qtd_Banheiros = qtd_Banheiros;
    }

    public int getQtd_Dormitorios() {
        return qtd_Dormitorios;
    }

    public void setQtd_Dormitorios(int qtd_Dormitorios) {
        this.qtd_Dormitorios = qtd_Dormitorios;
    }

    public int getQtd_Salas() {
        return qtd_Salas;
    }

    public void setQtd_Salas(int qtd_Salas) {
        this.qtd_Salas = qtd_Salas;
    }

    public int getQtd_Suites() {
        return qtd_Suites;
    }

    public void setQtd_Suites(int qtd_Suites) {
        this.qtd_Suites = qtd_Suites;
    }

    public int getQtd_Carros() {
        return qtd_Carros;
    }

    public void setQtd_Carros(int qtd_Carros) {
        this.qtd_Carros = qtd_Carros;
    }

    public String getTem_Garagem() {
        return tem_Garagem;
    }

    public void setTem_Garagem(String tem_Garagem) {
        this.tem_Garagem = tem_Garagem;
    }

    public String getTem_Churrasqueira() {
        return tem_Churrasqueira;
    }

    public void setTem_Churrasqueira(String tem_Churrasqueira) {
        this.tem_Churrasqueira = tem_Churrasqueira;
    }
    
}
