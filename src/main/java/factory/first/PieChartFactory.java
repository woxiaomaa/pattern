package factory.first;

public class PieChartFactory implements ChartFactory {

	@Override
	public Chart createChart() {
		Chart chart = new PieChart();
		return chart;
	}

}
