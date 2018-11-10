package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.StackPane;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class LineChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Defining Axis
        final NumberAxis xAxis=new NumberAxis(2008,2018,1);		
        final NumberAxis yAxis=new NumberAxis(10,80,5);		
		//Defining Labels for Axis
		xAxis.setLabel("Year");
		yAxis.setLabel("Price");
		//creating instance of LineChart with the specified axis
		LineChart lineChart=new LineChart(xAxis,yAxis);	
		//creating the series
		XYChart.Series series=new XYChart.Series();	
		//setting the name and Date to the Series
		series.setName("StockAnalysis");
        series.getData().add(new XYChart.Data(2009,25));
		series.getData().add(new XYChart.Data(2010,15));
		series.getData().add(new XYChart.Data(2011,68));
		series.getData().add(new XYChart.Data(2012,60));
		series.getData().add(new XYChart.Data(2013,35));
		series.getData().add(new XYChart.Data(2014,55));
		series.getData().add(new XYChart.Data(2015,45));
		series.getData().add(new XYChart.Data(2016,67));
		series.getData().add(new XYChart.Data(2017,78));
		//adding series to line chart
		lineChart.getData().add(series);
		//setting Group and Scene
		//StackPane root=new StackPane(lineChart); //try StackPane
		Group root=new Group(lineChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("LineChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
