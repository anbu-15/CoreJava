import java.io.*;
class NewExcep {

    public static void main(String[] args)
            throws IOException
    {

        //// Creating a file and reading from local repository
//        //FileReader f = new FileReader("C:\\test\\a.txt");
        FileReader f = new FileReader("C:\\Users\\DIVYA\\Downloads\\Excep.txt");

        //// Reading content inside a file
        BufferedReader fi = new BufferedReader(f);

        ////  Printing first 2 lines of file "C:\Users\HP\Downloads\duplicates.txt"
        //// for (int i = 0; i < 2; i++)
        ////   System.out.println(fi.readLine());

        // // Printing all lines of file "C:\Users\HP\Downloads\duplicates.txt"

        String line;
        while ((line = fi.readLine()) != null)
            System.out.println(line);


        // // Closing all file connections
        // // using close() method
        //  // Good practice to avoid any memory leakage

        fi.close();
        f.close();

//
//                FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\duplicates.txt");
//
//                int ch;
//                while ((ch = fr.read()) != -1) {  // Reads character by character (slow for large files)
//                    System.out.print((char) ch);
//                }
//
//                fr.close();


    }
}


