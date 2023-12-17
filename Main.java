abstract class Hewan{
    abstract void suara();
}

class Kucing extends Hewan{
    public void suara(){
        System.out.println("Meow!");
    }
}

class Anjing extends Hewan{
    public void suara(){
        System.out.println("Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        
        System.out.println("--- Suara Kucing ---");
        kucing.suara();
        System.out.println("--- Suara Anjing ---");
        anjing.suara();
    }
}
