class computer {

    public String buy(int cost) {

        if (cost >= 10)
            return "Pen";
        return "Nothing";

    }
}

public class Methods {

    public static void main(String args[]) {

        computer obj = new computer();
        System.out.println(obj.buy(11));

    }

}
