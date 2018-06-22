package factory.factory;

public class PieChartFactory implements ChartFactory {


	public Chart createChart() {
		Chart chart = new PieChart();
		return chart;
	}

}
