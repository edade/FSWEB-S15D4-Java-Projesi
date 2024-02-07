import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueChallenge {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }
    public static boolean checkForPalindrome(String text) {
        System.out.println("text: "+ text );
        text = text.replaceAll("[.,'!?\\-\\s]","");
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
       char[] chars = text.toCharArray();
       for(char c: chars){
           stack.push(c);
           queue.offer(c);
       }
        System.out.println(queue);
        System.out.println(stack);

        while(!queue.isEmpty()){
            Character queue1 =queue.remove();
            Character stack1 =stack.pop();
            System.out.println("removed char: " + queue1);
            System.out.println("removed char: " + stack1);
            if(queue1 !=stack1){
                return false;
            }
        }
        return true;
    }
}
