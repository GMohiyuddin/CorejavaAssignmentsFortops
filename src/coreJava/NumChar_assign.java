package coreJava;

public class NumChar_assign {
	 public void print(int n, char c) {
	        System.out.println(n + "  " + c);
	    }
	    
	    public void print(char c, int n) {
	        System.out.println(c + "  " + n);
	    }
	    


public static void main(String[] args) {
	NumChar_assign p = new NumChar_assign();
	p.print(10, 'A');
	p.print('B', 20);

}
}
