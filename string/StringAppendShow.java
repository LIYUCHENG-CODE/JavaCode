package string;

public class StringAppendShow {
    public static void main(String[] args) {
        StringAppendShow obj = new StringAppendShow();

        obj.stringAppend();
        obj.stringObjectAppend();
        obj.stringBooleanAppend();

    }
    public void stringAppend(){
        // 这里演示往可变字符串后面添加字符串
        // 创建一个可变字符串对象，并初始化了一个值Hello
        StringBuffer strBuffer = new StringBuffer("Hello ");
        // 向这个可变字符串对象使用append方法在字符串末尾添加一个字符串World
        strBuffer.append("World");
        // 输出这个字符串
        System.out.println(strBuffer);
    }

    public void stringObjectAppend(){
        StringBuffer strBuffer2 = new StringBuffer();
        Object obj = null;
        // 将null添加进字符串strBuffer2中
        strBuffer2.append(obj);
        // 输出null 但这个null不是Object类型，已经自动转换为String类型
        System.out.println(strBuffer2);
    }

    public void stringBooleanAppend(){
        StringBuffer strBuffer3 = new StringBuffer();
        boolean bool = false;
        // 将false添加进字符串对象中
        strBuffer3.append(bool);
        // 输出的结果false 不是boolean类型而是String类型
        System.out.println(strBuffer3);
    }
}
