package src;

import java.io.*;
import java.nio.file.*;

public class ThirdTask {
    public static void writeToFile(String filename, String data) throws MyFileOperationException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            writer.write(data);
        } catch (IOException e) {
            throw new MyFileOperationException("Error: " + filename, e);
        }
    }

    public static String readFromFile(String filename) throws MyFileOperationException {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            throw new MyFileOperationException("Error: " + filename, e);
        }
    }

    public static void main(String[] args) {
        String filename = "test.txt";
        String data = "First string.\nВторая строка файла.";

        try {
            writeToFile(filename, data);
            System.out.println("Success.");

            String content = readFromFile(filename);
            System.out.println("Content:\n" + content);

        } catch (MyFileOperationException e) {
            System.err.println("Error:");
            e.printStackTrace();
        }
    }
}
