public class Tela {
    public static void main (String[]args){
        Animal tiger = new Animal(89,30,86);
        Animal lion = new Animal(86,30,89);

        tiger.attack(lion);
        tiger.info();
        
    }
}
