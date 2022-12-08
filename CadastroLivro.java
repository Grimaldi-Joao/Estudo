public class CadastroLivro {
    private Livro[] vetor;
    private int cont;

    public CadastroLivro(int tamanho){
        vetor = new Livro[tamanho];
    }

    public void cadastrarLivro(Livro a){
        int i;
        if(this.cont == this.vetor.length){
            System.out.println("Cadstro está cheio");
        }else{
            for(i = 0; i < this.cont;i++){
                if(a.compareTo(this.vetor[i])==0){
                    System.out.println("Cadastro não efetuado, nome repetido");
                }
            }
            this.vetor[this.cont] = a;
            this.cont++;
            System.out.println("Livro cadastrado");
        }
    }

    public void exibirLivros(){
        int u;
        for (u=0; u<this.cont;u++){
            System.out.println(this.vetor[u]);
        }
    }

    private int busca(Livro a){
        int i;
        for (i = 0; i <= this.cont - 1; i++) {
            if (a.compareTo(this.vetor[i])== 0) {
                return i;
            }
        }
        return -1;

    }

    public void exibirOLivro(Livro a){
        int i = busca(a);
        if(i==-1){
            System.out.println("Livro não cadastrado");
        }else{
            a.toString();
        }
    }

    public void alterarPreco(Livro a, double NovoPreco){
        int i = busca(a);
        if (i == -1){
            System.out.println("Livro não cadastrado");
        }else{
            a.setPreco(NovoPreco);
        }
    }

    public void alterarEstoque(Livro a, int NovoEstoque){
        int i = busca(a), c;
        if (i == -1){
            System.out.println("Livro não cadastrado");
        }else{
            c = a.getQuantidadeNoEstoque();
            NovoEstoque = c + NovoEstoque;
            a.setQuantidadeNoEstoque(NovoEstoque);
        }
    }

    public void remover(Livro a){
        int retorno = busca(a);
        int i;
        if (retorno == -1){
            System.out.println("Livro não cadastrado");
        }else{
            for (i = retorno; i < this.cont-1; i++){
                this.vetor[i] = this.vetor[i+1];
            }
            this.vetor[i] = null;
            this.cont--;
            System.out.println("Remoção efetuada!");
        }
    }

}
