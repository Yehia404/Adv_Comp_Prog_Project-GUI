package classes;

public class Librarian extends Person {

    public Librarian(String password, String TYPE, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email){
        super(password, TYPE, FIRSTNAME, LASTNAME, address, cellPhone, email);
    }

    static public void addBook(Book book){
        Library.books.add(book);
        System.out.println("book "+ book.getName()+ " was added to list");

    }
    static public void removeBook(String name){
        int index = searchBook(name);
        if (index >= 0){


            Library.books.remove(index);
        }else {
            System.out.println("The book '"+ name+ "' was not found");
        }

    }
    static public void addUser(Person person){

        Library.persons.add(person);
        System.out.println("person with first name "+ person.getFIRSTNAME()+ " was added to list");
    }

    static public int searchMember(int id){

        for (int i = 0; i< Library.persons.size(); i++){
            if (Library.persons.get(i).getID() == id){
                System.out.println("First name:  "+Library.persons.get(i).getFIRSTNAME()+ "\nLast name: "+Library.persons.get(i).getLASTNAME()+ "\nEmail: "+Library.persons.get(i).getEmail());
                return i;

            }
        }
        System.out.println("The person with id "+ id+ " was not found");
        return -1;


    }


    static public void removeUser(int id){            //can remove user from library or queue
        int index = searchMember(id);
        if (index >=0){
            Library.persons.remove(index);
            System.out.println("user with id: "+ id+ " is removed");
        }else {
            System.out.println("The person with id "+id+ " was not found");
        }


    } static public void addUserToQueue(int id, String name){
        int userIndex = searchMember(id);

        if (userIndex >= 0){

            Library.persons.get(userIndex).rentBook(name);
        }else {
            System.out.println("User was not found");
        }



    }

    static public void removeUserFromQueue(int id, String name){

        int bookIndex = searchBook(name);

        if (bookIndex >= 0){
            for (int i = 0; i < Library.books.get(bookIndex).queue.size(); i++){
                if (id == Library.books.get(bookIndex).queue.get(i).getID()-1){
                    Library.books.get(bookIndex).queue.remove(i);
                    System.out.println("user with id"+(id+1)+" was removed from book "+name+ " queue");
                    return;

                }
            }
            System.out.println("user was not found in queue");
        }




    }
}



