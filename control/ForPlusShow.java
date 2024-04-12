package control;

public class ForPlusShow {
    public static void main(String[] args) {
        int[] a = {6,4,7,1};
        // 普通的for循环读取元素
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("---------------------------------");
        // 使用for循环增强读取元素
        for (int item : a){
            System.out.println(item);
        }
    }
}
