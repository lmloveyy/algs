package test;

import com.sun.org.apache.bcel.internal.generic.I2F;
import com.sun.org.apache.bcel.internal.generic.PUSH;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if (s.equals("+")) {
				ops.push(s);
			}else if (s.equals("(")) {
				
			}else if (s.equals("-")) {
				ops.push(s);
			}else if (s.equals("*")) {
				ops.push(s);
			}else if (s.equals("/")){
				ops.push(s);
			}else if (s.equals(")")) {
				double v = vals.pop();
				String op = ops.pop();
				if (op.equals("+")){
					v = vals.pop()+v;
				}else if (op.equals("-")) {
					v = vals.pop()+v;
				}else if (op.equals("*")) {
					v = vals.pop()*v;
				}else if (op.equals("/")) {
					v = vals.pop()/v;
				}
				vals.push(v);
			}
			else{
				vals.push(Double.parseDouble(s));
			}
			
		}
		StdOut.println(vals.pop());
	}

}
