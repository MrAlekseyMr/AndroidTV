package com.example.AndroidTV;

public class Item {
    String DenNedeli;

    String Para1;
    int Photo1;

    String Para2;
    int Photo2;

    String Para3;
    int Photo3;

    String Para4;
    int Photo4;

    String Para5;
    int Photo5;

    public Item(String denNedeli, String para1, int photo1, String para2, int photo2, String para3, int photo3, String para4, int photo4, String para5, int photo5) {
        DenNedeli = denNedeli;
        Para1 = para1;
        Photo1 = photo1;
        Para2 = para2;
        Photo2 = photo2;
        Para3 = para3;
        Photo3 = photo3;
        Para4 = para4;
        Photo4 = photo4;
        Para5 = para5;
        Photo5 = photo5;
    }

    public String getDenNedeli() {
        return DenNedeli;
    }
}
