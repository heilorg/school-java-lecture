package test.car;

public class Rentcar {
	Driveable[] cars = new Driveable[4];
	Driver testDriver;
	
	public Rentcar() {
		testDriver = new Driver("�մ�", "010-0000-0000", "guest@gmail.com", 20, null);
		
		cars[0] = new Sedan("�Ÿ", testDriver, 50, 20, 12, 180, "black");
		cars[1] = new Sedan("�׷���", testDriver, 60, 20, 11, 180, "black");
		cars[2] = new Sedan("K5", testDriver, 50, 20, 13, 180, "black");
		cars[3] = new Bus("��������", testDriver, 100, 65, 9, 15);
	}
	
	void chkRent(Driver driver) {
		System.out.println("== " + driver.getName() + "������, ��Ʈ ���� �ڵ��� ==");
		for(int i = 0; i < cars.length; i++) {
			((Car)cars[i]).setOwner(driver);
			
			if(driver.getAge() >= 19 && cars[i].chkLicense()) {
				System.out.println(((Car)cars[i]).getName());
			}
		}
	}
}
