public class SSD extends OpcaoNotebook {
    public SSD(Notebook notebook) { super(notebook); }

    public String getDescricao() { return notebook.getDescricao() + ", SSD"; }

    public float getPreco() { return notebook.getPreco() + 500.0f; }
}