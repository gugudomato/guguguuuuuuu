public class Quest4_Produto_Ecommerce {

    private int quantidadeEmEstoque;
    private String nomeProduto;
    private Double precoProduto;

    public Quest4_Produto_Ecommerce(String nome, int quantidade, double preco){

        this.nomeProduto = nome;
        this.quantidadeEmEstoque = quantidade;
        this.precoProduto = preco;

    }
    public void ComprarProduto(int quantidade){
        this.quantidadeEmEstoque -= quantidade;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public int getQuantidadeProduto(){
        if(this.quantidadeEmEstoque >=0 ) {
            return this.quantidadeEmEstoque;
        }else{
            return 0;
        }
    }

    public double getPrecoProduto(){
        return this.precoProduto;
    }
}