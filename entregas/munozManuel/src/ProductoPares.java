import java.io.Console;

class ProductoPares {
    private static int counter;

    public static void main(String[] args) {
        Console console = System.console();

        String stringNumber = console.readLine("Dime un numero y te dare su producto de numeros pares: ");
        int productNumber = Integer.parseInt(stringNumber);
        productNumber = productCalculation(productNumber);

        console.printf("El producto de numeros pares dio: %d", productNumber);
    }
    
    private static int productCalculation(int number){
        counter = number % 2 == 0 ? number : number - 1;

        if (counter <= 2){
            return counter;
        }else{
            counter *= productCalculation(number-2);
            return counter;
        }
    }
}


