import java.util.Stack;

public class Paranthesis {
	public boolean validaeParanthesis(String s) {
		char[] allParanthesis = s.toCharArray();
		boolean isValid = true;
		if (allParanthesis.length % 2 != 0)
			return false;
		else {
			int left = 0, right = 0;
			for (int i = 0; i < allParanthesis.length; i++) {
				if (allParanthesis[i] == '(')
					left++;
				else if (allParanthesis[i] == ')')
					right++;
				if (right > left)
					return false;
			}
			if (left != right)
				isValid = false;
		}
		return isValid;
	}

	public boolean validateUsingStack(String s) {
		char[] allParanthesis = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < allParanthesis.length; i++) {
			if (allParanthesis[i] == '{' || allParanthesis[i] == '(' || allParanthesis[i] == '[')
				stack.push(allParanthesis[i]);
			else if ((allParanthesis[i] == '}' || allParanthesis[i] == ')' || allParanthesis[i] == ']')
					&& !stack.isEmpty()) {
				if ((stack.peek() == '(' && allParanthesis[i] == ')')
						|| (stack.peek() == '{' && allParanthesis[i] == '}')
						|| (stack.peek() == '[' && allParanthesis[i] == ']'))
					stack.pop();
			} else if (allParanthesis[i] == '}' || allParanthesis[i] == ')' || allParanthesis[i] == ']')
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Paranthesis p = new Paranthesis();

		/*String s2 = "((((((((((((    ((((((((((((((xfcgngh,jbvcctjukkmnb)))))))))))))))))))))))))))))))(((((((((((((((((((((((((()))))))))))))))))))))))))))))))))(((((((((((((((((((((((((()))))))))))))";
		String s4 = ")(";
		String s5 = "()(";
		String s6 = "()())";
		String s7 = "((((asd))))";
		
		System.out.println(p.validaeParanthesis(s2));
		System.out.println(p.validaeParanthesis(s4));
		System.out.println(p.validaeParanthesis(s5));
		System.out.println(p.validaeParanthesis(s6));
*/
		String s1 = "{([])}}";
		String s2 = "";
		String s3 = "{([])}";
		String s4 = "{{([])}";
		System.out.println(p.validateUsingStack(s1));
		System.out.println(p.validateUsingStack(s2));
		System.out.println(p.validateUsingStack(s3));
		System.out.println(p.validateUsingStack(s4));
	}

}
