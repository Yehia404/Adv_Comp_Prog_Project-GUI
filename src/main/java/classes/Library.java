package classes;

import java.util.ArrayList;

public class Library {
    static ArrayList<Person> persons  = new ArrayList<Person>();
    static ArrayList<Book> books= new ArrayList<Book>();
    public Library() {
        books.add(new Book("book1","yehia"));
        books.add(new Book("book2","marwan"));
        books.add(new Book("book3","ayman"));
        books.add(new Book("book4","kassab"));
        books.add(new Book("book5","omar"));



        Librarian l0= new Librarian("ab", "Lib", "a", "a", "1", 1, "email1" );
        Librarian l1= new Librarian("aa", "Lib", "b", "b", "2", 2, "email2" );
        Librarian l4= new Librarian("ac", "Lib", "E", "e", "5", 6, "email5" );
        Librarian l3= new Librarian("ac", "Lib", "D", "d", "4", 5, "email4" );
        Librarian l2= new Librarian("ac", "Lib", "c", "c", "3", 4, "email3" );
        persons.add(l0);
        persons.add(l1);
        persons.add(l2);
        persons.add(l3);
        persons.add(l4);


        Reader R0= new Reader("ab", "Read", "a", "a", "1", 1, "email1" );
        Reader R1= new Reader("aa", "Read", "b", "b", "2", 2, "email2" );
        Reader R2= new Reader("ac", "Read", "E", "e", "5", 6, "email5" );
        Reader R3= new Reader("ac", "Read", "D", "d", "4", 5, "email4" );
        Reader R4= new Reader("ac", "Read", "c", "c", "3", 4, "email3" );
        persons.add(R0);
        persons.add(R1);
        persons.add(R2);
        persons.add(R3);
        persons.add(R4);

    }

    public char checkPassword(String email,String password){
        for (int i = 0; i< persons.size(); i++){
            if (persons.get(i).getEmail().equals(email) && persons.get(i).getPassword().equals(password)){
                System.out.println("The person was found");
                return persons.get(i).getTYPE();
            }

        }
        System.out.println("The person is not found");
        return 'n';
    }

}






