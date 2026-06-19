package org.example;

public class Main {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Main a = new Main();
        System.out.println(a.add(1,2));
    }
}