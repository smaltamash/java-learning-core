package java_javafx.javafx_charts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
//import javafx.scene.layout.StackPane;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
public class StackedAreaChartExample extends Application
{
	@Override
	public void start(Stage primaryStage)throws Exception
	{
		//TODO Auto-generated method stub
		//configuring x and y axis
		CategoryAxis xAxis=new CategoryAxis();
        NumberAxis yAxis=new NumberAxis(100,700,50);
        xAxis.setLabel("Month");
		yAxis.setLabel("Sales Value(lacs)");
		//creating StackedAreaChart
		StackedAreaChart saChart=new StackedAreaChart(xAxis,yAxis);
		saChart.setTitle("Sales Comparison between the year 2016 and 2017");
		//configuring series 1
		XYChart.Series year1=new XYChart.Series();
		year1.getData().add(new XYChart.Data("Jan",140));
		year1.getData().add(new XYChart.Data("Feb",110));
		year1.getData().add(new XYChart.Data("Mar",125));
		year1.getData().add(new XYChart.Data("Apr",130));
		year1.getData().add(new XYChart.Data("May",180));
		year1.getData().add(new XYChart.Data("June",120));
		year1.getData().add(new XYChart.Data("July",133));
		year1.getData().add(new XYChart.Data("Aug",200));
		year1.getData().add(new XYChart.Data("Sep",230));
		year1.getData().add(new XYChart.Data("Oct",250));
		year1.getData().add(new XYChart.Data("Nov",255));
		year1.getData().add(new XYChart.Data("Dec",390));
		//adding series 1 to the StackedAreaChart
		saChart.getData().add(year1);
		year1.setName("2017");
		//configuring series 2
		XYChart.Series year2=new XYChart.Series();
		year2.getData().add(new XYChart.Data("Jan",200));
		year2.getData().add(new XYChart.Data("Feb",210));
		year2.getData().add(new XYChart.Data("Mar",225));
		year2.getData().add(new XYChart.Data("Apr",430));
		year2.getData().add(new XYChart.Data("May",180));
		year2.getData().add(new XYChart.Data("June",334));
		year2.getData().add(new XYChart.Data("July",143));
		year2.getData().add(new XYChart.Data("Aug",400));
		year2.getData().add(new XYChart.Data("Sep",431));
		year2.getData().add(new XYChart.Data("Oct",359));
		year2.getData().add(new XYChart.Data("Nov",155));
		year2.getData().add(new XYChart.Data("Dec",190));
		//adding series 2 to the StackedAreaChart
		saChart.getData().add(year2);
		year2.setName("2016");
		//StackPane root=new StackPane(); //try StackPane
        //configuring Group and Scene
        Group root=new Group();
		root.getChildren().add(saChart);
		Scene scene=new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("StackedAreaChart Example");
		primaryStage.show();
	}
	public static void main(String[] args)throws Exception
	{
		launch(args);
	}
}
