// ========================================================
// 
// This program was an assignment for my Intermediate Java 
// class. The goal was to create a TextBook class which 
// stores the Author, Title, Page Count, ISBN, and Price 
// for TextBook objects. A secondary TextBook sorting class
// is created to allow the user to sort an array of objects
// based on the criterion provided by the user. 
// 
// ========================================================

// Textbooks 
public class TextBook {
    private String author;
    private String title;
    private int pageCount;
    private String ISBN;
    private float price;

    // Constructor 
    public TextBook(String auth, String ttle, int pgeCnt, String isbn, float prce){
        this.author = auth;
        this.title = ttle;
        this.pageCount = pgeCnt;
        this.ISBN = isbn;
        this.price = prce;
    }

    // Gets author
    public String getAuthor(){
        return this.author;
    }

    // Sets new author value
    public void setAuthor(String newVal){
        this.author = newVal;
    }

    // Gets title
    public String getTitle(){
        return this.title;
    }

    // Sets new title value
    public void setTitle(String newVal){
        this.title = newVal;
    }

    // Gets page count
    public int getPageCount(){
        return this.pageCount;
    }

    // Sets new page count value
    public void setPageCount(int newVal){
        this.pageCount = newVal;
    }

    // Gets ISBN 
    public String getISBN(){
        return this.ISBN;
    }

    // Sets new ISBN value
    public void setISBN(String newVal){
        this.ISBN = newVal;
    }

    // Gets price
    public float getPrice(){
        return this.price;
    }

    // Sets new price value
    public void setPrice(float newVal){
        this.price = newVal;
    }

    // Displays TextBook object information
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Author: ").append(this.author).append(" | | Title: ").append(this.title).append(" | | Page Count: ").append(
        this.pageCount).append(" pages ").append(" | |  ISBN: ").append(this.ISBN).append(" | | Price: $").append(this.price);

        return sb.toString();
    }
}