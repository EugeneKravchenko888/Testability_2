public class BmiService {
    public double calculate(int m, double h) {

        double dblResult = Math.pow(h,2);
        double result = (m / dblResult);
        return result;
    }
}