class ClassObject1
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.name = "Richa";
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }

    static class Student
    {
        String name;
        int age;
    }
}