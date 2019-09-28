import java.io.File;
import java.io.IOException;

public class FileTest {
    // /home/mjq/桌面/file1
    public static void main(String[] args) throws IOException{
        File file = new File("/home/mjq/桌面/file1");
        if(file.exists()){
            System.out.println("yes");
        }
    }
}
