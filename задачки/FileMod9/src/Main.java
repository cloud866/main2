import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/denis/Документы/test");
        boolean isDir = file.isDirectory();
        System.out.println(isDir);
    }
}