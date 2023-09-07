public class FindAverage {

    public static void main(String[] args) {
        double X = 10;
        double Y = 5;
        double Z = 15;
        double res = calavg(X, Y, Z);
        System.out.println(res);
    }

    public static double calavg(double X, double Y, double Z) {
        double sum = X + Y + Z;
        double average = sum / 3;
        return average;
    }

}
