/**
 * task1:
 * Реализовать алгоритм сортировки слиянием 
 */


 // import java.util.Arrays;
// import java.util.Random;
        
// public class Program {
//     public static void main(String[] args) {

//         System.out.println();
//         System.out.println("Начальный массив: ");
//         int[] Arr = fillArray();
//         System.out.println(Arrays.toString(Arr));
        
//         System.out.println();
//         Arr = mergeSort(Arr);
//         System.out.println("Отсортированный массив: ");
//         System.out.println(Arrays.toString(Arr));
//         System.out.println();
//     }
        
//     public static int[] fillArray() {

//         int[] arr = new int[12];
//         Random random = new Random();

//             for (int i = 0; i < arr.length; i++) {
//                 arr[i] = random.nextInt(31) - 15;
//                 }
//             return arr;
//     }
        
//     public static int[] mergeArray(int[] arr1, int[] arr2) {
//         int[] resultArray = new int[arr1.length + arr2.length];
//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while (i < arr1.length && j < arr2.length) {
//         if (arr1[i] <= arr2[j]) {
//             resultArray[k] = arr1[i];
//             i += 1;
//             k += 1;
//         } else {
//             resultArray[k] = arr2[j];
//             j += 1;
//             k += 1;
        
//             }
//         }
//         while (i < arr1.length) {

//             resultArray[k] = arr1[i];
//             i += 1;
//             k += 1;
//         }

//         while (j < arr2.length) {

//             resultArray[k] = arr2[j];
//             j += 1;
//             k += 1;
//         }
//         return resultArray;
//     }
        
//     public static int[] mergeSort(int[] array) {

//         if (array == null) {
//             return null;
//         }

//         if (array.length < 2) {

//             return array;
//         }
//         int[] leftArray = new int[array.length / 2];
//         System.arraycopy(array, 0, leftArray, 0, array.length / 2);
//         int[] rightArray = new int[(array.length - array.length / 2)];
//         System.arraycopy(array, array.length / 2, rightArray, 0, array.length - array.length / 2);
//         leftArray = mergeSort(leftArray);
//         rightArray = mergeSort(rightArray);
        
//         return mergeArray(leftArray, rightArray);
//     }
// }

/**
 * task2:
 * Удалить четные числа, из списка целых чисел
 */

// import java.util.ArrayList;
// import java.util.Random;

// public class Program {
//     public static void main(String[] args) {

//         ArrayList<Integer> list = fillList();
//         System.out.println("Начальный список: ");
//         System.out.println(list);

//         System.out.println("Обработаный список: ");
//         list = removeEven(list);
//         System.out.println(list);
//     }

//     public static ArrayList<Integer> fillList(){
   
//         Random random = new Random();
//         ArrayList<Integer> list = new ArrayList<>(10);

//         for (int i = 0; i < 10; i++){
//             int a = random.nextInt(20 + 1);
//             list.add(a); 
//         }
//         return list;
//     }

//     public static ArrayList<Integer> removeEven(ArrayList<Integer> list) {
   
//         for (int i = 0; i < list.size();){
//             if (list.get(i) % 2 == 0 && list.get(i) != 0){
//                 list.remove(i);
//             }
//             else{
//                 i++;
//             }
//         }
//         return list;
//     }
// }


/**
 * task3:
 * Найти максимальное, минимальное и среднее арифметическое, списка целых чисел.
 */


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;

// public class Program {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = fillList();
//         System.out.println(list);
        
//         System.out.println("Максимальное число: ");
//         System.out.println(Collections.max(list));
        
//         System.out.println("Минимальное число: ");
//         System.out.println(Collections.min(list));
        
//         System.out.println("Среднее арифметическое: ");
//         System.out.println(average(list));
//     }

//     public static ArrayList<Integer> fillList() {

//         Random random = new Random();
//         ArrayList<Integer> list = new ArrayList<>(10);

//         for (int i = 0; i < 10; i++) {
//             int a = random.nextInt(20 + 1);
//             list.add(a);
//         }
//         return list;
//     }

//     public static double average(ArrayList<Integer> list) {

//         double sum = 0;

//         for (int i = 0; i < list.size(); i++) {
//             sum += list.get(i);
//         }
//         return sum / list.size();
//     }
// }