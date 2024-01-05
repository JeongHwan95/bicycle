package bicycle;

public class Gear {
//	 1. 필드
//	 ==========================================
//	 ==========================================	

	 private int price;				// 가격 		1. 20,000	2. 30,000	3. 40,000
	 private int gripShift;			// 기어 단수	1. 5단		2. 7단		3. 9단
	 private int color; 			// 색상			1. Black 	2. Gray 	3. Blue

	 private int realPrice;			// 주문자가 선택한 가격
	 private String realGripShift;	// 주문자가 선택한 기어 단수
	 private String realColor;		// 주문자가 선택한 색상

	 
//	 2. 생성자
//	 ==========================================
//	 ==========================================
	 public Gear() {;;} 			 					// 기본 생성자
	 
	 public Gear(int price) { 							// "가격"만 선택하고 	 		<< 기어 단수, 색상을 선택하지 않은 경우
		 this(price, 0); 		 						// 0은 선택하지 않은 경우
	 } // 옵션을 제대로 선택하지 않았을 경우1
	  
	 public Gear(int price, int gripShift) { 			// "가격, 기어 단수"만 선택하고	<< 색상을 선택하지 않은 경우
		 this(price, gripShift ,0);		   				// 0은 선택하지 않은 경우
	 } // 옵션을 제대로 선택하지 않았을 경우2
	   
	 public Gear(int price, int gripShift, int color){  // "가격, 기어 단수, 색상" 모두 선택했을 때
		System.out.println("::Constructor(int, int, int) invoked");
	     this.price = price;							// 1.20,000원	2.30,000원		3.40,000원		중 원하는 번호를 선택
	     this.gripShift = gripShift;					// 1.5단		2.7단	 		3.9단	 		중 원하는 번호를 선택
	     this.color = color;							// 1.검은색	 	2.회색			3.파란색		중 원하는 번호를 선택
	     
//	 ============ 가격 선택 ======================	
	      
	     if(this.price == 1) {							// 1을 선택 시 "20,000원" 선택
	        realPrice = 20000;	
	     }else if(this.price == 2) {					// 2를 선택 시 "30,000원" 선택
	        realPrice = 30000;
	     }else if(this.price == 3) {					// 3을 선택 시 "40,000원" 선택
	        realPrice = 40000;
	     } // 가격 if -else  
	     
//	 ============ 기어 단수 선택 ==================	
	      
	     if(this.gripShift == 1) {						// 1을 선택 시 "5단" 선택
	    	realGripShift = "5단";
	     }else if(this.gripShift == 2) {				// 2를 선택 시 "7단" 선택
	    	realGripShift = "7단";
	     }else if(this.gripShift == 3) {				// 3을 선택 시 "9단" 선택
	    	realGripShift = "9단";
	     } // 기어 단수 if -else

//	 ============= 색상 선택 =====================	 
	      									
	     if(this.color == 1) {							// 1을 선택 시 "검은색" 선택
	        realColor = "black";
	     }else if(this.color == 2) {					// 2를 선택 시 "회색" 선택
	        realColor = "gray";
	     }else if(this.color == 3) {					// 3을 선택 시 "파란색" 선택
	        realColor = "blue";
	     } // 색상 if -else

     } // 옵션을 제대로 선택하여 주문한 경우 gear
	 
	 
//	 3. 메소드
//	 ==========================================
//	 ==========================================
	 
	 
	public int getRealPrice() {
		System.out.println("Gear::getRealPrice() invoked");
		return realPrice;
	}
	
	 
	 void assembly() {														// 자전거 부품 조립 메소드(기어)
		 System.out.println("Gear::assembly() invoked");
		 
		 System.out.println("기어 단수 : " + this.realGripShift);
		 System.out.println("기어 색상 : " + this.realColor);
		 System.out.println("기어 가격 : " + this.realPrice + "원");
	 } // assembly() 	 
   
} // end class
