package netaji.it.com;

public interface Mobile {
	void call();
	void sms();
}
class Sim implements Mobile{
	public void Sim(Sim sim) {
		sim.call();
		sim.sms();
	}

	@Override
	public void call() {
          System.out.println("CALL THE SELECTED SIM :");
		
	}

	@Override
	public void sms() {
		System.out.println("SMS THE SELECTED SIM");
	}
	}
class Airtel implements Mobile{

	@Override
	public void call() {
		System.out.println("CALL THE AIRTEL SIM");
	}

	@Override
	public void sms() {

        System.out.println("SMS THE AIRTEL SIM");
	}
	
}
class Idea implements Mobile{

	@Override
	public void call() {
		System.out.println("CALL THE IDEA NETWORK");
	}

	@Override
	public void sms() {
		System.out.println("SMS THE IDEA NETWORK");
		
	}
	void mms() {
		System.out.println("MMS THE IDEA NETWORK");
	}
	
}
class Test{
	public static void main(String[] args) {
		Mobile m;
		m=new  Sim();
		m.call();
		m=new Airtel();
		m.call();
		m.sms();
		m=new Idea();
		m.call();
		m.sms();
		
		
	}
}

