package ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Processor extends Thread{
    private String Pname;
    private MyBuffer buff;
    private HashMap<String,Integer> wordsCounts;

    public Processor(String pname, MyBuffer buff) {
        Pname = pname;
        this.buff = buff;
        wordsCounts= new HashMap<String,Integer>();
    }

    public void run(){
        try{sleep(1000);}catch(Exception e){}
            if(buff.getData().size()>0){


            for(String elt: buff.getData()){

                System.out.println("p: "+elt);
                process(elt);
            }
                buff.getData().clear();

           try{ Thread.sleep(200);}catch(Exception e){}
}
    }
    private  synchronized void process(String s){
                if(wordsCounts.containsKey(s)){
                    wordsCounts.put(s, wordsCounts.get(s) + 1);
                    System.out.println("existing word");
                }else {
                    wordsCounts.put(s,1);
                    System.out.println("new word");

                }


            }
}







