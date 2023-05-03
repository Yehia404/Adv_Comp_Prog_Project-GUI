package classes;

public class Librarian extends Person {

    Librarian(String password, String TYPE, String FIRSTNAME, String LASTNAME, String address, int cellPhone, String email){
        super(password, TYPE, FIRSTNAME, LASTNAME, address, cellPhone, email);
    }

    static public void addBook(Book book){
        Library.books.add(book);

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


}
