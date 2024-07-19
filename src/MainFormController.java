import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtUsername;
    public Button btnClick;
    public TextField txtPrint;
    public TextField txtNum1;
    public TextField txtNum2;
    public Button btnAdd;
    public TextField txtResult;
    public Button btnClear;

    public void onClickonAction(ActionEvent actionEvent) {

        String username = txtUsername.getText();
        // System.out.println("Your name is "+username);
        txtPrint.setText(username);
    }

    public void addTwoNumbers(ActionEvent actionEvent) {
        String num1=txtNum1.getText();
        String num2=txtNum2.getText();
        String result = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
        txtResult.setText(result);
    }

    public void btnClear(ActionEvent actionEvent) {
        txtNum1.setText("");
        txtNum2.setText("");
        txtResult.setText("");
    }
}
