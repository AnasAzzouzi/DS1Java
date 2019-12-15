package ds;

import java.util.LinkedList;

public class MyBuffer {
    public int getSize() {
        return size;
    }

    private int size;

    public LinkedList<String> getData() {
        return data;
    }

    private LinkedList<String> data;

    public MyBuffer(int size) {
        this.size = size;
        data= new LinkedList<String>();
    }
    public void addWord(String s){
        data.add(s);

    }

}
