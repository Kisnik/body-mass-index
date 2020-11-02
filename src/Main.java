public class Main {
    public static void main(String[] args) {
        BmiService bodyIM = new BmiService();
        double index = bodyIM.calculate(173, 60);
        System.out.println(index);
    }
}
