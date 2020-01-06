package test.car;

public class Car {
	//필드 (멤버변수)
	String name;
	String owner;
	float max_oil_level;
	float mileage;
	float oil_level_gauge;
	float fuel_efficiency;
	float maxSpeed;

	public Car(){}//생성자
	public Car(String n, String o, float mo, float ol, float f, float ms) {
		this.name = n;
		this.owner = o;
		this.max_oil_level = mo;
		this.oil_level_gauge = ol;
		this.fuel_efficiency = f;
		this.maxSpeed = ms;
	}
	
	//메서드 (기능)
	void carInfo() {
		System.out.println("이 자동차의 이름은 " + name + "입니다.");
		System.out.println("이 자동차의 주인은 " + owner + "입니다.");
		System.out.println("이 자동차의 최대 기름 양은 " + max_oil_level + "리터입니다.");
		System.out.println("이 자동차의 현재 기름 양은 " + oil_level_gauge + "리터입니다.");
		System.out.println("이 자동차의 최고 속도는 시속 " + maxSpeed + "Km/h입니다.");
		System.out.println("이 자동차의 연비는 " + fuel_efficiency + "Km입니다.");
		System.out.println("이 자동차의 현재까지 주행거리는 " + mileage + "Km입니다.");
		System.out.println("---------------------------------");
	}
	
	void move(int speed, int minute) {
		if(speed > maxSpeed) { // 속도가 최대 속도보다 클 수 없다
			System.out.println("최고속도인 " + maxSpeed + "Km/h를 넘을 수 없습니다.");
			return; // 메서드 종료
		}
		
//		float maxDistance = oil_level_gauge * fuel_efficiency; // 최대 이동 가능거리 = 현재 기름양  * 연비
		float distance = (minute / (float)60) * speed; //일정한 스피드로 일정 시간만큼 이돌할 거리 계산
//		if(distance > maxDistance) {
//			oil_level_gauge = 0;
//			mileage = mileage + maxDistance; // 실제 이동거리는 최대 이동거리
//		}else {
//			oil_level_gauge = oil_level_gauge - (distance / fuel_efficiency); // 연비에 따른 이동거리 계산
//			mileage = mileage + distance;
//		}
		this.move(distance);
	}
	
	void move(float distance) { // 메서드 오버로딩 : 메서드 이름이 같아도 인자 값이나 수 자료형이 다르면 다른 메서드로 인식 
		float maxDistance = oil_level_gauge * fuel_efficiency;
		if(distance > maxDistance) {
			oil_level_gauge = 0;
			mileage = mileage + maxDistance; 
		}else {
			oil_level_gauge = oil_level_gauge - (distance / fuel_efficiency);
			mileage = mileage + distance;
		}
	}
}