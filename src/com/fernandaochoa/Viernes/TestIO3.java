package com.fernandaochoa.Viernes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO3 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos =
                new FileOutputStream("C:\\io.txt");
        FileOutputStream fos2 =
                new FileOutputStream("C:\\io2.txt");

        ByteArrayOutputStream baos =
                new ByteArrayOutputStream();

        baos.write(65);
        baos.writeTo(fos);
        baos.writeTo(fos2);

        baos.flush();
        baos.close();
        System.out.println("Listo");

    }
}
