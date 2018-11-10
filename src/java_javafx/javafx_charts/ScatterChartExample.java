package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.StackPane;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class ScatterChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		NumberAxis xAxis=new NumberAxis(35,105,5);
        NumberAxis yAxis=new NumberAxis(1,2.2,0.1);
        xAxis.setLabel("Weight");
		yAxis.setLabel("Height");
		//configuring ScatterChart
		ScatterChart sChart=new ScatterChart(xAxis,yAxis);
		sChart.setTitle("Pefect Height according to your weight");
		//configuring series and adding data to series
		XYChart.Series series=new XYChart.Series();
		series.setName("Height Value");
		series.getData().add(new XYChart.Data(40,1.27));
		series.getData().add(new XYChart.Data(45,1.35));
		series.getData().add(new XYChart.Data(50,1.42));
		series.getData().add(new XYChart.Data(55,1.49));
		series.getData().add(new XYChart.Data(60,1.55));
		series.getData().add(new XYChart.Data(65,1.62));
		series.getData().add(new XYChart.Data(70,1.68));
		series.getData().add(new XYChart.Data(75,1.74));
		series.getData().add(new XYChart.Data(80,1.79));
		series.getData().add(new XYChart.Data(85,1.85));
		series.getData().add(new XYChart.Data(90,1.90));
		series.getData().add(new XYChart.Data(95,1.95));
		series.getData().add(new XYChart.Data(100,2.1));
		//adding series to the ScatterChart
		sChart.getData().add(series);
		//StackPane root=new StackPane(); //try StackPane
        //configuring Group and Scene
        Group root=new Group();
		root.getChildren().add(sChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ScatterChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
