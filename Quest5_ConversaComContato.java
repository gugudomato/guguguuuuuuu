public class Quest5_ConversaComContato {

    public static void main(String[] args){

        Quest5_contato Prof = new Quest5_contato(992232123, "Professor Breno");

        Prof.enviar_mensagem("Professor, Quando é a data da recu?");
        Prof.getVLidas();

        Prof.men_recebidas("Recu?");
        Prof.men_recebidas("Não sei");
        Prof.men_recebidas("Só a direção dirá");
        Prof.men_recebidas("Por que não fez as avaliacoes?");
        Prof.men_recebidas("Será reprovada, assim");

        Prof.getVLidas();
        Prof.mensagensNaoLidas();
        Prof.getVLidas();
    }
}
