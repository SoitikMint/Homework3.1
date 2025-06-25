public class BmiService {
    /*
        double weight = 70;
        double height = 1.69;
        double square = height * height;
        double result = weight / square;

        System.out.println( "ИМТ: " + (int) result);
        */
    public int calculate(double weight, double height) {
        double square = height * height;
        double index = weight / square;
        return (int) index;
    }

}
