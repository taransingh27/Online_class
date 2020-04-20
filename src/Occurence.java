import java.util.Scanner;

public class Occurence {
        // Returns number of times x occurs in arr[0..n-1]
        public static int[] occurences(int [] array ,int number){
            int [] out =new int[array.length];
            for(int a=0; a<array.length; a++){
                if(array[a]==number){
                    out[a]=a;
                }
            }
            return out;
        }
        public static void main(String args[])
        {   int [] myArray= {2,5,6,4,1,2,6,7,1,3,4};
            int num=4; //let
            int [] occur=occurences(myArray,num);
            System.out.print("Occurence of : "+num + " --> ");
            for(int a : occur){
                if(a!=0){System.out.print(a+" ");}
            }
        }
    }
