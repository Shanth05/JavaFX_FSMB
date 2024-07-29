import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class MainformController {
    public PieChart pie;

    public void initialize(){
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        data.addAll(
                new PieChart.Data("Java",300),
                new PieChart.Data("C#",300),
                new PieChart.Data("Python",300)
        );
        pie.setData(data);
    }
}
