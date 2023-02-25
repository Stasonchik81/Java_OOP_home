package classes.Other;

public class ParamWorker <T extends Number> {
    private T id;

    public String name;
    public int age;
    public int salary;

    public ParamWorker(T id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void getInfo(){
        System.out.printf("Worker %s age = %d, salary = %d", name, age, salary);
    }
}
