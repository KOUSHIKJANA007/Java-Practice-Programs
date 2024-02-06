/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prectice80;

/**
 *
 * @author koush
 */
public class Test {
    public static void main(String[] args) {
        Book b=new Book();
        b.setItemID(1);
        b.setTitle("free fire");
        b.setAuthor("koushik");
        
        b.setISBN("37389798357");
    
        
        System.out.printf("Book's ISBN: %s,ID: %d,TITLE: %s,AUTHOR: %s",b.getISBN(),b.getItemID(),b.getTitle(),b.getAuthor());
    }
}
