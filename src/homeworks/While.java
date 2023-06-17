package homeworks;
public class While {
    public static void main(String[] args) {
        String str = "hello";
        int lastInd = str.length() -1;
        String str2 = "";
        while(lastInd >= 0){
            char letters = str.charAt(lastInd);
            str2 = str2 + letters;
            lastInd--;
        }
        System.out.println(str2);
    }
}
