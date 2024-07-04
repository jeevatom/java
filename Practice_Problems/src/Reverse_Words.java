public class Reverse_Words {
    public static void main(String[] args) {
        String str="Hello java is a fun programming",ans="";
        String [] ch=str.split(" ");
        for(int i=ch.length-1;i>=0;i--){
            ans+=ch[i]+" ";
        }
        System.out.println(ans);
    }
}