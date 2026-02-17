class Level1 {

    public static void main(String[] args) {
        calculateAge();
        calculateAverage();
        kmtomiles();
        volume_of_earth();

    }

    public static void calculateAge() {
        int currentYear = 2024;
        int dateOfBirth = 2000;
        int age = currentYear - dateOfBirth;
        System.out.println("Harry's Age in 2024 is: " + age);
    }
    public static 
    public static void calculateAverage() {
        int physics = 95;
        int chemistry = 96;
        int maths = 94;
        int average = (physics + chemistry + maths) / 3;
        System.out.println("Sam\'s average mark in PCM is " + average);
    }



 public static void kmtomiles() {
    float km = 10.8f;
    float miles = km * 0.62f;

    System.out.printf("The distance %.2f km in miles is %.2f\n", km, miles);





}
    public static void volume_of_earth() {
    double radius = 6371.0; 
    double volumeInCubicKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    double volumeInCubicMiles = volumeInCubicKm * 0.239913;
    System.out.printf(
        "The volume of Earth is %.2f cubic km and %.2f cubic miles%n",
        volumeInCubicKm,
        volumeInCubicMiles
    );
            }
}