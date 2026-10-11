class Animal
{
    void sound()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal
{
    
    void sound()
    {
        System.out.println("Bark");
    }
}

class cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Meow");
    }
}

class Inheritance
{
    public static void main(String[] args)
    {
        Animal a1 = new Dog();
        Animal a2 = new cat();

        a1.sound();
        a2.sound();
    
    }
}