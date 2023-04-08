import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Practical_18 extends Applet implements ActionListener{
   TextField t1 = new TextField(10);
   TextField t2 = new TextField(10);
   TextField t3 = new TextField(10);
   Label l1 = new Label("First No. : ");
   Label l2 = new Label("Second No. : ");
   Label l3 = new Label("Sum : ");
   Button b = new Button("Add");
   public void init() {
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(l3);
      add(t3);
      add(b);
      b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b){
        int n1 = Integer.parseInt(t1.getName());
        int n2 = Integer.parseInt(t2.getName());
        t3.setText(""+(n1+n2));
      }
   }
}