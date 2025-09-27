package hu.unideb.inf;

public class MyServer implements hu.unideb.inf.appTools.IServer{
    @Override
    public void serve() {
        System.out.println("Hahó Pandó!");
    }
}
