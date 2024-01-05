package bicycle;

public class Ground {
//	 1. 필드 선언
//	 ==========================================
//	 ==========================================	
	private int groundStatus;
	private int numberOfTrafficLight;

	private String realGroundStatus;
	
	
//	2. 생성자
//	==========================================
//	==========================================	
	
	Ground(int groundStatus, int numberOfTrafficLight){
		System.out.println("Ground::Constructor(int, int) invoked");
		
		this.groundStatus = groundStatus;
		
		if(groundStatus == 1)
			this.realGroundStatus = "flat";
		else if(groundStatus == 2)
			this.realGroundStatus = "uphill";
		else if(groundStatus == 3)
			this.realGroundStatus = "downhill";
		
		
		this.numberOfTrafficLight = numberOfTrafficLight;
	}


	
//	3. 메소드
//	==========================================
//	==========================================	
	
	
	public String getStatus() {
		System.out.println("Ground::getStatus() invoked");

		return this.realGroundStatus;
	}
	
	
	public void groundStatusPrint() {
		System.out.println("Ground::getStatusPrint() invoked");

		//땅 상태가 평평하다면
		if(this.groundStatus == 1) {
			System.out.println("Ground::groundStatusPrint()  invoked");
			
			System.out.println("평지를 달립니다.");
		}
		
		// 땅 상태가 오르막이라면
		else if(this.groundStatus == 2) {
			System.out.println("Ground::groundStatusPrint()  invoked");
			System.out.println("오르막길을 달립니다. \t 속력이 느려집니다.");


		}
		
		// 땅 상태가 내리막이라면
		else if(this.groundStatus == 3) {
			System.out.println("Ground::groundStatusPrint()  invoked");
			System.out.println("내리막길을 달립니다.");

		}
		
	
	}

	
	//신호등 갯수를 return 한다.
	public int getNumberOfTrafficLight() {
		return numberOfTrafficLight;
	}


	// 땅 상태를 return하는 함수 
	// groundStatus == 1 : 평지
	// groundStatus == 2 : 오르막
	// groundStatus == 3 : 내리막
	public int getGroundStatus() {
		System.out.println("Ground::getGroundStatus() invoked");

		return this.groundStatus;
	}
	
	
}
