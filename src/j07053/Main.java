import j07053.PhuHo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            PhuHo ph = new PhuHo(i, in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()));
            System.out.println(ph);
        }
    }
}


