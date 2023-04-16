/*
Задание №5 (доп)
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
*/
import java.util.Arrays;
public class TaskJava5 {
    public static void main(String[] args) {
        String words = "Добро пожаловать на курс по Java";
        String[] arrayWords = words.split(" ");
        System.out.println(Arrays.toString(arrayWords));
        String temp = "";
        for ( int i = 0; i < arrayWords.length / 2; i++) {
            temp = arrayWords[i];
            arrayWords[i] = arrayWords[arrayWords.length - i -1];
            arrayWords[arrayWords.length - i -1] = temp;
        }
        System.out.println(Arrays.toString(arrayWords));
        for (String j: arrayWords) {
            System.out.print(j + ' ');
        }
    }


}
