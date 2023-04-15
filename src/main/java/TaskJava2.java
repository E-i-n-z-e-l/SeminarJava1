import java.util.Arrays;

/* Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
*/
public class TaskJava2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,1,1,1,0};
        System.out.println(Arrays.toString(array));
        int count = 0;
        int maxValue = count;
        for (int i:array) {
            if (i == 1) {count++;}
            else {
                if (count > maxValue) {
                    maxValue = count;
                    count = 0;
                }
            }
        }
        if (count > maxValue) maxValue = count;
        System.out.println(maxValue);
    }
}
