package hu.unideb.inf;

public class Student implements IHuman{
    Human h;
    int credits;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setH(Human h) {
        this.h = h;
    }

    public String getName() {
        return h.getName();
    }

    public void setName(String name) {
        this.h.setName(name);
    }
}
