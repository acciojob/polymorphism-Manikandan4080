package com.driver;

public class Main {
    public static class Product{
        public Product(){}
        public int product(int x, int y){
            return x*y;
        }
        public int product (int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.product(10, 2));
        System.out.println(p.product(10, 8, 57));
        System.out.println(p.product(50.1, 80.5));
    }

}