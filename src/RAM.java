public class RAM extends OpcaoNotebook {
    public RAM(Notebook notebook) { super(notebook); }

    public String getDescricao() { return notebook.getDescricao() + ", RAM"; }

    public float getPreco() { return notebook.getPreco() + 300.0f; }
}