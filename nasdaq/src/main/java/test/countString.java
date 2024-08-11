package test;

public class countString {
    
    public static void main(String[] args) {

        //count character in a String

       String  a = "Rijo Johnson";
       long count = 0;
       char tarChar = 'o';

       for(int i=0;i<a.length();i++){
        if(a.charAt(i) == tarChar){
            count++;

        }
       }
       System.out.println(count);








        
    //     String a = "Rijo johnson";
    //     char targetChar = 'j';
    //     long count = 0;

    //     for (int i = 0; i < a.length(); i++) {
    //         if (a.charAt(i) == targetChar) {
    //             count++;
    //         }
    //     }

    //     System.out.println(count);
     }
}
