package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

              Scanner inputdata = new Scanner(System.in);
                int npersonas = 0, i, resp;
                int tplato, pigual = 0, vplato = 0;
                double desc, propina;
                double compra = 0, tcompra = 0;
                System.out.print("Restaurante Muerte Lenta");
                System.out.println();
                System.out.print("       Menú              ");
                System.out.println();
                System.out.print("1. Hambuerguesas--$10.000");
                System.out.println();
                System.out.print("2. Perros       --$ 8.000");
                System.out.println();
                System.out.print("3. Salchipapas  --$ 6.000");
                System.out.println();
                System.out.print("4. Chorizos     --$ 7.000");
                System.out.println();
                System.out.print("Mesa para cuantos:");
                npersonas = inputdata.nextInt();
                for (i = 1; i <= npersonas; i++) {
                    System.out.print("Que plato desea la persona " + i + ": ");
                    tplato = inputdata.nextInt();
                    System.out.println();
                    if (tplato == 1) {
                        vplato = 10000;

                    } else if (tplato == 2) {
                        vplato =  8000;
                    }
                    else if (tplato == 3){
                        vplato =  6000;

                    }
                    else if (tplato == 4){
                        vplato =  7000;
                    }
                    compra = compra + vplato;
                }

                tcompra = tcompra + compra;
                System.out.println("Desea incluir propina: 1(Si) 2(No) ");
                resp = inputdata.nextInt();
                if (resp == 1){
                    propina = tcompra * 0.10;
                    tcompra = tcompra + propina;
                }
                else if(resp == 2){
                    propina = 0;
                    tcompra = tcompra + propina;
                }
                if (tcompra > 20000){
                    desc = tcompra * 0.10;
                    tcompra = tcompra - desc;
                    System.out.println("Tiene un descuento por compras superiores a $20.000 ");
                    System.out.println();
                    System.out.println("el valor del descuento es: "+ desc);
                }
                System.out.println();

                System.out.println(" El valor total de la mesa es: " + tcompra);
            }
        }




