package part2File.Exercise.Exercise1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadWrite {

    public void readData() {
        try {
            File f = new File("ASCII.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;

            while ((i = bis.read()) != -1) {
                String content = new String();
                System.out.print((char) i);

            }
            System.out.println();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
