package bicycle;

public class Frame {
//	 1. 필드
//	 ==========================================
//	 ==========================================		
	
	 private int color;			// 색상			1. black	2. white	3. Brown
	 private int size;    	  	// 프레임 크기	1. S	    2. M 		3. L
	 private int price;  	    // 가격			1. 120,000  2. 400,000  3. 700,000
	   
	 private String realColor;	// 선택된 색상
	 private String realSize;	// 선택된 프레임 크기
	 private int realPrice;		// 선택된 가격




	//	 2. 생성자
//	 ==========================================
//	 ==========================================	 
	 public Frame() {;;}							// 기본 생성자
	     
	 public Frame(int color) { 						// "색상"만 선택하고 		  << 프레임 크기 종류, 가격을 선택하지 않았을 때
		 this(color, 0); 		 					// 0은 선택하지 않았을 때	  
	 }
		  
	 public Frame(int color, int size) { 			// "색상, 프레임 크기"만 선택하고 << 가격을 선택하지 않았을 때
		 this(color, size, 0);		   				// 0은 선택하지 않았을 때
	 }
		   
	 public Frame(int color, int size, int price){  // "색상, 프레임 크기, 가격" 모두 선택했을 때
			System.out.println("Frame::Constructor(int, int, int) invoked");
		 this.color = color;						// 1.검은색		2.흰색 			3.핑크색		중 원하는 번호를 선택
		 this.size = size;							// 1.S			2.M		 	  	3.L		 		중 원하는 번호를 선택
		 this.price = price;						// 1.120,000원 	2.400,000원		3.700,000원 	중 원하는 번호를 선택
		      
//	 ============= 색상 선택 =====================	 
			
		 if(this.color == 1) {						// 1을 선택 시 "검은색" 선택
			realColor = "black";
		 }else if(this.color == 2) {				// 2를 선택 시 "흰색" 선택
			realColor = "white";
		 }else if(this.color == 3) {				// 3을 선택 시 "브라운" 선택
			realColor = "Brown";
	     } // 색상 if -else
	     
//	 ============ 페달 종류 선택 ==================
	      
	     if(this.size == 1) {						// 1을 선택 시 "S" 선택
	        realSize = "S";
	     }else if(this.size == 2) {					// 2를 선택 시 "M" 선택
	        realSize = "M";
	     }else if(this.size == 3) {					// 3을 선택 시 "L" 선택
	        realSize = "L";
	     } // 페달 종류 if -else
	      
//	 ============ 가격 선택 ======================	 
	      
	     if(this.price == 1) {						// 1을 선택 시 "120,000원" 선택
	        realPrice = 120000;	
	     }else if(this.price == 2) {				// 2를 선택 시 "400,000원" 선택
	        realPrice = 400000;
	     }else if(this.price == 3) {				// 3을 선택 시 "700,000원" 선택
	        realPrice = 700000;
	     } // 가격 if -else
	      	      
	 } // Frame
	 
	 
//	 3. 메소드
//	 ==========================================
//	 ==========================================
	 
	 
	 // 가격을 getter
	public int getRealPrice() {
		System.out.println("Frame::getRealPrice() invoked");
		
		return realPrice;		
	}
	 
	 void assembly() {														// 자전거 조립 메소드(프레임)
		 System.out.println("Frame::assembly() invoked");
		 
		 System.out.println("프레임 크기 : " + this.realSize);
		 System.out.println("프레임 색상 : " + this.realColor);
		 System.out.println("프레임 가격 : " + this.realPrice + "원");
	 } // assembly()
	 
//	 void crushed() {
//	 	System.out.println("Bicycle::crushed()::invoked");
	 
//	    System.out.println("...");
//	 } // crushed()
//
//	 int distance;   //자전거가 달린 거리
	 
//	 void start(int speed, int min) {         //속력과 몇 분동안 달릴 건지를 매개변수로 받음
//	 	System.out.println("Bicycle::start(int, int)::invoked");
//	      
//	 	for(int i=1; i<=min; i++) {
//	  		distance += speed;   //거리 = 시간 * 속력
//	  		System.out.println(i + "분 경과, 이동한 거리는 " + distance + " km 입니다.");
//	         
//	  		if(durabilityChecked(speed)) {
//	  			System.out.println("부품이 고장났습니다.!");      
//
//	  			distance = 0;                              //전역 변수 초기화
//	  			break;
//	  		} // if
//	  	} // for
//	 } // start()

//	 boolean durabilityChecked(int speed) {
//	     System.out.println("Biycle::durabilityChecked(int)::invoked");
//	         
//		 //BreakLever.내구성 -= speed;
//		 //WheelSet.내구성 -= speed;
//		         
//		 boolean flag = false;
//		         
//		 //if(BreakLever.내구성<0)   =>    flag = true;
//		 //if(WheelSet.내구성<0)     =>    flag = true;
//		         
//		 return flag;
//	 
//	 } //durability 
	   
} // end class