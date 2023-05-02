import java.io.PrintStream;

public class RelatorioGastos {
    private String[] nome = new String[100];
    private String[] tipo = new String[100];
    private String[] data = new String[100];
    private double[] valor = new double[100];
    private String[] pagamento = new String[100];

    private String[] relatorio = new String[100];

    public void setRelatorio(String nome, String tipo, String data, double valor, String pagamento, int i){
        this.nome[i] = nome;
        this.tipo[i] = tipo;
        this.data[i] = data;
        this.valor[i] = valor;
        this.pagamento[i] = pagamento;
    }

    public PrintStream getRelatorio(int i){
        return (
                System.out.printf("\n%30s%15s%15s%15.2f%25s \n", this.nome[i], this.tipo[i], this.data[i], this.valor[i], this.pagamento[i])
                );
    }

}
