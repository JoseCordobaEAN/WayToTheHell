package Pricipal.View;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JCALLE
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        startMap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Mapa = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setName("jFrame2"); // NOI18N
        jFrame2.getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("ATACK");

        jButton3.setText("SPECIAL ABILITY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton3)
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel3)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jFrame2.getContentPane().add(jPanel2);
        jPanel2.setBounds(-20, 330, 800, 110);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jFrame2.getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 10, 260, 110);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jFrame2.getContentPane().add(jPanel4);
        jPanel4.setBounds(540, 20, 220, 0);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BATTLE");
        jFrame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 10, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Means/historia.jpg"))); // NOI18N
        jFrame2.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 776, 439);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 360));
        setMinimumSize(new java.awt.Dimension(550, 360));
        setPreferredSize(new java.awt.Dimension(550, 360));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mapa.setMaximumSize(new java.awt.Dimension(700, 700));
        Mapa.setMinimumSize(new java.awt.Dimension(700, 700));
        Mapa.setOpaque(false);
        Mapa.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 550, 330));

        Fondo.setMaximumSize(new java.awt.Dimension(1680, 1500));
        Fondo.setMinimumSize(new java.awt.Dimension(1680, 1500));
        Fondo.setPreferredSize(new java.awt.Dimension(1680, 1500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Means/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 440, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 1050, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int keyPressed = evt.getKeyCode();
        switch (keyPressed) {
            case KeyEvent.VK_UP:
                if (posX != 0) {
                    if (!(map[posX - 1][posY].getIcon() == pop[2])) {
                        map[posX][posY].setIcon(null);
                        posX--;
                        map[posX][posY].setIcon(pop[1]);
                    }
                }
                break;
            case KeyEvent.VK_DOWN:
                if (posX != 7) {
                    if (!(map[posX + 1][posY].getIcon() == pop[2])) {
                        map[posX][posY].setIcon(null);
                        posX++;
                        map[posX][posY].setIcon(pop[1]);
                    }
                }
                break;
            case KeyEvent.VK_LEFT:
                if (posY != 0) {
                    if (!(map[posX][posY - 1].getIcon() == pop[2])) {
                        map[posX][posY].setIcon(null);
                        posY--;
                        map[posX][posY].setIcon(pop[1]);
                    }
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (posY != 7) {
                    if (!(map[posX][posY + 1].getIcon() == pop[2])) {
                        map[posX][posY].setIcon(null);
                        posY++;
                        map[posX][posY].setIcon(pop[1]);
                    }
                }
                break;
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void startMap() {
        pop[1] = new ImageIcon(getClass().getResource("/Means/soldier.png"));
        pop[2] = new ImageIcon(getClass().getResource("/Means/wall.png"));
        pop[3] = new ImageIcon(getClass().getResource("/Means/Hades.png"));

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new JLabel(pop[1]);
                map[i][j].setIcon(null);
                Mapa.add(map[i][j]);
            }

        }
        map[0][0].setIcon(pop[1]);
        map[1][6].setIcon(pop[3]);

        map[1][0].setIcon(pop[2]);
        map[1][1].setIcon(pop[2]);
        map[2][1].setIcon(pop[2]);
        map[3][1].setIcon(pop[2]);
        map[4][1].setIcon(pop[2]);
        map[6][0].setIcon(pop[2]);
        map[6][1].setIcon(pop[2]);
        map[6][2].setIcon(pop[2]);
      
        map[0][3].setIcon(pop[2]);
        map[1][3].setIcon(pop[2]);
        map[2][3].setIcon(pop[2]);
        map[2][4].setIcon(pop[2]);
        map[3][4].setIcon(pop[2]);
        map[4][4].setIcon(pop[2]);
        map[5][4].setIcon(pop[2]);
        map[0][7].setIcon(pop[2]);
        map[1][7].setIcon(pop[2]);
        map[2][7].setIcon(pop[2]);
        map[2][6].setIcon(pop[2]);
        map[3][6].setIcon(pop[2]);
        map[4][6].setIcon(pop[2]);
        map[5][6].setIcon(pop[2]);
        map[7][5].setIcon(pop[2]);
        map[7][6].setIcon(pop[2]);
        map[7][7].setIcon(pop[2]);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    int posX = 0, posY = 0;
    private final JLabel[][] map = new JLabel[8][8];
    private ImageIcon pop[] = new ImageIcon[5];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Mapa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    // End of variables declaration//GEN-END:variables
}
