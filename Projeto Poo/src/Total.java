import java.io.PrintStream;

public class Total {
    private double gastos;
    private double ganhos;
    private double totalgg;

    public void setGastos(double gastos){
        this.gastos += gastos;
    }
    public void setGanhos(double ganhos){
        this.ganhos += ganhos;
    }

    public void setTotalgg(){
        this.totalgg = (this.ganhos - this.gastos);
    }
    public PrintStream getTotalgg(){
        return (
                System.out.printf("\n\n\n\n%30s:%15.2f-\n%30s:%15.2f+\n%30s:%15.2f", "Total Gastos", this.gastos, "Total Ganhos", this.ganhos, "Total", this.totalgg)

                );
    }

}
