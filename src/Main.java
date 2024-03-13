public class Main {
    public static void main(String[] args) {
        // Obtendo um jogador aleatório
        Jogador jogador = JogadorGerador.obterJogadorAleatorio();

        // Obtendo a descrição do jogador e mostrando-a
        String descricao = jogador.getDescricao();
        System.out.println(descricao);
    }
}