package classes;

import java.util.ArrayList;

public class Book {
    int rentedDays;
    private final String name;
    private final String author;
    private boolean isBooked = false;

    ArrayList<Person> queue= new ArrayList<Person>();

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setRentedDays() {
        this.rentedDays = 0;
    }

    public void setIsBooked(boolean booked) {
        isBooked = booked;
    }

    // Method that blocks overdue users
    public void userBlocked(Person person){
        if (this.rentedDays > 30){
            person.setBlocked(true);}}



}
