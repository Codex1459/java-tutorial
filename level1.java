class Level1 {

    public static void main(String[] args) {
        calculateAge();
        calculateAverage();
    }

    public static void calculateAge() {
        int currentYear = 2024;
        int dateOfBirth = 2000;
        int age = currentYear - dateOfBirth;
        System.out.println("Harry's Age: " + age);
    }

    public static void calculateAverage() {
        int physics = 95;
        int chemistry = 96;
        int maths = 94;
        int average = (physics + chemistry + maths) / 3;
        System.out.println("Average Marks: " + average);
    }
}
