package bicycle;

public class Saddle {
//	 1. 필드
//	 ==========================================
//	 ==========================================		
	
	 int color;				// 색상			1. black	2. white	3. pink
	 int material;    		// 안장 재질	1. 일반	    2. 스펀지 	3. 스프링
	 int price;  	   		// 가격			1. 40,000   2. 60,000  	3. 80,000
	   
	 String realColor;		// 선택된 색상
	 String realMaterial;	// 선택된 프레임 크기
	 int realPrice;			// 선택된 가격


//	 2. 생성자
//	 ==========================================
//	 ==========================================	 
	 public Saddle() {;;}								 // 기본 생성자
	     
	 public Saddle(int color) { 						 // "색상"만 선택하고 		  		<< 페달 종류, 가격을 선택하지 않았을 때
		 this(color, 0); 		 						 // 0은 선택하지 않았을 때	  
	 }	
		  
	 public Saddle(int color, int material) { 			 // "색상, 안장 재질"만 선택하고 	<< 가격을 선택하지 않았을 때
		 this(color, material, 0);	 					 // 0은 선택하지 않았을 때
	 }
		   
	 public Saddle(int color, int material, int price){  // "색상, 타입, 가격" 모두 선택했을 때
		System.out.println("Saddle::Constructor(int, int, int) invoked");

		 this.color = color;							 // 1.검은색	2.흰색 				3.핑크색		중 원하는 번호를 선택
		 this.material = material;						 // 1.일반		2.스펀지	 	  	3.스프링	 	중 원하는 번호를 선택
		 this.price = price;							 // 1.40,000원 	2.60,000원			3.80,000원 		중 원하는 번호를 선택
		      
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
		 }else if(this.material == 2) {					 // 2를 선택 시 "스펀지" 선택
		    realMaterial = "스펀지";
		 }else if(this.material == 3) {					 // 3을 선택 시 "스프링" 선택
		    realMaterial = "스프링";
		 } // 안장 재질 종류 if -else
		      
//	 ============ 가격 선택 ======================	 
		      
		 if(this.price == 1) {							 // 1을 선택 시 "40,000원" 선택
			realPrice = 40000;	
		 }else if(this.price == 2) {					 // 2를 선택 시 "60,000원" 선택
			realPrice = 60000;
		 }else if(this.price == 3) {					 // 3을 선택 시 "80,000원" 선택
		    realPrice = 80000;
		 } // 가격 if -else
	     
	 } // Saddle
	 
	 
//	 3. 메소드
//	 ==========================================
//	 ==========================================	
	 void assembly() {														// 자전거 부품 조립 메소드(안장)
		 System.out.println("Saddle::assembly() invoked");
		 
		 System.out.println("안장 재질 : " + this.realMaterial);
		 System.out.println("안장 색상 : " + this.realColor);
		 System.out.println("안장 가격 : " + this.realPrice + "원");
	 } // assembly()
	 
//	 void notFixed() {
//		 System.out.println("Saddle::notFixed() invoked");
//		 
//		 System.out.println("안장이 고장났습니다");
//	 } // notFixed()
    	
} // end class
