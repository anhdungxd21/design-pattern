package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\Learn\\design-pattern\\src\\resource\\test.txt")));
            while ((c = inputStream.read()) > 0){
                System.out.print( (char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
