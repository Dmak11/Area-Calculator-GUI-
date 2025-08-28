package PackageCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ActionMapUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JFrame frame = new JFrame("Area Calculator");
    JPanel cont = new JPanel();
    JPanel m1 = new JPanel();
    JPanel m2 = new JPanel();
    JPanel m3 = new JPanel();
    JPanel m4 = new JPanel();
    JButton b1 = new JButton("Rectangle");
    JButton b2 = new JButton("Circle");
    JButton b3 = new JButton("Triangle");
    JButton calcr = new JButton("Calculate Area:");
    JButton calcc = new JButton("Calculate Area:");
    JButton calct = new JButton("Calculate Area:");
    JButton rt1 = new JButton("Return");
    JButton rt2 = new JButton("Return");
    JButton rt3 = new JButton("Return");
    CardLayout cl = new CardLayout();
    JLabel l1 = new JLabel("Please select a shape to calculate it's area:");
    JLabel a1r = new JLabel("Area is: ");
    JLabel a1c = new JLabel("Area is: ");
    JLabel a1t = new JLabel("Area is: ");
    JLabel length = new JLabel("Length:");
    JTextField lf = new JTextField();
    JLabel width = new JLabel("Width:");
    JTextField wf = new JTextField();
    JLabel height = new JLabel("Height:");
    JTextField hf = new JTextField();
    JLabel base = new JLabel("Base: ");
    JTextField bf = new JTextField();
    JLabel radius = new JLabel("Radius:");
    JTextField rf = new JTextField();
    InputHandlerR IHR = new InputHandlerR();
    InputHandlerC IHC = new InputHandlerC();
    InputHandlerT IHT = new InputHandlerT();


    public GUI() {
        cont.setLayout(cl);

        m1.add(l1);
        m1.add(b1);
        m1.add(b2);
        m1.add(b3);

        m2.add(length);
        m2.add(lf);
        lf.setPreferredSize(new Dimension(80, 20));
        m2.add(width);
        m2.add(wf);
        wf.setPreferredSize(new Dimension(80, 20));
        m2.add(calcr);
        calcr.addActionListener(IHR);
        m2.add(a1r);
        m2.add(rt1);

        m3.add(radius);
        m3.add(rf);
        rf.setPreferredSize(new Dimension(80, 20));
        m3.add(calcc);
        calcc.addActionListener(IHC);
        m3.add(a1c);
        m3.add(rt2);

        m4.add(height);
        m4.add(hf);
        hf.setPreferredSize(new Dimension(80, 20));
        m4.add(base);
        m4.add(bf);
        bf.setPreferredSize(new Dimension(80, 20));
        m4.add(calct);
        calct.addActionListener(IHT);
        m4.add(a1t);
        m4.add(rt3);

        cont.add(m1, "1");
        cont.add(m2, "2");
        cont.add(m3, "3");
        cont.add(m4, "4");
        cl.show(cont, "1");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "2");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "3");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "4");
            }
        });
        rt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "1");
            }
        });
        rt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "1");
            }
        });
        rt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(cont, "1");
            }
        });

        frame.add(cont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(750,75);
        frame.setVisible(true);
    }

    public class InputHandlerR implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double inputl = Double.parseDouble(lf.getText());
            double inputw = Double.parseDouble(wf.getText());
            AreaCalc r = new Rectangle(inputl, inputw);
            a1r.setText(String.valueOf("Area is: " + r.area()));
        }
    }

    public class InputHandlerC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double inputr = Double.parseDouble(rf.getText());
            AreaCalc c = new Circle(inputr);
            a1c.setText(String.valueOf("Area is: " + c.area()));
        }
    }

    public class InputHandlerT implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double inputh = Double.parseDouble(hf.getText());
            double inputb = Double.parseDouble(bf.getText());
            AreaCalc t = new Triangle(inputh, inputb);
            a1t.setText(String.valueOf("Area is: " + t.area()));
        }
    }
}
