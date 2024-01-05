package bicycle;

public class HyundaiWheelSet extends WheelSet{
	
    private int color;         //1. black, 2. brown, 3. ivory
    private int inch;            //1. 20인치, 2. 26인치 3. 28인치
    private int price;         //1. 50000, 2. 100000, 3. 150000
    int durability;      // 휠의 최대 내구성
    boolean isBroken;
    boolean function;
    
    private String realColor;   
    private String realInch;
    private int realPrice;
    
    
    public HyundaiWheelSet(int color, int inch, int price) {
    	super();
        System.out.println("HyundaiWheelSet()::constructor(int, int, int) invoked");
       
        this.durability = 10;
        this.isBroken = false;
        this.color = color;
        this.inch = inch;
        this.price = price;
  
//  ============== 색상 선택 =====================   
       
       if(this.color == 1) {
    	   this.realColor ="black";
       }else if(this.color== 2) {
    	   this.realColor = "brown";
       }else if(this.color== 3) {
          this.realColor = "pink";
       }
       
//  ============== 휠 인치 선택 ==================
       
       if(this.inch== 1) {
          this.realInch = "20인치";
       }else if(this.inch== 2) {
    	   this.realInch = "26인치";
       }else if(this.inch == 3) {
          this.realInch = "28인치";
       }
       
//  ============== 휠 가격 선택 ==================
       
       if(this.price == 1) {
    	   this.realPrice = 50000;
       }else if(this.price== 2) {
    	   this.realPrice = 100000 ;
       }else if(this.price== 3) {
          this.realPrice =150000;
       } // if - else
       
    } // WheelSet

    
    
    //while문을 돌며 내구도 감소 함수
    //현대차는 내구도 3 감소
	@Override
	void statusRunningWheel() {
		System.out.println("HyundaiWheelSet::statusRunningWheel() invoked");
	
    
		if( this.isBroken == false && this.durability>0) {
			this.durability = this.durability - 3;
			
		} // if
		
		if(this.durability<=0) {
			this.isBroken = true;
			this.durability = 0;
			System.out.println("고장입니다! 현대 바퀴를 교체해주세요");
		} // if
		
		System.out.println("현재 내구도는" + this.durability + "입니다.");
	}
	
	
	//내구도 조립 함수
	@Override
	void assembly() {                                       
	      System.out.println("HyundaiWheelSet::assembly() invoked");
	       
	      
	      System.out.println("휠 인치 : " + this.getRealInch());
	      System.out.println("휠 색상 : " + this.getRealColor());
	      System.out.println("휠 가격 : " + this.getRealPrice() + "원");
	   } // assembly()   
	
	
	/*
	 * Getter Method
	 */
	
	@Override
	public int getRealPrice()  {
        System.out.println("HyundaiWheelSet::getRealPrice() invoked");
        
        return realPrice;
    } 
	
	@Override
	public int getDurability() {
        System.out.println("HyundaiWheelSet::getDurability() invoked");
        
        return durability;
     }
	@Override
	public String getRealInch() {
		System.out.println("HyundaiWheelSet::getRealInch() invoked");
		
		return this.realInch;
	}
	@Override
	public String getRealColor() {
        System.out.println("HyundaiWheelSet::getRealColor() invoked");

        return realColor;
     }

	@Override
	public void setBroken(boolean isBroken) {
        System.out.println("HyundaiWheelSet::setBroken(boolean) invoked");
        
        this.isBroken = isBroken;
     }

	@Override
	public int getColor() {
        System.out.println("HyundaiWheelSet::getColor() invoked");

        return color;
     }
	@Override
	public int getInch(){
        System.out.println("HyundaiWheelSet::getInch() invoked");

        return inch;
     }
	@Override
	public int getPrice() {
        System.out.println("HyundaiWheelSet::getPrice() invoked");

        return price;
     }

	
	/*
	 *  	Setter Method
	 */
	
	@Override
	public void setDurability(int minus) {
        System.out.println("HyundaiWheelSet::setDurability(int) invoked");
        
        this.durability -= minus;
     }
	@Override
	public void setRealColor(String realColor) {
        System.out.println("HyundaiWheelSet::setRealColor() invoked");

		this.realColor = realColor;
	}
	@Override
	public void setRealInch(String realInch) {
        System.out.println("HyundaiWheelSet::setRealInch() invoked");

		this.realInch = realInch;
	}
	@Override
	public void setRealPrice(int realPrice) {
        System.out.println("HyundaiWheelSet::setRealPrice() invoked");

		this.realPrice = realPrice;
	}

	@Override
	public void setColor(int color) {
        System.out.println("HyundaiWheelSet::setColor() invoked");

        this.color = color;
     }

	@Override
	public void setInch(int inch){
        System.out.println("HyundaiWheelSet::setInch() invoked");

        this.inch = inch;
     }
	
	@Override
	public boolean isBroken() {
        System.out.println("HyundaiWheelSet::isBroken() invoked");
        
        return isBroken;
     }
	@Override
	public void setPrice(int price) {
        System.out.println("HyundaiWheelSet::setPrice() invoked");

        this.price = price;
     }

	
	@Override
	public void rollWheel() {        
		System.out.println("HyundaiWheelSet::rollWheel() invoked");
		System.out.println("현대 바퀴가 굴러갑니다. ");
	}
	@Override
	public void stopWheel() {
        System.out.println("HyundaiWheelSet::stopWheel() invoked");
        System.out.println("현대 바퀴가 멈춥니다. ");
    }

    
}
