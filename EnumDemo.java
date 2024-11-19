enum Laptop{

    MACBOOK(2000),XPS,SURFACE(1500),THINKPAD(1800);

    private int price;

    private Laptop(){
        this.price=2200;
    }
    private Laptop(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo {

    public static void main(String[] args) {

        // Laptop lap=Laptop.MACBOOK;
        for(Laptop lap : Laptop.values()){
            System.out.println(lap.ordinal()+ " "+ lap + " : "+lap.getPrice());

        }

    }
}
