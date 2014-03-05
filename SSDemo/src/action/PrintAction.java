/**
 * 
 */
package action;

import service.Print;
import service.PrintImpl;

/**
 * @author DUCHAO
 *
 */
public class PrintAction {
	
	private Print p;
	private String message;

//	public PrintAction(){
//		p=new PrintImpl();
//	}
	public void Print1(){
		p.print();
	}
	public void Print2(){
		String str=getMessage();
		p.print(str);
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	public Print getP() {
		return p;
	}
	public void setP(Print p) {
		this.p = p;
	}
//	public static void main(String[] args){
//		PrintAction p=new PrintAction();
//		p.Print1();
//		p.Print2("print2");
//	}
}
