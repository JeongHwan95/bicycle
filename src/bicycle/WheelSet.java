package bicycle;

public abstract class WheelSet {
	 // 바퀴 내구도 닳는 함수
	
	public WheelSet() {
		System.out.println("WheelSet::Constructor invoked");
	} //WheelSet
	
	//miniRun()의 while문을 돌면서 내구도를 감소시키는 함수
    abstract void statusRunningWheel();
    
    // 부품 조립하는 함수
    abstract void assembly(); 
     
    
    // Getter Method
    public abstract int getRealPrice() ;
    public abstract int getDurability();
    public abstract boolean isBroken() ;
    public abstract int getColor() ;
    public abstract int getInch() ;
    public abstract int getPrice();
    public abstract String getRealColor();
    public abstract String getRealInch();
    
   

    // Setter Method
    public abstract void setDurability(int minus);
    public abstract void setBroken(boolean isBroken) ;
    public abstract void setInch(int inch) ;
    public abstract void setColor(int color) ;
    public abstract void setPrice(int price);
    public abstract void setRealColor(String realColor) ;
    public abstract void setRealInch(String realInch);
    public abstract void setRealPrice(int realPrice) ;

    
    
   
    // 바퀴가 돌아갈때 
    public abstract void stopWheel() ;
    public abstract  void rollWheel() ;

}
