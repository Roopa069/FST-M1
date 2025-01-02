public class activity3 {

    // Define constants for orbital periods in Earth years
    private static final double EARTH_YEAR_SECONDS = 31557600;
    private static final double MERCURY_YEAR = 0.2408467;
    private static final double VENUS_YEAR = 0.61519726;
    private static final double MARS_YEAR = 1.8808158;
    private static final double JUPITER_YEAR = 11.862615;
    private static final double SATURN_YEAR = 29.447498;
    private static final double URANUS_YEAR = 84.016846;
    private static final double NEPTUNE_YEAR = 164.79132;

    public static double calculateAge(double seconds, double orbitalPeriod) {
        return seconds / (EARTH_YEAR_SECONDS * orbitalPeriod);
    }

    public static void main(String[] args) {
        // Example age in seconds
        double ageInSeconds = 1000000000;

        // Calculate age on different planets
        double ageOnEarth = calculateAge(ageInSeconds, 1.0);
        double ageOnMercury = calculateAge(ageInSeconds, MERCURY_YEAR);
        double ageOnVenus = calculateAge(ageInSeconds, VENUS_YEAR);
        double ageOnMars = calculateAge(ageInSeconds, MARS_YEAR);
        double ageOnJupiter = calculateAge(ageInSeconds, JUPITER_YEAR);
        double ageOnSaturn = calculateAge(ageInSeconds, SATURN_YEAR);
        double ageOnUranus = calculateAge(ageInSeconds, URANUS_YEAR);
        double ageOnNeptune = calculateAge(ageInSeconds, NEPTUNE_YEAR);

        // Print the results
        System.out.printf("Age in seconds: %.0f%n", ageInSeconds);
        System.out.printf("Age on Earth: %.2f years%n", ageOnEarth);
        System.out.printf("Age on Mercury: %.2f years%n", ageOnMercury);
        System.out.printf("Age on Venus: %.2f years%n", ageOnVenus);
        System.out.printf("Age on Mars: %.2f years%n", ageOnMars);
        System.out.printf("Age on Jupiter: %.2f years%n", ageOnJupiter);
        System.out.printf("Age on Saturn: %.2f years%n", ageOnSaturn);
        System.out.printf("Age on Uranus: %.2f years%n", ageOnUranus);
        System.out.printf("Age on Neptune: %.2f years%n", ageOnNeptune);
    }
}