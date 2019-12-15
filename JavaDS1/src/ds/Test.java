package ds;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        MyBuffer buff= new MyBuffer(10);
        Lecteur l= new Lecteur("helloT","hello",buff);

        Processor p= new Processor("p",buff);
        l.start();
        p.start();
        try{l.join();p.start();}catch(Exception e){}


        System.out.println(buff.getData().size());



    }
}
