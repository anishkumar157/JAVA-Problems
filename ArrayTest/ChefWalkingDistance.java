public class FindChefWalkingDistance6 {
    public static void main(String[] args) {
        int x = 3; 
        int totalTripsInDay = 2;
        int totalWorkingDay = 5;
        int totalTripsInAWeek = totalWorkingDay * totalTripsInDay;

        int totalDistance = x * totalTripsInAWeek;

        System.out.println("Total distance traveled by Chef in a week: " + totalDistance + " kilometers");
    }
}
