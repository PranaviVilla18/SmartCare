
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private Label connectionStatus;

    @Override
    public void start(Stage stage) {

        // Main layout
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #F4F7FB;");

        // Sidebar
        VBox sidebar = new VBox(20);
        sidebar.setPadding(new Insets(25));
        sidebar.setPrefWidth(210);
        sidebar.setStyle("-fx-background-color: #173B57;");

        Label logo = new Label("SmartCare");
        logo.setFont(Font.font("Arial", 25));
        logo.setTextFill(Color.WHITE);

        Button dashboardBtn = createMenuButton("Dashboard");
        Button healthBtn = createMenuButton("My Health");
        Button medicinesBtn = createMenuButton("Medicines");
        Button appointmentsBtn = createMenuButton("Appointments");
        Button profileBtn = createMenuButton("My Profile");

        sidebar.getChildren().addAll(
                logo,
                dashboardBtn,
                healthBtn,
                medicinesBtn,
                appointmentsBtn,
                profileBtn
        );

        // Header
        HBox header = new HBox();
        header.setAlignment(Pos.CENTER_LEFT);
        header.setPadding(new Insets(20));

        Label welcome = new Label("Welcome to SmartCare");
        welcome.setFont(Font.font("Arial", 24));
        welcome.setTextFill(Color.web("#173B57"));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        connectionStatus = new Label("Checking backend...");
        connectionStatus.setTextFill(Color.DARKORANGE);

        header.getChildren().addAll(welcome, spacer, connectionStatus);

        // Dashboard cards
        HBox cards = new HBox(20);
        cards.setPadding(new Insets(20));

        VBox userCard = createCard("My Health", "Health records");
        VBox medicineCard = createCard("Medicines", "Medicine reminders");
        VBox appointmentCard = createCard("Appointments", "Upcoming visits");

        cards.getChildren().addAll(
                userCard,
                medicineCard,
                appointmentCard
        );

        // Medicine section
        VBox medicineSection = new VBox(15);
        medicineSection.setPadding(new Insets(20));

        Label medicineTitle = new Label("Medicine Reminders");
        medicineTitle.setFont(Font.font("Arial", 20));

        Label medicineInfo = new Label(
                "No medicine data loaded from backend yet."
        );

        medicineSection.getChildren().addAll(
                medicineTitle,
                medicineInfo
        );

        // Appointment section
        VBox appointmentSection = new VBox(15);
        appointmentSection.setPadding(new Insets(20));

        Label appointmentTitle = new Label("Appointments");
        appointmentTitle.setFont(Font.font("Arial", 20));

        Label appointmentInfo = new Label(
                "No appointment data loaded from backend yet."
        );

        appointmentSection.getChildren().addAll(
                appointmentTitle,
                appointmentInfo
        );

        VBox centerContent = new VBox(
                10,
                header,
                cards,
                medicineSection,
                appointmentSection
        );

        root.setLeft(sidebar);
        root.setCenter(centerContent);

        // Button actions
        dashboardBtn.setOnAction(e ->
                showMessage("Dashboard", "Welcome to SmartCare!")
        );

        healthBtn.setOnAction(e ->
                showMessage("My Health", "Health records section")
        );

        medicinesBtn.setOnAction(e ->
                showMessage("Medicines", "Medicine reminders section")
        );

        appointmentsBtn.setOnAction(e ->
                showMessage("Appointments", "Appointments section")
        );

        profileBtn.setOnAction(e ->
                showMessage("My Profile", "User profile section")
        );

        // Backend connection
        checkBackendConnection();

        Scene scene = new Scene(root, 1100, 700);

        stage.setTitle("SmartCare Health Management System");
        stage.setScene(scene);
        stage.show();
    }

    private Button createMenuButton(String text) {

        Button button = new Button(text);

        button.setMaxWidth(Double.MAX_VALUE);
        button.setAlignment(Pos.CENTER_LEFT);
        button.setStyle(
                "-fx-background-color: transparent;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 15px;" +
                "-fx-padding: 12px;"
        );

        return button;
    }

    private VBox createCard(String title, String description) {

        VBox card = new VBox(12);

        card.setPadding(new Insets(20));
        card.setPrefWidth(230);
        card.setStyle(
                "-fx-background-color: white;" +
                "-fx-background-radius: 12;" +
                "-fx-border-radius: 12;"
        );

        Label heading = new Label(title);
        heading.setFont(Font.font("Arial", 19));
        heading.setTextFill(Color.web("#173B57"));

        Label details = new Label(description);
        details.setFont(Font.font("Arial", 13));

        card.getChildren().addAll(heading, details);

        return card;
    }

    private void showMessage(String title, String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void checkBackendConnection() {

        String result = BackendConnection.testConnection();

        System.out.println("SmartCare Backend:");
        System.out.println(result);

        if (result.startsWith("200")) {
            connectionStatus.setText("Backend Connected");
            connectionStatus.setTextFill(Color.GREEN);
        } else {
            connectionStatus.setText("Backend Not Connected");
            connectionStatus.setTextFill(Color.RED);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
