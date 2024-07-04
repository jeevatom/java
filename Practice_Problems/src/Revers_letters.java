public class Revers_letters{
    public static void main(String[] args) {
        String input = "Hello java is a fun programming";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String reverseWords(String input) {
     StringBuilder ans=new StringBuilder();
     String[] st=input.split(" ");
     for(String s:st){
         StringBuilder rev=new StringBuilder(s);
         rev.reverse();
         ans.append(rev).append(" ");
     }
     return ans.toString();
    }
}
