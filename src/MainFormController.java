import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtUsername;
    public Button btnClick;
    public TextField txtPrint;

    public void onClickonAction(ActionEvent actionEvent) {

        String username = txtUsername.getText();
        // System.out.println("Your name is "+username);
        txtPrint.setText(username);
    }
}
