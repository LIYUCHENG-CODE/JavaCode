package iostream.filecontrol;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        // 创建对象
        File f = new File("src/iostream/filecontrol/MainThreadShow.txt");
        // File f = new File("src/iostream/filecontrol", "MainThreadShow.txt");  //创建File实例的另外一种方法

        // 获得文件名
        System.out.println("文件名： " + f.getName()); // 获得文件名称
        System.out.println("文件路径： " +f.getParent()); // 获得文件路径
        System.out.println("获得文件绝对路径： " + f.getAbsolutePath()); // 获得绝对路径

        // 文件属性测试
        System.out.println("File对象所表示的文件是否存在: " + f.exists()); // 测试当前File对象所表示的文件是否存在。
        System.out.println("测试当前文件是否可写 : " + f.canWrite());  // 测试当前文件是否可写
        System.out.println("测试当前文件是否可读：" + f.canRead()); // 检查对象是否可读
        System.out.println("检查是否是文件: " + f.isFile());  // 检查是否是文件
        System.out.println("测试当前File对象是否是目录: " + f.isDirectory());  // 测试当前File对象是否是目录


        // 文件操作
        System.out.println("获取最近一次修改文件的时间(时间戳格式)： " + f.lastModified());  // 获取最近一次修改文件的时间
        System.out.println("获得文件长度，长度以字节为单位: " + f.length()); // 获得文件长度，长度以字节为单位

        // System.out.println(f.delete()); // 删除文件

    }


}
