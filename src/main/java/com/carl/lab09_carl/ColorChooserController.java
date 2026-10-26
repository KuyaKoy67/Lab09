import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorChooserController {
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    @FXML
    private Slider alphaSlider;

    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider blueSlider;

    @FXML
    private TextField blueTextField;

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private Slider greenSlider;

    @FXML
    private TextField greenTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private TextField redTextField;

    public void initialize() {
        redSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            red = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f")); 
        
        greenSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            green = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f")); 
        
        blueSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            blue = newValue.intValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        
        alphaSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
        });
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));

    }
}
