package visao;

import java.util.ArrayList;
import dominio.Curso;
import servico.CursoServico;

public class CursoVisao {

        private CursoServico srv;

    public CursoVisao(){
        this.srv = new CursoServico();
    }
     public void CriarListar(){
        Curso cp = new Curso();
        cp.setId(0);
        cp.setDescricao("Teste");
        cp.setCargahoraria(0);
        this.srv.Criar(cp);
        this.Imprimir(cp);
    }

    public void Exibir(){
        ArrayList<Curso> lista = this.srv.LerTodos();
        for (Curso cp : lista) {
            this.Imprimir(cp);
        }
    }

    private void Imprimir(Curso cp){
        System.out.println("Classe de Produto");
        System.out.println("Id: " + cp.getId());
        System.out.println("Nome: " + cp.getNome());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Carga Horaria : " + cp.getCargahoraria());
    }

    public void ExibirEmLinha(){
        ArrayList<Curso> lista = this.srv.LerTodos();
        for (Curso cp : lista) {
            this.ImprimirEmLinha(cp);
        }
    }

   private void ImprimirEmLinha(Curso cp){
        String msg = "Curso - ";
        msg += "Id: " + cp.getId() + " | ";
        msg += "Nome: " + cp.getNome() + " | ";
        msg += "Descrição: " + cp.getDescricao() + " | ";
        msg += "Carga Horaria: " + cp.getCargahoraria();
        System.out.println(msg);
            
        }
    }

