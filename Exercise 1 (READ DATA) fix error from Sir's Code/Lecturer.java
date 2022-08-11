public class Lecturer
{
    private String name;
    private int age;
    private double salary;

    
    public Lecturer(String name, int age, double salary)
    {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }
    
    public void setName(String name) { this.name = name; }
    public void setAge (int age) { this.age = age; }
    public void setSalary(double salary) { this.salary = salary; }
    
    public String getName() { return name;}
    public int getAge() { return age;}
    public double getSalary() { return salary;}
    
    public String toString()
    {
        return this.name + ", " + this.age + ", " + this.salary;
    }
}