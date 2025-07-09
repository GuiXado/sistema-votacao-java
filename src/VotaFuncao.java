import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class VotaFuncao {
    int i;
    public Vota[] cadvota(Vota[] vota){
        Random rand = new Random();
        
        for (i = 0; i < vota.length; i++) {
            int secao = rand.nextInt(11);       // 0 a 10
            int candidato = rand.nextInt(301);  // 0 a 300
            vota[i] = new Vota(secao, candidato);
        }

        System.out.println("20 votos cadastrados aleatoriamente.");
        
        return vota;
    }
    
    public Vota[] classifica(Vota[] vota){
        for(i = 0; i < vota.length -1 ; i++){
            for(int j = 0; j < vota.length - 1 - i; j++){
                if(vota[j].numsecao < vota[j+1].numsecao){
                    Vota temp = vota[j];
                    vota[j] = vota[j+1];
                    vota[j+1] = temp;
                            
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,"Dados Classificados");
        return vota;
    }
    
    String arq = "Votacao.txt";
    public String grava(Vota[] vota)throws IOException{
        BufferedWriter escr = new BufferedWriter(new FileWriter(arq));
        for(i = 0; i < vota.length; i++){
            escr.write(/*"Número da Sec?o: " + */vota[i].numsecao + "\n");
            escr.write(/*"Número do Candidato é: " + */vota[i].numcand + "\n");
        }
        escr.close();
        
        return "arquivo gerado";
    }
    
    public void quant(Vota[] vota){
        String a = "";
        int[] contagem = new int[11];
        
        for (i = 0; i < vota.length; i++) {
            //if (vota[i] != null) {   //evita erro caso alguma posiç?o n?o tenha informaç?o
                contagem[vota[i].numsecao]++;
            //}
        }
        
        for (i = 0; i < contagem.length; i++) {
            //if (contagem[i] > 0) {    //n?o mostra seç?es com 0 votos
                a += "Seç?o " + i + ": " + contagem[i] + " voto(s)\n";
            //}
        }
        
        JOptionPane.showMessageDialog(null, a);
        
    }
    
    public void mm(Vota[] vota){
        int[] contagem = new int[11];
    
        for(i = 0; i < vota.length; i++){
            contagem[vota[i].numsecao]++;
        }
        
        int secaoMaior = 0;
        int secaoMenor = 0;
        int maior = contagem[0];
        int menor = contagem[0];

        for(i = 1; i < contagem.length; i++){
            if(contagem[i] > maior){
                maior = contagem[i];
                secaoMaior = i;
            }
            if(contagem[i] < menor){
                menor = contagem[i];
                secaoMenor = i;
            }
        }
        
        String msg = "Seç?o com maior número de eleitores: " + secaoMaior + " (" + maior + " voto(s))\n"
               + "Seç?o com menor número de eleitores: " + secaoMenor + " (" + menor + " voto(s))";
    
    
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void votos(Vota[] vota) {
    int[] votos = new int[301]; // candidatos de 0 a 300

    // Conta votos por candidato
    for (i = 0; i < vota.length; i++) {
        votos[vota[i].numcand]++;
    }

    String saida = "";
    for (i = 0; i < votos.length; i++) {
        if (votos[i] > 0) { //mostra só os candidatos com votos
            saida += "Candidato " + i + ": " + votos[i] + " voto(s)\n";
        }
    }

    JOptionPane.showMessageDialog(null, saida);
}
    
    public void top (Vota[] vota){
        int[] votos = new int[301]; 
        
        for (i = 0; i < vota.length; i++) {
            votos[vota[i].numcand]++;
        }
        
        int[][] candidatos = new int[301][2];
        for (i = 0; i < 301; i++) {
            candidatos[i][0] = i;         // Número do candidato
            candidatos[i][1] = votos[i];  // Total de votos
        }

        for (i = 0; i < candidatos.length - 1; i++) {
            for (int j = 0; j < candidatos.length - 1 - i; j++) {
                if (candidatos[j][1] < candidatos[j + 1][1]) {
                    int[] temp = candidatos[j];
                    candidatos[j] = candidatos[j + 1];
                    candidatos[j + 1] = temp;
                }
            }
        }
        
        String said = "";
        int mostrar = 0;
        for (i = 0; i < 301 && mostrar < 5; i++) {
            if (candidatos[i][1] > 0) { //mostra só os candidatos com votos
                said += "Candidato " + candidatos[i][0] + ": " + candidatos[i][1] + " voto(s)\n";
                mostrar ++;
            }
        }
        
        JOptionPane.showMessageDialog(null, said);
    }
}
