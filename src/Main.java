public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int m = 108; // Масса тела в килограммах
        double h = 1.87; // Рост в сантиметрах

        double index = service.calculate(m, h);
        int intValue = (int)index;
            System.out.println();
            System.out.println("Ваш индекс массы тела составляет: "+ intValue);

       }

}