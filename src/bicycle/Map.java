package bicycle;

public class Map {

	private String destination;
	private int row ; 
	private int directions[];
	private double distances[];
	private Ground grounds[];
	
	public Map() {
		System.out.println("Map::Constructor() invoked");
		this.destination = "삼각지";
		this.row = 10;									// 갯수
		this.directions = new int[row];					// 방향 1. 직진 2. 우회전 3. 좌회전
		this.distances = new double[row];				// 거리 km
		this.grounds = new Ground[row];					// 땅의 높낮이, 신호등 갯수
		
		for(int i = 0; i < row; i++) {
			directions[i] = 1+ (int)(Math.random()*3);
			distances[i] = Math.floor((Math.random()*10+1)*10)/100;
			
			//Ground의 객체를 생성, 인자값을 Math.random() 함수로 생성해서 전달.
			int groundStatus = 1+ (int)(Math.random()*3);					// 땅의 높낮이 1. 평지 2. 오르막 3. 내리막
			int numberOfTrafficLight = (int)(Math.random()*3);				// 신호등의 갯수
			grounds[i] = new Ground(groundStatus, numberOfTrafficLight);
		}
	}
	
	public Map(String destination, int row, int directions[], double distances[], Ground grounds[]){
		System.out.println("Map::Constructor(destination, row, int directions[], double distances[], Ground grounds[]) invoked");
		
		this.destination = destination;
		this.row = row;
		this.directions = directions;
		this.distances = distances;
		this.grounds = grounds;
		
	}

	
	public int getRow() {
		System.out.println("Map::getRow() invoked");

		return row;
	}

	
	public int[] getDirections() {
		System.out.println("Map::getDirections() invoked");

		return directions;
	}

	
	public double[] getDistances() {
		System.out.println("Map::getDistances() invoked");

		return distances;
	}


	public Ground[] getGrounds() {
		System.out.println("Map::getGrounds() invoked");

		return grounds;
	}

	
	public String getDestination() {
		System.out.println("Map::getDestination() invoked");

		return destination;
	}
	
	
	public double totalDistance() {
		System.out.println("Map::totalDistance() invoked");

		
		double totalDistance = 0;
		for(int i=0; i<this.distances.length; i++) {
			totalDistance += this.distances[i];
		}
		
		return totalDistance;
	}
	
}
