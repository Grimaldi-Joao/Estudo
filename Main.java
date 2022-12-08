import java.util.Scanner;

public class Main {
    public static void exibeOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um Livro");
        System.out.println("2 - Exibir Livros cadastrados");
        System.out.println("3 - Exibir os dados de um Livro");
        System.out.println("4 - Alterar preço de um livro");
        System.out.println("5 - Alterar quantidade em estoque");
        System.out.println("6 - Remover um Livro");
        System.out.println("0 - Sair do Programa");
        System.out.println("Informe a opção: ");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ISNB, Titulo;
        double Preco;
        int QuantidadenoEstoque, tamanho = 0, op;
        while (tamanho == 0 || tamanho < 0) {
            System.out.println("Digite a quantidade de livros, numeros validos so maior que zero");
            tamanho = scan.nextInt();
        }
        CadastroLivro cadastro = new CadastroLivro(tamanho);
        Livro a;

        do {
            exibeOpcoes();
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Informe os dados do Livro");
                    System.out.println("Informe o Nome do Livro:");
                    Titulo = scan.nextLine();
                    System.out.println("informe o ISNB:");
                    ISNB = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Informe o Preço do livro:");
                    Preco = scan.nextDouble();
                    System.out.println("Informe a quante dade em estoque do livro:");
                    QuantidadenoEstoque = scan.nextInt();
                    scan.nextLine();
                    a = new Livro(ISNB, Titulo, Preco, QuantidadenoEstoque);
                    break;

                case 2:
                    cadastro.exibirLivros();
                    break;
                case 3:
                    System.out.println("Digite o ISNB do livro desejado:");
                    ISNB = scan.nextLine();
                    a = new Livro(ISNB);
                    cadastro.exibirOLivro(a);
                    break;
                case 4:
                    System.out.println("Digite o ISNB do livro desejado:");
                    ISNB = scan.nextLine();
                    a = new Livro(ISNB);
                    System.out.println("Digite o novo preço");
                    Preco = scan.nextDouble();
                    cadastro.alterarPreco(a,Preco);
                    break;
                case 5:
                    System.out.println("Digite o ISNB do livro desejado:");
                    ISNB = scan.nextLine();
                    a = new Livro(ISNB);
                    System.out.println("Quantas unidades tem a mais:");
                    QuantidadenoEstoque = scan.nextInt();
                    cadastro.alterarEstoque(a,QuantidadenoEstoque);
                    break;
                case 6:
                    System.out.println("Digite o ISNB do livro desejado:");
                    ISNB = scan.nextLine();
                    a = new Livro(ISNB);
                    cadastro.remover(a);
                    break;
                case 0:
                    System.out.println("Tchau!!! Ate a proxima");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (op!=0);
    }

}