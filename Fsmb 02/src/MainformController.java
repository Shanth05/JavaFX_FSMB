import javafx.scene.control.TextField;

import java.util.Observable;

public class MainformController {

    public TextField txtEmail;
    public TextField txtName;

    public void initialize() {
        txtEmail.textProperty().addListener((Observable, oldValue, newValue) -> {
                    System.out.println("new value : " + newValue);
                    System.out.println("old value : " + oldValue);
                    txtName.setText(newValue);
                }
        );
    }
}
