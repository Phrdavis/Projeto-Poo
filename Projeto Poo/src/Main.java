//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gastos gas = new Gastos();
        Ganhos gan = new Ganhos();
        DataGanho dataGanho = new DataGanho();
        DataGasto dataGasto = new DataGasto();
        RelatorioGastos relGastos = new RelatorioGastos();
        RelatorioGanhos relGanhos = new RelatorioGanhos();
        Total total = new Total();

        String pagamento = "";

        int count_gasto = 0;
        int count_ganho = 0;

        while(true) {
            System.out.println(" ");
            System.out.println("Gestão Financeira");
            System.out.println("-----------------------");
            System.out.println("1 - Adicionar Gastos");
            System.out.println("2 - Adicionar Ganhos");
            System.out.println("3 - Relatório de Gastos");
            System.out.println("4 - Relatório de Ganhos");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - sair");
            System.out.println(" ");
            System.out.println("Selecione uma opção: ");
            int resposta = scan.nextInt();

            if (resposta == 6) {
                System.out.println("Obrigado por utilizar o programa!");
                return;
            }

            if (resposta == 1) {
                System.out.println("Insira o nome do gasto:");
                scan.nextLine();
                String nomeGasto = scan.nextLine();
                gas.setNomeGasto(nomeGasto, count_gasto);


                System.out.println("Insira o tipo do gasto:");
                String tipoGasto = scan.nextLine();
                gas.setTipoGasto(tipoGasto, count_gasto);


                System.out.println("Insira o dia: EX - 20");
                int dia = scan.nextInt();
                System.out.println("Insira o mês: EX - 04");
                int mes = scan.nextInt();
                System.out.println("Insira o ano: EX - 2023");
                int ano = scan.nextInt();

                dataGasto.setDia(dia);
                dataGasto.setMes(mes);
                dataGasto.setAno(ano);
                dataGasto.setFormData(dia,mes,ano, count_gasto);


                System.out.println("Insira o valor do gasto:");
                double valorGasto = scan.nextDouble();
                gas.setValorGasto(valorGasto, count_gasto);


                System.out.println("Insira a forma de pagamento do gasto: \n1 - PIX\n2 - Boleto \n3 - Credito");
                int pagamentoGasto = scan.nextInt();
                gas.setPagamentoGasto(pagamentoGasto, count_gasto);


                while (pagamentoGasto != 1 && pagamentoGasto != 2 && pagamentoGasto != 3) {
                    System.out.println("\n\nO valor inserido não é valido!");
                    System.out.println("Insira a forma de pagamento do gasto: \n1 - PIX\n2 - Boleto \n3 - Credito");
                    pagamentoGasto = scan.nextInt();
                }

                System.out.printf("\n\n\n\n %30s: %15s","Nome",nomeGasto);
                System.out.printf("\n %30s: %15s","Tipo",tipoGasto);
                System.out.printf("\n %30s: %15s","Data",dataGasto.getFormData(count_gasto));
                System.out.printf("\n %30s: %15.2f","Valor",valorGasto);
                System.out.printf("\n %30s: %15s\n\n\n\n","Forma de Pagamento",pagamentoGasto);

                ++count_gasto;
            } else if (resposta == 2) {
                System.out.println("Insira o nome do ganho:");
                scan.nextLine();
                String nomeGanho = scan.nextLine();
                gan.setNomeGanho(nomeGanho, count_ganho);


                System.out.println("Insira o tipo do ganho:");
                String tipoGanho = scan.nextLine();
                gan.setTipoGanho(tipoGanho, count_ganho);


                System.out.println("Insira o dia: EX - 20");
                int dia = scan.nextInt();
                System.out.println("Insira o mês: EX - 04");
                int mes = scan.nextInt();
                System.out.println("Insira o ano: EX - 2023");
                int ano = scan.nextInt();

                dataGanho.setDia(dia);
                dataGanho.setMes(mes);
                dataGanho.setAno(ano);
                dataGanho.setFormData(dia,mes,ano, count_ganho);



                System.out.println("Insira o valor do ganho:");
                double valorGanho = scan.nextDouble();
                gan.setValorGanho(valorGanho, count_ganho);



                System.out.printf("\n\n\n\n %30s: %10s","Nome",nomeGanho);
                System.out.printf("\n %30s: %10s","Tipo",tipoGanho);
                System.out.printf("\n %30s: %10s","Data",dataGanho.getFormData(count_ganho));
                System.out.printf("\n %30s: %10.2f\n\n\n\n","Valor",valorGanho);

                ++count_ganho;
            } else {
                int i;
                if (resposta == 3) {
                    System.out.printf("%30s%15s%15s%15s%25s \n", "Gastos", "Tipo", "Data", "Valor", "Forma de Pagamento");

                    for (i = 0; i < count_gasto; ++i) {
                        if (gas.getPagamentoGasto(i) == 1) {
                            pagamento = "PIX";
                        } else if (gas.getPagamentoGasto(i) == 2) {
                            pagamento = "Boleto";
                        } else if (gas.getPagamentoGasto(i) == 3) {
                            pagamento = "Crédito";
                        }
                        relGastos.setRelatorio(gas.getNomeGasto(i), gas.getTipoGasto(i), dataGasto.getFormData(i), gas.getValorGasto(i), pagamento, i);
                        relGastos.getRelatorio(i);
                    }
                } else if (resposta == 4) {
                    System.out.printf("%30s%15s%15s%15s \n", "Ganhos", "Tipo", "Data", "Valor");

                    for (i = 0; i < count_ganho; ++i) {
                        relGanhos.setRelatorio(gas.getNomeGasto(i), gas.getTipoGasto(i), dataGasto.getFormData(i), gas.getValorGasto(i), i);
                        relGanhos.getRelatorio(i);
                    }
                } else if (resposta == 5) {
                    System.out.println("\n\n\n\nEscolha qual o mês referente ao relatório: " +
                            "\n 01-Janeiro" +
                            "\n 02-Fevereiro" +
                            "\n 03-Março" +
                            "\n 04-Abril" +
                            "\n 05-Maio" +
                            "\n 06-Junho" +
                            "\n 07-Julho" +
                            "\n 08-Agosto" +
                            "\n 09-Setembro" +
                            "\n 10-Outubro" +
                            "\n 11-Novembro" +
                            "\n 12-Dezembro");
                    System.out.println("\nResposta: ");
                    scan.nextLine();
                    int mensal = scan.nextInt();

                    System.out.println("Escolha o ano referente ao relatório: EX - 2020");
                    int ano = scan.nextInt();

                    System.out.printf("%30s%15s%15s%15s%25s \n", "Gastos", "Tipo", "Data", "Valor", "Forma de Pagamento");
                    for (i = 0; i < count_gasto; ++i) {
                        if (dataGasto.getFormData(i).contains("/" + mensal + "/" + ano)) {
                            if (gas.getPagamentoGasto(i) == 1) {
                                pagamento = "PIX";
                            } else if (gas.getPagamentoGasto(i) == 2) {
                                pagamento = "Boleto";
                            } else if (gas.getPagamentoGasto(i) == 3) {
                                pagamento = "Crédito";
                            }

                            relGastos.setRelatorio(gas.getNomeGasto(i), gas.getTipoGasto(i), dataGasto.getFormData(i), gas.getValorGasto(i), pagamento, i);
                            relGastos.getRelatorio(i);
                            total.setGastos(gas.getValorGasto(i));

                        } else {
                            System.out.printf("\n%100s", "Não existe registro de Gastos nesse mês!");
                        }
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.printf("%30s%15s%15s%15s \n", "Ganhos", "Tipo", "Data", "Valor");

                    for (i = 0; i < count_ganho; ++i) {
                        if (dataGanho.getFormData(i).contains("/" + mensal + "/" + ano)) {
                            relGanhos.setRelatorio(gas.getNomeGasto(i), gas.getTipoGasto(i), dataGasto.getFormData(i), gas.getValorGasto(i), i);
                            relGanhos.getRelatorio(i);
                            total.setGanhos(gan.getValorGanho(i));

                        } else {
                            System.out.printf("\n%100s", "Não existe registro de Ganhos nesse mês!");
                        }
                    }
                    total.setTotalgg();
                    total.getTotalgg();
                }
            }
        }
    }
}
