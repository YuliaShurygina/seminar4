import java.util.Arrays;
import java.util.Stack;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь

public class seminar4 {
    public static void createStack(String str) {
        char[] breckets = {'[', ']', '{', '}', '(', ')', '<', '>'};
        
       
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            for (int j = 0; j < breckets.length; j++){
                if (breckets[j] == c){
                    st.push(c);
                }
            }
        }
        System.out.print(str);
        int i =0;
        while(i < st.size()){
            char l = st.pop();
            if (l == '{' || l == '(' || l == '[' || l == '<'){
                System.out.println("False");
            } 
            else {

            }
            ;
        }
        
        
    }
    public static void main(String [] args) {
        
        String exp =  "a+(d*3)";
        String exp1 = "[a+(1*3)";
        String exp2 = "[6+(3*3)]";
        String exp3 = "{a}[+]{(d*3)}";
        String exp4 = "<{a}+{(d*3)}>";
        String exp5 = "{a+]}{(d*3)}";
        String exp6 = "]a+(d*3)[";

       createStack(exp);
       createStack(exp1);
       createStack(exp2);
       createStack(exp3);
       createStack(exp4);
       createStack(exp5);
        
        
    }
}
