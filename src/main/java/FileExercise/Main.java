package FileExercise;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        readFromFile();
        deleteFile();

        //Creat a file in another way
        createFile2();
        readFromFile2();
    }

    public static void createFile() {
        try {
            File directory = new File("Files");
            if (!directory.exists()) {
                directory.mkdirs(); // Skapar mappen "Files" om den inte redan finns
            }

            File file = new File(directory, "example.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Hej, det här är en testfil.");
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try{
            FileReader reader = new FileReader("Files/example.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String line;

            while ((line = buffer.readLine()) != null){
                System.out.println(line);
            }
            buffer.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFile() {
        File file = new File("Files/example.txt");
        if (file.delete()) {
            System.out.println("File deleted.");
        }else {
            System.out.println("File could not be deleted.");
        }
    }

    public static void createFile2()  {
        try{
            File myFile = new File("example2.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created.: " + myFile.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readFromFile2(){
        try{
            File myFile = new File("example2.txt");
            Scanner scanner = new Scanner(myFile);
               while (scanner.hasNextLine()) {
                   String data = scanner.nextLine();
                   System.out.println(data);
               }
               scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
