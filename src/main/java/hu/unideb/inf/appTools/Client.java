package hu.unideb.inf.appTools;

public class Client {
    IServer s;

    public void setS(IServer s) {
        this.s = s;
    }

    public void doSg(){
        System.out.println("I'm the client and I work.");
        s.serve();
    }
}
