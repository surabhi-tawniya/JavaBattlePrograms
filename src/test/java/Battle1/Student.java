package Battle1;

public class Student {

    private String name;

    private String college;

    private String course;

    private int rollno;

    private String Add;

    private int mobileNo;

    Student(String name,String college,String course,int rollno,String Add,int mobileNo){
        this.name = name;
        this.college = college;
        this.course = course;
        this.rollno = rollno;
        this.Add = Add;
        this.mobileNo = mobileNo;

    }

    public Student() {
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

}

class TestStudent {

    public static void main(String args[]) {
        Student s = new Student();

        s.setName("ved tawniya");
        System.out.println(s.getName());

        s.setCollege("cambridge University");
        System.out.println(s.getCollege());

        s.setCourse("Engineering");
        System.out.println(s.getCourse());

        s.setRollno(101);
        System.out.println(s.getRollno());

        s.setAdd("USA");
        System.out.println(s.getAdd());

        s.setMobileNo(936821740);
        System.out.println(s.getMobileNo());
    }
}
