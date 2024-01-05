package bicycle;


// static 브랜드, 부품 개수, 최대 속력, 최대 하중

// int distance, int str, int flat, 
//
public class Bicycle{
//	 1. 필드 선언
//	 ==========================================
//	 ==========================================
	private String brand;
	private boolean assembly; // bicycle이 조립과 고장을 확인하는 변수
	private boolean broken;
	private Person owner;
	private BrakeLever bkl;
	private Frame frm;
	private Gear gear;
	private Handle handle;
	private Pedal pedal;
	private Saddle sad;
	public WheelSet wheel;

//	 2. 생성자
//	 ==========================================
//	 ==========================================

	//(1) 이 인자를 통해 전달받은 부품객체들을
	//(2) Bicycle 객체의 부품필드들과 연결시킵니다.
	//(3) 이때 Person의 래퍼런스도 인자로 받아서 이 래퍼런스를 이 Person객체의 필드와 연결시킵니다.
	public Bicycle(Person owner, BrakeLever bkl, Frame frm, Gear gear, Handle handle, Pedal pedal, Saddle sad,
			WheelSet wheel) {

		System.out.println(
				"Bicycle::Constructor(Person, BrakeLever, Frame, Gear, Handle, Pedal, Saddle, WheelSet) invoked");
		
		this.owner = owner;
		this.assembly = false;
		this.broken = false;

		this.bkl = bkl;
		this.frm = frm;
		this.gear = gear;
		this.handle = handle;
		this.pedal = pedal;
		this.sad = sad;
		this.wheel = wheel;
	}

//	 3. 메소드
//	 ==========================================
//	 ==========================================

	// 고장났는지 getter
	public boolean isbroken() {
		System.out.println("Bicycle::isbroken() invoked");
		
		return broken;
	}

	// 고장났는지 안났는지 setter
	public void setbroken(boolean broken) {
		System.out.println("Bicycle::setbroken() invoked");
		
		this.broken = broken;
	}	
	
	
	
//	==========assembly 자전거 조립과 관련된 함수 ==============

	public void setAssembly(boolean value) {
		System.out.println("Bicycle::setAssembly() invoked");
		
		if(value == false) {
			this.assembly = value;
			return;
		}
		
		this.assembly = true;

		System.out.println();
		System.out.println("=======부품 조립을 시작합니다.=======");
		System.out.println();

		bkl.assembly();
		frm.assembly();
		gear.assembly();
		handle.assembly();
		pedal.assembly();
		sad.assembly();
		wheel.assembly();

		int day = (int) (Math.random() * 4);
		System.out.println();
		System.out.println("=======" + day + "일 만에 부품 조립을 완료합니다.=======");
		System.out.println();
	}

	public boolean getAssembly() {
		System.out.println("Bicycle::getAssembly() invoked");

		return this.assembly;
	}
	
	
	

	// Ower의 값을 return.
	public Person getOwner() {
		System.out.println("Bicycle::getOwner() invoked");

		return owner;
	}

	
	// Bicycle의 가격을 return;
	public int totalBicyclePrice() {
		System.out.println("Bicycle::totalBicyclePrice() invoked");

		return bkl.getRealPrice() + frm.getRealPrice() + gear.getRealPrice() + handle.getRealPrice() 
		+ pedal.getRealPrice() + sad.realPrice+ wheel.getRealPrice();
	}
	
	
	/*
	 *  Setter Method
	 */
	
	
	
	//WheelSet을 setter
	public void setWheel(WheelSet wheel) {
		System.out.println("Bicycle::setWheel() invoked ");
		
		this.wheel = wheel;
	}
	
	/*
	 *  Getter Method
	 */
	
	
	// WheelSet을 getter
	public WheelSet getWheel() {
		System.out.println("Bicycle::getWheel() invoked");
		return wheel;
	}
	
	// Handle을 getter
	public Handle getHandle() {
		System.out.println("Bicycle::getHandle() invoked");
		return handle;
	}
	
	// Gear을 getter
	public Gear getGear() {
		System.out.println("Bicycle::getGear() invoked");
		return gear;
	}
	
	// BrakeLever을 getter
	public BrakeLever getBkl() {
		System.out.println("Bicycle::getBrakeLever() invoked");
		return bkl;
	}
	
	
}
