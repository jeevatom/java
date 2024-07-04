import java.util.HashMap;

public class OCC {

    public static void main(String[] args) {
        String in="jeevarajan";
        int [] arr= new int[26];
        for(int i=0;i<in.length();i++){
            char ch=in.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<in.length();i++){
            if(arr[in.charAt(i)-'a']>0)
                System.out.print(in.charAt(i)+""+arr[in.charAt(i)-'a']);
            arr[in.charAt(i)-'a']=0;
        }


    }
}
