
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorMaker implements ActionListener {


    private final JFrame mainFrame;
    //   private JPanel panel;
    private JPanel numbersPanel;
    private JPanel borderPanel;
    private JLabel label;
    private int nClicks;
    private double answer=0;
    private double a;
    private double b;
    private int func;



    private JButton exponent;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton multiply;
    private JButton divide;
    private JButton add;
    private JButton subtract;
    private JButton equals;
    private JButton blank;
    private JButton decimal;
    private JButton clear;
    private JButton buttonSquared;
    private JButton buttonCubed;
    private Calculator calculator;


    public static void main(String[] args) {CalculatorMaker myCalculatorMaker = new CalculatorMaker();}

    public CalculatorMaker(){
//        nClicks = new Integer(0);

        calculator = new Calculator();

//        answer = new double;

        mainFrame = new JFrame();

        label = new JLabel();

        borderPanel = new JPanel();

        numbersPanel = new JPanel();

        button1 = new JButton("1");
        button1.addActionListener(this); //makes button clickable

        button2 = new JButton("2");
        button2.addActionListener(this); //makes button clickable

        button3 = new JButton("3");
        button3.addActionListener(this); //makes button clickable

        button4 = new JButton("4");
        button4.addActionListener(this); //makes button clickable

        button5 = new JButton("5");
        button5.addActionListener(this); //makes button clickable

        button6 = new JButton("6");
        button6.addActionListener(this); //makes button clickable

        button7 = new JButton("7");
        button7.addActionListener(this); //makes button clickable

        button8 = new JButton("8");
        button8.addActionListener(this); //makes button clickable

        button9 = new JButton("9");
        button9.addActionListener(this); //makes button clickable

        button0 = new JButton("0");
        button0.addActionListener(this); //makes button clickable

        multiply = new JButton("x");
        multiply.addActionListener(this); //makes button clickable

        divide = new JButton("÷");
        divide.addActionListener(this); //makes button clickable

        add = new JButton("+");
        add.addActionListener(this); //makes button clickable

        subtract = new JButton("-");
        subtract.addActionListener(this); //makes button clickable

        equals = new JButton("=");
        equals.addActionListener(this); //makes button clickable

        blank = new JButton();
        blank.addActionListener(this); //makes button clickable

        exponent = new JButton("^");
        exponent.addActionListener(this); //makes button clickable

        buttonSquared = new JButton("x^2");
        buttonSquared.addActionListener(this); //makes button clickable

        buttonCubed = new JButton("x^3");
        buttonCubed.addActionListener(this);

        decimal = new JButton (".");
        decimal.addActionListener(this);

        clear = new JButton("Clear");
        clear.addActionListener(this);

        label = new JLabel(" ");
        label.setSize(1000,200);








        //      label = new JLabel();
        //     borderPanel = new JPanel();
        //     numbersPanel = new JPanel();
        //panel = new JPanel();

        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(label, BorderLayout.NORTH);
        label.setBackground(Color.white);
        label.setSize(1000,200);
        numbersPanel.setBackground(Color.black);
        borderPanel.add(numbersPanel, BorderLayout.CENTER);



        //    borderPanel.add(label, BorderLayout.NORTH);
        //    borderPanel.add(numbersPanel, BorderLayout.CENTER);
        numbersPanel.setLayout(new GridLayout(5,4));

        numbersPanel.add(buttonSquared);
        numbersPanel.add(buttonCubed);
        numbersPanel.add(exponent);
        numbersPanel.add(divide);
        numbersPanel.add(button1);
        numbersPanel.add(button2);
        numbersPanel.add(button3);
        numbersPanel.add(multiply);
        numbersPanel.add(button4);
        numbersPanel.add(button5);
        numbersPanel.add(button6);
        numbersPanel.add(subtract);
        numbersPanel.add(button7);
        numbersPanel.add(button8);
        numbersPanel.add(button9);
        numbersPanel.add(add);
        numbersPanel.add(clear);
        numbersPanel.add(button0);
        numbersPanel.add(decimal);
        numbersPanel.add(equals);



        //int borderSize = 1;

        //panel.setBorder(BorderFactory.createEmptyBorder(borderSize,borderSize,borderSize,borderSize));


        //    panel.setLayout(new BorderLayout());
        //panel.add(button9, BorderLayout.EAST);
        //panel.add(button10, BorderLayout.SOUTH);
        //panel.add(label, BorderLayout.CENTER);

        //gridPanel.setLayout(new GridLayout(2,3));
        mainFrame.add(borderPanel);

        mainFrame.setSize(500,700);
        mainFrame.pack();
        mainFrame.setVisible(true);








    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonClicked = e.getSource();
        if (buttonClicked == decimal)
        {label.getText();
        label.setText(label.getText() + ".");
        }
        if (buttonClicked == button1) {
            System.out.print("1");
            nClicks++;
            label.getText();
            label.setText(label.getText() + "1");

        } else if (buttonClicked == button2) {
            System.out.print("2");
            nClicks = nClicks + 2;
            label.getText();
            label.setText(label.getText() + "2");

        } else if (buttonClicked == button3) {
            System.out.print("3");
            nClicks = nClicks + 3;
            label.getText();
            label.setText(label.getText() + "3");

        } else if (buttonClicked == button4) {
            System.out.print("4");
            nClicks = nClicks + 4;
            label.getText();
            label.setText(label.getText() + "4");

        } else if (buttonClicked == button5) {
            System.out.print("5");
            nClicks = nClicks + 5;
            label.getText();
            label.setText(label.getText() + "5");

        } else if (buttonClicked == button6) {
            System.out.print("6");
            nClicks = nClicks + 6;
            label.getText();
            label.setText(label.getText() + "6");

        } else if (buttonClicked == button7) {
            System.out.print("7");
            nClicks = nClicks + 7;
            label.getText();
            label.setText(label.getText() + "7");

        } else if (buttonClicked == button8) {
            System.out.print("8");
            nClicks = nClicks + 8;
            label.getText();
            label.setText(label.getText() + "8");

        } else if (buttonClicked == button9) {
            System.out.print("9");
            nClicks = nClicks + 9;
            label.getText();
            label.setText(label.getText() + "9");

        } else if (buttonClicked == button0) {
            System.out.print("0");
            nClicks = nClicks + 0;
//            label.getText();
            label.setText(label.getText() + "0");

        } else if (buttonClicked == clear) {
            nClicks = 0;
            System.out.println("clearing");

//            label.getText();
            label.setText(" ");
        }

        if (buttonClicked == add) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            System.out.println("a: " + a);
            func = 0;

        }

        if (buttonClicked == subtract) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 1;

        }

        if (buttonClicked == multiply) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 2;
        }

        if (buttonClicked == divide) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 3;
        }

        if (buttonClicked == buttonSquared) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 4;
        }
        if (buttonClicked == buttonCubed) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 5;
        }
        if (buttonClicked == exponent) {
            a = Double.parseDouble(label.getText());
            label.setText(" ");
            func = 6;
        }


        if (buttonClicked == equals) {
            if (func == 0) {
                b = Double.parseDouble(label.getText());
                System.out.println("b: " + b);
//            calculator.add(a,b);
                answer = calculator.add(a, b);
                label.setText("" + answer);
            }
            if (func == 1) {
                b = Double.parseDouble(label.getText());
                System.out.println("b: " + b);
//            calculator.add(a,b);
                answer = calculator.subtract(a, b);
                label.setText("" + answer);
            }
            if (func == 2) {
                b = Double.parseDouble(label.getText());
                System.out.println("b: " + b);
//            calculator.add(a,b);
                answer = calculator.multiply(a, b);
                label.setText("" + answer);
            }
            if (func == 3) {
                b = Double.parseDouble(label.getText());
                System.out.println("b: " + b);
//            calculator.add(a,b);
                answer = calculator.divide(a, b);
                label.setText("" + answer);
            }
            if (func == 4) {

//            calculator.add(a,b);
                answer = calculator.squared(a);
                label.setText("" + answer);
            }
            if (func == 5) {

//            calculator.add(a,b);
                answer = calculator.cubed(a);
                label.setText("" + answer);
            }
            if (func == 6) {
                b = Double.parseDouble(label.getText());
                System.out.println("b: " + b);
//            calculator.add(a,b);
                if (b == 0) {
                    answer = 1;
                    label.setText("" + answer);

                } else answer = calculator.power(a, b);
                label.setText("" + answer);

            }
        }
    }

    }
