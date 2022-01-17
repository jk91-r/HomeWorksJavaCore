public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(50);
        Course course2 = new Course(50);
        Course course3 = new Course(50);
        Course course4 = new Course(50);
            System.out.println(course1);
            System.out.println(course2);
            System.out.println(course3);
            System.out.println(course4);

        Team team = new Team("Nuts");
            System.out.println(team);

        Member member1 = new Member("Gary", 10);
        Member member2 = new Member("Maria", 20);
        Member member3 = new Member("Alla", 50);
        Member member4 = new Member("Joe", 50);
            System.out.println(member1);
            System.out.println(member2);
            System.out.println(member3);
            System.out.println(member4);

        member1.showResults(course1);
            System.out.println("The Member " + member1.getNameMember() + " went " + member1.getLimitDistanceMember() + " m " + " after passing the distance to the obstacle " + course1.getDistance() + " m ");
        member2.showResults(course2);
            System.out.println("The Member " + member2.getNameMember() + " went " + member2.getLimitDistanceMember() + " m " + " after passing the distance to the obstacle " + course2.getDistance() + " m ");
        member3.showResults(course3);
            System.out.println("The Member " + member3.getNameMember() + " went " + member3.getLimitDistanceMember()  + " m "+ " after passing the distance to the obstacle " + course3.getDistance() + " m ");
        member4.showResults(course4);
            System.out.println("The Member " + member4.getNameMember() + " went " + member4.getLimitDistanceMember() + " m " + " after passing the distance to the obstacle " + course4.getDistance() + " m ");

    }
}