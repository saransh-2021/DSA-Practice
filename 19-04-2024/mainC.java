interface Greater {
    boolean isgreater(Object o);    
}

class employee implements Greater {
    int salary;

    employee(int salary) {
        this.salary = salary;
    }

    public boolean isgreater(Object o) {
        employee e = (employee) o;
        if (this.salary > e.salary)
            return true;
        return false;
    }
}

class Circle implements Greater{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    
    public boolean isgreater(Object o) {
        Circle c = (Circle) o;
        if (this.radius > c.radius)
            return true;
        return false;
    }
}

public class mainC {
    public static void main(String[] args) {
        Greater e1 = new employee(1000);
        Greater e2 = new employee(2000);
        Greater e3 = new employee(3000);
        System.out.println(e1.isgreater(e2));
        System.out.println(e3.isgreater(e2));

        Circle c1 = new Circle(20);
        Circle c2 = new Circle(10);
        System.out.println("Circle Greater? "+c1.isgreater(c2));
    }
}