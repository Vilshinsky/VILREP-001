package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String t = "hello Class!";
        System.out.println(t);
        String ts = ", and Students!";
        System.out.println(t + ts);
        String[] u = {"asd","Ufff","Under key one but three","ssssddd","asdsad","Under key five"};
        System.out.println(u[5]);
        System.out.println(u[3-1]);
        for (int x = 8; x < 11; x++) {
            System.out.println(x);
        }
        String[] s = {"How", "are", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
        int[] m = {10, 20, 25, 30};
        int i = 0;
        int b = 25;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
        int[] n = {10, 20, 25, 30};
        int j = 0;
        int d = 10;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
    }
}
