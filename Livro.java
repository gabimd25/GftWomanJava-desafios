public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private double preco;

    public Livro(int codigo, String titulo, String autor, String editora, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
    }
    public Livro(){

    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", codigo=" + codigo + ", editora=" + editora + ", preco=" + preco
                + ", titulo=" + titulo + "]";
    }
	
    
}