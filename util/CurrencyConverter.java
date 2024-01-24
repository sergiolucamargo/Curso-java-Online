package util;

public class CurrencyConverter
{
    public static final double IOF = 0.06; // IOF valor de 6%
    public static double purchasePrice(double price, double value)
    {
        return (price * value) * (1+IOF);
    }

}
