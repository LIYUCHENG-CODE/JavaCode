package string;

public class StringStartEndShow {
    public static void main(String[] args) {
        String[] s = {"a.java", "b.java","c.xlsx","d.java"};
        int javaDocCount = 0;
        for(String doc:s){
            if (doc.endsWith("java")){
                javaDocCount++;
            }
        }
        System.out.println(javaDocCount);
    }
}
