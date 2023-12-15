import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Biodata extends JFrame {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textArea1;
    private JButton button1;
    private JPanel mainPanel;
    private JLabel jNama;
    private JLabel nama;
    private JTextField textField2;

    public Biodata(){
        setContentPane(mainPanel);
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NAMA = textField1.getText();
                Action tanggal =comboBox1.getAction();
                textField2.setText(NAMA);

            }
        });
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();


    }
}
