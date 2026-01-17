import java.util.Scanner;

class MilageReport {
    private float milesTravelled;
    private float gallonsUsed;

    public void setMilesTravelled(float milesTravelled) {
        this.milesTravelled = milesTravelled;
    }

    public void setGallonsUsed(float gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public float getMilesPerGallon() {
        return milesTravelled / gallonsUsed;
    }

    public float getMilesTravelled() {
        return milesTravelled;
    }

    public float getGallonsUsed() {
        return gallonsUsed;
    }
}

class Q11 {

    public static float rightValue(float a, Scanner sc) {
        while (a < 0) {
            System.out.print("Enter correct value: ");
            a = sc.nextFloat();
        }
        return a;
    }

    public static MilageReport readJourney(Scanner sc) {
        MilageReport report = new MilageReport();

        System.out.print("Enter the miles travelled: ");
        float miles = rightValue(sc.nextFloat(), sc);
        report.setMilesTravelled(miles);

        System.out.print("Enter the gallons used: ");
        float gallons = rightValue(sc.nextFloat(), sc);
        report.setGallonsUsed(gallons);

        System.out.println("Mileage of this journey is " + report.getMilesPerGallon());
        return report;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totalMiles = 0;
        float totalGallons = 0;

        System.out.println("Press -1 to exit or any other number to continue");
        int choice = sc.nextInt();

        while (choice != -1) {
            MilageReport journey = readJourney(sc);
            totalMiles += journey.getMilesTravelled();
            totalGallons += journey.getGallonsUsed();

            System.out.println("Press -1 to exit or any other number to continue");
            choice = sc.nextInt();
        }

        if (totalGallons > 0) {
            System.out.println("The total mileage throughout the journey is " + (totalMiles / totalGallons));
        } else {
            System.out.println("No journeys recorded.");
        }

        sc.close();
    }
}