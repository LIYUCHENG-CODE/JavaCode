package string;
// 这是一个利用substring方法和split方法截取字符串的方法
public class StringSubstringSplitShow {

    public static void main(String[] args) {
        StringSubstringSplitShow obj = new StringSubstringSplitShow();
        obj.substringShow();
        System.out.println("-----------------------------------------------");
        obj.splitShow();
    }
    public void substringShow(){
        String s1 = "abcde";
        String s2;
        s2 = s1.substring(2,5);
        System.out.println(s2);
    }

    public void splitShow(){
        String s = "This is a add string";
        String[] stringArray;
        stringArray = s.split(" "); // 空格字符串作为分隔符
        for(String i: stringArray){
            System.out.println(i);
        }
    }
}
