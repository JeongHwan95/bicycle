package bicycle;

public class SamsungWheelSet extends WheelSet{
    private int color;         //1. black, 2. brown, 3. ivory
    private int inch;            //1. 20인치, 2. 26인치 3. 28인치
    private int price;         //1. 50000, 2. 100000, 3. 150000
    int durability;      // 휠의 최대 내구성
    boolean isBroken;
    boolean function;
    
    private String realColor;   
    private String realInch;
    private int realPrice;
    
    public SamsungWheelSet(int color, int inch, int price) {
    	super();
        System.out.println("SamsungWheelSet()::constructor(int, int, int) invoked");
       
        this.durability = 10;
        this.isBroken = false;
        this.color = color;
        this.inch = inch;
        this.price = price;
  
//  ============== 색상 선택 =====================   
       
       if(color == 1) {
    	   this.realColor ="orange";
       }else if(color== 2) {
    	   this.realColor = "blue";
       }else if(color== 3) {
          this.realColor = "purple";
       }
       
//  ============== 휠 인치 선택 ==================
       
       if(inch== 1) {
          this.realInch = "20인치";
       }else if(inch== 2) {
    	   this.realInch = "26인치";
       }else if(inch == 3) {
          this.realInch = "28인치";
       }
       
//  ============== 휠 가격 선택 ==================
       
       if(price == 1) {
    	   this.realPrice = 100000;
       }else if(price== 2) {
    	   this.realPrice = 150000 ;
       }else if(price== 3) {
          this.realPrice =20000;
       } // if - else
       
    }
    
    //while문을 돌며 내구도 감소
    //삼성 바퀴는 내구도 1 감소
    @Override
	void statusRunningWheel() {
		System.out.println("SamsungWheelSet::statusRunningWheel() invoked");
	
    
		if( this.isBroken == false && this.durability>0) {
			this.durability = this.durability - 1;
			
		} // if
		
		if(this.durability<=0) {
			this.isBroken = true;
			this.durability = 0;
			System.out.println("고장입니다! 삼성 바퀴를 교체해주세요");
		} // if
		
		System.out.println("현재 내구도는" + this.durability + "입니다.");

	}
	
	@Override
	void assembly() {                                       
	      System.out.println("SamsungWheelSet::assembly() invoked");
	       
	      System.out.println("휠 인치 : " + this.getRealInch());
	      System.out.println("휠 색상 : " + this.getRealColor());
	      System.out.println("휠 가격 : " + this.getRealPrice() + "원");
	   } // assembly()   
	
	
	
	/*
	 *  Getter Method
	 */
	
	@Override
	public int getRealPrice()  {
        System.out.println("SamsungWheelSet::getRealPrice() invoked");
        
        return realPrice;
    } 
	@Override
	public String getRealInch() {
        System.out.println("SamsungWheelSet::getRealInch() invoked");

		return this.realInch;
	}
	@Override
	public int getDurability() {
        System.out.println("SamsungWheelSet::getDurability() invoked");
        
        return durability;
     }
	
	@Override
	public boolean isBroken() {
        System.out.println("SamsungWheelSet::isBroken() invoked");
        
        return isBroken;
     }
	@Override
	public int getColor() {
        System.out.println("SamsungWheelSet::getColor() invoked");

        return color;
     }
	@Override
	public int getInch(){
        System.out.println("SamsungWheelSet::getInch() invoked");

        return inch;
     }
	@Override
	public int getPrice() {
        System.out.println("SamsungWheelSet::getPrice() invoked");

        return price;
     }
	@Override
	public String getRealColor() {
        System.out.println("SamsungWheelSet::getRealColor() invoked");

        return realColor;
     }

	
	/*
	 *  Setter Method
	 */
	
	@Override
	public void setColor(int color) {
        System.out.println("SamsungWheelSet::setColor() invoked");

        this.color = color;
     }

	@Override
	public void setInch(int inch){
        System.out.println("SamsungWheelSet::setInch() invoked");

        this.inch = inch;
     }

	@Override
	public void setPrice(int price) {
        System.out.println("SamsungWheelSet::setPrice() invoked");

        this.price = price;
     }

	@Override
	public void setRealColor(String realColor) {
        System.out.println("SamsungWheelSet::setRealColor() invoked");

		this.realColor = realColor;
	}

	@Override
	public void setRealInch(String realInch) {
        System.out.println("SamsungWheelSet::setRealInch() invoked");

		this.realInch = realInch;
	}
	@Override
	public void setRealPrice(int realPrice) {
        System.out.println("SamsungWheelSet::setRealPrice() invoked");

		this.realPrice = realPrice;
	}
	@Override
	public void setDurability(int minus) {
        System.out.println("SamsungWheelSet::setDurability(int) invoked");
        
        this.durability -= minus;
     }
	@Override
	public void setBroken(boolean isBroken) {
        System.out.println("SamsungWheelSet::setBroken(boolean) invoked");
        
        this.isBroken = isBroken;
     }

	
	/*
	 * 초기 바퀴가 굴러갑니다 ~!
	 */
	
	@Override
	public void rollWheel() {        
		System.out.println("SamsungWheelSet::rollWheel() invoked");
		System.out.println("삼성 바퀴가 굴러갑니다. ");
	}

	@Override
	public void stopWheel() {
        System.out.println("SamsungWheelSet::stopWheel() invoked");
		System.out.println("삼성 바퀴가 멈춥니다. ");

    }
    
}