package task2;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только
// с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
public class Program2 {
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        int[][] array2 = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        int[][] array3 = {{1,0,0,1,1},
                {1,1,0,0,0},
                {1,0,0,1,1},
                {1,0,0,1,1},
                {1,1,0,0,0}
        };
        //System.out.println(matrixSumm(array1));
        //System.out.println(matrixSumm(array2));
        System.out.println(matrixSumm(array3));


    }

    public static int matrixSumm(int[][] arrays){
        int sumArr = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays.length != arrays[i].length)
                throw new RuntimeException("Массив не квадратный: " + arrays.length + "x" + arrays[i].length);
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0 && arrays[i][j] != 1)
                    throw new RuntimeException("ячейке может лежать только значение 0 или 1");
                sumArr += arrays[i][j];
            }
        }
        return sumArr;
    }
}
