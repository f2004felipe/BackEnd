import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jogador {
    private String nome;
    private String sobrenome;
    private String posicao;
    private int idade;
    private String clube;

    public Jogador(String nome, String sobrenome, String posicao, int idade, String clube) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.idade = idade;
        this.clube = clube;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public String getClube() {
        return clube;
    }

    public String getDescricao() {
        return String.format("%s %s é um futebolista brasileiro de %d anos que atua como %s. Atualmente defende o %s.",
                nome, sobrenome, idade, posicao, clube);
    }
}

class JogadorGerador {
    private static List<String> nomes = Arrays.asList("Neymar", "Lionel", "Cristiano", "Kylian", "Robert", "Sergio", "Luka");
    private static List<String> sobrenomes = Arrays.asList("Jr", "Messi", "Ronaldo", "Mbappe", "Lewandowski", "Aguero", "Modric");
    private static List<String> posicoes = Arrays.asList("Goleiro", "Zagueiro", "Lateral", "Volante", "Meia", "Atacante");
    private static List<String> clubes = Arrays.asList("Paris Saint-Germain", "Manchester United", "Barcelona", "Real Madrid", "Bayern Munich", "Manchester City");

    private static Jogador gerarJogadorAleatorio() {
        Random random = new Random();
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        String posicao = posicoes.get(random.nextInt(posicoes.size()));
        int idade = random.nextInt(20) + 18; // Idade entre 18 e 37
        String clube = clubes.get(random.nextInt(clubes.size()));
        return new Jogador(nome, sobrenome, posicao, idade, clube);
    }

    public static Jogador obterJogadorAleatorio() {
        return gerarJogadorAleatorio();
    }
}
