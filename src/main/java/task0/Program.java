package task0;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива
public class Program {
    public static void main(String[] args) {
        int[] array = {1, 6, 5, 7, 12};
        System.out.println(sizeArray(array, 6));

    }
    public static int sizeArray(int[] arr, int minNum){
        if (arr.length <minNum){
            return -1;
        }
        return arr.length;
    }
}
