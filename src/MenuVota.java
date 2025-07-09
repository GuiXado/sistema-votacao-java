import javax.swing.*;
import java.io.*;
public class MenuVota {
    public static void main(String x[]) throws IOException{
        int n, nu;
        Vota[] vota = new Vota[20];
        VotaFuncao f = new VotaFuncao();
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇ?O"
                    + "\n1 - Carregar Seç?o/Número Eleitor"
                    + "\n2 - Classificar por Seç?o"
                    + "\n3 - Gravar Registros"
                    + "\n4 - Mostrar Indicadores"
                    + "\n9 - Finalizar"));
            switch(n){
                case 1:
                    vota = f.cadvota(vota);
                    break;
                case 2:
                    vota = f.classifica(vota);
                    break;
                case 3:
                    String a = f.grava(vota);
                    JOptionPane.showMessageDialog(null, a);
                    break;
                case 4:
                    do{
                        nu = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de Votaç?o"
                                + "\n1 ? Quantidade Eleitores por Seç?o"
                                + "\n2 - Seç?o com Maior e Menor número de Eleitores"
                                + "\n3 - Quantidade de votos por candidato"
                                + "\n4 - 10 primeiros colocadas (nro cand. e qtd votos)"
                                + "\n9 - Finalizar"));
                        switch(nu){
                            case 1:
                                f.quant(vota);
                                break;
                            case 2:
                                f.mm(vota);
                                break;
                            case 3:
                                f.votos(vota);
                                break;
                            case 4:
                                f.top(vota);
                                break;
                        }
                    }while(nu != 9);
                        }
        }while(n != 9);
    }
}
