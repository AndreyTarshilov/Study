/**
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке
массив. Массивы могут быть любой длины, в том числе нулевой. Предполагается, что вы реализуете алгоритм слияния,
имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий
массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
Пример
Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
*/
public class MergingArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length)
            result[k++] = a1[i] < a2[j] ? a1[i++] :  a2[j++];
        while (i < a1.length)
            result[k++] = a1[i++];
        while (j < a2.length)
            result[k++] = a2[j++];
        return result;
    }

    public static void main(String[] args) {
        int [] array1 = {0, 2};
        int [] array2 = {1, 3};
       // int [] b = mergeArrays(array1, array2);
        System.out.println(mergeArrays(array1, array2));
    }
}
