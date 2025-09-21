package Library;

import java.util.Scanner;

public class Librarian {
    private static Librarian librarian;

    private Librarian() {

    }

    class UnAuthorisedException extends Exception {
        UnAuthorisedException(String msg) {
            super(msg);
        }

        @Override
        public String toString() {
            return this.getMessage();
        }
    }

    Scanner sc = new Scanner(System.in);

    Librarian getInstance() throws UnAuthorisedException {
        System.out.print("Please Enter The Password for Librarian : ");
        if (sc.nextLine().equals("admin@123")) {
            return librarian;
        } else {
            throw new UnAuthorisedException("Access Denied!");

        }

    }
    
    
    
}
