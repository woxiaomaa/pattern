package simpleFactory.first;

public class SipmleFactoryTest {
	
	public static Chart getChart(String type) {
		Chart chart = null;
		if(type.equals("pie")) {
			chart = new PieChart();
		}if(type.equals("line")) {
			chart = new LineChart();
		}
		return chart;
	}

}
