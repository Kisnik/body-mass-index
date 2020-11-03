public class BmiService {
    double calculate(double height, double weight) {

        double imt = weight / (height * height / 10000);

        return imt;
    }
}
