package string;
// 这是一个展示字符缓冲区.可变字符串的类
public class StringBufferShow {
    public static void main(String[] args) {
        StringBuffer strBuffer1 = new StringBuffer();
        System.out.println("刚创建StringBuffer对象的字符串长度" + strBuffer1.length());  // 字符串长度
        System.out.println("刚创建StringBuffer对象字符串默认缓冲区的容量" + strBuffer1.capacity());  // 字符串默认缓冲区

        System.out.println("-----------------分割线------------------------------");
        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        System.out.println("" + stringBuffer2.length());  // 有字符串对象后的字符串长度
        System.out.println("" + stringBuffer2.capacity());  // 字符缓冲区的容量
        System.out.println("----------------分割线-------------------------------");
        // 第一次扩容
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < 17; i++) {
            stringBuffer3.append(8); // 扩容17个字符
        }
        // System.out.println(stringBuffer3);
        System.out.println("第一次扩容的字符串长度： " + stringBuffer3.length());
        System.out.println("第一次扩容的字符缓冲区容量： " + stringBuffer3.capacity());
        System.out.println("----------------分割线-------------------------------");

        // 第二次扩容
        for (int i = 0; i < 18; i++) {
            stringBuffer3.append(8); // 扩容18个字符
        }
        // System.out.println(stringBuffer3);
        System.out.println("第二次扩容的字符串长度： " + stringBuffer3.length());
        System.out.println("第二次扩容的字符缓冲区容量： " + stringBuffer3.capacity());
    }
    /*out:
    *刚创建StringBuffer对象的字符串长度0
    刚创建StringBuffer对象字符串默认缓冲区的容量16
    -----------------分割线------------------------------
    5
    21
    ----------------分割线-------------------------------
    第一次扩容的字符串长度： 17
    第一次扩容的字符缓冲区容量： 34
    ----------------分割线-------------------------------
    第二次扩容的字符串长度： 35
    第二次扩容的字符缓冲区容量： 70
    * */
}
