package ex2;

public class Worker {
    private String name;
    private int expYears;
    private int salary;
    private int age;

    Worker(String name, int expYears,int salary, int age){
        this.name = name;
        this.expYears = expYears;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getExpYears() {
        return this.expYears;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }
    public void setName(String name){
       this.name = name;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getBonus(int amount){
        this.salary += amount;
    }
    public void print(){
        System.out.println("The worker " + this.name + " is - " + this.age + " years old, has " + this.expYears +" years of experience, he earns " + this.salary);
    }

}
