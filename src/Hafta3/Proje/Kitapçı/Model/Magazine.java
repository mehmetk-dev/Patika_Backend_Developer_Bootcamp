package Hafta3.Proje.Kitapçı.Model;

public class Magazine extends Product {


    public Magazine(String name, double price) {
        super(name, price);
    }

        @Override
        public String toString() {
            return "Magazine{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }



}
