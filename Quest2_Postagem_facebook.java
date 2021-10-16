public class Quest2_Postagem_facebook {

    public static void main(String[] args){

        Quest2_Postagem amazonia = new Quest2_Postagem("Está pegando fogo na amazonia hoje", "https://www.instagram.com");

        amazonia.Curtir();
        amazonia.Curtir();
        amazonia.Curtir();
        System.out.println("Quantidade de curtidas: "+amazonia.getNumeroCurtidas());

        amazonia.Compartilhar();
        amazonia.Compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+amazonia.getNumeroCompartilhamento());

    }
}
