import java.io.File;

public class Main {
    public static void main(String[] args) {
                                //указываем путь к файлу
        String foldrePath = "C:/users/Professional/Desktop/обновить роутер";
        File file = new File(foldrePath);
        System.out.println(getFollderSize(file));
    }

    public static long getFollderSize(File folder) {
        if (folder.isFile()) {
            return folder.length(); // возвращаем размер файла
        }

        File[] files = folder.listFiles(); // получаем список файлов в этой папке

        long sum = 0;
        for (File file : files) {
            sum += getFollderSize(file); //рекурсия
        }
        return sum;
    }

}


