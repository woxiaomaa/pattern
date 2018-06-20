package simpleFactory;

public class MyMain {
	public static void main(String[] args) {
		Chart chart = SipmleFactoryTest.getChart("pie");
		chart.show();
	}
}
