package chap08.sec13;

public class ImplClass implements InterfaceC{

	//상속받은 InterfaceA에 있는 추상 메소드를 Override 해줌
	@Override
	public void methodA() {
		System.out.println("Impl_methodA");
	}

	//상속받은 InterfaceB에 있는 추상 메소드를 Override 해줌
	@Override
	public void methodB() {
		System.out.println("Impl_methodB");
	}
	
	//Interface에 있는 추상 메소드를 Override 해줌
	@Override
	public void methodC() {
		System.out.println("Impl_methodC");
	}
	
}
