package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.StackPane;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class BarChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Defining String to label xAxis
		String euro="Euro";
		String pound="British Pound";
		String aDollar="Australian Dollar";
		String franc="Swis Franc";
		//configuring category axis and number axis
		CategoryAxis xAxis=new CategoryAxis();
		NumberAxis yAxis=new NumberAxis(0.1,2,0.1);
        xAxis.setLabel("Currency");
		yAxis.setLabel("Dollar Price");
		//Configuring BarChart
		BarChart<String,Float> barChart=new BarChart(xAxis,yAxis);
		barChart.setTitle("Dollar Conversion Chart");
		//configuring series for XYChart
		XYChart.Series<String,Float> series=new XYChart.Series<>();
		series.getData().add(new XYChart.Data(euro,0.83));
		series.getData().add(new XYChart.Data(pound,0.73));
		series.getData().add(new XYChart.Data(franc,1.0));
		series.getData().add(new XYChart.Data(aDollar,1.32));
		//adding series to the BarChart
		barChart.getData().add(series);
		//StackPane root=new StackPane(); //try with StackPane
		Group root=new Group();
		root.getChildren().add(barChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BarChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
