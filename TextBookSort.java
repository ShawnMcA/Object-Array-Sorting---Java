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

import javax.swing.JOptionPane;

// Used to sort through Textbook objects
public class TextBookSort {

    // Returns which option the user would like to sort by
    private static int getUserSort(){
        int sortBy;
        do {
            sortBy = Integer.parseInt(JOptionPane.showInputDialog(
                "What would you like to sort by:\n" +
                "1. Author\n" +
                "2. Title\n" +
                "3. Page Count\n" +
                "4. ISBN\n" + 
                "5. Price"
            ));

            if(sortBy < 1 || sortBy > 5){
                JOptionPane.showMessageDialog(null, "Sorry... That is an invalid entry...");
            }
        } while(sortBy < 1 || sortBy > 5);

        return sortBy;
    }

    // Sorts TextBook objects by Author A -> Z
    private static void sortAuthor(TextBook[] books) {

        int i, j;
        TextBook temp;
        int len = books.length - 1;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(books[j].getAuthor().compareTo(books[j + 1].getAuthor()) > 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sorts TextBook objects by Title A -> Z
    private static void sortTitle(TextBook[] books) {

        int i, j;
        TextBook temp;
        int len = books.length - 1;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(books[j].getTitle().compareTo(books[j + 1].getTitle()) > 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sorts TextBook objects by Page Count low -> high 
    private static void sortPageCount(TextBook[] books) {

        int i, j;
        TextBook temp;
        int len = books.length - 1;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(books[j].getPageCount() > books[j + 1].getPageCount()){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sorts TextBook objects by ISBN low -> high 
    private static void sortISBN(TextBook[] books) {

        int i, j;
        TextBook temp;
        int len = books.length - 1;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(books[j].getISBN().compareTo(books[j + 1].getISBN()) > 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sorts TextBook objects by price low -> high 
    private static void sortPrice(TextBook[] books) {

        int i, j;
        TextBook temp;
        int len = books.length - 1;
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(books[j].getPrice() > books[j + 1].getPrice()){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    // Sorts based on user input
    private static void sortBooks(int sortType, TextBook[] books){

        switch(sortType){
            case 1:
                sortAuthor(books);
                break;
            case 2:
                sortTitle(books);
                break;
            case 3:
                sortPageCount(books);
                break;
            case 4:
                sortISBN(books);
                break;
            case 5:
                sortPrice(books);
                break;
        }
    }

    // Displays TextBook Objects
    private static void displayBooks(TextBook[] books){
        StringBuilder output = new StringBuilder();

        // Display each array element
        for (int i = 0; i < books.length; i++){
            output.append(books[i].toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }

    // Main 
    public static void main (String[] args){

        TextBook[] books = new TextBook[5]; 
        books[0] = new TextBook("Joshua Bloch", "Effective Java", 412, "0134685997", 35.49f);
        books[1] = new TextBook("Herbert Schildt", "Java: The Complete Reference", 1248, "1260440230", 38.99f);
        books[2] = new TextBook("Eric Freeman", "Head First  Design Patterns: A Brain-Friendly Guide", 694, "9780596007126", 20.97f);
        books[3] = new TextBook("Kathy Sierra", "Head First Java", 688, "0596009208", 31.60f);
        books[4] = new TextBook("Herbert Schildt", "Java: A Beginners Guide", 720, "1260440214", 20.99f);

        sortBooks(getUserSort(), books);
        displayBooks(books);
    }
}