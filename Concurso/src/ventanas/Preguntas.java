
package ventanas;
import clases.OpcionesPregunta;
import clases.Respuestas;
import clases.Niveles;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author KATHERINE BIBIANA VILLA ROJAS
 */
public class Preguntas extends javax.swing.JFrame {

    ConexionDB con = new ConexionDB();
    Connection cn = con.conexion();
    public Preguntas() {
        initComponents();
        siguiente.setEnabled(true);
        pregunta.setText(p.getOpciones(posicion));
        titulo.setText(n.getNiveles(posicion));
        String[] a = r.setRespuestas(posicion);
        buttonGroup1.clearSelection(); // Borra la selección de los botones
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
    }
    int posicion = (int) (Math.random() * 5 + 0); 
    int i = 5;
    int j= 10;
    private int count=0;
   
    Respuestas r = new Respuestas();
    OpcionesPregunta p = new OpcionesPregunta();
    Niveles n = new Niveles();
    Object[] select = {"","","","","","","","","","","","","","","","","","","","","","","","",""};
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        pregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        salir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cultura General");

        pregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setText("¿Pregunta 1?");

        opc1.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(opc1);
        opc1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc2.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(opc2);
        opc2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        opc3.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(opc3);
        opc3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(opc4);
        opc4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opc2)
                    .addComponent(opc1)
                    .addComponent(opc3)
                    .addComponent(opc4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(158, 158, 158)
                .addComponent(salir)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(opc1)
                .addGap(18, 18, 18)
                .addComponent(opc2)
                .addGap(18, 18, 18)
                .addComponent(opc3)
                .addGap(18, 18, 18)
                .addComponent(opc4)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(salir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion]= opc1.getLabel();
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion]= opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
       select[posicion]= opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     
        int puntuacion = 0; 
       for(int i =0; i<25; i++){
           if(select[i].equals(r.getRespuesta(i))){
               puntuacion = puntuacion + (100 * count);
           }
       } JOptionPane.showMessageDialog(null,"Alcanzaste el nivel "+ count + " Tu puntuacion es: "+ puntuacion + " de 2500 ");
           siguiente.setEnabled(false);
           try {
            java.sql.PreparedStatement pps = cn.prepareStatement("INSERT INTO puntaje(Puntaje) VALUES(?)");
            pps.setInt(1, puntuacion);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Puntaje guardado");
        } catch (SQLException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
           Principal principal = new Principal();
           principal.setVisible(true);
           this.dispose();
          
    }//GEN-LAST:event_salirActionPerformed

    
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        // Cuadro de dialogo si selecciona una respues incorrecta
        this.count ++;
        int puntaje=0;
       for(int i =0; i<25; i++){
           if(select[i].equals(r.getRespuesta(i))){
               puntaje = puntaje +10;
           } 
       }if(puntaje != count *10){
           JOptionPane.showMessageDialog(null, "Tu respuesta es incorrecta");
           siguiente.setEnabled(false);
       }
        
           
            //numero total de pregutas                             
        if (posicion < 25){
            posicion = (int)(Math.random() * (i-j) + j);
            pregunta.setText(p.getOpciones(posicion));
            titulo.setText(n.getNiveles(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // Borra la selección de los botones
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
            i=i+5;
            j=j+5;
        }else{
            siguiente.setEnabled(false);
           
    }//GEN-LAST:event_siguienteActionPerformed
    }
    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        select[posicion]= opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

  
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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
