class Employee{
    int empid;
    String name;
    double sal;
    Employee(int empid,String name,double sal)
    {
        this.empid=empid;
        this.name=name;
        this.sal=sal;
    }
    void display()
    {
        System.out.println("empid:"+this.empid);
        System.out.println("name:"+this.name);
        System.out.println("sal:"+this.sal);
    }
}
class developer extends Employee
{
    String proglan;
    developer(int empid,String name,double sal, String proglan){
        super(empid,name,sal);
        this.proglan=proglan;
    }
    void display(){
        super.display();
        System.out.println("proglan:"+proglan);
    }
}
public class Oops {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"abi",100000);
        developer dev1=new developer(102,"prithivi",150000,"java");
        emp1.display();
        dev1.display();
    }
}
