package factory.first;

public class LineChartFactory implements ChartFactory {

	@Override
	public Chart createChart() {
		Chart chart = new LineChart();
		return chart;
	}

}
