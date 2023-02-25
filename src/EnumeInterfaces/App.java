package EnumeInterfaces;

public class App {

    public static void main(String[] args) {

        Dog d = new Dog();
        talk(d);
        talk(MyPet.CAT);//Enum implementando interace
        talk(MyPet.MOUSE);//Enum implementando interace
    }

    private static void talk(Pet pet){
        System.out.println(pet.talk());
    }


}

