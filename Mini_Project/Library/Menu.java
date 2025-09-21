package Library;

public class Menu {

    public void showMainMenu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Manage Members");
        System.out.println("2. Manage Books");
        System.out.println("3. Transactions");
        System.out.println("4. Reports");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void showMemberMenu() {
        System.out.println("\n---- Member Management ----");
        System.out.println("1. Register New Member");
        System.out.println("2. View Member Details");
        System.out.println("3. Update Member Info");
        System.out.println("4. Delete Member");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public void showBookMenu() {
        System.out.println("\n---- Book Management ----");
        System.out.println("1. Add New Book");
        System.out.println("2. View All Books");
        System.out.println("3. Update Book Info");
        System.out.println("4. Remove Book");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public void showTransactionMenu() {
        System.out.println("\n---- Transactions ----");
        System.out.println("1. Issue Book to Member");
        System.out.println("2. Return Book");
        System.out.println("3. View Borrowed Books by Member");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    public void showReportMenu() {
        System.out.println("\n---- Reports ----");
        System.out.println("1. View All Members");
        System.out.println("2. View All Available Books");
        System.out.println("3. View All Borrowed Books");
        System.out.println("4. Overdue Books");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }
}
