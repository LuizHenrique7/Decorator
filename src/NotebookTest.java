import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {
    @Test
    void deveRetornartDescricaoNotebook() {
        Notebook notebook = new NotebookBasico();
        assertEquals("Notebook Básico", notebook.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoNotebookComPlacaDeVideo() {
        Notebook notebook = new PlacaDeVideo(new NotebookBasico());
        assertEquals("Notebook Básico, Placa de Vídeo", notebook.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoNotebookComRAM() {
        Notebook notebook = new RAM(new NotebookBasico());
        assertEquals("Notebook Básico, RAM", notebook.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoNotebookComSSD() {
        Notebook notebook = new SSD(new NotebookBasico());
        assertEquals("Notebook Básico, SSD", notebook.getDescricao());
    }

    @Test
    public void deveRetornarPrecoNotebook() {
        Notebook notebook = new NotebookBasico();
        assertEquals(2000.0f, notebook.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoNotebookComPlacaDeVideo() {
        Notebook notebook = new NotebookBasico();
        notebook = new PlacaDeVideo(notebook);
        assertEquals(2800.0f, notebook.getPreco(), 0.001f);
    }


    @Test
    public void deveRetornarPrecoNotebookComRAM() {
        Notebook notebook = new NotebookBasico();
        notebook = new RAM(notebook);
        assertEquals(2300.0f, notebook.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoNotebookComSSD() {
        Notebook notebook = new NotebookBasico();
        notebook = new SSD(notebook);
        assertEquals(2500.0f, notebook.getPreco(), 0.001f);
    }

    @Test
    public void deveRetornarPrecoNotebookComPlacaDeVideoMaisRAMMaisSSD() {
        Notebook notebook = new NotebookBasico();notebook = new PlacaDeVideo(notebook);notebook = new RAM(notebook);notebook = new SSD(notebook);
        assertEquals(3600.0f, notebook.getPreco(), 0.001f);
    }
}