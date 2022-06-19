package Projeto2_2b.Agenda;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // List<Endereco> agenda = new ArrayList<Endereco>();

        Pessoa p = new Pessoa("Carina", "13442255-3", "10111997");
        p.getEmail().put("Email principal", "carina@gmail.com");
        p.getEmail().put("Email secundario", "carina2@gmail.com");

        p.getTelefone().put("Residencial", "41 3333-3333");
        p.getTelefone().put("Comercial", "41 3222-3222");
        p.getTelefone().put("celular", "41 99999-8888");

        // p.getEndereco().put( "Residencial", "Rua Huehue");

        // agenda.add(new Endereco("Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua"));

        // for (Pessoa p : agenda) {
        //     System.out.println(p);
        // }

        //Ordenação 

        System.out.println("\n---------------ORDENAÇÃO---------------\n");
        // Collections.sort(agenda);
        
    }
}
