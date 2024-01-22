package OutrosTopicosJava;

public class FuncaoParaStringVetor
{
    public static void main(String[] args)
    {
        String fruits = "potato apple lemon orange";
        String [] vector;

        vector = fruits.split(" ");

        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);

    }
}
