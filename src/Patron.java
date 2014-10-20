public class Patron {

    String name;
    Book b1, b2, b3;

    public Patron(String n) {
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean borrow(Book b) {
        boolean canBorrow = (b1 == null || b3 == null || b2 == null);
        if (canBorrow) {
            if (b1 == null) {
                b1 = b;
            } else if (b2 == null) {
                b2 = b;
            } else if (b3 == null) {
                b3 = b;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Book b) {
        if (hasBook(b)) {
            if (b1 == b) {
                b1 = null;
            } else if (b2 == b) {
                b2 = null;
            } else if (b3 == b) {
                b3 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean hasBook(Book b) {
        if (b1 == b) {
            return true;
        } else if (b2 == b) {
            return true;
        } else if (b3 == b) {
            return true;
        } else {
            return false;
        }
    }
    public String getName(){
        return name;
    }
}
