package factory.simpleFactory;

public class MyMain {
	public static void main(String[] args) {
		String type = XMLUtil.getChartType();
		Chart chart = SipmleFactoryTest.getChart(type);
		chart.show();
	}
}
