public class Quest2_Postagem {

    private String text, link;
    private int numeroCurtidas, numeroCompartilhamento;

    public Quest2_Postagem(String text, String link){

        this.text = text;
        this.link = link;

    }
    public void Curtir(){
        this.numeroCurtidas+=1;
    }
    public int getNumeroCurtidas(){
        return this.numeroCurtidas;
    }

    public void Compartilhar(){
        this.numeroCompartilhamento+=1;
    }
    public int getNumeroCompartilhamento(){
        return this.numeroCompartilhamento;
    }
}
