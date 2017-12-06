import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginBox {
    private JPanel Login;
    private JTextField textField1;
    private JPasswordFieldField PasswordField;
    private JButton exitButton;
    private JButton LoginButton;
    public static JFrame LoginFR=new JFrame(title "Login Box");

    public static void main(String [] args) {
        LoginFR.setConnectPane(new LoginBox().Login);
        LoginFR.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LoginFR.pack();
        LoginFR.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    private void LoginCheck(String frUsername,String frPW)

    {
        String inUsername="COSC";
        String inPW="22035";
        if(frUsername.equals(inUsername)&& frPW.equals(inPW))
            JOptionPane.showMessageDialog(null,"Username and Password Correct");
    }
    }



}
