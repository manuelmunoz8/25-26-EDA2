package munozManuel;


class Main {
    
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};
        printArray(array);
        System.err.println("Insertion sort iterativo");
        System.err.println("-----------------------------------------------------------");
        InsertionSort.ordenar(array);
        System.err.println("-----------------------------------------------------------");
        System.err.println("Insertion sort recursivo");
        System.err.println("-----------------------------------------------------------");
        InsertionSort.ordenar(array, array.length, new int[1]);

        
    }

    private static void printArray(int[] array){
        for (int numero : array){
            System.out.print(numero + " ");
        }
        System.out.println("");
    }

}
