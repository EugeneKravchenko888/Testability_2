public class BmiService {
    public double calculate(int m, int h) {

        double dblResult = Math.pow(h,2);
        double result = (m / dblResult) * 10000;
        return result;
    }
}