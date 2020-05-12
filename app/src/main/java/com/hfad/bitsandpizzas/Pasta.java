package com.hfad.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;
    private String details;

    private Pasta(String name,int id,String details){
        this.name=name;
        this.imageResourceId=id;
        this.details=details;
    }

    public static Pasta[] pastas ={

            new Pasta("Fettucine",R.drawable.fettucine,"Fettuccine is a long, flat, ribbon-like pasta that's popular in Roman and Tuscan cuisine. Because it's a thicker pasta, fettuccine is often paired with heavier sauces, especially creamy Alfredo sauce."),
            new Pasta("Gnocchi",R.drawable.gnocchi,"Gnocchi is an Italian pasta made of cooked mashed potatoes, flour, and eggs. These soft, doughy dumplings are typically served with a savory white or red sauce."),
            new Pasta("Lasagne",R.drawable.lasagne,"Lasagna is a type of wide, flat pasta that's typically layered with sauce and cheese to form the popular casserole dish of the same name. Lasagna originated in Italy and is considered one of the oldest types of pasta in the world."),
            new Pasta("Linguine",R.drawable.linguine,"Italian for “little tongues,” linguine is elliptical in shape and about 4 millimeters in width, which is wider than spaghetti, but not as wide as fettuccine. It's traditionally served with seafood or pesto, but we love it with crispy pancetta and Brussels sprouts!"),
            new Pasta("Pappardelle",R.drawable.pappardelle,"Is it any wonder that the word pappardelle comes from the Italian “pappare,” which means “to gobble up”? This pasta comes in the form of long, broad ribbons that are the perfect canvas for rich, meaty ragù sauces."),
            new Pasta("Ravioli",R.drawable.ravioli,"Ravioli are a type of pasta featuring a filling enveloped in thin, egg-based pasta dough. Raviolis are typically square or circular and stuffed with meat, cheese, or vegetables. One of our favorite recipes features a butternut squash center."),
            new Pasta("Spaghetti Bolognese",R.drawable.spag_bol,"You know it, you love it, you can’t get enough of it. Spaghetti is a long, thin, solid, cylindrical pasta that’s easily recognizable. A staple food anywhere you go, spaghetti is so beloved in the U.S. that it has its own unofficial holiday."),
            new Pasta("Tortellini",R.drawable.tortellini,"Tortellini are ring-shaped pastas that are usually stuffed with cheese or meat. Tortellini are traditionally served in capon broth, which could explain why they make the perfect addition to a variety of soups."),
            };


    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String getDetails(){
        return details;
    }
}
