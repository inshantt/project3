package com.lambton;

public class Arthmetic
{
    public int add(int x, int y) {
        int c = x + y;
        return c;
    }
    public float add(float x, float y) {
        float c = x + y;
        return c;
    }
    public String add(String x, String y) {
        String c = x.concat(y);
        return c;
    }
    public String add(String x, int y) {
        String c = x.concat(String.valueOf(y));
        return c;
    }
    public String add(int x, String y) {
        String c = String.valueOf(x).concat(y);
        return c;
    } 
    public int add(int x, int y, int z) {
        int c = x + y + z;
        return c;
    }
    public float add(int x, int y, float z) {
        float c = x + y + z;
        return c;
    }
    public float add(float x, int y) {
        float c = x + y;
        return c;
    }
    public float add(float x, int y, int z) {
        float c = x + y + z;
        return c;
    }
    public String add(String x, int y, float z) {
        String c = x.concat(String.valueOf(y)).concat(String.valueOf(z));
        return c;
    }
    public double add(int x, double y) {
        double c = x + y;
        return c;
    }
    public float add(int x, float y) {
        float c = x + y;
        return c;
    }
    public static void main(String[] args) {
//        System.out.println(Arithmetic.add(53,"inshant"));
    }
}
