import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] p = {
                "Arroz",
                "Feijão",
                "Macarrão",
                "Óleo de cozinha",
                "Açúcar",
                "Sal",
                "Café",
                "Leite",
                "Pão",
                "Carne",
                "Frango",
                "Peixe",
                "Ovos",
                "Tomate",
                "Cebola"
        };

       String listaProdutos = Arrays.toString(p);

        System.out.println("Bem vindo ao mercadinho da bianca \n Temos esses produtos disponíveis: \n"  + listaProdutos  );

        System.out.print("Digite o nome do produto para saber o preço: ");
        Scanner s = new Scanner(System.in);
        String produtoDigitado = s.next().toLowerCase(Locale.ROOT);

        NumberFormat real = NumberFormat.getCurrencyInstance();

        switch (produtoDigitado) {
            case "arroz":
                System.out.print(real.format(15.99) + " unidade");
                break;
            case "feijao", "feijão":
                System.out.print(real.format(10.20) + " unidade");
                break;
            case "macarrao", "macarrão":
                System.out.print(real.format(3.20) + " unidade");
                break;
            case "oleo de cozinha", "óleo de cozinha", "oleo":
                System.out.print(real.format(5.60) + " unidade");
                break;
            case "acucar", "açucar":
                System.out.print(real.format(6.50) + " unidade");
                break;
            case "sal":
                System.out.print(real.format(4) + " unidade" );
                break;
            case "cafe", "café":
                System.out.print(real.format(7.80) + " unidade");
                break;
            case "leite":
                System.out.print(real.format(3.99) + " unidade");
                break;
            case "pao", "pão":
                System.out.print(real.format(10.50) + " Kg");
                break;
            case "carne":
                System.out.print(real.format(32.30) + " Kg");
                break;
            case "frango":
                System.out.print(real.format(11.40) + " Kg");
                break;
            case "peixe":
                System.out.print(real.format(22.50) + " 500g");
                break;
            case "ovos":
                System.out.print(real.format(30) + " caixa");
                break;
            case "tomate":
                System.out.print(real.format(2.05) + " unidade");
                break;
            case "cebola":
                System.out.print(real.format(1.13) + " unidade");

        }


    }
}