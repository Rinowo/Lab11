package part2File.Exercise.Exercise2;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void menu() {
        System.out.println("1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File");
        System.out.println("3. Exit");
        System.out.print("Your choice:  ");
    }

    public void writeData(Student student) {
        byte[] b = toString().getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("StudentList1.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();

        while (true) {
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    studentList.inputStudent();
                    studentList.writeFile();
                }
                case 2 -> {
                    studentList.readFile();
                    //studentList.printStudent();
                }
                case 3 -> System.exit(0);
            }
        }
    }
}
