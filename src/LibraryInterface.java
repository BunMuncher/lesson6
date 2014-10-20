public class LibraryInterface {

    public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing in the Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To Be a Model", "Lisa Lahey");//setting all the books
        System.out.println("Here are the books avaliable:");
        System.out.println("-----------------------------");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);//printing all books
        Patron p = new Patron("Dardan Sagget");

        System.out.println("\nLending 4 books to " + p.getName());
        if (p.borrow(b1)) {
            System.out.println(b1.getTitle() + " successfully borrowed.");
        } else {
            System.out.println(b1.getTitle() + " could not be borrowed.");
        }
        if (p.borrow(b2)) {
            System.out.println(b2.getTitle() + " successfully borrowed.");
        } else {
            System.out.println(b2.getTitle() + " could not be borrowed.");
        }
        if (p.borrow(b3)) {
            System.out.println(b3.getTitle() + " successfully borrowed.");
        } else {
            System.out.println(b3.getTitle() + " could not be borrowed.");
        }
        if (p.borrow(b4)) {
            System.out.println(b4.getTitle() + " successfully borrowed.");
        } else {
            System.out.println(b4.getTitle() + " could not be borrowed.");
        }
    }
}
