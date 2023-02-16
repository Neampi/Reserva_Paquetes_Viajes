/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reserva;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author USUARIO
 */
public class Reserva1 extends javax.swing.JFrame {
    ModeloVuelo obtlineaaerea = new ModeloVuelo();
    ArrayList<Vuelo> listaLineaAerea = obtlineaaerea.obtenerLineaAerea();
    JToggleButton[][] asiento = new JToggleButton[12][10];
    private int idvueloida, idvuelovuelta,idhotel;

    public int getIdvueloida() {
        return idvueloida;
    }

    public void setIdvueloida(int idvueloida) {
        this.idvueloida = idvueloida;
    }

    public int getIdvuelovuelta() {
        return idvuelovuelta;
    }

    public void setIdvuelovuelta(int idvuelovuelta) {
        this.idvuelovuelta = idvuelovuelta;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }
    
    public Reserva1(int idvueloida,int idvuelovuelta,int idhotel) {
        initComponents();
        this.setLocationRelativeTo(null);
        generar(idvueloida);
        setResizable(false);
        this.idvueloida = idvueloida;
        this.idvuelovuelta = idvuelovuelta;
        this.idhotel = idhotel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelprecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnregisvuelo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectSeatsTxtArea = new javax.swing.JTextArea();
        labalasiento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CODIGO ASIENTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 22, -1, -1));

        labelprecio.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(labelprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 130, 60));

        jLabel3.setText("PRECIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 122, -1, -1));

        btnregisvuelo.setText("Registrar");
        btnregisvuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisvueloActionPerformed(evt);
            }
        });
        jPanel1.add(btnregisvuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 229, 138, 48));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        selectSeatsTxtArea.setBackground(new java.awt.Color(242, 242, 242));
        selectSeatsTxtArea.setColumns(20);
        selectSeatsTxtArea.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        selectSeatsTxtArea.setRows(5);
        selectSeatsTxtArea.setAutoscrolls(false);
        selectSeatsTxtArea.setOpaque(false);
        selectSeatsTxtArea.setRequestFocusEnabled(false);
        selectSeatsTxtArea.setSelectedTextColor(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(selectSeatsTxtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 60));

        labalasiento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("Vuelo Ida");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Aviso:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setText("Tenga especial cuidado de selecionar ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("la cantidad deseada de asientos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(labalasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labalasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisvueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisvueloActionPerformed
        String asientosIda= selectSeatsTxtArea.getText();
        Reserva2 reservacion2 = new Reserva2(idvueloida,idvuelovuelta,idhotel,asientosIda);
        reservacion2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnregisvueloActionPerformed

    
    public void generar(int idvueloida){
        int c;
        int c1=0;
        int sum=0;
        //float price=0;
        
        ActionListener seatSelectionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSelectedSeats(idvueloida);
            }
        };
        selectSeatsTxtArea.setLineWrap(true);
        selectSeatsTxtArea.setWrapStyleWord(true);
        selectSeatsTxtArea.setEditable(false);
        selectSeatsTxtArea.setBackground(new java.awt.Color(242,242,242));
        
        for(int i=0;i<asiento.length;i++){
            c=0;
            for(int j=0;j<asiento[i].length;j++){
            c+=55;
            sum+=1;
            
            JToggleButton tb = new JToggleButton();
            asiento[i][j] = tb;
            tb.addActionListener(seatSelectionListener);
            tb.setText(Integer.toString(sum));
            if (j>=3 && j<7) {
                tb.setBounds(20+c,30+c1,55,55);
                tb.setName("Center");
            }else if(j>=7){
                tb.setBounds(50+c,30+c1,55,55);
                tb.setName("Right");
            }else{
                tb.setBounds(c-20,30+c1,55,55);
                tb.setName("Left");
            }
            //System.out.println(sum);
            boolean str = listaLineaAerea.get(idvueloida).getAsientos().get(sum-1).isDisponibilidad();
            if (str==false) {
                tb.setEnabled(false);
            }
            panel.add(tb);
            }
            c1+=55;
        }
    }
    private void showSelectedSeats(int idvueloida) {
        int contador =0;
        StringBuilder sb = new StringBuilder();
        for (int ii=0; ii<12; ii++) {
            for(int j=0;j<10;j++){
                JToggleButton tb = asiento[ii][j];
                if (tb.isSelected()) {
                    sb.append(tb.getText());
                    sb.append(", ");
                    contador+=1;
                    
                }
            }
        }
        String s = sb.toString();
        if (s.length()>0) {
            s = s.substring(0, s.length()-2);
        }
        selectSeatsTxtArea.setText(s);
        float precioXasiento = listaLineaAerea.get(idvueloida).getPrecio();
        float preciototal = (Float)(precioXasiento*contador);
        labelprecio.setText(preciototal+"");
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
            java.util.logging.Logger.getLogger(Reserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva1(0,4,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregisvuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labalasiento;
    private javax.swing.JLabel labelprecio;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea selectSeatsTxtArea;
    // End of variables declaration//GEN-END:variables
}
