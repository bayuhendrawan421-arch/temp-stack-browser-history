package com.github.affandes.kuliah.pm;

public class Main {
    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Browser History Menu ===");
            System.out.println("1. Browse Website");
            System.out.println("2. Back");
            System.out.println("3. View History");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    bh.browse(url);
                    break;
                case 2:
                    bh.back();
                    break;
                case 3:
                    bh.view();
                    break;
                case 4:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}


    }
}
