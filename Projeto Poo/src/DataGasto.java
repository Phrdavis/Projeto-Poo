public class DataGasto {
    private int dia;
    private int mes;
    private int ano;
    private String[] data = new String[100];

    public DataGasto(){}

    public String getFormData(int i){
        return this.data[i];
    }
    public void setFormData(int dia, int mes, int ano, int i){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        this.data[i] = (Integer.toString(getDia())+"/"+Integer.toString(getMes())+"/"+Integer.toString(getAno()));
    }



    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }



}
