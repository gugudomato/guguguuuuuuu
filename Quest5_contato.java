public class Quest5_contato {

    private int numero, recebidas, VLidas, envi;
    private String nomeContato;

    String[] mensagensNlidas = new String[1000]; String[] mensagem_enviada = new String[1000];

    public Quest5_contato(int numero, String nome){
        this.nomeContato = nome;
        this.numero = numero;
    }

    public void enviar_mensagem (String mensagem){
        this.mensagem_enviada[envi] = mensagem;
        this.envi++;
    }

    public void men_recebidas(String qual){
        this.mensagensNlidas[this.recebidas] = qual;
        this.recebidas++;
    }

    public void getVLidas() {
        System.out.println("Quantidade de mensagens não lidas: " + this.recebidas);
    }

    public void mensagensNaoLidas(){
        System.out.println("Mensagens que não foram lidas: ");
        while(this.recebidas > 0){
            System.out.println(this.mensagensNlidas[this.VLidas]);
            this.VLidas++;
            this.recebidas --;
        }
    }
}