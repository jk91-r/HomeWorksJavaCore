public class Course {
    private int distance;

    public Course(int distance) {
        this.distance = distance;
    }

    public void doIt( int n) {
        distance-= n;
    }

    @Override
    public String toString() {
        return "Distance to obstacle: " + distance;
    }

    public int getDistance() {
        return distance;
    }
}








