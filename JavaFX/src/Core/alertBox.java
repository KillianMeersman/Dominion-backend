package Core;

import static Core.ConfirmBox.answer;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Sepp
 */
public class AlertBox {
    
    /**
     *
     * @param title Title to display
     * @param message Message to display
     */
    public static void display(String title, String message) {
     
        Stage alertBox = new Stage();
        
        alertBox.initModality(Modality.APPLICATION_MODAL);
        alertBox.setTitle(title);
        alertBox.setMinWidth(300);
        alertBox.setMinHeight(100);
        alertBox.setResizable(false);
        alertBox.getIcons().add(new Image("http://i.imgur.com/StwnYe8.png"));
        
        Label alert = new Label();
        alert.setText(message);
        Button button = new Button("Close");
        button.setOnAction(e -> alertBox.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(alert, button);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        alertBox.setScene(scene);
        
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case ENTER:
                    alertBox.close();
                    break;
            }
        });
        
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case ENTER:
                    alertBox.close();
                    break;
            }
        }); 
        
        alertBox.showAndWait();
        
    }
    
}
