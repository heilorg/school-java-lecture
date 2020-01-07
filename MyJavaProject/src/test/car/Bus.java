package test.car;

public class Bus extends Car implements Driveable {
	final private int MAX_SPEED = 130; // ��� 
	private int seat;
	
	public Bus(String name, Owner owner, float max_oil_level, float oil_level_gauge, float fuel_efficiency, int seat) {
		this.setName(name);
		this.setOwner(owner);
		this.setMax_oil_level(max_oil_level);
		this.setOil_level_gauge(oil_level_gauge);
		this.setFuel_efficiency(fuel_efficiency);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	// �������̵� ��ӹ��� �޼��带 ����
	@Override
	public void setMaxSpeed(float maxSpeed) {
		// TODO Auto-generated method stub
		if(maxSpeed > MAX_SPEED) {
			System.out.println("�ְ��ӵ��� " + MAX_SPEED + "km/h�� ���� �� ��� " + MAX_SPEED + "km/h���� �����Ͽ����ϴ�.");
			maxSpeed = MAX_SPEED;
		}
		super.setMaxSpeed(maxSpeed);
	}
	
	@Override
	public boolean chkLicense() {
		if(super.getOwner().getLicense().equals(Driver.LICENSE_BIG)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void move(int speed, int minute) {
		if(chkLicense()) {
			super.move(speed, minute);
		}else {
			System.out.println("������ ������ �������� ��� ������ �� �����ϴ�.");
		}
	}
	
	@Override
	void move(float distance) {
		if(chkLicense()) {
			super.move(distance);
		}else {
			System.out.println("������ ������ �������� ��� ������ �� �����ϴ�.");
		}		
	}
}