/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fileHandler;

import java.io.FileWriter;

/**
 *
 * @author koush
 */
public class FileHandling {

    public static void main(String[] args) {
        String filename = "javacourse.txt";
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("This is java course by koushik");
            for(int i=0;i<10000;i++){
                fileWriter.write("*");
            }
            fileWriter.flush();
            System.out.println("File written successfully");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
