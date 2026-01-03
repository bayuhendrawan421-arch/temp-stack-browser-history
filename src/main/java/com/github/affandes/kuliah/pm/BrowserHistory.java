package com.github.affandes.kuliah.pm;

import java.util.Stack;

public class BrowserHistory {

    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = null;
    }

    // Buka halaman baru
    public void browse(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Membuka halaman: " + currentPage);
    }

    // Kembali ke halaman sebelumnya
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Tidak ada halaman sebelumnya.");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Kembali ke: " + currentPage);
    }

    // Maju ke halaman berikutnya
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Tidak ada halaman selanjutnya.");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Maju ke: " + currentPage);
    }

    // Tampilkan kondisi browser
    public void view() {
        System.out.println("\n=== STATUS BROWSER ===");
        System.out.println("Halaman saat ini : " +
                (currentPage == null ? "-" : currentPage));

        System.out.println("Back Stack       : " + backStack);
        System.out.println("Forward Stack    : " + forwardStack);
        System.out.println("=====================\n");
    }
}
