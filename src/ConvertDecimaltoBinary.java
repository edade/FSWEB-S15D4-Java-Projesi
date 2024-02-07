import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ConvertDecimaltoBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(1));
        System.out.println(decimalToBinary(2));
        System.out.println(decimalToBinary(3));
        System.out.println(decimalToBinary(4));
        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinary(6));

    }
    private static LinkedList<Integer> decimalToBinary(int num) {
        Stack<Integer> reminderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();
        while(num>0){
            int reminder = num %2;
            reminderStack.push(reminder);
            num /=2;
        }
        Iterator<Integer> iterator= reminderStack.iterator();
        while (iterator.hasNext()){
            Integer binaryNum = iterator.next();
            result.push(binaryNum);
        }
        return result;
    }
}
