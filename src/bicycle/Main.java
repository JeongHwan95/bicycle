package bicycle;


public class Main {
	
	public static void main(String[] args) {
		
		
//		======= 시나리오 시작 =======
		
//		1. 사람과 회사를 만들어 
//		   회사에서 부품을 만들고 사람이 그 부품을 받아 자전거를 조립한다.   

		
		//(1) 사람 강지용씨는
		//(2) company에게 
		//(3) 자기 자전거 부품을 주문합니다.
		//(4) 부품을 받은 강지용씨는 자전거 부품을 조립합니다.
		Person 이재용 = new Person("이재용");
		Person 정주영 = new Person("정주영");
		Company Hyundai = new Hyundai();
		Company Samsung = new Samsung();
		Samsung.orderBicycleParts(이재용);
		Hyundai.orderBicycleParts(정주영);
		이재용.getBicycle().setAssembly(true);
		정주영.getBicycle().setAssembly(true);
//회사가 사람한테 객체를 만들어서 줬어 , 근데 그 사람이 또 bicycle을 생성해서 bicycle한테 객체를 생성자를 준다
//bicycle에서 객체를 
		
//		Person person = new Person();
		
		
//		2. Map이라는 지도 생성 

		Map 삼각지 = new Map();

		
		
//		3. 사이 지도를 받아 달리기 시작한다. 
		
		이재용.setMap(삼각지);
		이재용.run();
		
		정주영.setMap(삼각지);
		정주영.run();
		
		//사람 "이광수"를 만들어서
		//자전거 부품은 company이 객체를 이용해서 만들어라
		//이광수의 자전거를 만들어라!

//		Person person2 = new Person("이광수");
//		company.orderBicycleParts(person2);
//		person2.getBicycle().setAssembly(true);
		
		
		
		
		/*
		 * ((int)Math.random()*2)+1
		 * 만약 1이면 현대바퀴를 생성하고
		 * 만약 2이면 삼성바퀴를 생성
		 * 
		 * 
		 * 
		 */

		
		
		
		//메소드를 동떨어져서 써도 되나?
		
//		check 함수가 true이면 assembly(바퀴가 고장난지 확인하려면 assembly) 가 false로 바뀌게 설정(고장) 
//		
		//사람의 자전거가 조립이 안되어 있다  				=> 		바퀴가 망가져있다는 뜻
		//사람이 회사에서 바퀴를 주문한다.					=>		
		//회사에서 생성해준 바퀴 객체를 받는 함수 in 사람	=> 이 함수를 통해 사람은 바퀴 객체를 받는다
		//사람은 이 바퀴를 가지고 자전거를 조립한다.		=> 조립하는 함수 호출
		
		
		
		
		
//		
	}
}
