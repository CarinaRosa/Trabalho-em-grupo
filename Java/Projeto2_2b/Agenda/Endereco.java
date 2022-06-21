package Projeto2_2b.Agenda;

public class Endereco extends Pessoa{
    
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;

    
    public Endereco(String nome, String rg, String data, String logradouro, int numero,String complemento, String bairro, String cep, String cidade){
        super(nome, rg, data);        
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    
    public String getLogradouro() {
        return logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }

    // implements Comparable<Endereco>
    //@Override
    // public int compareTo(Endereco o) {
    //     return this.nome.compareTo(o.nome);
    // }

    
}
