public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogram = 63;
        float metre = 1,74F;
        int metre = float metre;
        int index = service.calculate(metre, kilogram);

        System.out.println(index);
    }
}