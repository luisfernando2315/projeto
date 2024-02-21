import javax.swing.Icon;
import javax.swing.ImageIcon;

 public class LabelFrame extends JFrame
         {
         private final JLabel label1;
         private final JLabel label2;
         private final JLabel label3;
         
         public LabelFrame(){
             super("Testing JLabel");
               setLayout(new FlowLayout() );
               
               label1 = new JLabel("INSTITUTO FEDERAL");
               label1.setToolTipText("this is Label");
               add(label1);
               
               Icon bug = new ImageIcon(getClass().getResource("ifmt.png"));
               label2 = new JLabel("DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA", bug, SwingConstants.LEFT);
               label2.setToolTipText("this is label2");
               add(label2);
               
               
              label3 = new JLabel();
              label3.setText("DE MATO GROSSO");
             
              label3.setHorizontalTextPosition(SwingConstants.CENTER);
              label3.setVerticalTextPosition(SwingConstants.BOTTOM);
              label3.setToolTipText("this is label3");
              add(label3);
         }
 }
              
