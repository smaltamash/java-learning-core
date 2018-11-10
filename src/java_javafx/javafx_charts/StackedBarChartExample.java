package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class StackedBarChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//configuring x and y axis
		CategoryAxis xAxis=new CategoryAxis();
        NumberAxis yAxis=new NumberAxis(1000,350000,1000);
        xAxis.setLabel("Months");
		yAxis.setLabel("Number of Users");
		//configuring StackedBarChart
		StackedBarChart sbChart=new StackedBarChart(xAxis,yAxis);
		sbChart.setTitle("Popularity of programming Languages");
		//configuring series for Java
		XYChart.Series java=new XYChart.Series();
		java.getData().add(new XYChart.Data("Jan",10000));
		java.getData().add(new XYChart.Data("Feb",130000));
		java.getData().add(new XYChart.Data("Mar",50000));
		java.getData().add(new XYChart.Data("Apr",60300));
		java.getData().add(new XYChart.Data("May",105600));
		java.getData().add(new XYChart.Data("June",50600));
		java.getData().add(new XYChart.Data("July",103000));
		java.getData().add(new XYChart.Data("Aug",203000));
		java.getData().add(new XYChart.Data("Sep",103400));
		java.getData().add(new XYChart.Data("Oct",105600));
		java.getData().add(new XYChart.Data("Nov",102400));
		java.getData().add(new XYChart.Data("Dec",200000));
		//adding series 1 to the StackedBarChart
		sbChart.getData().add(java);
		java.setName("Java");
		//configuring python
		XYChart.Series python=new XYChart.Series();
		python.getData().add(new XYChart.Data("Jan",50000));
		python.getData().add(new XYChart.Data("Feb",14300));
		python.getData().add(new XYChart.Data("Mar",50400));
		python.getData().add(new XYChart.Data("Apr",100500));
		python.getData().add(new XYChart.Data("May",104000));
		python.getData().add(new XYChart.Data("June",134000));
		python.getData().add(new XYChart.Data("July",60000));
		python.getData().add(new XYChart.Data("Aug",78000));
		python.getData().add(new XYChart.Data("Sep",89000));
		python.getData().add(new XYChart.Data("Oct",150000));
		python.getData().add(new XYChart.Data("Nov",120000));
		python.getData().add(new XYChart.Data("Dec",109450));
		//adding series 2 to the StackedBarChart
		sbChart.getData().add(python);
		python.setName("Python");
		StackPane root=new StackPane(); //try StackPane
        //configuring Group and Scene
        //Group root=new Group();
		root.getChildren().add(sbChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("StackedBarChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
//StackedBarChart works in a way as soon as java(series 1) bar is over python(series 2) bar will start from the last value of java it(python bar) will consider it as 0 and will start from there and go on till its value
//the above procedure takes place even if we take more than two series