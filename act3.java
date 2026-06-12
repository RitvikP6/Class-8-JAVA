class Mammals{
    void mam(){
        System.out.println("Mammals... Mammals Class");
    }
}

class Lion extends Mammals{
    void roar(){
        System.out.println("Roaring... Lion Class");
    }
}

class Human extends Mammals{
    void speak(){
        System.out.println("Speaking... Human Class");
    }
}

class act3{
    public static void main(String[] args)
    {
        Lion obj = new Lion();
        obj.roar();

        Human obj1 = new Human();
        obj1.speak();
        
    }
}