/**
 * 
 */
package service;

/**
 * @author DUCHAO
 *
 */
public class PrintImpl implements Print {

	/* (non-Javadoc)
	 * @see service.Print#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("hello world!");
	}

	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.print("A String called: "+ str+ " injected!");
	}

}
