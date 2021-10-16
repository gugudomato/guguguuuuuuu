public class Quest4_ECommerce {
    public static void main(String[] args){

        Quest4_Produto_Ecommerce p = new Quest4_Produto_Ecommerce("Kinder-OVO", 10, 20);

        System.out.println("Produto: "+p.getNomeProduto());
        System.out.println("Preco: "+p.getPrecoProduto());

        p.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+p.getQuantidadeProduto());

        p.ComprarProduto(1);
        System.out.println("Quantidade em estoque: "+p.getQuantidadeProduto());

        p.ComprarProduto(9);
        System.out.println("Quantidade em estoque: "+p.getQuantidadeProduto());
    }
}
