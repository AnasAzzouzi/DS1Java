package ds;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class Lecteur extends Thread {
    private String threadname;
    private  String fileName ;
    private MyBuffer buff;
    public static String full="";
    boolean checker=true;

    public Lecteur(String threadname, String fileName, MyBuffer buff) {
        this.threadname = threadname;
        this.fileName = fileName;
        this.buff = buff;
    }
    File f = new File("fichier1.txt");
    FileReader fr;
    public void run() {

        try {
            fr= new FileReader(f);
            int n;
            String s = "";
            while ((n = fr.read()) != -1) {
                char c = (char) n;
                if (c != '?' && c != '!' && c != ',' && c != '.' && c != ';' && c != ':' && c != ' ' && n != 10) {
                    s += c;
                } else {


                    readWord(s);
                    s = "";
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private synchronized void readWord(String s)
        {


                    if(buff.getData().size()<buff.getSize()){
                        System.out.println(s);
                        buff.addWord(s);
                    }
                    else{
                        return;
                    }
            }


        }





