public class Gastos {
    private String[] nomeGasto = new String[100];
    private String[] tipoGasto= new String[100];
    private double[] valorGasto= new double[100];
    private int[] pagamentoGasto= new int[100];

    public Gastos(){}

    public String getNomeGasto(int i){

        return this.nomeGasto[i];
    }
    public String getTipoGasto(int i){

        return this.tipoGasto[i];
    }
    public double getValorGasto(int i){

        return this.valorGasto[i];
    }
    public int getPagamentoGasto(int i){

        return this.pagamentoGasto[i];
    }


    public void setNomeGasto(String nomeGasto, int i){

        this.nomeGasto[i] = nomeGasto;
    }
    public void setTipoGasto(String tipoGasto, int i){

        this.tipoGasto[i] = tipoGasto;
    }
    public void setValorGasto(double valorGasto, int i){

        this.valorGasto[i] = valorGasto;
    }
    public void setPagamentoGasto(int pagamentoGasto, int i){
        this.pagamentoGasto[i] = pagamentoGasto;
    }


}