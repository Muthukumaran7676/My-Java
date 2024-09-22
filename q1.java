import java.util.Scanner;

class Area {
    // Method to calculate the area of a square
    double square(int sideLength) {
        return sideLength * sideLength;
    }

    // Method to calculate the area of a circle
    double circle(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the square:");
        int sideLength = sc.nextInt();
        Area areaCalculator = new Area();
        double squareArea = areaCalculator.square(sideLength);
        System.out.println("Area of the square: " + squareArea);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double circleArea = areaCalculator.circle(radius);
        System.out.println("Area of the circle: " + circleArea);
        
        sc.close(); // Close the scanner to avoid resource leak
    }
}
