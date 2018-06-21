package simpleFactory.first;

public class MyMain {
	public static void main(String[] args) {
		String type = XMLUtil.getChartType();
		Chart chart = SipmleFactoryTest.getChart(type);
		chart.show();
	}
}
