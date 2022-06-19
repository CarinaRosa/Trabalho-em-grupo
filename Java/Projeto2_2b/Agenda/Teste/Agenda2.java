package Projeto2_2b.Agenda.Teste;

import java.util.ArrayList;

public class Agenda2 {
    private ArrayList<Contato>contatos;

    public void Agenda(){
        contatos = new ArrayList();
    }

    public void inserir(Contato c){
        contatos.add(c);
    }

    public Contato buscar(String nome){
        for(int i=0;i<contatos.size();i++){
            Contato c = contatos.get(i);
            
            if(c.getNome().equalsIgnoreCase(nome)){

                return contatos.get(i);
            }
               
        }
        return null;
    }

    public Contato buscar(int pos){
        if(pos >= 0 && pos < contatos.size()){
            return contatos.get(pos);
        }
        return null;
    }
    public Email buscarEmail(String email){
        for(int i=0;i<contatos.size();i++){
            if(contatos.get(i) != instanceofEmail)
            {
              Email c=(Email)contatos.get(i);
              if(c.getEmail().equalsIgnoreCase(email))
              return (Email)contatos.get(i);
            }
        }
        return null;
    }

    public Contato[] buscarGeral(String palavraChave){
        ArrayList<Contato> todos = new ArrayList();
         for(int i = 0; i < contatos.size(); i++)
          {   Contato c = contatos.get(i);
               if(c.getDados().contains(palavraChave))
                 todos.add(c);
           }
           Contato[] vet=new Contato[todos.size()];

            return (todos.toArray(vet));
     }
     Public Contato[] buscarTodos()
    {   Contato[] vet=new Contato[contatos.size()];

         return (contatos.toArray(vet));
    }
    Public intgetQuantidade()
   {  returncontatos.size();
    }
}
