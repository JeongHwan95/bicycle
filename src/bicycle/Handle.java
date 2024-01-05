package bicycle;

public class Handle {
//	 1. 필드
//	 ==========================================
//	 ==========================================		
	
	 private int color;				// 색상			1. black	2. white	3. pink
	 private int material;    		// 손잡이 소재	1. 일반	    2. 고무	 	3. 털
	 private int price;  	   		// 가격			1. 30,000   2. 40,000  	3. 50,000
	 private int handleDirection; 	// 방향			1. 직진		2. 오른쪽	3. 왼쪽
	 private String realColor;		// 선택된 색상
	 private String realMaterial;	// 선택된 손잡이 소재
	 private int realPrice;			// 선택된 가격


//	 2. 생성자
//	 ==========================================
//	 ==========================================	
	 public Handle() {;;}								 // 기본 생성자
	     
	 public Handle(int color) { 						 // "색상"만 선택하고 		  		 << 페달 종류, 가격을 선택하지 않았을 때
		 this(color, 0); 		 						 // 0은 선택하지 않았을 때	  
	 }	
		  
	 public Handle(int color, int material) { 			 // "색상, 손잡이 소재"만 선택하고	 << 가격을 선택하지 않았을 때
		 this(color, material, 0);	 					 // 0은 선택하지 않았을 때
	 }
		   
	 public Handle(int color, int material, int price){  // "색상, 타입, 가격" 모두 선택했을 때
		System.out.println("::Constructor(int, int, int) invoked");
		 this.color = color;							 // 1.검은색		2.흰색 			3.핑크색		중 원하는 번호를 선택
		 this.material = material;						 // 1.일반			2.고무	 	  	3.털			중 원하는 번호를 선택
		 this.price = price;							 // 1.30,000원 		2.40,000원		3.50,000원 		중 원하는 번호를 선택

//	 ============= 색상 선택 =====================	 
			
		 if(this.color == 1) {							 // 1을 선택 시 "검은색" 선택
			realColor = "black";	
		 }else if(this.color == 2) {					 // 2를 선택 시 "흰색" 선택
			realColor = "white";
		 }else if(this.color == 3) {					 // 3을 선택 시 "핑크색" 선택
			realColor = "pink";	
		 } // 색상 if -else
			     
//	 ============ 안장 재질 선택 ==================
			      
		 if(this.material == 1) {						 // 1을 선택 시 "일반" 선택
			realMaterial = "일반";
		 }else if(this.material == 2) {					 // 2를 선택 시 "고무" 선택
			realMaterial = "고무";
		 }else if(this.material == 3) {					 // 3을 선택 시 "털" 선택
			realMaterial = "털";
		 } // 안장 재질 종류 if -else
			      
//	 ============ 가격 선택 ======================	 
			      
		 if(this.price == 1) {							 // 1을 선택 시 "30,000원" 선택
			 realPrice = 40000;	
		 }else if(this.price == 2) {					 // 2를 선택 시 "40,000원" 선택
			 realPrice = 60000;
		 }else if(this.price == 3) {					 // 3을 선택 시 "50,000원" 선택
			 realPrice = 80000;
		 } // 가격 if -else

     } // Handle

	 
//	 3. 메소드
//	 ==========================================
//	 ==========================================
	 
	public int getRealPrice() {
		System.out.println("Handle::getRealPrice() invoked");
		
		return realPrice;
	}
	
	public int getHandleDirection() {
		return handleDirection;
	}
	
	// 1은 직진 2는 오른쪽 3은 왼쪽
	public void setHandleDirection(int handleDirection) {
		System.out.println("Handle::setHandelDirection(int) invoked");
		
		this.handleDirection = handleDirection;
		
		if(handleDirection == 1) {
			System.out.println("핸들을 직진으로 합니다");
		}else if(handleDirection == 2) {
			System.out.println("핸들을 오른쪽으로 합니다");			
		}else if(handleDirection == 3){
			System.out.println("핸들을 왼쪽으로 합니다");
		}
	}


	 
	 void assembly() {														// 자전거 부품 조립 메소(핸들)
		 System.out.println("Handle::assembly() invoked");
		 
		 System.out.println("핸들 소재 : " + this.realMaterial);
		 System.out.println("핸들 색상 : " + this.realColor);
		 System.out.println("핸들 가격 : " + this.realPrice + "원");
	 } // assembly()
	 
	 void grabHandle() {
		 System.out.println("Handle::grabHandle() invoked");
		 
		 System.out.println("핸들을 잡습니다");
		 System.out.println();
	 } // grabHandle()
	 
	 void leftHandle() {
		 System.out.println("Handle::leftHandle() invoked");
		 
		 System.out.println("좌회전 하여 이동합니다.");
		 System.out.println();
	 } // leftHandle()
	 	 
//	 void takeoffHandle() {
//		 System.out.println("Handle::takeoffHandle() invoked");
//		 
//		 System.out.println("핸들을 놓습니다");
//	 } // takeoffHandle()
//		 
//	 void handleTurn() {
//		 System.out.println("Handle::handleTurn() invoked");
//		 
//		 System.out.println("핸들이 고장났습니다");
//	 } // handleTurn()

} // end class
