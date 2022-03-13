import java.util.*;

public class NonRepChar {
    static void firstnonrep(String str){
        int [] charCount = new int[26];
        Queue<Character> q = new LinkedList<Character>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            charCount[ch - 'a']++;
            while(!q.isEmpty()){
                if(charCount[q.peek()-'a']> 1){
                    q.remove();
                }
                else{
                    System.out.print(q.peek() + " ");
                    break;
                }
                if(q.isEmpty()){
                    System.out.print(-1 + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        firstnonrep(str);
    }
}
