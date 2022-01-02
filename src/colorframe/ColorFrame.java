package colorframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame implements ActionListener {
    private JPanel p = new JPanel();
    private JButton OK = new JButton("OK");
    private JButton newOK = new JButton("Green");
    private JComboBox<String> chon = new JComboBox<>();
    public ColorFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);

        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(OK);
        ps.add(newOK);
        ps.add(chon);
        chon.addItem("XANH");
        chon.addItem("DO");
        chon.addItem("TIM");
        chon.addItem("VANG");
        chon.addItem("CAM");

        add(ps, BorderLayout.SOUTH);
        OK.addActionListener(this);
        newOK.addActionListener(this);
//        OK.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String s= chon.getSelectedItem().toString();
//                if(s.equals("XANH"))
//                    p.setBackground(Color.BLUE);
//                if(s.equals("DO"))
//                    p.setBackground(Color.RED);
//                if(s.equals("TIM"))
//                    p.setBackground(Color.MAGENTA);
//                if(s.equals("VANG"))
//                    p.setBackground(Color.YELLOW);
//                if(s.equals("CAM"))
//                    p.setBackground(Color.ORANGE);
//            }
//        }) ;
//
//        newOK.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                p.setBackground(Color.GREEN);
//            }
//        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(OK)) {
            String s = chon.getSelectedItem().toString();
            if (s.equals("XANH"))
                p.setBackground(Color.BLUE);
            if (s.equals("DO"))
                p.setBackground(Color.RED);
            if (s.equals("TIM"))
                p.setBackground(Color.MAGENTA);
            if (s.equals("VANG"))
                p.setBackground(Color.YELLOW);
            if (s.equals("CAM"))
                p.setBackground(Color.ORANGE);
        }else p.setBackground(Color.GREEN);

    }
}
