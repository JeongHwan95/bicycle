package bicycle;


public interface  Company {
	String brand = "5조";

	
	
	public abstract void orderBicycleParts(Person person);
	public abstract Frame	   orderFrame(int v1, int v2, int v3);
	public abstract Gear	   orderGear(int v1, int v2, int v3);
	public abstract Handle	   orderHandle(int v1, int v2, int v3) ;
	public abstract Pedal	   orderPedal(int v1, int v2, int v3);
	public abstract Saddle	   orderSaddle(int v1, int v2, int v3);
	public abstract WheelSet   orderWheelSet(int v1, int v2, int v3);
}
