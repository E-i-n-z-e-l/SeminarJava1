import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
Задание №9 (доп)
Записать в файл следующие данные:
Name Surname Age
Kate Smith 20
Paul Green 25
Mike Black 23
Работа с файлами
 */
public class TaskJava7 {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("GB_java_s01.txt", Charset.forName("UTF-8"), false)) {
            fw.write("Name\tSurname\tAge\nKate\tSmith\t20\nPaul\tGreen\t25\nMike\tBlack\t23");
            fw.flush();
        }
        catch (Exception ex) {
            System.out.println("Some error: " + ex.getMessage());
        }
    }
}
