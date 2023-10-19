package task1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3
//придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.


public class Program1 {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3};
        int [] array2 = {1, 2, 3, 4, 5, 6};

        findNumberComment(array1, 3, 6);
        findNumberComment(array2, 7, 5);
        findNumberComment(null, 3, 6);
        findNumberComment(array2, 3, 5);

    }
    public static int findNumber(int[] arr, int number, int minSize){
        if (arr == null) return  -3;
        if (arr.length < minSize) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return  i;
        }
        return  -2;
    }
    public static void findNumberComment(int[] arr, int number, int minSize){
        int result = findNumber(arr, number, minSize);
        switch (result){
            case -1:
                System.out.println("длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("искомый элемент не найден");
                break;
            case -3:
                System.out.println("вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс элемента равен: " + result);
        }
    }
}
