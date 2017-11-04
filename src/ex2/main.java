package ex2;

public class main {
    public static void main(String[] args) {
    Worker workers[] = new Worker[3];
    int topSalary;
    int workerIndex = 0;
    workers[0] = new Worker("Max",5,5000,27);
    workers[1] = new Worker("Eddie",6,1000,24);
    workers[2] = new Worker("Bill",30,9000,65);
    topSalary = workers[0].getSalary();
        for (int i = 0; i <workers.length ; i++) {
            if(workers[i].getSalary()>topSalary) {
                workerIndex = i;
                topSalary = workers[i].getSalary();
            }
        }
        System.out.println("the worker with the highest salary is");
     workers[workerIndex].print();
     workers[workerIndex].getBonus(500);
        System.out.println("worker " + workers[workerIndex].getName() + " new salary is " + workers[workerIndex].getSalary());
        
    }

}
