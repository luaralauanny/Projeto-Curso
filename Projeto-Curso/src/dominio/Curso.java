package dominio;

public class Curso {

    private int codigo;
    private String nome;
    private String descricao;
    private int cargahoraria;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
public Curso() {
}
public Curso(int id, String nome, String descricao, int cargahoraria) {
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.cargahoraria = cargahoraria;
}
}