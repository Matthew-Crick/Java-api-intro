import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/* Public class MainFrame extends javax.swing.JFrame as a library utilised 
 * for creating and showing frames. */
public class MainFrame extends JFrame {

    /* Textfields and Label objects*/
    final private Font mainFont = new Font("Times New Roman", Font.BOLD, 20);
    JTextField tfFirstName;
    JTextField tfLastName;
    JTextField tfAge;
    JLabel lbWelcome;

    /* Initialise JPanel object instances*/
    public void initialize() {

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        
        /* First Name Label query */
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        /* First Name TextField entry */
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        /* Last Name Label query */
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        /* Last Name TextField entry */
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        /* Age Label query */
        JLabel lbAge = new JLabel("Age");
        lbAge.setFont(mainFont);

        /* Age Textfield entry */
        JTextField tfAge = new JTextField();
        tfAge.setFont(mainFont);

        /* JPanel object */
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        formPanel.add(lbAge);
        formPanel.add(tfAge);

        /* Start Button */
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // executed on click of OK
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                String age = tfAge.getText();
                lbWelcome.setText("Greetings " + firstName + " " + lastName
                + " your age is " + age);
            }

        });

        /* Clear Button */
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // executed on click of Clear
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });

        /* Panel containing two buttons*/
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        /* Main Panel */
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(64, 128, 64));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
