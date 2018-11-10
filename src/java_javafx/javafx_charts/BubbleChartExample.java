package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.StackPane;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class BubbleChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		NumberAxis xAxis=new NumberAxis(0,70,5);
        NumberAxis yAxis=new NumberAxis(0,24,4);
        xAxis.setLabel("Age");
		yAxis.setLabel("Hours Spent");
		BubbleChart bubbleChart=new BubbleChart(xAxis,yAxis);
		bubbleChart.setTitle("Hours spent online by different age groups");
        XYChart.Series male=new XYChart.Series();
        male.setName("Male");
        male.getData().add(new XYChart.Data(10,2));
        male.getData().add(new XYChart.Data(15,7));
        male.getData().add(new XYChart.Data(25,4));
        male.getData().add(new XYChart.Data(35,6));
        male.getData().add(new XYChart.Data(45,10));
        male.getData().add(new XYChart.Data(55,13));
        male.getData().add(new XYChart.Data(65,15));
        XYChart.Series female=new XYChart.Series();
        female.setName("Female");
        female.getData().add(new XYChart.Data(10,1));
        female.getData().add(new XYChart.Data(15,2));
        female.getData().add(new XYChart.Data(25,9));
        female.getData().add(new XYChart.Data(35,12));
        female.getData().add(new XYChart.Data(45,15));
        female.getData().add(new XYChart.Data(55,4));
        female.getData().add(new XYChart.Data(65,2));
        bubbleChart.getData().addAll(male,female);
        //StackPane root=new StackPane(); //try StackPane
        Group root=new Group();
		root.getChildren().add(bubbleChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BubbleChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
