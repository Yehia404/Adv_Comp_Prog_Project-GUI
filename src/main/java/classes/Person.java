package classes;

import java.util.ArrayList;

abstract public class Person {
    private int ID;

    static int personCounter = 0;
    private String password;
    private final char TYPE;
    private final String FIRSTNAME;
    private final String LASTNAME;
    private String address;
    private int cellPhone;
    private String email;
    private boolean isBlocked =false;

    // Array that contains a users Currently rented books
    ArrayList<Book> rentedBooks= new ArrayList<Book>();


    public Person(String password, String type, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email) {
        this.password = password;
        this.TYPE = type.toLowerCase().charAt(0);
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;

        this.ID = personCounter;
        personCounter++;

    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public char getTYPE() {
        return TYPE;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getAddress() {
        return address;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }


    // Method checks if a certain cook is already rented or not, if rented then adds this person to a queue array, else rents book for this user
     public void rentBook(String name) {
        int i = searchBook(name);
        if (i >= 0) {

            if (Library.books.get(i).getIsBooked()) {
                Library.books.get(i).queue.add(Library.loggedIn);
                System.out.println("You have been added to the queue!");
            } else {
                Library.books.get(i).setIsBooked(true);
                Library.books.get(i).setRentedDays();
                System.out.println("You have successfully rented the book, You have three days to return this book!");
                Library.loggedIn.rentedBooks.add(Library.books.get(i));
            }
        } else {
            System.out.println("classes.Book was not found");
        }
    }

    static public int searchBook(String name){
        for (int i = 0; i< Library.books.size(); i++){
            if (Library.books.get(i).getName().equals(name)){
                System.out.println("The book '"+ Library.books.get(i).getName()+ "' index is: "+i );
                return i;

            }
        }
        System.out.println("The book "+ name+ " was not found");
        return -1;

    }

}
