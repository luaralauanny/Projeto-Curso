package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDb<Curso> {
    protected ArrayList<Curso> tabela;
    public ArrayList<Curso> getTabela() {
        return tabela;
    }
 
    protected abstract void preencherDados();   

    public BaseFakeDb(){
        this.preencherDados();
    }

}
