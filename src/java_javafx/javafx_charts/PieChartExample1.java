package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class PieChartExample1 extends Application
{
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//Instantiating the pie-chart class
		PieChart pieChart=new PieChart();
		//setting the Data of the Pie Chart
		pieChart.setData(getChartData());
		//creating the Layout
		StackPane root=new StackPane();
		//Adding pie-chart to the layout
        root.getChildren().add(pieChart);
        //configuring Scene
		Scene scene=new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PieChart Example");
		primaryStage.show();
	}
	//creating getChartData method to set the chart data
	private ObservableList<Data> getChartData()
	{
		ObservableList<Data> list=FXCollections.observableArrayList();
		list.addAll(new PieChart.Data("Android",85),new PieChart.Data("Others",10));
		return list;
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
