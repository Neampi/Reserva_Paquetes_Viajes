/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reserva;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author aplo612
 */
public class Reservacion extends javax.swing.JFrame {
    private JComponent ui = null;
    private JToggleButton[] seats = new JToggleButton[120];//numero de asientos
    private JTextArea selectedSeats = new JTextArea(3, 40);
    /**
     * Creates new form Reservacion
     */
    public Reservacion(int idvueloida,int idvuelovuelta,int idhotel) {
        //initComponents();
        initUI(idvueloida);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    public void initUI(int idvuelo) {
        ModeloVuelo obtlineaaerea = new ModeloVuelo();
        ArrayList<Vuelo> listaLineaAerea = obtlineaaerea.obtenerLineaAerea();
        
        if (ui!=null) return;

        ui = new JPanel(new BorderLayout(4,4));
        ui.setBorder(new EmptyBorder(4,4,4,4));

        selectedSeats.setLineWrap(true);
        selectedSeats.setWrapStyleWord(true);
        selectedSeats.setEditable(false);
        ui.add(new JScrollPane(selectedSeats), BorderLayout.PAGE_END);

        JPanel avionFloor = new JPanel(new BorderLayout(30, 0));//Espacio entre lineas de asientos
        avionFloor.setBorder(new TitledBorder("Sitios Disponibles"));
        ui.add(avionFloor, BorderLayout.CENTER);
        JPanel leftStall = new JPanel(new GridLayout(20, 3, 2, 6));//(filas,columnas,horizontal espacio,vertical espacio)
        JPanel rightStall = new JPanel(new GridLayout(20, 3, 2, 6));
        
        avionFloor.add(leftStall, BorderLayout.WEST);//agregar asientos
        avionFloor.add(rightStall, BorderLayout.EAST);
        //avionFloor.setBounds(WIDTH, WIDTH, 50, 50);
        ActionListener seatSelectionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                showSelectedSeats();
            }
        };
        //generar asientos botones
        for (int ii=0; ii <seats.length; ii++) {
            JToggleButton tb = new JToggleButton("S-" + (ii+1));
            
            tb.addActionListener(seatSelectionListener);
            tb.setBounds(0, 0, 100, 100);
            seats[ii] = tb;
            int colIndex = ii%6;
            if (colIndex<3) {
                leftStall.add(tb);
                leftStall.setBounds(0, 0, 50, 50);
            } else {
                rightStall.add(tb);
                rightStall.setBounds(0, 0, 50, 50);
                
            }
            //for (int x=1; x<seats.length; x++) {
                //JToggleButton tb = seats[ii];
            boolean str = listaLineaAerea.get(idvuelo).getAsientos().get(ii).isDisponibilidad();
            if (str==false) {
                tb.setEnabled(false);
            }
            //System.out.println(str);
            //}
        }
        System.out.println(ui.getBounds());
        /*for(int ii=0; ii <seats.length; ii++){
            if (){
                
            }
        }*/
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        setContentPane(getUI());
        pack();
        setMinimumSize(getSize());
    }
    private void showSelectedSeats() {
        StringBuilder sb = new StringBuilder();
        for (int ii=0; ii<seats.length; ii++) {
            JToggleButton tb = seats[ii];
            if (tb.isSelected()) {
                sb.append(tb.getText());
                sb.append(", ");
            }
        }
        String s = sb.toString();
        if (s.length()>0) {
            s = s.substring(0, s.length()-2);
        }
        selectedSeats.setText(s);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcesar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel2.setText("<html><body>Seleccione los asientos disponibles, <br>tenga especial cuidado de indicar <br>la cantidad exacta de asientos</body></html>");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("VUELO IDA");

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Atencion!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProcesar)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(142, 142, 142)
                .addComponent(btnProcesar)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarActionPerformed
    public JComponent getUI() {
        return ui;
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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });*/
        Runnable r = new Runnable() {
            @Override
            public void run() {
                new Reservacion(0,4,0).setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
