package day5a.EX1;

public class chaoMao implements Bird{
    private String name;

    public chaoMao() {
    }

    public chaoMao(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("liu lo.. liu lo");
    }

    @Override
    public void sleep() {
        System.out.println("haizzzz...zzz");
    }

    @Override
    public void fly() {
        System.out.println("co the bay cao....");
    }
}
