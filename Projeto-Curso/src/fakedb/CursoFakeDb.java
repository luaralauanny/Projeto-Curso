package fakedb;

import java.util.ArrayList;
import dominio.Curso;

public class CursoFakeDb extends BaseFakeDb<Curso> {

    @Override
    protected void preencherDados()  {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Curso(1, "Gabriella", "Direito", 5000));
        this.tabela.add(new Curso(2, "Viviane", "Administração", 3000));

    }
    public CursoFakeDb(){
        super();
    }
    
}
