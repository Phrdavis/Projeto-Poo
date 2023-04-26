public class Ganhos {
    private String[] nomeGanho = new String[100];
    private String[] tipoGanho = new String[100];
    private double[] valorGanho = new double[100];

    public Ganhos(){}

    public String getNomeGanho(int i){

        return this.nomeGanho[i];
    }
    public String getTipoGanho(int i){

        return this.tipoGanho[i];
    }
    public double getValorGanho(int i){

        return this.valorGanho[i];
    }


    public void setNomeGanho(String nomeGanho, int i){
        this.nomeGanho[i] = nomeGanho;
    }
    public void setTipoGanho(String tipoGanho, int i){
        this.tipoGanho[i] = tipoGanho;
    }
    public void setValorGanho(double valorGanho, int i){
        this.valorGanho[i] = valorGanho;
    }
}
