package arbol_principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Verlaine
 */
public class Recorrido_v2 extends javax.swing.JFrame {

    public Recorrido_v2() {
        initComponents();
    }

    public void valid() {
        if (txt15.getText() != "" && txt8.getText().isEmpty()) {
            txt15.setText("");
        }
        if (txt16.getText() != "" && txt8.getText().isEmpty()) {
            txt16.setText("");
        }
        if (txt17.getText() != "" && txt9.getText().isEmpty()) {
            txt17.setText("");
        }
        if (txt18.getText() != "" && txt9.getText().isEmpty()) {
            txt18.setText("");
        }
        if (txt8.getText() != "" && txt4.getText().isEmpty()) {
            txt8.setText("");
            txt15.setText("");
            txt16.setText("");
        }
        if (txt9.getText() != "" && txt4.getText().isEmpty()) {
            txt9.setText("");
            txt17.setText("");
            txt18.setText("");
        }
        if (txt4.getText() != "" && txt2.getText().isEmpty()) {
            txt4.setText("");
            txt8.setText("");
            txt9.setText("");
            txt15.setText("");
            txt16.setText("");
            txt17.setText("");
            txt18.setText("");
        }
        if (txt19.getText() != "" && txt11.getText().isEmpty()) {
            txt19.setText("");
        }
        if (txt20.getText() != "" && txt11.getText().isEmpty()) {
            txt20.setText("");
        }
        if (txt10.getText() != "" && txt5.getText().isEmpty()) {
            txt10.setText("");
        }
        if (txt11.getText() != "" && txt5.getText().isEmpty()) {
            txt11.setText("");
            txt19.setText("");
            txt20.setText("");
        }
        if (txt5.getText() != "" && txt2.getText().isEmpty()) {
            txt5.setText("");
            txt10.setText("");
            txt11.setText("");
            txt19.setText("");
            txt20.setText("");
        }
        if (txt21.getText() != "" && txt13.getText().isEmpty()) {
            txt21.setText("");
        }
        if (txt22.getText() != "" && txt13.getText().isEmpty()) {
            txt22.setText("");
        }
        if (txt12.getText() != "" && txt7.getText().isEmpty()) {
            txt12.setText("");
        }
        if (txt13.getText() != "" && txt7.getText().isEmpty()) {
            txt13.setText("");
        }
        if (txt6.getText() != "" && txt3.getText().isEmpty()) {
            txt6.setText("");
        }
        if (txt7.getText() != "" && txt3.getText().isEmpty()) {
            txt7.setText("");
            txt12.setText("");
            txt13.setText("");
            txt21.setText("");
            txt22.setText("");
        }
        if (txt2.getText() != "" && txt1.getText().isEmpty()) {
            txt2.setText("");
            txt4.setText("");
            txt5.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
            txt15.setText("");
            txt16.setText("");
            txt17.setText("");
            txt18.setText("");
            txt19.setText("");
            txt20.setText("");
        }
        if (txt3.getText() != "" && txt1.getText().isEmpty()) {
            txt3.setText("");
            txt6.setText("");
            txt7.setText("");
            txt12.setText("");
            txt13.setText("");
            txt21.setText("");
            txt22.setText("");
        }
    }

    public static String strResultado;

    public void preOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "PRE ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void postOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "POST ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void inOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "IN ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        arbolimagen = new javax.swing.JLabel();
        btnPreorder = new javax.swing.JButton();
        btnInorder = new javax.swing.JButton();
        btnPostorder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setCaretColor(new java.awt.Color(255, 0, 51));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 70, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 157, 60, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 157, 60, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 217, 60, -1));
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 207, 60, -1));
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 207, 60, -1));
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 207, 60, -1));
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 267, 60, -1));
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 267, 60, -1));
        getContentPane().add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 267, 60, -1));
        getContentPane().add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 267, 60, -1));
        getContentPane().add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 267, 60, -1));
        getContentPane().add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 267, 60, -1));
        getContentPane().add(txt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 327, 60, -1));
        getContentPane().add(txt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 327, 60, -1));

        txt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt17ActionPerformed(evt);
            }
        });
        getContentPane().add(txt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 327, 60, -1));
        getContentPane().add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 327, 60, -1));

        txt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt19ActionPerformed(evt);
            }
        });
        getContentPane().add(txt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 327, 60, -1));
        getContentPane().add(txt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 327, 60, -1));
        getContentPane().add(txt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 327, 60, -1));
        getContentPane().add(txt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 327, 60, -1));

        arbolimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arbol_modelo/base_arbol.png"))); // NOI18N
        getContentPane().add(arbolimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 57, 647, -1));

        btnPreorder.setText("Pre order");
        btnPreorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 90, 40));

        btnInorder.setText("In order");
        btnInorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnInorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, 40));

        btnPostorder.setText("Post order");
        btnPostorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 100, 40));

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 384, 390, 90));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt17ActionPerformed

    }//GEN-LAST:event_txt17ActionPerformed

    private void txt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt19ActionPerformed

    }//GEN-LAST:event_txt19ActionPerformed

    private void btnPreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text15 = txt15.getText();
        String text16 = txt16.getText();
        String text17 = txt17.getText();
        String text18 = txt18.getText();
        String text19 = txt19.getText();
        String text20 = txt20.getText();
        String text21 = txt21.getText();
        String text22 = txt22.getText();

        Resultado.setText(text1 + "," + text2 + "," + text4 + "," + text8 + "," + text15 + "," + text16 + "," + text9
                + "," + text17 + "," + text18 + "," + text5 + "," + text10 + "," + text11 + "," + text19 + ","
                + text20 + "," + text3 + "," + text6 + "," + text7 + "," + text12 + "," + text13 + ","
                + text21 + "," + text22);
        strResultado = Resultado.getText();
        preOrderArchivo();
    }//GEN-LAST:event_btnPreorderActionPerformed

    private void btnInorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text15 = txt15.getText();
        String text16 = txt16.getText();
        String text17 = txt17.getText();
        String text18 = txt18.getText();
        String text19 = txt19.getText();
        String text20 = txt20.getText();
        String text21 = txt21.getText();
        String text22 = txt22.getText();

        Resultado.setText(text15 + "," + text8 + "," + text16 + "," + text4 + "," + text17 + "," + text9 + "," + text18
                + "," + text2 + "," + text10 + "," + text5 + "," + text19 + "," + text11 + "," + text20 + ","
                + text1 + "," + text6 + "," + text3 + "," + text12 + "," + text7 + "," + text21 + ","
                + text13 + "," + text22);
        strResultado = Resultado.getText();
        inOrderArchivo();
    }//GEN-LAST:event_btnInorderActionPerformed

    private void btnPostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostorderActionPerformed

        valid();
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();
        String text4 = txt4.getText();
        String text5 = txt5.getText();
        String text6 = txt6.getText();
        String text7 = txt7.getText();
        String text8 = txt8.getText();
        String text9 = txt9.getText();
        String text10 = txt10.getText();
        String text11 = txt11.getText();
        String text12 = txt12.getText();
        String text13 = txt13.getText();
        String text15 = txt15.getText();
        String text16 = txt16.getText();
        String text17 = txt17.getText();
        String text18 = txt18.getText();
        String text19 = txt19.getText();
        String text20 = txt20.getText();
        String text21 = txt21.getText();
        String text22 = txt22.getText();

        Resultado.setText(text15 + "," + text16 + "," + text8 + "," + text17 + "," + text18 + "," + text9 + "," + text4
                + "," + text10 + "," + text19 + "," + text20 + "," + text11 + "," + text5 + "," + text2 + ","
                + text6 + "," + text12 + "," + text21 + "," + text22 + "," + text13 + "," + text7 + ","
                + text3 + "," + text1);
        strResultado = Resultado.getText();
        postOrderArchivo();
    }//GEN-LAST:event_btnPostorderActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recorrido_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JLabel arbolimagen;
    private javax.swing.JButton btnInorder;
    private javax.swing.JButton btnPostorder;
    private javax.swing.JButton btnPreorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
