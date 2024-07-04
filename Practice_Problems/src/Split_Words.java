public class Split_Words {
    public static void main(String[] args) {
        String name="HelloJavaWorld";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
               ch= Character.toUpperCase(ch);
                System.out.println();
            }else if(Character.isLowerCase(ch)){
               ch= Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
    }
}
