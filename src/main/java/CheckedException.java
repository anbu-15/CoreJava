import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public void readFile(String filePath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line=reader.readLine())!=null)
        {
            System.out.println(line);
        }
        reader.close();
    }
}
public class CheckedException {
    public static void main(String[] args) {
        FileReaderExample ff = new FileReaderExample();
         try {
             ff.readFile("HelloWworld.txt");
         }
         catch (IOException e)
         {
             System.out.println("error message "+e.getMessage());
//             e.printStackTrace();
             System.out.println("ended");
         }
    }
}
