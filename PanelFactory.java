import javax.swing.*;
import java.sql.SQLException;

public class PanelFactory {
    public static JFrame createPanel(String panelType) {
        switch (panelType.toLowerCase()) {
            case "addbook":
                return new AddBook();
            case "admin":
                return new Admin();
            case "adminfunc":
                return new AdminFunc();
            case "searchbyname":
                return new SearchByName();
            case "userscreen":
                return new UserScreen();
            case "history":
                try {
                    return new history(1); // Example userId
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            case "mainscreen":
                return new MainScreen();
            default:
                throw new IllegalArgumentException("Unknown panel type: " + panelType);
        }
    }
}
