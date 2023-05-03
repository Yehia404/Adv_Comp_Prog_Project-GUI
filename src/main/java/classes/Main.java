package classes;

public class Main {
    public static void main(String[]args){
        Library Library = new Library();
        System.out.println(Person.searchBook("book3"));
        Librarian.addUserToQueue(1, "book3");
        Librarian.addUserToQueue(2, "book3");
        Librarian.addUserToQueue(3, "book3");
        Librarian.removeUserFromQueue(9, "book3");











    }
}
