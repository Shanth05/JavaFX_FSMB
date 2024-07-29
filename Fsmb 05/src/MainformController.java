import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class MainformController {

    NumberAxis xAxis = new NumberAxis(1,7,1);

    NumberAxis yAxis = new NumberAxis(10,500,10);

    public AreaChart<Number,Number> Chart = new AreaChart<>(xAxis,yAxis);

    public void initialize(){

        xAxis.setLabel("Count");
        yAxis.setLabel("Days");

        XYChart.Series<Number,Number> javaStudent = new XYChart.Series<>();
        javaStudent.setName("Java");

        javaStudent.getData().add(new XYChart.Data<>(2,50));
        javaStudent.getData().add(new XYChart.Data<>(4,20));
        javaStudent.getData().add(new XYChart.Data<>(1,70));
        javaStudent.getData().add(new XYChart.Data<>(5,80));
        javaStudent.getData().add(new XYChart.Data<>(8,25));
        javaStudent.getData().add(new XYChart.Data<>(3,30));


        XYChart.Series<Number,Number> PhpStudent = new XYChart.Series<>();
        PhpStudent.setName("Php");

        PhpStudent.getData().add(new XYChart.Data<>(5,20));
        PhpStudent.getData().add(new XYChart.Data<>(4,30));
        PhpStudent.getData().add(new XYChart.Data<>(2,10));
        PhpStudent.getData().add(new XYChart.Data<>(4,40));
        PhpStudent.getData().add(new XYChart.Data<>(4,15));
        PhpStudent.getData().add(new XYChart.Data<>(2,20));

        Chart.getData().addAll(javaStudent,PhpStudent);
    }
}
