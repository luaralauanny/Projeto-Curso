package servico;

import java.util.ArrayList;

import dominio.Curso;
import repositorio.CursoRepositorio;

public class CursoServico extends BaseServico<Curso>{

    private CursoRepositorio repositorio;

    public CursoServico(){
        this.repositorio = new CursoRepositorio();
    }

    @Override
    public Curso Criar(Curso obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public ArrayList<Curso> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Curso Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Curso Atualizar(Curso obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Curso Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

    public Curso Ler(int codigo, String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }
}
