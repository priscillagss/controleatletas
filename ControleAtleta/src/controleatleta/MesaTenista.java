package controleatleta;

import java.util.ArrayList;

public class MesaTenista extends Atleta {

    private char classificacaoDestaque; // I=Individual    E=Equipes(ou Duplas)
    private char categoria; // A=Atleta  P=ParaAtleta
    private ArrayList<Premiacao> premiacoes;
    private int idade;
    private int rating;
    private int totalJogos;
    private int totalVitoriasJogos;
    private int totalDerrotas;
    private int totalDesistencias;    
   
    public MesaTenista(String nome) {
        super(nome);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalDesistencias() {
        return totalDesistencias;
    }

    public void setTotalDesistencias(int desistencias) {
        this.totalDesistencias = desistencias;
    }

    public char getClassificacaoDestaque() {
        return classificacaoDestaque;
    }

    public void setClassificacaoDestaque(char classificacaoDestaque) {
        this.classificacaoDestaque = classificacaoDestaque;
    }

    public int getTotalJogos() {
        return totalJogos;
    }

    public void setTotalJogos(int numJogos) {
        this.totalJogos = numJogos;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTotalVitoriasJogos() {
        return totalVitoriasJogos;
    }

    public void setTotalVitoriasJogos(int vitoriasJogos) {
        this.totalVitoriasJogos = vitoriasJogos;
    }

    public String obterCategoriaIdadeNome() {
        return obterCategoriaIdadeNome(this.getCategoria(), this.getIdade());
    }

    public static String obterCategoriaIdadeNome(char categoria, int idade) {
        if (categoria == 'A') {
            return obterCategoriaIdadeNomeAtleta(idade);
        } else if (categoria == 'P') {
            return obterCategoriaIdadeNomeParaAtleta(idade);
        } else {
            return "";
        }
    }

    private static String obterCategoriaIdadeNomeAtleta(int idade) {
        if (idade <= 11) {
            return "Pré-Mirím";
        } else if (idade <= 13) {
            return "Mirím";
        } else if (idade <= 15) {
            return "Infantil";
        } else if (idade <= 18) {
            return "Juvenil";
        } else if (idade <= 21) {
            return "Juventude";
        } else if (idade <= 29) {
            return "Absoluto";
        } else if (idade <= 39) {
            return "Sênior/Lady";
        } else if (idade <= 49) {
            return "Veterano 40+";
        } else if (idade <= 59) {
            return "Veterano 50+";
        } else if (idade <= 69) {
            return "Veterano 60+";
        } else {
            return "Veterano 70+";
        }
    }

    private static String obterCategoriaIdadeNomeParaAtleta(int idade) {
         if (idade <= 11) {
            return "Classe 1";
        } else if (idade <= 13) {
            return "Classe 2";
        } else if (idade <= 15) {
            return "Classe 3";
        } else if (idade <= 18) {
            return "Classe 4";
        } else if (idade <= 21) {
            return "Classe 5";
        } else if (idade <= 29) {
            return "Classe 6";
        } else if (idade <= 39) {
            return "Classe 7";
        } else if (idade <= 49) {
            return "Classe 8";
        } else if (idade <= 59) {
            return "Classe 9";
        } else if (idade <= 69) {
            return "Classe 10";
        } else {
            return "Classe 11";
        }
    }
}
