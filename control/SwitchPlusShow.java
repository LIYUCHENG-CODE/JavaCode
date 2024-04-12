package control;

public class SwitchPlusShow {
    public static void main(String[] args) {
        String name = "李";
        String leave = "";
        switch(name){
            case "李" -> leave = "优";
            case "张" -> leave = "良";
            default -> leave = "未知";
        }
        System.out.printf("%s", leave);
    }
}
