import javax.swing.*;
import java.io.*;
public class MenuVota {
    public static void main(String x[]) throws IOException{
        int n, nu;
        Vota[] vota = new Vota[20];
        VotaFuncao f = new VotaFuncao();
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTA�?O"
                    + "\n1 - Carregar Se�?o/N�mero Eleitor"
                    + "\n2 - Classificar por Se�?o"
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
                        nu = Integer.parseInt(JOptionPane.showInputDialog("Estat�sticas de Vota�?o"
                                + "\n1 ? Quantidade Eleitores por Se�?o"
                                + "\n2 - Se�?o com Maior e Menor n�mero de Eleitores"
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
