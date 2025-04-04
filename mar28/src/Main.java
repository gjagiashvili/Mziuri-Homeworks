import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//       Group root = new Group();
//       Scene scene = new Scene(root, 500, 100, Color.RED);
//
//       Text text = new Text("გამარჯობა ეს არის აპლიკაცია");
//       text.setFont(Font.font("Helvetica", 30));
//       text.setFill(Color.WHITE);
//       text.setX(25);
//       text.setY(50);
//       root.getChildren().add(text);
//
//       Image icon = new Image("support.png");
//       stage.setScene(scene);
//       stage.getIcons().add(icon);
//
//       stage.setTitle("აპლიკაცია");
//       stage.setScene(scene);
//       stage.setResizable(false);
//       stage.show();
//  }

//
//    @Override
//    public void start(Stage stage) {
//        Group root = new Group();
//        Scene scene = new Scene(root, 400, 400, Color.LIGHTGRAY);
//
//        Rectangle square = new Rectangle(100, 100, 200, 200);
//        square.setFill(Color.GREEN);
//        root.getChildren().add(square);
//
//        Line top = new Line(100, 100, 300, 100);
//        Line right = new Line(300, 100, 300, 300);
//        Line bottom = new Line(300, 300, 100, 300);
//        Line left = new Line(100, 300, 100, 100);
//
//        for (Line line : new Line[]{top, right, bottom, left}) {
//            line.setStroke(Color.BLUE);
//            line.setStrokeWidth(3);
//            root.getChildren().add(line);
//        }
//
//        Line diagonal1 = new Line(100, 100, 300, 300);
//        Line diagonal2 = new Line(100, 300, 300, 100);
//        diagonal1.setStroke(Color.YELLOW);
//        diagonal2.setStroke(Color.YELLOW);
//        diagonal1.setStrokeWidth(2);
//        diagonal2.setStrokeWidth(2);
//        root.getChildren().addAll(diagonal1, diagonal2);
//
//        stage.setTitle("კვადრატი");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
//    }
//}
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.WHITE);

        Circle face = new Circle(200, 200, 120);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(10);
        root.getChildren().add(face);

        Circle eyeLeft = new Circle(170, 180, 10);
        Circle eyeRight = new Circle(230, 180, 10);
        eyeLeft.setFill(Color.BLACK);
        eyeRight.setFill(Color.BLACK);
        root.getChildren().addAll(eyeLeft, eyeRight);

        Line mouth = new Line(170, 240, 230, 240);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(15);
        root.getChildren().add(mouth);

        stage.setScene(scene);
        stage.setTitle("სმაილი");
        stage.show();
    }
 }
