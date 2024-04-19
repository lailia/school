package chap08.sec9;

public class InterfaceExam1 {

	public static void main(String[] args) {
		
		InterfaceCImple impl = new InterfaceCImple();
		
		InterfaceA ia = impl;
		
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
