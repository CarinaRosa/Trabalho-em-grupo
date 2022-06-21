package Projeto2_2b.Agenda;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("Carina", "13442255-3", "10/11/1997", "Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua"));

        // pp.add(new Endereco("Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua"));

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println("\n---------------ORDENAÇÃO---------------\n");
        Collections.sort(pessoas);
        
        Pessoa p = new Pessoa("Carina", "13442255-3", "10/11/1997", "Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua");
        p.getEmail().put("Email principal", "carina@gmail.com");
        p.getEmail().put("Email secundario", "carina_2@gmail.com");

        p.getTelefone().put("Residencial", "41 3333-3333");
        p.getTelefone().put("Comercial", "41 3222-3222");
        p.getTelefone().put("celular", "41 99999-8888");

        p.getEndereco().put("Residencial", "Casa");
        p.getTelefone().put("Comercial", "Trabalho");

        Endereco end = new Endereco("Rua Huehue", 123, "casa", "Legal", "81444-333", "Paranagua");

        end.getLogradouro();
        end.getNumero();
        end.getComplemento();
        end.getBairro();
        end.getCep();
        end.getCidade();

        for (Endereco e : pessoas) {
            System.out.println(e);
        }

        System.out.println("\n---------------ORDENAÇÃO---------------\n");
        Collections.sort(pessoas);

        
        System.out.printf("Email: %s;\nTelefone: %s;\nEndereço: %s", p.getEmail().get("Email principal"), p.getTelefone().get("celular"), p.getEndereco().get("Casa"));

              
        
    }
}
