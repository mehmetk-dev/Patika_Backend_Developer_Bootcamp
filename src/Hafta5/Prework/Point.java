package Hafta5.Prework;

public record Point(int a,int b) {
    public Point{
        if (a == b){
            System.out.println(a + " sayısı ile " + b + " sayısı eşit");
        }
    }

}