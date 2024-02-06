/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fileHandler;

import java.io.FileReader;

/**
 *
 * @author koush
 */
public class ReadFromFile {
    public static void main(String[] args) {
        String filename="javacourse.txt";
        try(FileReader reader=new FileReader(filename)) {
            int read=0;
            do {                
                read=reader.read();
                System.out.print((char)read);
            } while (read !=-1);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
