public class Livro implements Comparable <Livro> {

    private String ISNB;
    private String Titulo;
    private double Preco;
    private int QuantidadeNoEstoque;

    public double getPreco() {
        return Preco;
    }

    public int getQuantidadeNoEstoque() {
        return QuantidadeNoEstoque;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        QuantidadeNoEstoque = quantidadeNoEstoque;
    }

    public String toString() {
        return "Livro{" +
                "ISNB='" + this.ISNB + '\'' +
                ", Titulo='" + this.Titulo + '\'' +
                ", Preco=" + this.Preco +
                ", QuantidadeNoEstoque=" + this.QuantidadeNoEstoque +
                '}';
    }
    public int compareTo (Livro outro) {
        int result;
        result = this.ISNB.compareTo(outro.ISNB);
        return result;
    }

    public Livro(String ISNB){
        this.ISNB = ISNB;
    }

    public Livro(String ISNB, String Titulo, double Preco,int QuantidadeNoEstoque){
        this.ISNB = ISNB;
        this.Titulo = Titulo;
        this.Preco = Preco;
        this.QuantidadeNoEstoque = QuantidadeNoEstoque;
    }
}
