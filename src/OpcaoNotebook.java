public abstract class OpcaoNotebook implements Notebook {
    protected Notebook notebook;

    public OpcaoNotebook(Notebook notebook) { this.notebook = notebook; }

    public String getDescricao() { return notebook.getDescricao(); }

    public float getPreco() { return notebook.getPreco(); }
}
