package battleship;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BattleShip extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane ennemi = createGrid();
        GridPane moi = createGrid();

        StackPane text = createTitle();

        StackPane stackPane = etatDeJeux();

        board(ennemi);


        board(moi);

        VBox vbox = new VBox(text, ennemi, stackPane, moi);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
    /**
     * Création du board en 5*5
     * @param ennemi borad allié/ennemi
     */
    private void board(GridPane ennemi) {
        for (int col = 0; col < 10; col++) {
            for (int line = 0; line < 10; line++) {
                Rectangle rec = new Rectangle(50, 50, Color.BLUE);
                ennemi.add(rec, col, line);
                
                rec.setOnMouseClicked((event) -> {
                    if (rec.getFill() == Color.BLUE) {
                        rec.setFill(Color.WHITE);
                    } else {
                        rec.setFill(Color.BLUE);
                    }
                });
                
            }
        }
    }

    /**
     * L'état du jeux qui pour le moment est "win" pour rester optimiste :).
     * @return WIN
     */
    private StackPane etatDeJeux() {
        Text etatDuJeux = new Text("WIN");
        etatDuJeux.setFill(Color.RED);
        etatDuJeux.setFont(Font.font(55));
        StackPane stackPane = new StackPane(etatDuJeux);
        return stackPane;
    }

    /**
     * Le titre du jeux
     * @return Le titre du jeux (BATTLE SHIP)     
     */
    private StackPane createTitle() {
        Text text = new Text("BATTLE SHIP");
        text.setFill(Color.RED);
        text.setFont(Font.font(55));
        StackPane stackPane = new StackPane(text);
        return stackPane;
    }

    /**
     * Création du grid
     * @return le grid allie/ennemi
     */
    private GridPane createGrid() {
        GridPane ennemi = new GridPane();
        ennemi.setPadding(new Insets(10));
        ennemi.setHgap(10);
        ennemi.setVgap(10);
        return ennemi;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
