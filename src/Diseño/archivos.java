/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import código.Validacion;
import código.archi;

import código.idiomas;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;



/**
 *
 * @author Home1
 */
public class archivos extends javax.swing.JFrame {

    private idiomas idioma=new idiomas();
    /**
     * Creates new form archivos
     */
    public archivos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/log.png")).getImage());
        this.setLayout(new AbsoluteLayout());
        this.setLocation(this.getWidth()/3,this.getHeight()/3);
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screensize.width/2, screensize.height-250);
        p1.setSize(new Dimension(screensize.width/2,40));
        l1.setSize(new Dimension(screensize.width/2,p1.getHeight()));
        tp1.setLocation(p1.getX(),p1.getHeight());
        tp1.setSize(new Dimension(screensize.width/2,this.getHeight()/4));
        p3.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p4.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p5.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p6.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p7.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p8.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p2.setSize(new Dimension(this.getWidth(),this.getHeight()-p1.getHeight()-tp1.getHeight()));
        p2.setLocation(0,tp1.getHeight()+p1.getHeight());
        lb1.setLocation(p3.getX()+20/2,p3.getY());
        lb2.setLocation(p3.getX()+20/2,p3.getY());
        lb3.setLocation(p3.getX()+20/2,p3.getY());
        lb4.setLocation(p3.getX()+20/2,p3.getY());
        lb5.setLocation(p3.getX()+20/2,p3.getY());
        lb6.setLocation(p3.getX()+20/2,p3.getY());
        b1.setLocation(lb1.getWidth()+lb1.getX()+50,lb1.getY());
        bte.setLocation(p1.getWidth()-btc.getWidth(),p1.getHeight()/15);
        bte.setSize(new Dimension(30,30));
        bte.setText("");
        btm.setLocation(p1.getWidth()-btc.getWidth()-bte.getWidth(),p1.getHeight()/15);
        btm.setSize(new Dimension(30,30));
        btp.setSize(new Dimension(40,40));
        btp.setLocation(50,p2.getHeight()-70);
        btm.setText("");
        btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
        btc.setSize(new Dimension(30,30));
        btr.setLocation(0,p1.getHeight()/15);
        btr.setSize(new Dimension(30,30));
        btc.setText("");
        sp1.setSize(new Dimension(p2.getWidth(),10));
        txta.setLocation(p2.getX(),10);
        scp1.setLocation(p2.getX(),10);
        txta.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        scp1.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        txta.setEditable(false);
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
        ImageIcon abrir=new ImageIcon(getClass().getResource("/iconos/abrir.png"));
        Icon abra= new ImageIcon(abrir.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon procesar=new ImageIcon(getClass().getResource("/iconos/procesar.png"));
        Icon procesa= new ImageIcon(procesar.getImage().getScaledInstance(btp.getWidth(), btp.getHeight(), Image.SCALE_DEFAULT));
        btp.setIcon(procesa);
        b1.setIcon(abra);
        b2.setIcon(abra);
        b3.setIcon(abra);
        b4.setIcon(abra);
        b5.setIcon(abra);
        b6.setIcon(abra);
        this.repaint();
        Cursor cursor;
        ImageIcon flecha=new ImageIcon(getClass().getResource("/cursores/flecha2.png"));
        cursor=t.createCustomCursor(flecha.getImage(), new Point(1,1), "flecha");
        setCursor(cursor);
         a=1;
    }
    private int a, x, y;
    private archi arch=new archi();
    //private arreglos arre=new arreglos();
    private Validacion val=new Validacion();
    private void mano(){
         Toolkit t= Toolkit.getDefaultToolkit();
        Cursor cursor;
        ImageIcon mano=new ImageIcon(getClass().getResource("/cursores/mano.png"));
        cursor=t.createCustomCursor(mano.getImage(), new Point(1,1), "mano");
        btp.setCursor(cursor);
        btc.setCursor(cursor);
        btm.setCursor(cursor);
        bte.setCursor(cursor);
        b1.setCursor(cursor);
        b2.setCursor(cursor);
        b3.setCursor(cursor);
        b4.setCursor(cursor);
        b5.setCursor(cursor);
        b6.setCursor(cursor);
        btr.setCursor(cursor);
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
        scp1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        sp1 = new javax.swing.JSeparator();
        btp = new javax.swing.JButton();
        tp1 = new javax.swing.JTabbedPane();
        p3 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        p5 = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        p6 = new javax.swing.JPanel();
        lb4 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        p7 = new javax.swing.JPanel();
        lb5 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        p8 = new javax.swing.JPanel();
        lb6 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incidencias");
        setLocation(new java.awt.Point(5, 0));
        setUndecorated(true);
        setResizable(false);
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
        l1.setText("INCIDENCIAS");
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
        p2.setMinimumSize(new java.awt.Dimension(200, 100));
        p2.setLayout(null);

        scp1.setEnabled(false);

        txta.setBackground(new java.awt.Color(0, 51, 51));
        txta.setColumns(20);
        txta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txta.setForeground(new java.awt.Color(255, 255, 255));
        txta.setRows(5);
        txta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scp1.setViewportView(txta);

        p2.add(scp1);
        scp1.setBounds(0, 10, 300, 220);

        sp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sp1.setOpaque(true);
        p2.add(sp1);
        sp1.setBounds(0, 0, 810, 10);

        btp.setToolTipText("Procesar");
        btp.setBorderPainted(false);
        btp.setContentAreaFilled(false);
        btp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btpMouseEntered(evt);
            }
        });
        btp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpActionPerformed(evt);
            }
        });
        p2.add(btp);
        btp.setBounds(650, 50, 33, 9);

        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 803, 100));

        tp1.setBackground(new java.awt.Color(204, 204, 204));
        tp1.setName("9"); // NOI18N
        tp1.setOpaque(true);

        p3.setBackground(new java.awt.Color(0, 102, 102));
        p3.setLayout(null);

        lb1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb1.setOpaque(true);
        p3.add(lb1);
        lb1.setBounds(20, 20, 470, 30);

        b1.setToolTipText("Abrir");
        b1.setBorder(null);
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
        p3.add(b1);
        b1.setBounds(510, 20, 40, 40);

        tp1.addTab("Archivo_de_empleado", p3);

        p4.setBackground(new java.awt.Color(153, 51, 0));
        p4.setLayout(null);

        lb2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb2.setOpaque(true);
        p4.add(lb2);
        lb2.setBounds(20, 20, 470, 30);

        b2.setToolTipText("Abrir");
        b2.setBorder(null);
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
        p4.add(b2);
        b2.setBounds(510, 20, 40, 40);

        tp1.addTab("Asistencia", p4);

        p5.setBackground(new java.awt.Color(153, 102, 0));
        p5.setLayout(null);

        lb3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb3.setOpaque(true);
        p5.add(lb3);
        lb3.setBounds(20, 20, 470, 30);

        b3.setToolTipText("Abrir");
        b3.setBorder(null);
        b3.setContentAreaFilled(false);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        p5.add(b3);
        b3.setBounds(510, 20, 40, 40);

        tp1.addTab("Archivo_de_horario", p5);

        p6.setBackground(new java.awt.Color(145, 27, 55));
        p6.setLayout(null);

        lb4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb4.setOpaque(true);
        p6.add(lb4);
        lb4.setBounds(20, 20, 470, 30);

        b4.setToolTipText("Abrir");
        b4.setBorder(null);
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
        p6.add(b4);
        b4.setBounds(510, 20, 40, 40);

        tp1.addTab("Reglas_de_negocio", p6);

        p7.setBackground(new java.awt.Color(106, 70, 109));
        p7.setLayout(null);

        lb5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb5.setOpaque(true);
        p7.add(lb5);
        lb5.setBounds(20, 20, 470, 30);

        b5.setToolTipText("Abrir");
        b5.setBorder(null);
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
        p7.add(b5);
        b5.setBounds(510, 20, 40, 40);

        tp1.addTab("Archivo_detalle_de_horario", p7);

        p8.setBackground(new java.awt.Color(88, 103, 92));
        p8.setLayout(null);

        lb6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb6.setOpaque(true);
        p8.add(lb6);
        lb6.setBounds(20, 20, 470, 30);

        b6.setToolTipText("Abrir");
        b6.setBorder(null);
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
        p8.add(b6);
        b6.setBounds(510, 20, 40, 40);

        tp1.addTab("Horario_por_empleado", p8);

        getContentPane().add(tp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        arch.empleados();
        try{
        lb1.setText(arch.a);
        txta.setText(arch.documento);
        }
        catch(NullPointerException npe){  
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btcActionPerformed

    private void bteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteActionPerformed
        if(a==1){
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screensize.width-5,screensize.height-40);
        this.setLocation(2,0);
        p1.setSize(new Dimension(screensize.width,40));
        l1.setSize(new Dimension(screensize.width,p1.getHeight()));
        tp1.setLocation(p1.getX(),p1.getHeight());
        tp1.setSize(new Dimension(screensize.width,this.getHeight()/4));
        p3.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p4.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p5.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p6.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p7.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p8.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p2.setSize(new Dimension(this.getWidth(),this.getHeight()-p1.getHeight()-tp1.getHeight()));
        p2.setLocation(0,tp1.getHeight()+p1.getHeight());
        lb1.setLocation(p3.getX()+20/2,p3.getY());
        b1.setLocation(lb1.getWidth()+lb1.getX()+50,lb1.getY());
        bte.setLocation(p1.getWidth()-80,p1.getHeight()/15);
        bte.setSize(new Dimension(30,30));
        bte.setText("");
        btm.setLocation(p1.getWidth()-120,p1.getHeight()/15);
        btm.setSize(new Dimension(30,30));
        btm.setText("");
        btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
        btc.setSize(new Dimension(30,30));
        btc.setText("");
        sp1.setSize(new Dimension(p2.getWidth(),10));
        txta.setLocation(p2.getX(),10);
        scp1.setLocation(p2.getX(),10);
        txta.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        scp1.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        ImageIcon comprimir=new ImageIcon(getClass().getResource("/iconos/comprimir.png"));
        Icon com= new ImageIcon(comprimir.getImage().getScaledInstance(bte.getWidth(), bte.getHeight(), Image.SCALE_DEFAULT));
        bte.setIcon(com);
        lb1.setLocation(p3.getX()+20/2,p3.getY());
        lb2.setLocation(p3.getX()+20/2,p3.getY());
        lb3.setLocation(p3.getX()+20/2,p3.getY());
        lb4.setLocation(p3.getX()+20/2,p3.getY());
        lb5.setLocation(p3.getX()+20/2,p3.getY());
        lb6.setLocation(p3.getX()+20/2,p3.getY());
        btp.setSize(new Dimension(40,40));
        btp.setLocation(50,p2.getHeight()-70);
        a=0;
        } else{
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Tu resolución es de " + screensize.width + "x" + screensize.height);
        this.setSize(screensize.width/2, screensize.height-250);
        p1.setSize(new Dimension(screensize.width/2,40));
        l1.setSize(new Dimension(screensize.width/2,p1.getHeight()));
        tp1.setLocation(p1.getX(),p1.getHeight());
        tp1.setSize(new Dimension(screensize.width/2,this.getHeight()/4));
        p3.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p4.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p5.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p6.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p7.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p8.setSize(new Dimension(this.getWidth(),tp1.getHeight()));
        p2.setSize(new Dimension(this.getWidth(),this.getHeight()-p1.getHeight()-tp1.getHeight()));
        p2.setLocation(0,tp1.getHeight()+p1.getHeight());
        lb1.setLocation(p3.getX()+20/2,p3.getY());
        b1.setLocation(lb1.getWidth()+lb1.getX()+50,lb1.getY());
        btc.setLocation(p1.getWidth()-40,p1.getHeight()/15);
        btc.setSize(new Dimension(30,30));
        bte.setLocation(p1.getWidth()-btc.getWidth()-40,p1.getHeight()/15);
        bte.setSize(new Dimension(30,30));
        bte.setText("");
        btm.setLocation(p1.getWidth()-btc.getWidth()-bte.getWidth()-40,p1.getHeight()/15);
        btm.setSize(new Dimension(30,30));
        btm.setText("");
        lb1.setLocation(p3.getX()+20/2,p3.getY());
        lb2.setLocation(p3.getX()+20/2,p3.getY());
        lb3.setLocation(p3.getX()+20/2,p3.getY());
        lb4.setLocation(p3.getX()+20/2,p3.getY());
        lb5.setLocation(p3.getX()+20/2,p3.getY());
        lb6.setLocation(p3.getX()+20/2,p3.getY());
        btc.setText("");
        sp1.setSize(new Dimension(p2.getWidth(),10));
        txta.setLocation(p2.getX(),10);
        scp1.setLocation(p2.getX(),10);
        txta.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        scp1.setSize(new Dimension(p2.getWidth(),p2.getHeight()-sp1.getHeight()-70));
        txta.setEditable(false);
        ImageIcon expandir=new ImageIcon(getClass().getResource("/iconos/expandir.png"));
        Icon exp= new ImageIcon(expandir.getImage().getScaledInstance(bte.getWidth(), bte.getHeight(), Image.SCALE_DEFAULT));
        bte.setIcon(exp);
        this.setLocation(this.getWidth()/3,this.getHeight()/3);
        btp.setSize(new Dimension(40,40));
        btp.setLocation(50,p2.getHeight()-70);
        a=1;
        }
    }//GEN-LAST:event_bteActionPerformed

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

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            arch.asis.clear();
            arch.otros(1);
            txta.setText("");
            try{
                lb2.setText(arch.a);
                txta.setText(arch.documento);
            }
            catch(NullPointerException npe){
                System.out.println(npe);
            }
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
        arch.adh.clear();
        arch.otros(2);
        txta.setText("");
        try{
        lb3.setText(arch.a);
        txta.setText(arch.documento);
        }
        catch(NullPointerException npe){
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
        arch.rdn.clear();
        arch.otros(3);
       
        txta.setText("");
        try{
        lb4.setText(arch.a);
        txta.setText(arch.documento);
        }
        catch(NullPointerException npe){
        }    
        
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       
        arch.addh.clear();
        arch.otros(4);
        
        txta.setText("");
        try{
        lb5.setText(arch.a);
        txta.setText(arch.documento);
        }
        catch(NullPointerException npe){  
        }      
        
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       
        arch.hpe.clear();
        arch.otros(5);
        
        txta.setText("");
        try{
        lb6.setText(arch.a);
        txta.setText(arch.documento);
        }
        catch(NullPointerException npe){ 
        }  
    }//GEN-LAST:event_b6ActionPerformed

    private void btpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpMouseEntered
        mano();
    }//GEN-LAST:event_btpMouseEntered

    private void btcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcMouseEntered
        mano();
    }//GEN-LAST:event_btcMouseEntered

    private void btmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmMouseEntered
        mano();
    }//GEN-LAST:event_btmMouseEntered

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        mano();        
    }//GEN-LAST:event_b1MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        mano();      
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        mano();       
    }//GEN-LAST:event_b3MouseEntered

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        mano();        
    }//GEN-LAST:event_b4MouseEntered

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        mano();    
    }//GEN-LAST:event_b6MouseEntered

    private void btrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrActionPerformed
         Portada por=new Portada();
        String aux=btc.getToolTipText();
        switch(aux){
            case "близко":
                por.cambiarIdioma("ruso");
            break;
            case "Fechar":
                por.cambiarIdioma("portugues");
            break;
            case "vicino":
                por.cambiarIdioma("italiano");
            break;
            case "Close":
                por.cambiarIdioma("ingles");
            break;
            case "Fermer":
                por.cambiarIdioma("frances");
            break;
            case "Schließen":
                por.cambiarIdioma("aleman");
            break;
            case "Cerrar":
                por.cambiarIdioma("Espanol");
            break;
        }
        por.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btrActionPerformed

    private void btrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btrMouseEntered
        mano();
    }//GEN-LAST:event_btrMouseEntered

    private void btpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpActionPerformed
         if(arch.a_detalledelhorario()==false) JOptionPane.showMessageDialog(null, "Su Archivo de empleados\n No cumple el formato", "Error de formato", JOptionPane.ERROR_MESSAGE);
         if(arch.a_detalledelhorario()==true) JOptionPane.showMessageDialog(null, "ok", "Error de formato", JOptionPane.ERROR_MESSAGE);
         
    }//GEN-LAST:event_btpActionPerformed

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        mano();
    }//GEN-LAST:event_b5MouseEntered
public void cambiarIdioma(String nombreIdioma){    
    idioma.idiomas(nombreIdioma);
    btc.setToolTipText(idioma.getProperty("Cerrar"));
    btm.setToolTipText(idioma.getProperty("Minimizar"));
    btr.setToolTipText(idioma.getProperty("Regresar"));
    b1.setToolTipText(idioma.getProperty("Abrir"));
    b2.setToolTipText(idioma.getProperty("Abrir"));
    b3.setToolTipText(idioma.getProperty("Abrir"));
    b4.setToolTipText(idioma.getProperty("Abrir"));
    b5.setToolTipText(idioma.getProperty("Abrir"));
    b6.setToolTipText(idioma.getProperty("Abrir"));
    btp.setToolTipText(idioma.getProperty("Procesar"));
    l1.setText(idioma.getProperty("Incidencias"));
    tp1.setTitleAt(0, idioma.getProperty("Archivo_de_Empleado"));
    tp1.setTitleAt(1, idioma.getProperty("Asistencia"));
    tp1.setTitleAt(2, idioma.getProperty("Archivo_de_Horario"));
    tp1.setTitleAt(3, idioma.getProperty("Reglas_de_negocio"));
    tp1.setTitleAt(4, idioma.getProperty("Archivo_detalle_de_horario"));
    tp1.setTitleAt(5, idioma.getProperty("Horario_por_empleado"));

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
            java.util.logging.Logger.getLogger(archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton btc;
    private javax.swing.JButton bte;
    private javax.swing.JButton btm;
    private javax.swing.JButton btp;
    private javax.swing.JButton btr;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JScrollPane scp1;
    private javax.swing.JSeparator sp1;
    private javax.swing.JTabbedPane tp1;
    private javax.swing.JTextArea txta;
    // End of variables declaration//GEN-END:variables
}
