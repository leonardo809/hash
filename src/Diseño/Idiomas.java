/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import código.idiomas;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Home1
 */
public class Idiomas extends javax.swing.JFrame {
 
    /**
     * Creates new form Idiomas
     */
    public Idiomas() {
        initComponents();
        cambiarIdioma("Espanol");
        l1.setSize(new Dimension(p1.getWidth(),p1.getHeight()));
        btm.setLocation(p1.getWidth()-btc.getWidth(),p1.getHeight()/15);
        btm.setSize(new Dimension(30,30));
        btm.setText("");
        btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
        btc.setSize(new Dimension(30,30));
        btc.setText("");
        Toolkit t= Toolkit.getDefaultToolkit();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/log.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(jPanel1.getWidth(),jPanel1.getHeight()));
        ImageIcon cerrar=new ImageIcon(getClass().getResource("/iconos/cerrar.png"));
        Icon cierra= new ImageIcon(cerrar.getImage().getScaledInstance(btc.getWidth(), btc.getHeight(), Image.SCALE_DEFAULT));
        btc.setIcon(cierra);
        ImageIcon minimizar=new ImageIcon(getClass().getResource("/iconos/minimizar.png"));
        Icon mini= new ImageIcon(minimizar.getImage().getScaledInstance(btm.getWidth(), btm.getHeight(), Image.SCALE_DEFAULT));
        btm.setIcon(mini);
        ImageIcon esp=new ImageIcon(getClass().getResource("/banderas/españa.png"));
        Icon espa= new ImageIcon(esp.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_DEFAULT));
        b1.setIcon(espa);
        ImageIcon ale=new ImageIcon(getClass().getResource("/banderas/alemania.png"));
        Icon alem= new ImageIcon(ale.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_DEFAULT));
        b2.setIcon(alem);
        ImageIcon fra=new ImageIcon(getClass().getResource("/banderas/frances.png"));
        Icon fran= new ImageIcon(fra.getImage().getScaledInstance(b4.getWidth(), b4.getHeight(), Image.SCALE_DEFAULT));
        b4.setIcon(fran);
        ImageIcon ing=new ImageIcon(getClass().getResource("/banderas/ingles.png"));
        Icon ingl= new ImageIcon(ing.getImage().getScaledInstance(b5.getWidth(), b5.getHeight(), Image.SCALE_DEFAULT));
        b5.setIcon(ingl);
        ImageIcon iti=new ImageIcon(getClass().getResource("/banderas/italiano.png"));
        Icon ita= new ImageIcon(iti.getImage().getScaledInstance(b6.getWidth(), b6.getHeight(), Image.SCALE_DEFAULT));
        b6.setIcon(ita);
        ImageIcon por=new ImageIcon(getClass().getResource("/banderas/portugues.png"));
        Icon port= new ImageIcon(por.getImage().getScaledInstance(b7.getWidth(), b7.getHeight(), Image.SCALE_DEFAULT));
        b7.setIcon(port);
        ImageIcon rus=new ImageIcon(getClass().getResource("/banderas/rusia.png"));
        Icon ruso= new ImageIcon(rus.getImage().getScaledInstance(b8.getWidth(), b8.getHeight(), Image.SCALE_DEFAULT));
        b8.setIcon(ruso);
        Cursor cursor;
        ImageIcon flecha=new ImageIcon(getClass().getResource("/cursores/flecha2.png"));
        cursor=t.createCustomCursor(flecha.getImage(), new Point(1,1), "flecha");
        setCursor(cursor);
    }
    private int x,y;
    Portada por=new Portada();

private void mano(){
         Toolkit t= Toolkit.getDefaultToolkit();
        Cursor cursor;
        ImageIcon mano=new ImageIcon(getClass().getResource("/cursores/mano.png"));
        cursor=t.createCustomCursor(mano.getImage(), new Point(1,1), "mano");
        btc.setCursor(cursor);
        btm.setCursor(cursor);
        b1.setCursor(cursor);
        b2.setCursor(cursor);
        b4.setCursor(cursor);
        b5.setCursor(cursor);
        b6.setCursor(cursor);
        b7.setCursor(cursor);
        b8.setCursor(cursor);
    }
    
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        btc = new javax.swing.JButton();
        btm = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDIOMAS");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.setLayout(null);

        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(230, 40, 40, 40);

        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(340, 40, 40, 40);

        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(390, 100, 40, 40);

        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(80, 100, 40, 40);

        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6MouseEntered(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(180, 100, 40, 40);

        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b7MouseEntered(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(290, 100, 40, 40);

        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b8MouseEntered(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(130, 40, 40, 40);

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Selecciona un idioma:");
        jPanel1.add(l2);
        l2.setBounds(40, 170, 200, 40);

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Español");
        jPanel1.add(l3);
        l3.setBounds(240, 180, 230, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 260));

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.setLayout(null);

        btc.setText("jButton1");
        btc.setToolTipText("cerrar");
        btc.setBorder(null);
        btc.setContentAreaFilled(false);
        btc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btcMouseEntered(evt);
            }
        });
        btc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcActionPerformed(evt);
            }
        });
        p1.add(btc);
        btc.setBounds(900, 10, 73, 23);

        btm.setText("jButton1");
        btm.setToolTipText("minimizar");
        btm.setBorder(null);
        btm.setContentAreaFilled(false);
        btm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmMouseEntered(evt);
            }
        });
        btm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActionPerformed(evt);
            }
        });
        p1.add(btm);
        btm.setBounds(590, 10, 41, 15);

        l1.setFont(new java.awt.Font("Kalinga", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("IDIOMA");
        l1.setToolTipText("");
        l1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                l1MouseDragged(evt);
            }
        });
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l1MousePressed(evt);
            }
        });
        p1.add(l1);
        l1.setBounds(0, 0, 290, 40);

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 510, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcMouseEntered
        mano();
    }//GEN-LAST:event_btcMouseEntered

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btcActionPerformed

    private void l1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_l1MouseDragged

    private void l1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_l1MousePressed

    private void btmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_btmActionPerformed

    private void btmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmMouseEntered
        mano();   
    }//GEN-LAST:event_btmMouseEntered

    private void b8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseEntered
        mano();  
        cambiarIdioma("ruso");
    }//GEN-LAST:event_b8MouseEntered

    private void b7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseEntered
        mano();
        cambiarIdioma("portugues");
    }//GEN-LAST:event_b7MouseEntered

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        mano();           
        cambiarIdioma("italiano");
    }//GEN-LAST:event_b6MouseEntered

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        mano();          
        cambiarIdioma("ingles");
    }//GEN-LAST:event_b5MouseEntered

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        mano();         
        cambiarIdioma("frances");
    }//GEN-LAST:event_b4MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        mano();       
        cambiarIdioma("aleman");
    }//GEN-LAST:event_b2MouseEntered

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        mano();    
        cambiarIdioma("Espanol");
    }//GEN-LAST:event_b1MouseEntered

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("ruso");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b8ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("Espanol");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("aleman");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("ingles");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("italiano");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("portugues");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b7ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Portada por=new Portada();
        por.cambiarIdioma("frances");
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b4ActionPerformed
public void cambiarIdioma(String nombreIdioma){
    idiomas idioma=new idiomas();
    idioma.idiomas(nombreIdioma);
    btc.setToolTipText(idioma.getProperty("Cerrar"));
    btm.setToolTipText(idioma.getProperty("Minimizar"));
    l1.setText(idioma.getProperty("Idioma"));
    l2.setText(idioma.getProperty("Selecciona_un_idioma"));
    switch(nombreIdioma){
            case "Espanol":
                l3.setText(idioma.getProperty("Espanol"));
            break;
            case "aleman":
                l3.setText(idioma.getProperty("Aleman"));
            break;
            case "frances":
                l3.setText(idioma.getProperty("Frances"));
            break;
            case "ingles":
                l3.setText(idioma.getProperty("Ingles"));
            break;
            case "italiano":
                l3.setText(idioma.getProperty("Italiano"));
            break;
            case "portugues":
                l3.setText(idioma.getProperty("Portugues"));
            break;
            case "ruso":
                l3.setText(idioma.getProperty("Ruso"));
            break;
        }
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
            java.util.logging.Logger.getLogger(Idiomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idiomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idiomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idiomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idiomas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton btc;
    private javax.swing.JButton btm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}
