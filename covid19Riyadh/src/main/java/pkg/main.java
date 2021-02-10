package pkg;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class main {
    static app App = new app();
    static func fun = new func();

    public static void main(String[] args) throws IOException, InterruptedException, ParseException {

            fun.prepare();
            fun.logo();
            App.Corona();

    }
}
