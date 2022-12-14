import java.io.File;

public class Main {
    public static void main(String[] args) {
                                //указываем путь к файлу
        String folderPath = "C:/users/Professional/Desktop/обновить роутер";
        File file = new File(folderPath);
        System.out.println(getFolderSize(file));
    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length(); // возвращаем размер файла
        }

        File[] files = folder.listFiles(); // получаем список файлов в этой папке

        long sum = 0;
        for (File file : files) {
            sum += getFolderSize(file); //рекурсия
        }
        return sum;
    }

}


