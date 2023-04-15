/*
Задание №3
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */
import java.util.Arrays;
public class TaskJava3 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 2, 2, 3, 2};
        int val = 3;
        int temp = nums1[0];
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if (nums1[j] == val) {
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(nums1));
    }
}
