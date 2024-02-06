
package com.example.prectice80;

class LibraryItems {
    private long itemID;
    private String title;
    private String author;

    public long getItemID() {
        return itemID;
    }

    public void setItemID(long itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   
    
    
    public void checkout(){
        System.out.println("checkout");
    }
    public void returnitem(){
        System.out.println("itme returned");
    }

    @Override
    public String toString() {
        return "LibraryItems{" + "itemID=" + itemID + ", title=" + title + ", author=" + author + '}';
    }
    
    
}
