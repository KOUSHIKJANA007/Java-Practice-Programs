package com.example.prectice88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileHandler {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String filename=sc.nextLine();
        try(FileReader reader=new FileReader(filename)) {
            int read=0;
            do {                
                read=reader.read();
                System.out.print((char)read);
            } while (read != -1);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
