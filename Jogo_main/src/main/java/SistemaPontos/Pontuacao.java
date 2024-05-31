package SistemaPontos;

import javax.swing.JOptionPane;

public final class Pontuacao {
    private static boolean cadastrado = false; //ops talvez esqueci de checar se é adm(n deve aparecer no ranking)
    private static int idJogador;
    private static int pontos;
    private static long tempoInicioQuiz;
    private static long tempoFimQuiz;
    
    public static void adicionarPontos(String dificuldade, boolean faseBonus){
        switch(dificuldade){
            case "Difícil":
                pontos += faseBonus ? 30 * 2 : 30 * 1;
                break;
            case "Médio":
                pontos += faseBonus ? 20 * 2 : 20 * 1;
                break;
            case "Fácil":
                pontos += faseBonus ? 10 * 2 : 10 * 1;
                break;
        }
    }
    
    public boolean estaCadastrado(){
        return cadastrado;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontos(){
        return pontos;
    }
    
    public void setIdJogador(int id){
        this.idJogador = id;
    }
    
    public static void setTempoInicio(long milisegundos){
        tempoInicioQuiz = milisegundos;
    }
    
    public static void setTempoFim(long milisegundos){
        tempoFimQuiz = milisegundos;
    }
    
    public static String getTempoEmString(){
        long segundosTotais = (tempoFimQuiz - tempoInicioQuiz)/1000;
        long segundosRestantes = segundosTotais%60;
        long minutos = (segundosTotais - segundosRestantes)/60;
        return String.format("%d minuto(s) e %d segundo(s)", minutos, segundosRestantes);
    }
    
    public static void exibirMensagemParabens(){
        JOptionPane.showMessageDialog(null, String.format("Parabéns!\nSUA PONTUAÇÃO FOI: %d pts\nSEU TEMPO FOI: %s", pontos, getTempoEmString()));
    }
    
    public int getIdJogador(){
        if(cadastrado){
            return idJogador;
        }else{
            System.err.println("ERRO, TENTOU PEGAR ID DE UM JOGADOR QUE CLICOU \"Jogar sem cadastro\".");
            return -1;
        }
    }
        
}
