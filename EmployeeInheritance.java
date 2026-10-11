class Employee
{
    String name;
    double salary;


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
        System.out.println(name);
        System.out.println(salary);
        System.out.println(programmingLanguage);
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
        System.out.println(name);
        System.out.println(salary);
        System.out.println(testingTool);
    }
}
class EmployeeInheritance
{
    public static void main(String[] args) 
    {
        Employee e1 = new Developer("Richa",500000,"Java");
        Employee e2= new Tester("Richa",500000, "Selenium");
        e1.displayDetails();
        //Developer d = new Developer("Richa", 500000, "Java");
        e2.displayDetails();
        //d.showLanguage();
    }
}

