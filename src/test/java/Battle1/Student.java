package Battle1;

public class Student {

    private String name;

    private String college;

    private String course;

    private int rollno;

    private String Add;

    private int mobileNo;

    Student(String name1,String college1,String course1,int rollno1,String Add1,int mobileNo1){
        name = name1;
        college = college1;
        course = course1;
        rollno = rollno1;
        Add = Add1;
        mobileNo = mobileNo1;

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


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", rollno=" + rollno +
                ", Add='" + Add + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

    public static void main(String args[]) {
        //Student s = new Student();
        Student s1 = new Student("vrishti tawniya","oxford university","MBBS",102,"UK",965321435);
        System.out.println(s1);


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
