public class PlacaDeVideo extends OpcaoNotebook {
    public PlacaDeVideo(Notebook notebook) { super(notebook); }

    public String getDescricao() { return notebook.getDescricao() + ", Placa de Vídeo"; }

    public float getPreco() { return notebook.getPreco() + 800.0f; }
}