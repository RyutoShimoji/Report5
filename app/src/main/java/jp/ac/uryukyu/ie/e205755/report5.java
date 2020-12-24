package jp.ac.uryukyu.ie.e205755; 
public class report5 {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
            System.out.println(e.getMessage());
        } 

    }


}
