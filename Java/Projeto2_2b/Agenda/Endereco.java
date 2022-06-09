package Projeto2_2b.Agenda;

public class Endereco {
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;

    public Endereco(String logradouro, int numero,String complemento, String bairro, String cep, String cidade){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }
}
