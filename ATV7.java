package Atividade07;

import java.util.Scanner;

public class Produto    {

    private int codigo;
    private String descricao;
    private String nomeProd;
    private double preco;
    private int qtdInicialEstoque;
    
    public Produto(int codigo, String descricao, String nomeProd, double preco, int qtdInicialEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdInicialEstoque = qtdInicialEstoque;
        this.nomeProd = nomeProd;
    }

   
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getNomeProd(){
        return nomeProd;
    }

    public double getPreco() {
        return preco;
    }

    public int getqtdInicialEstoque() {
        return qtdInicialEstoque;
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            qtdInicialEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque do produto " + descricao);
        } else {
            System.out.println("Quantidade inválida. Nenhuma alteração feita no estoque.");
        }
    }

   
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdInicialEstoque) {
            qtdInicialEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque do produto " + descricao);
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente. Nenhuma alteração feita no estoque.");
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite o nome do produto: ");
        String nomeProd = scanner.nextLine();

        System.out.println("Digite o código do produto: " );
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a descrição do produto: " );
        String descricao = scanner.nextLine();

        System.out.println("Digite o preço do produto: R$");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto: ");
        int qtdInicialEstoque = scanner.nextInt();

        Produto produto = new Produto(codigo, descricao, nomeProd, preco, qtdInicialEstoque);

        System.out.println("-------- Informações do produto --------");

        System.out.println("Nome do produto: " + produto.getNomeProd());
        System.out.println("Codigo do produto: " + produto.getCodigo());
        System.out.println("Descrição do produto: " + produto.getDescricao());
        System.out.println("Preço do porduto: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque inicial do produto: " + produto.getqtdInicialEstoque());

        System.out.println("Digite quantos produtods você deseja adicionar no estoque: ");
        int qtdAdicionada = scanner.nextInt();
        produto.adicionarEstoque(qtdAdicionada);
        System.out.println("Quantidade de estoque após adicionar: " + produto.getqtdInicialEstoque());

        System.out.println("Digite a quantidade de estoque que foi removida: ");
        int qtdRemovida = scanner.nextInt();
        produto.removerEstoque(qtdRemovida);
        System.out.println("Quantidade de estoque apos a remoção: " + produto.getqtdInicialEstoque());

    }
}
