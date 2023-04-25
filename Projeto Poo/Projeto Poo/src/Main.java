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
        String[] nomeGastoList = new String[100];
        String[] tipoGastoList = new String[100];
        String[] dataGastoList = new String[100];
        double[] valorGastoList = new double[100];
        int[] pagamentoGastoList = new int[100];
        String pagamento = "";
        String[] nomeGanhoList = new String[100];
        String[] tipoGanhoList = new String[100];
        String[] dataGanhoList = new String[100];
        double[] valorGanhoList = new double[100];
        int count_gasto = 0;
        int count_ganho = 0;

        while(true) {
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
                System.out.println("Selecione uma opção!");
                int resposta = scan.nextInt();
                if (resposta == 6) {
                    System.out.println("Obrigado por utilizar o programa!");
                    return;
                }

                if (resposta == 1) {
                    System.out.println("Insira o nome do gasto:");
                    nomeGastoList[count_gasto] = scan.nextLine();
                    nomeGastoList[count_gasto] = scan.nextLine();
                    System.out.println("Insira o tipo do gasto:");
                    tipoGastoList[count_gasto] = scan.nextLine();
                    System.out.println("Insira a data do gasto: EX - 20/04/2023");
                    dataGastoList[count_gasto] = scan.nextLine();
                    System.out.println("Insira o valor do gasto:");
                    valorGastoList[count_gasto] = scan.nextDouble();
                    System.out.println("Insira a forma de pagamento do gasto: \n1 - PIX\n2 - Boleto \n3 - Credito");

                    for(pagamentoGastoList[count_gasto] = scan.nextInt(); pagamentoGastoList[count_gasto] != 1 && pagamentoGastoList[count_gasto] != 2 && pagamentoGastoList[count_gasto] != 3; pagamentoGastoList[count_gasto] = scan.nextInt()) {
                        System.out.println("O valor inserido não é valido!");
                        System.out.println("Insira a forma de pagamento do gasto: \n1 - PIX\n2 - Boleto \n3 - Credito");
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(nomeGastoList[count_gasto]);
                    System.out.println(tipoGastoList[count_gasto]);
                    System.out.println(dataGastoList[count_gasto]);
                    System.out.println(valorGastoList[count_gasto]);
                    System.out.println(pagamentoGastoList[count_gasto]);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    ++count_gasto;
                } else if (resposta == 2) {
                    System.out.println("Insira o nome do ganho:");
                    nomeGanhoList[count_ganho] = scan.nextLine();
                    nomeGanhoList[count_ganho] = scan.nextLine();
                    System.out.println("Insira o tipo do ganho:");
                    tipoGanhoList[count_ganho] = scan.nextLine();
                    System.out.println("Insira a data do ganho: EX - 20/04/2023");
                    dataGanhoList[count_ganho] = scan.nextLine();
                    System.out.println("Insira o valor do ganho:");
                    valorGanhoList[count_ganho] = scan.nextDouble();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(nomeGanhoList[count_ganho]);
                    System.out.println(tipoGanhoList[count_ganho]);
                    System.out.println(dataGanhoList[count_ganho]);
                    System.out.println(valorGanhoList[count_ganho]);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    ++count_ganho;
                } else {
                    int mes;
                    if (resposta == 3) {
                        System.out.printf("%30s%15s%15s%15s%25s \n", "Gastos", "Tipo", "Data", "Valor", "Forma de Pagamento");

                        for(mes = 0; mes < count_gasto; ++mes) {
                            if (pagamentoGastoList[mes] == 1) {
                                pagamento = "PIX";
                            } else if (pagamentoGastoList[mes] == 2) {
                                pagamento = "Boleto";
                            } else if (pagamentoGastoList[mes] == 3) {
                                pagamento = "Crédito";
                            }

                            System.out.printf("%30s%15s%15s%15.2f%25s \n", nomeGastoList[mes], tipoGastoList[mes], dataGastoList[mes], valorGastoList[mes], pagamento);
                        }
                    } else if (resposta == 4) {
                        System.out.printf("%30s%15s%15s%15s \n", "Ganhos", "Tipo", "Data", "Valor");

                        for(mes = 0; mes < count_ganho; ++mes) {
                            System.out.printf("%30s%15s%15s%15.2f \n", nomeGanhoList[mes], tipoGanhoList[mes], dataGanhoList[mes], valorGanhoList[mes]);
                        }
                    } else if (resposta == 5) {
                        System.out.println("Escolha qual o mês referente ao relatório: " +
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
                        System.out.print("Resposta: ");
                        scan.nextLine();
                        String mensal = scan.nextLine();

                        System.out.println("Escolha o ano referente ao relatório: EX - 2020");
                        int ano = scan.nextInt();

                        System.out.printf("%30s%15s%15s%15s%25s \n", "Gastos", "Tipo", "Data", "Valor", "Forma de Pagamento");
                        for(int i = 0; i < count_gasto; ++i) {
                            if (dataGastoList[i].contains("/" + mensal + "/" + ano)) {
                                if (pagamentoGastoList[i] == 1) {
                                    pagamento = "PIX";
                                } else if (pagamentoGastoList[i] == 2) {
                                    pagamento = "Boleto";
                                } else if (pagamentoGastoList[i] == 3) {
                                    pagamento = "Crédito";
                                }

                                System.out.printf("%30s%15s%15s%15.2f%25s \n", nomeGastoList[i], tipoGastoList[i], dataGastoList[i], valorGastoList[i], pagamento);
                            }else {
                                System.out.printf("%30s", "Não existe registro de Gastos nesse mês!");
                            }
                        }

                        System.out.println("");
                        System.out.println("");
                        System.out.printf("%30s%15s%15s%15s \n", "Ganhos", "Tipo", "Data", "Valor");

                        for(int i = 0; i < count_ganho; ++i) {
                            if (dataGanhoList[i].contains("/" + mensal + "/" + ano)) {
                                System.out.printf("%30s%15s%15s%25.2f  \n", nomeGanhoList[i], tipoGanhoList[i], dataGanhoList[i], valorGanhoList[i]);
                            }else {
                                System.out.printf("%30s", "Não existe registro de Ganhos nesse mês!");
                            }
                        }
                    }
                }
            }
        }
    }
}
