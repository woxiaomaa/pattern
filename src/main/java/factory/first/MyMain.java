package factory.first;

public class MyMain {

	public static void main(String[] args) {
		//ChartFactory cf = new LineChartFactory();
		//ChartFactory cf = new PieChartFactory();
		ChartFactory cf = null;
		cf = (ChartFactory)XMLUtil.getBean();
		Chart chart = cf.createChart();
		chart.show();
	}

}
