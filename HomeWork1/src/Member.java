public class Member {
    private String nameMember;
    private int limitDistanceMember;


    public Member(String nameMember, int limitDistanceMember) {
        this.nameMember = nameMember;
        this.limitDistanceMember = limitDistanceMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public int getLimitDistanceMember() {
        return limitDistanceMember;
    }

    @Override
    public String toString() {
        return "Member of the team: " + nameMember + ", can go the distance: " + limitDistanceMember;
    }

    public void showResults(Course course) {
        if(course.getDistance() >= limitDistanceMember)
            course.doIt(limitDistanceMember);
        }

}

