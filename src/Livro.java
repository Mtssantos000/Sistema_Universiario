

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int id;
    private int Quantidade;
  

 

	public Livro() {
            
	}



	public Livro(String titulo, String autor, String editora, int id, int Quantidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.id = id;
                this.Quantidade = Quantidade; 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

	

    /**
     * @return the titulo
     */
    
    
}
