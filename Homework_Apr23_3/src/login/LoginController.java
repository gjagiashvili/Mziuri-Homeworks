package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    private final UserStorage storage = new UserStorage();
    @FXML
    private Label signupStatus;
    @FXML
    private TextField signupUsername, signupPassword, signupRePassword;

    public void signUp(ActionEvent event) {
        String username = signupUsername.getText();
        String password = signupPassword.getText();
        String rePassword = signupRePassword.getText();

        if (username.isEmpty()) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.isEmpty()) {
            signupStatus.setText("Please enter password");
            return;
        }
        if (rePassword.isEmpty()) {
            signupStatus.setText("Please re-enter password");
            return;
        }
        if (!password.equals(rePassword)) {
            signupStatus.setText("Passwords aren't matching!");
            return;
        }
        if (storage.getUser(username) != null) {
            signupStatus.setText("Username already registered!");
            return;
        }

        User user = new User(username, password);
        storage.addUser(user);

        signupStatus.setText("You are registered! Log in now.");
        signupUsername.clear();
        signupPassword.clear();
        signupRePassword.clear();
    }


    @FXML
    private TextField loginUsername, loginPassword;
    @FXML
    private Label loginStatus;

    public void logIn(ActionEvent event) {
        String username = loginUsername.getText();
        String password = loginPassword.getText();

        if (username.isEmpty()) {
            loginStatus.setText("Please enter username");
            return;
        }
        if (password.isEmpty()) {
            loginStatus.setText("Please enter password");
            return;
        }

        User user = storage.getUser(username);
        if (user == null || !user.getPassword().equals(password)) {
            loginStatus.setText("Incorrect username or password!");
        } else {
            loginStatus.setText("Login successful!");
        }
    }

}