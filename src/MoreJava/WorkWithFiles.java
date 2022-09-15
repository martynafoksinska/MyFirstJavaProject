package MoreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {
        File ourFile = new File("our_file.txt");
        try {
//            boolean created = ourFile.createNewFile();
//            if (created) {
//                System.out.println("File was created");
//            } else {
//                System.out.println("File was not created");
//            }
            FileWriter writer = new FileWriter("our_file1.txt");
            writer.write("Hello Martyna!");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File("our_file1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File name: " + file.getName());
        System.out.println("Path name: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length());

        file.delete();
    }
}
