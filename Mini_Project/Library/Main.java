package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Menu menu = new Menu();
        while (true) {
            menu.showMainMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    boolean membermenu = true;
                    while (membermenu) {
                        menu.showMemberMenu();
                        int ch2 = sc.nextInt();
                        sc.nextLine();
                        switch (ch2) {
                            case 1:
                                library.registerMember();
                                break;
                            case 2:
                                library.getMember().getDetails();
                                break;
                            case 3:
                                library.updateMemberDetails();
                                break;
                            case 4:
                                library.removeMember();
                                break;
                            case 5:
                                membermenu = false;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean bookmenu = true;
                    while (bookmenu) {
                        menu.showBookMenu();
                        int ch = sc.nextInt();
                        sc.nextLine();
                        switch (ch) {
                            case 1:
                                library.addBook();
                                break;
                            case 2:
                                library.getBooks();
                                break;
                            case 3:
                                library.getBook().setDetails();
                                break;
                            case 4:
                                library.removeBook();
                                break;
                            case 5:
                                bookmenu = false;
                                break;
                            default:
                                break;
                        }
                    }
                case 3:
                    boolean transactionMenu = true;
                    while (transactionMenu) {
                        menu.showTransactionMenu();
                        int ch = sc.nextInt();
                        sc.nextLine();
                        switch (ch) {
                            case 1:
                                library.getMember().addBorrowedBook(library.getBook());
                                break;
                            case 2:
                                library.getMember().returnBook(library.getBook());
                                break;
                            case 3:
                                library.getMember().getBooks();
                                break;
                            case 4:
                                transactionMenu = false;
                                break;
                            default:
                                break;
                        }

                    }

                default:
                    break;
            }

        }
    }
}
