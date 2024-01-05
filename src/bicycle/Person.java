package bicycle;

import java.util.Arrays;


public class Person {
//	 1. 필드 선언
//	 ==========================================
//	 ==========================================	
	
	private String name;				// 사람 이름
	private Map map;
	private Bicycle bicycle;
	private int runSecondSum;			//달리면서 측정된 초
	private double runDistanceSum;	 	//달리면서 측정된 거리 
	private double minDistance;			//분당 가는 거리, 속도
	private boolean driver;				// 운전 중 입니까?
	

	
//	2. 생성자
//	==========================================
//	==========================================	
	public Person() {
		System.out.println("Person::Default Constructor invoked");
		
		this.name = "이름 정보 알 수 없음";
		this.driver = false; 
	} // Default Constructor
	
	public Person(String name) {
		System.out.println("Person::Constructor(String) invoked");
		
		this.name = name;
		this.driver = false;
	} // Constructor(String name)
	

		
	
//	3. 메소드
//	==========================================
//	==========================================	
	
	public void setWheelSet(WheelSet changeWheel) { // 받는건 매개변수 , 받은 객체를 누구한테 줘? 필드값 초기화
		this.getBicycle().wheel = changeWheel;
	}
	
	
//	========= 사람 이름에 대한 메소드 =========
	
	//사람 이름을 반환하는 함수
	public String getPersonName() {
		System.out.println("Person::getPersonName() invoked");

		return name;
	} //getPersonName()
	
	
	//사람 이름을 설정하는 함수
	public void setPersonName(String name) {
		System.out.println("Person::setPersonName() invoked");

		this.name = name;
	} //setPersonName(String name)
	
	
	
	
//	========= needs에 대한 메소드 ========= 
	
	
	
	//사용자의 needs를 임의로 정하여 그 정보를 담는 needs배열을 return
	public int[] getNeeds() {
		System.out.println("Person::setNeeds() invoked");

		int needs[] = new int[21];
		
		for(int i = 0; i<needs.length; i++) {
			needs[i] = 1 + (int)(Math.random()*3);
		}
		
		System.out.println();
		System.out.println(" ==========================");
		System.out.println(this.name + "님의 선택은 ");
		System.out.println(Arrays.toString(needs));
		System.out.println(" 입니다.");
		System.out.println(" ==========================");
		System.out.println();
		
		return needs;
	} // setNeeds()
	
	
	
//	========= Map에 대한 메소드 ========= 
	
	
	//Map을 getter
	public Map getMap() {
		System.out.println("Person::getMap() invoked");

		return map;
	} // getMap()

	
	//Map을 setter
	public void setMap(Map map) {
		System.out.println("Person::setMap() invoked");

		this.map = map;
	} // setMap()

//	========= Person객체의 자전거 생성에 대한 메소드 ========= 
	
	//(1) 인자값을 전달받은 사람은
	//(2) 새로운 bicycle을 생성하고 이 객체를 this.bicycle 래퍼런스에 연결합니다
	public void setBicycle(BrakeLever bkl, Frame frm, Gear gear, Handle handle, 
			Pedal pedal, Saddle sad, WheelSet wheel) {
		System.out.println("Person::setBicycle(BrakeLever, Frame, Gear, "
				+ "Handle, Pedal, Saddle, WheelSet)");
		
		this.bicycle = new Bicycle(this, bkl, frm, gear, handle, pedal, sad, wheel);
	} // setBicycle()
	
	
	// Person 객체가 가지고 있는 자전거를 return
	public Bicycle getBicycle() {
		System.out.println("Person::getBicycle(int[] ) invoked");

		if(this.bicycle == null) {
			System.out.println("가지고 있는 자전거가 없습니다. ");
			System.out.println();
			
			return null;
		}
		return this.bicycle;
	} // getBicycle()
	
	
	// ========= 사람이 Map을 가지고 달린다=========

	public void run() {
		System.out.println("Person::run() invoked");
		
		//지도가 없거나 문제(바퀴의 내구도)가 있다면
		if(this.map == null || this.check()) {
			System.out.println("걸리나?");
			return;
		} //if
		
		//사람이 자전거를 올라타고, 바퀴가 돌아간다.
		this.rideOn();
		this.bicycle.getWheel().rollWheel();
		
		
		
		this.runSecondSum = 0;			// run()함수를 다 진행하였을때 사람의 이동시간
		this.runDistanceSum = 0;		// run()함수를 다 진행하였을때 사람의 이동거리
		
		// map객체의 대한 정보를 받는 과정
		int row = this.map.getRow();
		int mapDirections[] = this.map.getDirections();
		double mapDistances[] = this.map.getDistances();
		Ground mapGrounds[] = this.map.getGrounds();
		
		//miniRun()함수를 통해 map의 한 행씩, 행의 갯수 만큼 miniRun()함수를 실행한다.
		for(int i = 0; i < row; i++) {
			
			System.out.println("====================================== "+(i)+"번째 행을 달리기 시작. !======================================  ");

			
			this.miniRun(mapDirections[i], mapDistances[i], mapGrounds[i]);
			
			//바퀴 내구도를 확인하는 함수, 문제가 있다면
			if(this.check()) {
				System.out.println("====================================== "+(i)+"번째 행의 거리를 완주 중 문제가 생김. !======================================  ");
				this.bicycle.setAssembly(false);
				break;
				
			}else {//if
				System.out.println("====================================== "+(i)+"번째 행의 거리를 완주했습니다. !======================================  ");
				System.out.println();
				System.out.println();
				
			}//else
		}//for
		

		
		System.out.println("총 달린 거리는 " + Math.floor(100*this.runDistanceSum)/100 + "km 이고 " 
		+ (this.runSecondSum/60) + "분 " + (this.runSecondSum%60) + "초 만큼 걸렸습니다.");
		System.out.println("지도의 총 거리는 " + Math.floor(map.totalDistance()*100)/100 + "km 입니다.");
		
		
		//운행이 끝났음으로 바퀴가 멈추고 자리에서 내린다.
		this.bicycle.getWheel().stopWheel();
		this.getOff();
	} // run()
	
	// Map의 한 행의 정보를 입력받아 달리는 함수
	   private void miniRun(int mapDirection, double mapDistance, Ground mapGround) {
	      System.out.println("Person::miniRun() invoked");

	      
	      //map의 방향값을 핸들에게 줌. 핸들은 방향을 설정하고 상황을 Sysout으로 출력
	      this.bicycle.getHandle().setHandleDirection(mapDirection);
	      
	      
	      //mapGround 객체에서 땅의 상태를 받아서 Sysout으로 출력, 내리막일 때 brake를 잡는다.
	      int mapGroundStatus = mapGround.getGroundStatus();
	      if(mapGroundStatus == 1) {
	         System.out.println("============  평지를 달립니다.============  ");
	      }else if(mapGroundStatus == 2) {         
	         System.out.println("============오르막을 달립니다.============");
	      }else if(mapGroundStatus == 3) {
	         System.out.println("============내리막을 달립니다.============");
	         this.bicycle.getBkl().setBrake(true);         //내리막일 때 brake를 잡는다
	      }
	      

	      
	      int countTraffic = 0;             //횡단보도를 마주한 횟수
	      
	      this.minDistance = 0.25;          //분당 사람이 가는 거리 거리
	      int miniRunSecondSum = 0;         //miniRun()에서 while문을 진행할때마다 60초씩 증가된다.
	      double miniRunDistanceSum = 0;      //miniRun()에서 while문을 진행할때마다 사람이 가는 거리가 추가된다.
	      
	      
	      //(1) while문 한번 할때마다 60초가 지난 것을 의미하며
	      //(2) 그에 따라 사람이 간 거리는 사람의 분당 속력만큼 더해지고
	      //(3) 그 사람이 갔던 거리의 합이 지도의 일부의 거리보다 같거나 클시에 while문을 빠져나간다.
	      do {
	         
	         // 1분 이내에 행의 거리를 도착할 때, 예를 들어 23초에 남은 거리를 도착할 때,
	         // while문을 돌았다고 시간에다가 60을 추가하고
	         // 진행한 거리에다가 분속만큼을 추가하면 오차가 남으로
	         if(miniRunDistanceSum+this.minDistance >= mapDistance) {
	            miniRunSecondSum += (int)((mapDistance - miniRunDistanceSum)/((double)this.minDistance/60));      // 남은 거리만큼 가는데 걸린 초 = 남은 거리 / 속력
	            miniRunDistanceSum += (mapDistance - miniRunDistanceSum);   
	            
	            
	            this.getBicycle().getWheel().statusRunningWheel();      //(1) 달리면서 바퀴 내구도 감소
	            if(this.check())   break;                               //(2) 문제가 있다면 빠져나옴
	            
	         //   1분 이상 달려도 행의 거리에 도착하지 못 할때, 즉 1분을 달림
	         }else { //if
	            
	            // 횡단보도를 만남
	            if((int)(Math.random()*3) == 2){
	               while(countTraffic <= mapGround.getNumberOfTrafficLight()) {
	                  int trafficTime = (int)(Math.random()*120)+30;
	                  miniRunSecondSum += trafficTime;
	                  System.out.println("======신호등에 걸려 " + trafficTime + "초 동안 신호를 기다립니다. =======");
	                  System.out.println("======현재까지 걸린 시간은 " + (miniRunSecondSum+this.runSecondSum)/60 +"분 "
	                         + (miniRunSecondSum+this.runSecondSum)%60 + "초 입니다. ");
	                  countTraffic++;
	                  break;
	               } //while문
	            } //횡단보도에 관한 if문
	            
	            
	            //시간에 60초만큼 추가하고
	            //거리에 분속만큼 추가한다.
	            miniRunSecondSum += 60;
	            miniRunDistanceSum += this.minDistance;
	            
	            
	            this.getBicycle().getWheel().statusRunningWheel();         //(1) 달리면서 바퀴 내구도 감소
	            if(this.check())   break;                                  //(2) 문제가 있다면 빠져나옴
	         } //if - else                              
	         
	         System.out.println("=====대략 "+(miniRunSecondSum + this.runSecondSum)/60+"분 " + (miniRunSecondSum + this.runSecondSum)%60 + "초 경과, "+ this.minDistance + 
	               "km/min 속도로 현재까지 " + Math.floor(100*(this.runDistanceSum+miniRunDistanceSum))/100 + "km 만큼 달렸습니다. =====");
	      }while(miniRunDistanceSum < mapDistance);
		
		
		//내리막이 끝났음으로 brake를 놓는다.
		if(mapGroundStatus == 3) {
			System.out.println("현재 지도 행의 내리막을 다 달렸습니다.");
			this.bicycle.getBkl().setBrake(false);		//내리막을 다 타고 나서 brake를 놓는다.
		}		
		
		
		//for(i = 0; i < row; i++)을 돌며 전체의 거리와 시간의 합을 구하기 위해
		this.runDistanceSum += miniRunDistanceSum;
		this.runSecondSum += miniRunSecondSum;
	} //miniRun()
	
	
	//문제가 생기면 true 없으면 false
	private boolean check() {
		System.out.println("Person::check() invoked");
		if(this.bicycle.getWheel().getDurability() <= 0) {
			return true;
		}else {
			return false;
		}
	}

	// ========= 사람 행동과 관련된 함수들 =========
	
	void rideOn() { // 올라타다
		System.out.println("Person::ride() invoked");
		
		this.driver = true;
		System.out.println(this.name + "이가 자전거에 올라 탔습니다.");
		System.out.println();
			
		
	} // ride()
	
	
	void getOff() { // 내리다
		System.out.println("Person::ride() invoked");
		
		this.driver = false;
		System.out.println(name + "이가 자전거에서 내렸습니다.");
		System.out.println();
	} // getOff()
	
} // end class
