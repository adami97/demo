import java.util.Stack;

/**
 * tianye t00345598对所有人说 (8:03 下午)
 * 题目描述
 * 某某公司,每天早上都有很多人去坐电梯,每个人都可能到不同的楼层.同时电梯还有一个容量限制.电梯最多只能带K个人.电梯从第a层到第b层,会花费|a-b|的时间.
 * 现在有N个人,以及知道每个人想要去的地方,请问如何坐电梯,才能使每个人到达到他们对应的楼层,且所话费时间最少.电梯最后要会到第1层.
 *
 * 解答要求
 * 时间限制：1000ms, 内存限制：100MB
 * 输入
 * 对于每个输入文件,先输入两个整数N,K.表示有N个人,以及电梯的容量K.
 * 接下来一行,有N个整数,f1, f2, … , fn. 表示每个人要到达的地方.
 * (1 <= N, K <= 2000, 1 <= fi <= 2000)
 *
 * 输出
 * 输出最小的花费时间.
 *
 * 样例
 * 输入样例 1 复制
 *
 * 3 2
 * 2 3 4
 * 输出样例 1
 *
 * 8
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 *
 * 示例 2：
 * 输入：s = "()[]{}"
 * 输出：true
 *
 * 示例 3：
 * 输入：s = "(]"
 * 输出：false
 *
 * 示例 4：
 * 输入：s = "([)]"
 * 输出：false
 *
 * 示例 5：
 * 输入：s = "{[]}"
 * 输出：true
 */

public class Solution {
    // 栈
    public boolean judge(String s){
        Stack<Character> stack=new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else{
                if(stack.peek()==c){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "([)]";
        s = "{[]}";
        s="()[]{}";
        System.out.println(solution.judge(s));
    }
}
