package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class PieChartExample2 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Instantiating the pie-chart class
		PieChart pieChart=new PieChart();
		//setting the Data of the Pie Chart
		pieChart.setData(getChartData());
		pieChart.setLegendSide(Side.LEFT);
		pieChart.setTitle("Computer Language Properties");
		pieChart.setClockwise(false);
		//creating the Layout
		StackPane root=new StackPane();
		//Adding pie-chart to the layout
        root.getChildren().add(pieChart);
        //configuring Scene
		Scene scene=new Scene(root,800,600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PieChart Example");
		primaryStage.show();
	}
	//creating getChartData method to set the chart data
	private ObservableList<Data> getChartData()
	{
		ObservableList<Data> list=FXCollections.observableArrayList();
		list.addAll(new PieChart.Data("JavaScript",30.8),new PieChart.Data("Ruby",11.8),new PieChart.Data("Java",10.8),new PieChart.Data("Python",11.6),new PieChart.Data("PHP",7.2),new PieChart.Data("Objective-C",10.7),new PieChart.Data("C",5.2),new PieChart.Data("C++",4.3),new PieChart.Data("Go",3.8),new PieChart.Data("CSS",3.8));
		return list;
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
