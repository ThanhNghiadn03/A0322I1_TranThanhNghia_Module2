package ss11_stack_queue.BaiTap.DaoNguocPhanTu_Stack;

import java.util.List;
import java.util.Stack;

public class ReversingElement {
    public static int[] reverseInteger(int[] arrInteger, int n) {
        Stack<Integer> stackInteger;
        stackInteger = new Stack<>();
        for (int i=0 ; i<n ; i++) {
            stackInteger.push(arrInteger[i]);
        }
        for (int i=0 ; i<n ; i++) {
            arrInteger[i] = stackInteger.pop();
        }
        return arrInteger;
    }

    public static String reverseWord(String word) {
        Stack<Character> stackString;
        stackString = new Stack<>();
        for (int i = 0 ; i<word.length() ; i++) {
            stackString.push(word.charAt(i));
        }
        int size = word.length();
        word = "";
        for (int i=0 ; i<size ; i++) {
            word += stackString.pop();
        }
        return word;
    }
}
