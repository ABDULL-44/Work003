public class Animal {

    String Which_Animal;
    String Name;
    String Sound;

    Animal(String Which_Animal, String Name, String Sound) {
        this.Which_Animal = Which_Animal;
        this.Name = Name;
        this.Sound = Sound;
    }

    void Eat(){}
    void Inf(){
        System.out.println("Information");
        System.out.println("Animal :- "+Which_Animal);
        System.out.println("Name :- "+Name);
        System.out.println("Sound :- "+Sound);

    }

}
