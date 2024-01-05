package bicycle;

public class BrakeLever {
//	 1. 필드
//	 ==========================================
//	 ==========================================	

	 private int texture;    		// 브레이크 소재	1. 알루미늄	2. 스틸	 		 
	 private int color;				// 색상				1. black	2. white	3. pink
	 private int price;  	   		// 가격				1. 40,000   2. 60,000  	3. 80,000
	 private boolean brake;			// 브레이크			1. true(on) 2. false(off)

	 private String realTexture;	// 선택된 브레이크 소재	 
	 private String realColor;		// 선택된 색상
	 private int realPrice;			// 선택된 가격

	//	 2. 생성자
//	 ==========================================
//	 ==========================================	 
	 public BrakeLever() {;;}								 // 기본 생성자
	     
	 public BrakeLever(int texture) { 						 // "색상"만 선택하고 			   << 브레이크 소재, 가격을 선택하지 않았을 때
		 this(texture, 0); 		 							 // 0은 선택하지 않았을 때	  
	 }	
		  
	 public BrakeLever(int texture, int color) { 			 // "색상, 손잡이 소재"만 선택하고 << 가격을 선택하지 않았을 때
		 this(texture, color, 0);							 // 0은 선택하지 않았을 때
	 }
		   
	 public BrakeLever(int texture, int color, int price){   // "색상, 타입, 가격" 모두 선택했을 때
		System.out.println("BrakeLever::Constructor(int, int, int) invoked");

		 this.price = texture;							 	 // 1.검은색		2.흰색 		3.핑크색		중 원하는 번호를 선택
		 this.texture = color;						 	 // 1.일반		2.고무	 	  	3.털			중 원하는 번호를 선택
		 this.color = price;							 	 // 1.40,000원 	2.60,000원		3.80,000원 		중 원하는 번호를 선택	 

		 this.brake = false;
//	 ============ 가격 선택 ======================	
	      
	     if(this.price == 1) {								 // 1을 선택 시 "40,000원" 선택
	        realPrice = 40000;	
	     }else if(this.price == 2) {						 // 2를 선택 시 "60,000원" 선택
	        realPrice = 60000;
	     }else if(this.price == 3) {						 // 3을 선택 시 "80,000원" 선택
	        realPrice = 80000;
	     } // 가격 if -else  
	     
//	 =========== 브레이크 소재 선택 ================	
	      
	     if(this.texture == 1) {							 // 1을 선택 시 "알루미늄" 선택
	        realTexture = "알루미늄";
	     }else if(this.texture == 2) {						 // 2를 선택 시 "스틸" 선택
	        realTexture = "스틸";
	     } // 브레이크 소재 종류 if -else

//	 ============= 색상 선택 =====================	 
	      									
	     if(this.color == 1) {								 // 1을 선택 시 "검은색" 선택
	        realColor = "black";
	     }else if(this.color == 2) {						 // 2를 선택 시 "흰색" 선택
	        realColor = "white";
	     }else if(this.color == 3) {						 // 3을 선택 시 "핑크색" 선택
	        realColor = "pink";
	     } // 색상 if -else		 
		       
	 } // BrakeLever
	 

	public int getRealPrice() {
		System.out.println("BrakeLever::getRealPrice() invoked");
			
		return realPrice;
	}


	 
	 void assembly() {
		 System.out.println("BrakeLever::assembly() invoked");
		 
		 System.out.println("브레이크 소재 : " + this.realTexture);
		 System.out.println("브레이크 색상 : " + this.realColor);
		 System.out.println("브레이크 가격 : " + this.realPrice + "원");
	 }
	 
	//brake 상태를 getter
	public boolean isBrake() {
		System.out.println("BrakeLever::isBrake() invoked");
		
		return brake;
	}
	
	//brake 상태를 setter
	public void setBrake(boolean brake) {
		System.out.println("BrakeLever::setBrake() invoked");
		if(brake == true) {
			this.brake = brake;
			System.out.println("brake를 잡습니다. ");
		}else {
			System.out.println("brake를 놓습니다. ");
		}
		
		
		this.brake = brake;
	}

	 

	 
		   
} // end class
