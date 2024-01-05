package bicycle;

public class Pedal {
//	 1. 필드
//	 ==========================================
//	 ==========================================	

	 private int price;				// 가격 		1. 50,000	2. 100,000	3. 150,000
	 private int type;				// 페달 종류	1. 평페달	2. 로드클릿	3. MTB클릿
	 private int color; 			// 색상			1. black 	2. white 	3. pink 

	 private int realPrice;			// 선택된 가격
	 private String realType;		// 선택된 페달 종류	 
	 private String realColor;		// 선택된 색상
	 
	 
//	 2. 생성자
//	 ==========================================
//	 ==========================================
	 public Pedal() {;;} 			 				// 기본 생성자
	  
	 public Pedal(int price) { 						// "가격"만 선택하고 	 	<< 페달 종류, 색상을 선택하지 않은 경우
		 this(price, 0); 		 					// 0은 선택하지 않은 경우
	 }
	  
	 public Pedal(int price, int type) { 			// "색상, 타입"만 선택하고	<< 가격을 선택하지 않은 경우
		 this(price, type ,0);		   				// 0은 선택하지 않은 경우
	 }
	   
	 public Pedal(int price, int type, int color){  // "색상, 타입, 가격" 모두 선택했을 때
		System.out.println("Pedal::Constructor(int, int, int) invoked");
	     this.price = price;						// 1.검은색			2.흰색 			3.핑크색		중 원하는 번호를 선택
	     this.type = type;							// 1.평페달			2.로드클릿 	  	3.MTB클릿 		중 원하는 번호를 선택
	     this.color = color;						// 1.50,000원 		2.100,000원		3.150,000원 	중 원하는 번호를 선택

//	 ============ 가격 선택 ======================	
	      
	     if(this.price == 1) {						// 1을 선택 시 "50,000원" 선택
	        realPrice = 50000;	
	     }else if(this.price == 2) {				// 2를 선택 시 "100,000원" 선택
	        realPrice = 100000;
	     }else if(this.price == 3) {				// 3을 선택 시 "150,000원" 선택
	        realPrice = 150000;
	     } // 가격 if -else  
	     
//	 ============ 페달 종류 선택 ==================	
	      
	     if(this.type == 1) {						// 1을 선택 시 "평페달" 선택
	        realType = "평페달";
	     }else if(this.type == 2) {					// 2를 선택 시 "로드클릿" 선택
	        realType = "로드클릿";
	     }else if(this.type == 3) {					// 3을 선택 시 "MTB클릿" 선택
	        realType = "MTB클릿";
	     } // 페달 종류 if -else

//	 ============= 색상 선택 =====================	 
	      									
	     if(this.color == 1) {						// 1을 선택 시 "검은색" 선택
	        realColor = "black";
	     }else if(this.color == 2) {				// 2를 선택 시 "흰색" 선택
	        realColor = "white";
	     }else if(this.color == 3) {				// 3을 선택 시 "핑크색" 선택
	        realColor = "pink";
	     } // 색상 if -else
	     
	 } // Pedal
	 
	 
//	 3. 메소드
//	 ==========================================
//	 ==========================================	
	 void assembly() {														// 자전거 조립 메소드(페달)
		 System.out.println("Pedal::assembly() invoked");
		 
		 System.out.println("페달 종류 : " + this.realType);
		 System.out.println("페달 색상 : " + this.realColor);
		 System.out.println("페달 가격 : " + this.realPrice + "원");
	 }	// assembly() 
	   
	 void pushPedal () {
		 System.out.println("Pedal::pushPedal() invoked");
		 
		
	     System.out.println("이가 페달을 밟습니다.");
	     System.out.println();
	 } // pushPedal()
	 
//	 void takeoffPedal () {
//	      System.out.println("페달에서 발을 뗍니다.");
//	 } // takeoffPedal
	       	      
	void cameoffPedal (int number) {											// 지정한 횟수 이상 페달을 움직였을 때 페달 부품 고장 메소드
	   for (int i=0; i<=number; i++ ) {
	      if (i == number) {
	            System.out.println("부품 고장: 페달이 빠집니다.");
	      } // if
	   } // for
	} //cameoffPedal ()

	// 가격을 getter
	public int getRealPrice() {
		System.out.println("Pedal::getRealPrice() invoked");
		
		return realPrice;
	}
	
	
} // end class
