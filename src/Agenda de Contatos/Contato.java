package questao1;


public class Contato {
    int id;
    String nome;
    String telefone;
    String detalhes;

    public Contato(int id, String nome, String telefone, String detalhes) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
       public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
   
}
