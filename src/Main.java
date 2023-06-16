public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogram = 63;
        int metre = 174;
        int index = service.calculate(metre, kilogram);

        System.out.println(index);
    }
}