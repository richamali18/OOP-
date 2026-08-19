abstract class Employee
{
    private String name;
    private double salary;


    Employee(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }


    void displayDetails()
    {
        System.out.println(name);
        System.out.println(salary);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(double salary)
    {
        if(salary > 0)
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("Invalid salary");
        }   
    }   
    public double getSalary()
    {
        return salary;
    }

    abstract void work();
}

class Developer extends Employee
{
    String programmingLanguage;
  
    Developer(String name, double salary, String programmingLanguage)
    {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showLanguage()
    {
        System.out.println(programmingLanguage);
    }

    @Override
    void displayDetails()
    {
        System.out.println(getName());
        System.out.println(getSalary());
        System.out.println(programmingLanguage);
    }
    @Override
    void work()
    {
        System.out.println("Developer writes code");
    }

}
class Tester extends Employee
{
    String testingTool;


    Tester(String name,double salary,String testingTool)
    {
        super(name, salary);
        this.testingTool = testingTool;
    }
    @Override
    void displayDetails()
    {
        System.out.println(getName());
        System.out.println(getSalary());
        System.out.println(testingTool);
    }
    @Override
    void work()
    {
        System.out.println("Tester tests software");
    }

}
class EmpOOP
{
    public static void main(String[] args) 
    {
        Employee e1 = new Developer("Richa",500000,"Java");
        Employee e2= new Tester("Richa",500000, "Selenium");
        e1.displayDetails();
        //Developer d = new Developer("Richa", 500000, "Java");
        e2.displayDetails();
        //d.showLanguage();

        System.out.println("Changing salary...");

        e1.setSalary(550000);

        System.out.println("New salary: " + e1.getSalary());

        e1.setSalary(-10000);

        System.out.println("Salary after invalid value: " + e1.getSalary());

        e1.work();
        e2.work();
    }

}

