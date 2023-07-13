package View.Login;

import java.awt.Image;
import java.awt.Toolkit;
    import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame implements Model.Views{

    
    public Login() {
        setLayout(null);
        setTitle("Exchange Master");
        initComponents();
        
        //Se ingresa el icono de la app en lugar de la de java
        ImageIcon iconApp = new ImageIcon(getClass().getResource("Images/logoApp.ico"));
        setIconImage(iconApp.getImage());
                
    }
    @Override
    public Image getIconImage (){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logoApp.png"));
        return retValue;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton1.setText("Press to enter");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Alura\\AluraCursos\\Java\\ChallengeJavaUno\\ciclo 1\\Diseño\\Imagenes\\logoApp.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 71, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 600, 400));

        Background.setBackground(new java.awt.Color(0, 102, 204));
        Background.setForeground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.executeView();
        this.closeView();
        
        //super.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void executeView() {
        View.Menu.Menu menu = new View.Menu.Menu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setLocationRelativeTo(null);
        menu.setSize(600, 600);
    }

    @Override
    public void closeView() {
        this.setVisible(false);
    }

}
