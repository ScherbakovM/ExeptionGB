import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExeptionTest {


    public static void main(String[] args) throws Exception {
        //1 java.lang.ArithmeticException
        int a = 2;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }
        //2 java.lang.Exception:
        input();
        //3 java.io.FileNotFoundException
        File qwerty = new File("./qwerty");
        try {
            Scanner sc = new Scanner(qwerty);
            System.out.println(qwerty);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String input() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
            System.out.println(s);
            if (s.equals("")) {
                throw new Exception("String can not be empty!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return reader.toString();
    }


}

