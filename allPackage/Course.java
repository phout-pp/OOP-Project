package allPackage;
public class Course extends Select{
    protected String Name;
    protected double Grade;

    public Course (String name,double grade){
        super(4, "Laos");
        this.Name = name;
        this.Grade = grade;
    }
}