/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import código.idiomas;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Home1
 */
public class Portada extends javax.swing.JFrame {

    /**
     * Creates new form Portada
     */
   
    private idiomas idioma=new idiomas();
        
    public Portada() {
        initComponents();
        btr.setLocation(0,p1.getHeight()/15);
        btr.setSize(new Dimension(40,40));
        btc.setText(""); 
        this.setLayout(new AbsoluteLayout());
        this.setLocation(this.getWidth()/3,this.getHeight()/3);
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screensize.width/3, screensize.height/4);
        p1.setSize(new Dimension(screensize.width/3,40));
        l1.setSize(new Dimension(screensize.width/3,p1.getHeight()));
        btm.setLocation(p1.getWidth()-btc.getWidth()-bte.getWidth(),p1.getHeight()/15);
        btm.setSize(new Dimension(30,30));
        bte.setLocation(p1.getWidth()-btc.getWidth(),p1.getHeight()/15);
        bte.setSize(new Dimension(30,30));
        bte.setText("");
        btm.setText("");
        btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
        btc.setSize(new Dimension(30,30));
        btc.setText("");
        btnp.setSize(new Dimension(70,70));
        btna.setSize(new Dimension(70,70));
        p2.setSize(new Dimension(screensize.width/3,this.getHeight()-p1.getHeight()));
        p2.setLocation(0,p1.getHeight());
        l2.setLocation(p2.getWidth()/4,p2.getHeight()-25);
        btnp.setLocation(p2.getWidth()/3,p2.getHeight()/4);
        btna.setLocation(btnp.getX()*2,p2.getHeight()/4);
        ImageIcon acerca=new ImageIcon(getClass().getResource("/iconos/acercade.png"));
        Icon ad= new ImageIcon(acerca.getImage().getScaledInstance(btna.getWidth(), btna.getHeight(), Image.SCALE_DEFAULT));
        btna.setIcon(ad);
        ImageIcon archiv=new ImageIcon(getClass().getResource("/iconos/Archivos.png"));
        Icon ar= new ImageIcon(archiv.getImage().getScaledInstance(btnp.getWidth(), btnp.getHeight(), Image.SCALE_DEFAULT));
        btnp.setIcon(ar);
        lar.setLocation(btnp.getX(),btnp.getY()+70 );
        lac.setLocation(btna.getX(),btna.getY()+70 );
        lar.setVisible(false);
        lac.setVisible(false);
        ImageIcon expandir=new ImageIcon(getClass().getResource("/iconos/expandir.png"));
        Icon exp= new ImageIcon(expandir.getImage().getScaledInstance(bte.getWidth(), bte.getHeight(), Image.SCALE_DEFAULT));
        bte.setIcon(exp);
        ImageIcon cerrar=new ImageIcon(getClass().getResource("/iconos/cerrar.png"));
        Icon cierra= new ImageIcon(cerrar.getImage().getScaledInstance(btc.getWidth(), btc.getHeight(), Image.SCALE_DEFAULT));
        btc.setIcon(cierra);
        ImageIcon minimizar=new ImageIcon(getClass().getResource("/iconos/minimizar.png"));
        Icon mini= new ImageIcon(minimizar.getImage().getScaledInstance(btm.getWidth(), btm.getHeight(), Image.SCALE_DEFAULT));
        btm.setIcon(mini);
        ImageIcon regresar=new ImageIcon(getClass().getResource("/iconos/regresar.png"));
        Icon regresa= new ImageIcon(regresar.getImage().getScaledInstance(btr.getWidth(), btr.getHeight(), Image.SCALE_DEFAULT));
        btr.setIcon(regresa);
        Cursor cursor;
        ImageIcon flecha=new ImageIcon(getClass().getResource("/cursores/flecha2.png"));
        cursor=t.createCustomCursor(flecha.getImage(), new Point(1,1), "flecha");
        setCursor(cursor);
        setIconImage(new ImageIcon(getClass().getResource("/iconos/log.png")).getImage());
        a=1;
    }
   public void cambiarIdioma(String nombreIdioma){
       idioma.idiomas(nombreIdioma);
       btc.setToolTipText(idioma.getProperty("Cerrar"));
       btm.setToolTipText(idioma.getProperty("Minimizar"));
       btr.setToolTipText(idioma.getProperty("Regresar"));
       l1.setText(idioma.getProperty("Menu"));
       lac.setText(idioma.getProperty("Acerca_de"));
       lar.setText(idioma.getProperty("Archivos"));
    }
    private int a, x, y;

private void mano(){
        Toolkit t= Toolkit.getDefaultToolkit();
        Cursor cursor;
        ImageIcon mano=new ImageIcon(getClass().getResource("/cursores/mano.png"));
        cursor=t.createCustomCursor(mano.getImage(), new Point(1,1), "mano");
        btc.setCursor(cursor);
        btm.setCursor(cursor);
        bte.setCursor(cursor);
        btr.setCursor(cursor);
        btnp.setCursor(cursor);
        btna.setCursor(cursor);  
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        bte = new javax.swing.JButton();
        btc = new javax.swing.JButton();
        btm = new javax.swing.JButton();
        btr = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        btnp = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        lar = new javax.swing.JLabel();
        lac = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PORTADA");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(102, 102, 102));
        p1.setLayout(null);

        bte.setText("jButton1");
        bte.setToolTipText("");
        bte.setBorderPainted(false);
        bte.setContentAreaFilled(false);
        bte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteActionPerformed(evt);
            }
        });
        p1.add(bte);
        bte.setBounds(700, 10, 30, 30);

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
        btm.setBounds(580, 10, 41, 15);

        btr.setBorderPainted(false);
        btr.setContentAreaFilled(false);
        btr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btrMouseEntered(evt);
            }
        });
        btr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrActionPerformed(evt);
            }
        });
        p1.add(btr);
        btr.setBounds(10, 40, 33, 9);

        l1.setFont(new java.awt.Font("Kalinga", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("MENU");
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

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 803, 99));

        p2.setBackground(new java.awt.Color(0, 0, 0));
        p2.setLayout(null);

        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Copyright LCT, CJAA, AGH, RGM ");
        p2.add(l2);
        l2.setBounds(230, 170, 300, 30);

        btnp.setText("1");
        btnp.setBorderPainted(false);
        btnp.setContentAreaFilled(false);
        btnp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpMouseExited(evt);
            }
        });
        btnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpActionPerformed(evt);
            }
        });
        p2.add(btnp);
        btnp.setBounds(200, 40, 39, 23);

        btna.setBorderPainted(false);
        btna.setContentAreaFilled(false);
        btna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaMouseExited(evt);
            }
        });
        p2.add(btna);
        btna.setBounds(420, 40, 33, 9);

        lar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lar.setForeground(new java.awt.Color(255, 255, 255));
        lar.setText("Archivos");
        p2.add(lar);
        lar.setBounds(260, 90, 100, 18);

        lac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lac.setForeground(new java.awt.Color(255, 255, 255));
        lac.setText("Acerca de");
        p2.add(lac);
        lac.setBounds(430, 100, 100, 22);

        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteActionPerformed
        if(a==1){
            Toolkit t= Toolkit.getDefaultToolkit();
            Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
            this.setSize(screensize.width-5,screensize.height-40);
            this.setLocation(2,0);
            p1.setSize(new Dimension(screensize.width,40));
            l1.setSize(new Dimension(screensize.width,p1.getHeight()));
            bte.setLocation(p1.getWidth()-80,p1.getHeight()/15);
            bte.setSize(new Dimension(30,30));
            bte.setText("");
            btm.setLocation(p1.getWidth()-120,p1.getHeight()/15);
            btm.setSize(new Dimension(30,30));
            btm.setText("");
            btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
            btc.setSize(new Dimension(30,30));
            btc.setText("");
            btnp.setSize(new Dimension(140,140));
            btna.setSize(new Dimension(140,140));
            p2.setSize(new Dimension(screensize.width,this.getHeight()-p1.getHeight()));
            p2.setLocation(0,p1.getHeight());
            l2.setLocation(p2.getWidth()/3,p2.getHeight()-25);
            btnp.setLocation(p2.getWidth()/3,p2.getHeight()/4);
            btna.setLocation(btnp.getX()*2,p2.getHeight()/4);
            lar.setLocation(btnp.getX(),btnp.getY()+140 );
            lac.setLocation(btna.getX(),btna.getY()+140 );
            lar.setFont(new Font("Tahoma",Font.PLAIN,36));
            lar.setSize(200, 36);
            lac.setFont(new Font("Tahoma",Font.PLAIN,36));
            lac.setSize(200, 36);
            ImageIcon acerca=new ImageIcon(getClass().getResource("/iconos/acercade.png"));
            Icon ad= new ImageIcon(acerca.getImage().getScaledInstance(btna.getWidth(), btna.getHeight(), Image.SCALE_DEFAULT));
            btna.setIcon(ad);
            ImageIcon archiv=new ImageIcon(getClass().getResource("/iconos/Archivos.png"));
            Icon ar= new ImageIcon(archiv.getImage().getScaledInstance(btnp.getWidth(), btnp.getHeight(), Image.SCALE_DEFAULT));
            btnp.setIcon(ar);
            ImageIcon comprimir=new ImageIcon(getClass().getResource("/iconos/comprimir.png"));
            Icon com= new ImageIcon(comprimir.getImage().getScaledInstance(bte.getWidth(), bte.getHeight(), Image.SCALE_DEFAULT));
            bte.setIcon(com);
            a=0;
        } else{
            Toolkit t= Toolkit.getDefaultToolkit();
            Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
            
            this.setSize(screensize.width/3, screensize.height/4);
            p1.setSize(new Dimension(screensize.width/3,40));
            l1.setSize(new Dimension(screensize.width/3,p1.getHeight()));
            btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
            btc.setSize(new Dimension(30,30));
            bte.setLocation(p1.getWidth()-btc.getWidth()-40,p1.getHeight()/15);
            bte.setSize(new Dimension(30,30));
            bte.setText("");
            btm.setLocation(p1.getWidth()-btc.getWidth()-bte.getWidth()-40,p1.getHeight()/15);
            btm.setSize(new Dimension(30,30));
            btm.setText("");
            btc.setText("");
            btnp.setSize(new Dimension(70,70));
            btna.setSize(new Dimension(70,70));
            p2.setSize(new Dimension(screensize.width/3,this.getHeight()-p1.getHeight()));
            p2.setLocation(0,p1.getHeight());
            l2.setLocation(p2.getWidth()/4,p2.getHeight()-25);
            btnp.setLocation(p2.getWidth()/3,p2.getHeight()/4);
            btna.setLocation(btnp.getX()*2,p2.getHeight()/4);
            lar.setLocation(btnp.getX(),btnp.getY()+70 );
            lac.setLocation(btna.getX(),btna.getY()+70 );
            lar.setFont(new Font("Tahoma",Font.PLAIN,18));
            lar.setSize(200, 20);
            lac.setFont(new Font("Tahoma",Font.PLAIN,18));
            lac.setSize(200, 20);
            ImageIcon acerca=new ImageIcon(getClass().getResource("/iconos/acercade.png"));
            Icon ad= new ImageIcon(acerca.getImage().getScaledInstance(btna.getWidth(), btna.getHeight(), Image.SCALE_DEFAULT));
            btna.setIcon(ad);
            ImageIcon archiv=new ImageIcon(getClass().getResource("/iconos/Archivos.png"));
            Icon ar= new ImageIcon(archiv.getImage().getScaledInstance(btnp.getWidth(), btnp.getHeight(), Image.SCALE_DEFAULT));
            btnp.setIcon(ar);
            ImageIcon expandir=new ImageIcon(getClass().getResource("/iconos/expandir.png"));
            Icon exp= new ImageIcon(expandir.getImage().getScaledInstance(bte.getWidth(), bte.getHeight(), Image.SCALE_DEFAULT));
            bte.setIcon(exp);
            this.setLocation(this.getWidth()/3,this.getHeight()/3);
            a=1;
        }
    }//GEN-LAST:event_bteActionPerformed

    private void btcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcMouseEntered
        mano();
    }//GEN-LAST:event_btcMouseEntered

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btcActionPerformed

    private void btmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmMouseEntered
        mano();
    }//GEN-LAST:event_btmMouseEntered

    private void btmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_btmActionPerformed

    private void l1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_l1MouseDragged

    private void l1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_l1MousePressed

    private void btnpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpMouseEntered
        mano();
        lar.setVisible(true);
    }//GEN-LAST:event_btnpMouseEntered

    private void btnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaMouseEntered
        mano();
        lac.setVisible(true);
    }//GEN-LAST:event_btnaMouseEntered

    private void btnpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpMouseExited
        lar.setVisible(false);
    }//GEN-LAST:event_btnpMouseExited

    private void btnaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaMouseExited
        lac.setVisible(false);       
    }//GEN-LAST:event_btnaMouseExited

    private void btnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpActionPerformed
        archivos ar=new archivos();
        String aux=btc.getToolTipText();
        switch(aux){
            case "близко":
                ar.cambiarIdioma("ruso");
            break;
            case "Fechar":
                ar.cambiarIdioma("portugues");
            break;
            case "vicino":
                ar.cambiarIdioma("italiano");
            break;
            case "Close":
                ar.cambiarIdioma("ingles");
            break;
            case "Fermer":
                ar.cambiarIdioma("frances");
            break;
            case "Schließen":
                ar.cambiarIdioma("aleman");
            break;
            case "Cerrar":
                ar.cambiarIdioma("Espanol");
            break;
        }
        ar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpActionPerformed

    private void btrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrActionPerformed
        Idiomas idio=new Idiomas();
        idio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btrActionPerformed

    private void btrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btrMouseEntered
        mano();
    }//GEN-LAST:event_btrMouseEntered

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
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btc;
    private javax.swing.JButton bte;
    private javax.swing.JButton btm;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnp;
    private javax.swing.JButton btr;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel lac;
    private javax.swing.JLabel lar;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
}
