package string;

public class StringInsertDeleteReplaceShow {
    public void insertStringShow(){
        String str = "java c";
        StringBuffer strBuffer = new StringBuffer(str);
        /*
          offset: 在字符串缓冲区中索引为offset的字符位置之前插入
          str: 要插入的字符串
          */
        strBuffer.insert(4, " python"); // 在
        System.out.println(strBuffer);
    }


    public void deleteStringShow(){
        StringBuffer stringBuffer2 = new StringBuffer("java c");
        /*
        * delete(int start_index, int end_index)
        * */
        stringBuffer2.delete(5,6);  // 将"c"删除
        System.out.println(stringBuffer2);
    }

    public void replaceStringShow(){
        StringBuffer stringBuffer3 = new StringBuffer("java c");
        /*
        * replace(int start_index, int end_index, replaceString)
        * */
        stringBuffer3.replace(5,6, "Python");  // 将c替换成Python
        System.out.println(stringBuffer3);
    }
    /*
    * 0 1 2 3 4 5    index
    * j a v a   c    value
    * */

    public static void main(String[] args) {
        StringInsertDeleteReplaceShow obj = new StringInsertDeleteReplaceShow();
        obj.insertStringShow();
        System.out.println("---------------------");
        obj.deleteStringShow();
        System.out.println("---------------------");
        obj.replaceStringShow();
    }
}
