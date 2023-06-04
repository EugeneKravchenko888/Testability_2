public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int m = 98; // Масса тела в килограммах
        int h = 187; // Рост в сантиметрах

        double index = service.calculate(m, h);
        int intValue = (int)index;
            System.out.println();
            System.out.println("Ваш индекс массы тела составляет: "+ intValue);

       }

}