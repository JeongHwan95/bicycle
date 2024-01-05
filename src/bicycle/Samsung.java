package bicycle;

public class Samsung implements Company{

	@Override
	public void orderBicycleParts(Person person) {
		System.out.println("Samsung::orderBicycleParts(Person) invoked");
		

		
		//(1) Company는 사람의 요구사항을 배열로 받아
		//(2) int day일 만에 order메소드를 통해여 부품 객체들을 만들어
		//(3) 사람에게 전달해 줍니다.
		int needs[] = person.getNeeds();
		int day = (int)(Math.random()*7) + 1;
		person.setBicycle(
				this.orderBrakeLever(needs[0], needs[1], needs[2]),
				this.orderFrame(needs[3], needs[4], needs[5]),
				this.orderGear(needs[6], needs[7], needs[8]),
				this.orderHandle(needs[9], needs[10], needs[11]),
				this.orderPedal(needs[12], needs[13], needs[14]),
				this.orderSaddle(needs[15], needs[16], needs[17]),
				this.orderWheelSet(needs[18], needs[19], needs[20]));
		System.out.println(person.getPersonName() + "님의 자전거 부품이" + day + "일 만에 발송되었습니다.");
		
		

		System.out.println();
				
	}

	BrakeLever orderBrakeLever(int v1, int v2, int v3) {
		System.out.println("Samsung::orderBrakeLever(v1, v2, v3) invoked");
		return new BrakeLever(v1, v2, v3);
	};
	
	@Override
	public Frame orderFrame(int v1, int v2, int v3) {
		System.out.println("Samsung::orderBrakeLever(v1, v2, v3) invoked");
		return new Frame(v1, v2, v3);
	}

	@Override
	public Gear orderGear(int v1, int v2, int v3) {		
		System.out.println("Samsung::orderGear(v1, v2, v3) invoked");

		return new Gear(v1, v2, v3);
	}

	@Override
	public Handle orderHandle(int v1, int v2, int v3) {
		System.out.println("Samsung::orderHandle(v1, v2, v3) invoked");

		return new Handle(v1, v2, v3);
	}

	@Override
	public Pedal orderPedal(int v1, int v2, int v3) {
		System.out.println("Samsung::orderPedal(v1, v2, v3) invoked");

		return new Pedal(v1, v2, v3);
	}

	@Override
	public Saddle orderSaddle(int v1, int v2, int v3) {
		System.out.println("Samsung::orderSaddle(v1, v2, v3) invoked");

		return new Saddle(v1, v2, v3);
	}

	@Override
	public WheelSet orderWheelSet(int v1, int v2, int v3) {
		System.out.println("Samsung::orderWheelSet(v1, v2, v3) invoked");

		return new SamsungWheelSet(v1, v2, v3);
	}

}
