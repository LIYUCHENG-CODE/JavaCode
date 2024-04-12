package control;

public class SwitchCharShow {
    public static void main(String[] args) {
        char name = '李';
        switch (name){
            case '李':
                System.out.println("是李先生");
                break;
            case '赵', '钱', '孙':
            default:
                System.out.println("不是李先生");
        }
    }
}
