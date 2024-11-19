package exercicio2;

public class Pagina {
    private int numero;
    private String conteudo;

    public Pagina(int numero, String conteudo){
        this.numero = numero;
        this.conteudo = conteudo;
    }

    public int getNumero() {
        return numero;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Pagina: " +
                "numero= " + numero +
                ", conteudo= " + conteudo + '\'';
    }
}
