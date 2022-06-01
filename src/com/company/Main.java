package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String alfa = "abcdefghijklmnopqrstuvwxyz";
        try (FileWriter fileWriter = new FileWriter("Alfavit.txt")){

            for (int i = 0; i < alfa.length(); i++) {
                fileWriter.write(alfa.toUpperCase().charAt(i)+""+alfa.charAt(i)+"\n");
            }

            for (int i = 0; i <= 9; i++) {
                fileWriter.write(i+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("Alfavit.txt")){
            Scanner scanner = new Scanner(fileReader);
            int nomer = 0;
            while(scanner.hasNextLine()){
                nomer++;
                System.out.println(nomer +": "+scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}