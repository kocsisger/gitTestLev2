package hu.unideb.inf;

import hu.unideb.inf.appTools.Client;
import hu.unideb.inf.appTools.Server3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Client c = new Client();
        c.setS(new MyServer());
        c.doSg();
        //////////////////////////
        //Új sort adtam hozzá
//még egy
        ///Megint valami
        IHuman h = new Student();
        h.setName("Sanyi");
        System.out.println(h.getName());
    }
}