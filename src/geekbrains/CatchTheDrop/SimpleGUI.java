package geekbrains.CatchTheDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



    public class SimpleGUI extends JFrame {

        private JButton button = new JButton("Press");
        private JTextField input = new JTextField("",5);//текстовое поле
        private JLabel label = new JLabel("Input:");
        private JRadioButton radio1 = new JRadioButton("Select this"); //кнопки выбора либо radio1 либо radio2
        private JRadioButton radio2 = new JRadioButton("Select that");
        private JCheckBox check = new JCheckBox(); //кнопочка-галочка, например согласиться с лицензией

        public SimpleGUI(){ //конструктор, который будет вызываться при создании объекта класса
        super("Simple Example"); // передаем значение в форму конструктора super - двизаемся к основному конструктору в классе JFrame
        this.setBounds(100,100,250,100); //здесь уже в данном классе SimpleGUI устанавливаем размеры экрана
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// операция для закрытия программы


        Container container= this.getContentPane(); // это наша форма в которую мы помещяем все вышеуказанные кнопочки
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label); //
        container.add(input);

        ButtonGroup group = new ButtonGroup(); // radio1 и radio2 связаны, если один выбран, другой отключается, помещаем их в один контейнер
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true); //radio1 выбран по умолчанию, далее можем выбрать другой
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

        }
class ButtonEventListener implements ActionListener{
            public void actionPerformed (ActionEvent event) {
                String message = "";
                message+="Button was presed\n";
                message+="Text is " + input.getText() + "\n";
                message+=(radio1.isSelected()?"Radio#1":"Radio #2")+ "\n";
                message+="Checkbox is " + (check.isSelected()? "checked": "unchecked");
                JOptionPane.showMessageDialog(null,message,"Output", JOptionPane.PLAIN_MESSAGE);
            }
    }
}

