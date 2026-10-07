import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

class Calculator implements ActionListener{
    Frame f;
    TextField t1,t2,r;
    Button add,sub,mul,div;

Calculator(){
    f=new Frame("AWT Calculator");

        Label l1 = new Label("Enter First Number: ");
        Label l2 = new Label("Enter Second Number: ");
        Label result = new Label("Result: ");

        t1 = new TextField();
        t2 = new TextField();
        r = new TextField();

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("x");
        div = new Button("/");

        l1.setBounds(50, 50, 130, 30);
        l2.setBounds(50, 100, 130, 30);
        result.setBounds(50, 150, 130, 30);

        t1.setBounds(200, 50, 150, 30);
        t2.setBounds(200, 100, 150, 30);
        r.setBounds(200, 150, 150, 30);

        add.setBounds(50, 210, 60, 40);
        sub.setBounds(120, 210, 60, 40);
        mul.setBounds(190, 210, 60, 40);
        div.setBounds(260, 210, 60, 40);

        f.add(l1); f.add(l2);
        f.add(result);

        f.add(t1); f.add(t2);
        f.add(r);

        f.add(add); f.add(sub);
        f.add(mul); f.add(div);

        f.setSize(400, 300); f.setLayout(null);
        f.setVisible(true);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double res = 0;

        if (e.getSource() == add) {
            res = a + b;
        }
        else if (e.getSource() == sub) {
            res = a - b;
        }
        else if (e.getSource() == mul) {
            res = a * b;
        }
        else if (e.getSource() == div) {
            res = a / b;
        }

        r.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new Calculator();
    }
} 
