/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author apys
 */
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class pantallaFolletos extends javax.swing.JFrame {

    /**
     * Creates new form pantallaFolletos
     */
    
        String rutainvierno = "C:\\Publicaciones\\Folletos\\Invierno";
        String rutaenero = "C:\\Publicaciones\\Folletos\\Enero_Septiembre";
        String rutaverano = "C:\\Publicaciones\\Folletos\\Enero_Septiembre";
        public String[] invierno = rutas(rutainvierno,1);
        public String[] enero = rutas(rutaenero,1);
        public String[] verano = rutas(rutaverano,1);
        String[] imagenes = new String[invierno.length+enero.length+verano.length];
        String[] rutasimagenes = new String[imagenes.length];
        BufferedImage[] img = new BufferedImage[imagenes.length];
        int indicex=0;
        public pantallaFolletos() throws IOException {
        initComponents();
        int indice= 0;
        
       
        System.arraycopy(invierno, 0, imagenes, 0, invierno.length);
        System.arraycopy(enero, 0, imagenes, invierno.length, enero.length);
        System.arraycopy(verano, 0, imagenes, enero.length, verano.length);
        
        

            for (String images : imagenes) {
                if (images != null) {
                    img[indice] = ImageIO.read(Paths.get(images).toUri().toURL());
                    indice++;
                }
            }
            try {
                if (img[0] != null) {
                    folleto1.setIcon(new ImageIcon(img[0]));
                     lblf1.setText(imagenes[0]);
                    lblf1.setVisible(false);
                } else {
                    folleto1.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto1.setVisible(false);
            }
            try {
                if (img[1] != null) {
                    folleto2.setIcon(new ImageIcon(img[1]));
                     lblf1.setText(imagenes[1]);
                    lblf1.setVisible(false);
                } else {
                    folleto2.setVisible(false);
                }                
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto2.setVisible(false);
            }
            try {
                if (img[2] != null) {
                    folleto3.setIcon(new ImageIcon(img[2]));
                    lblf1.setText(imagenes[2]);
                    lblf1.setVisible(false);
                } else {
                    folleto3.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto3.setVisible(false);
            }
            try {
                if (img[3] != null) {
                    folleto4.setIcon(new ImageIcon(img[3]));
                     lblf1.setText(imagenes[3]);
                    lblf1.setVisible(false);
                } else {
                    folleto4.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto4.setVisible(false);
            }
            try {
                if (img[4] != null) {
                    folleto5.setIcon(new ImageIcon(img[4]));
                     lblf1.setText(imagenes[4]);
                    lblf1.setVisible(false);
                } else {
                    folleto5.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto5.setVisible(false);
                
            }
            try {
                if (img[5] != null) {
                    folleto6.setIcon(new ImageIcon(img[5]));
                     lblf1.setText(imagenes[5]);
                    lblf1.setVisible(false);
                } else {
                    folleto6.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto6.setVisible(false);
            }
        indicex=5;
      
       
    }
  
       /**
     * 
     * @param path
     * @param tipo 1 = carpeta 0 =archivo
     * @return 
     */
    public String[] rutas(String path, int tipo) {
        // Aquí la carpeta donde queremos buscar

        String files;
        String img;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        String[] carpeta = new String[folder.listFiles().length];
        String[] archivo = new String[folder.listFiles().length];
        int cont = 0;

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isDirectory()) {
                files = listOfFiles[i].getPath();
                File carpetas = new File(files);
                File[] listadearchivos = carpetas.listFiles();
                for (int c = 0; c < listadearchivos.length; c++) {
                    if (listadearchivos[i].isFile()) {
                        img = listadearchivos[i].getPath();
                        archivo[cont] = img;
                        cont++;
                        break;

                    }

                }//segundo for

            }
        }//primerfor
        return archivo;
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        folleto2 = new javax.swing.JButton();
        folleto3 = new javax.swing.JButton();
        folleto1 = new javax.swing.JButton();
        folleto4 = new javax.swing.JButton();
        folleto5 = new javax.swing.JButton();
        folleto6 = new javax.swing.JButton();
        panel4 = new org.edisoncor.gui.panel.Panel();
        panel5 = new org.edisoncor.gui.panel.Panel();
        lblf1 = new javax.swing.JLabel();
        lblf2 = new javax.swing.JLabel();
        lblf3 = new javax.swing.JLabel();
        lblf4 = new javax.swing.JLabel();
        lblf5 = new javax.swing.JLabel();
        lblf6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(false);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 6, true));
        panel2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel2.setColorSecundario(new java.awt.Color(255, 255, 255));

        folleto2.setText(" ");
        folleto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto2ActionPerformed(evt);
            }
        });

        folleto3.setText(" ");
        folleto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto3ActionPerformed(evt);
            }
        });

        folleto1.setText(" ");
        folleto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto1ActionPerformed(evt);
            }
        });

        folleto4.setText(" ");
        folleto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto4ActionPerformed(evt);
            }
        });

        folleto5.setText(" ");
        folleto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto5ActionPerformed(evt);
            }
        });

        folleto6.setText(" ");
        folleto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folleto6ActionPerformed(evt);
            }
        });

        panel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jean_victor_balin_arrow_orange_left.png"))); // NOI18N
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        panel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow-31212_960_720.png"))); // NOI18N
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        lblf1.setText(" ");

        lblf2.setText(" ");

        lblf3.setText(" ");

        lblf4.setText(" ");

        lblf5.setText(" ");

        lblf6.setText(" ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblf1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblf2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354)
                        .addComponent(lblf3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(folleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folleto4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folleto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folleto2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folleto3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folleto6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblf4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355)
                .addComponent(lblf6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(lblf5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1124, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(folleto2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(folleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(folleto3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblf1)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblf2)
                                .addComponent(lblf3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(folleto5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folleto4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folleto6, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblf4)
                    .addComponent(lblf6))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                    .addContainerGap(732, Short.MAX_VALUE)
                    .addComponent(lblf5)
                    .addGap(184, 184, 184)))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folleto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto1ActionPerformed
            try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf1.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_folleto1ActionPerformed

    private void folleto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto4ActionPerformed
        // TODO add your handling code here:
        try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf3.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_folleto4ActionPerformed

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        // TODO add your handling code here:
       int indice = indicex-1;
        try{
        if (img[indice]!=null){
         try {
                if (img[indice] != null) {
                    folleto1.setIcon(new ImageIcon(img[indice]));
                    lblf1.setText(imagenes[indice]);
                    lblf1.setVisible(false);
                } else {
                    folleto1.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto1.setVisible(false);
            }
         indice--;
            try {
                if (img[indice] != null) {
                    folleto2.setIcon(new ImageIcon(img[indice]));
                     lblf2.setText(imagenes[indice]);
                     lblf2.setVisible(false);
                } else {
                    folleto2.setVisible(false);
                }                
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto2.setVisible(false);
            }
            indice--;
            try {
                if (img[indice] != null) {
                    folleto3.setIcon(new ImageIcon(img[indice]));
                     lblf3.setText(imagenes[indice]);
                     lblf3.setVisible(false);
                } else {
                    folleto3.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto3.setVisible(false);
            }
            indice--;
            try {
                if (img[indice] != null) {
                    folleto4.setIcon(new ImageIcon(img[indice]));
                     lblf4.setText(imagenes[indice]);
                    lblf4.setVisible(false);
                } else {
                    folleto4.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto4.setVisible(false);
            }
            indice--;
            try {
                if (img[indice] != null) {
                    folleto5.setIcon(new ImageIcon(img[indice]));
                     lblf5.setText(imagenes[indice]);
                     lblf5.setVisible(false);
                } else {
                    folleto5.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto5.setVisible(false);
                
            }
            indice--;
            try {
                if (img[indice] != null) {
                    folleto6.setIcon(new ImageIcon(img[indice]));
                     lblf6.setText(imagenes[indice]);
                     lblf6.setVisible(false);
                } else {
                    folleto6.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto6.setVisible(false);
            }
            indice--;
            indicex=indice;
      
        }
        }catch(ArrayIndexOutOfBoundsException a){
                
        
        }
    }//GEN-LAST:event_panel4MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        // TODO add your handling code here:
        int indice = indicex+1;
        try{
        if (img[indice]!=null){
         try {
                if (img[indice] != null) {
                    folleto1.setIcon(new ImageIcon(img[indice]));
                     lblf1.setText(imagenes[indice]);
                    lblf1.setVisible(false);
                } else {
                    folleto1.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto1.setVisible(false);
            }
         indice++;
            try {
                if (img[indice] != null) {
                    folleto2.setIcon(new ImageIcon(img[indice]));
                     lblf2.setText(imagenes[indice]);
                    lblf2.setVisible(false);
                } else {
                    folleto2.setVisible(false);
                }                
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto2.setVisible(false);
            }
            indice++;
            try {
                if (img[indice] != null) {
                    folleto3.setIcon(new ImageIcon(img[indice]));
                     lblf3.setText(imagenes[indice]);
                    lblf3.setVisible(false);
                } else {
                    folleto3.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto3.setVisible(false);
            }
            indice++;
            try {
                if (img[indice] != null) {
                    folleto4.setIcon(new ImageIcon(img[indice]));
                     lblf4.setText(imagenes[indice]);
                    lblf4.setVisible(false);
                } else {
                    folleto4.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto4.setVisible(false);
            }
            indice++;
            try {
                if (img[indice] != null) {
                    folleto5.setIcon(new ImageIcon(img[indice]));
                     lblf5.setText(imagenes[indice]);
                    lblf5.setVisible(false);
                } else {
                    folleto5.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto5.setVisible(false);
                
            }
            indice++;
            try {
                if (img[indice] != null) {
                    folleto6.setIcon(new ImageIcon(img[indice]));
                     lblf6.setText(imagenes[indice]);
                    lblf6.setVisible(false);
                } else {
                    folleto6.setVisible(false);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                folleto6.setVisible(false);
            }
            indice++;
            indicex=indice;
      
        }
        }catch(ArrayIndexOutOfBoundsException a){
                
        
        }
    }//GEN-LAST:event_panel5MouseClicked

    private void folleto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto2ActionPerformed
            try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf2.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_folleto2ActionPerformed

    private void folleto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto3ActionPerformed
        // TODO add your handling code here:
        try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf3.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_folleto3ActionPerformed

    private void folleto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto5ActionPerformed
        // TODO add your handling code here:
        try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf4.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_folleto5ActionPerformed

    private void folleto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folleto6ActionPerformed
        // TODO add your handling code here:
        try {
                // TODO add your handling code here:
                new pantallaFolletosDespliegue(lblf5.getText()).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_folleto6ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(pantallaFolletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaFolletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaFolletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaFolletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
      
         
        



        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new pantallaFolletos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(pantallaFolletos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton folleto1;
    private javax.swing.JButton folleto2;
    private javax.swing.JButton folleto3;
    private javax.swing.JButton folleto4;
    private javax.swing.JButton folleto5;
    private javax.swing.JButton folleto6;
    private javax.swing.JLabel lblf1;
    private javax.swing.JLabel lblf2;
    private javax.swing.JLabel lblf3;
    private javax.swing.JLabel lblf4;
    private javax.swing.JLabel lblf5;
    private javax.swing.JLabel lblf6;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.panel.Panel panel5;
    // End of variables declaration//GEN-END:variables
}
