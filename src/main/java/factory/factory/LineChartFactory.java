package factory.factory;

public class LineChartFactory implements ChartFactory {

	@Override
	public Chart createChart() {
		Chart chart = new LineChart();
		return chart;
	}

}
