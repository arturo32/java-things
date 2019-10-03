
//import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class Tentando {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MEU FRAME!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        int x = 130;
        JTextArea label = new JTextArea("Hello World!");
        label.setBounds(5, 5, 180, 180);
        frame.add(label);
        label.setText("");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <10; j++){
                label.setText(label.getText()+"-    ");
            }
            label.setText(label.getText()+"\n");
           
        }
        
        frame.setVisible(true);
        
        
        /*Scanner leitor = new Scanner(System.in);
        int r;
        Calc primeiro = new Calc();
        //primeiro.setNums(4, 6);
        Calc segundo = new Calc();
        segundo.setNums(leitor.nextInt(), 4);
        r = primeiro.some();
        Calc terceiro = new Calc();
        System.out.println(r + " " + segundo.some() + " " + terceiro.some());  */
        
    }
    
}
