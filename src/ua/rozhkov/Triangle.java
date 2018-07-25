package ua.rozhkov;

public class Triangle implements Comparable {

    private float a, b, c;
    private String name;

    @Override
    public int compareTo(Object o) {

        return (int) (this.square() - ((Triangle) o).square());
    }

    @Override
    public String toString() {

        return "["+this.name+"]: "+String.format("%.2f", this.square());
    }

    public void setA(float a) {

        this.a = a;
    }

    public void setB(float b) {

        this.b = b;
    }

    public void setC(float c) {

        this.c = c;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Triangle(){}

    public double square() {

        double perimetr = (this.a + this.b + this.c) / 2;

        return Math.sqrt(perimetr * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
    }
}
