package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class DollarExchangeRate
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double priceDollar, buyDollars, valueIOF;

        System.out.print("What is the dollar price?  ");
        priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought?  ");
        buyDollars = sc.nextDouble();

        valueIOF = 100 * CurrencyConverter.IOF;

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.purchasePrice(priceDollar, buyDollars));
        System.out.printf("%nIOF value: %.2f", valueIOF);

        sc.close();
    }
}