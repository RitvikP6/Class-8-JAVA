class Animal{
    void eat(){
        System.out.println("Eating... Animal Class");

    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("Roaring... Lion Class");
    }
}

class BabyLion extends Lion{
    void weep(){
        System.out.println("Weeping... Baby Lion Class");
    }
}

class act2{
    public static void main(String[] args)
    {
        BabyLion obj = new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}