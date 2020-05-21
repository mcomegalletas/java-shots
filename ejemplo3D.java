/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3dframe;

import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.universe.*;
import java.awt.*;
import java.util.Arrays;
import javax.media.j3d.*;
import javax.swing.Timer;
import javax.vecmath.*;

/**
 *
 * @author VideoConferencias
 */
public class ejemplo3D extends javax.swing.JFrame {
    universoObjeto mundo;
    Tiempo Temporizado;
    java.util.Timer timer;
    private int coutn=0;
    private int contadorE=0;// contador comunicacion serial 
    private int contadorE2=0;
    private int coutn1=0;// Contador usado para la comunicacion serial

    public ejemplo3D() {
        initComponents();
        mundo = new universoObjeto(jPanel3);
        timer = new java.util.Timer();
        Temporizado= new Tiempo(mundo);
        timer.schedule(Temporizado, 100, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        subtitulo1 = new javax.swing.JTextField();
        BotonIsometrica = new javax.swing.JButton();
        BotonFrontal = new javax.swing.JButton();
        BotonSuperior = new javax.swing.JButton();
        BotonLatIzqui = new javax.swing.JButton();
        BotonLatDere = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        subtitulo2 = new javax.swing.JTextField();
        RotoPosi = new javax.swing.JButton();
        ElevaPosi = new javax.swing.JButton();
        RotoNega = new javax.swing.JButton();
        ElevoTreinta = new javax.swing.JButton();
        RotoTreinta = new javax.swing.JButton();
        ElevaNega = new javax.swing.JButton();
        RotaUnoOchenta = new javax.swing.JButton();
        RotaSesenta = new javax.swing.JButton();
        rotarm = new javax.swing.JButton();
        elevarm = new javax.swing.JButton();
        rotar = new javax.swing.JTextField();
        elevar = new javax.swing.JTextField();
        rR = new javax.swing.JTextField();
        rE = new javax.swing.JTextField();
        Origen = new javax.swing.JButton();
        RotoCuatroCinco = new javax.swing.JButton();
        ElevoCuatroCinco = new javax.swing.JButton();
        Disparar = new javax.swing.JButton();
        marcador = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subtitulo1.setEditable(false);
        subtitulo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtitulo1.setText("Movimiento Cámara");
        subtitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtitulo1ActionPerformed(evt);
            }
        });

        BotonIsometrica.setText("Isometrica");
        BotonIsometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIsometricaActionPerformed(evt);
            }
        });

        BotonFrontal.setText("Frontal");
        BotonFrontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFrontalActionPerformed(evt);
            }
        });

        BotonSuperior.setText("Superior");
        BotonSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSuperiorActionPerformed(evt);
            }
        });

        BotonLatIzqui.setText("Lateral Izq");
        BotonLatIzqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLatIzquiActionPerformed(evt);
            }
        });

        BotonLatDere.setText("Lateral Der");
        BotonLatDere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLatDereActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        subtitulo2.setEditable(false);
        subtitulo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtitulo2.setText("Movimiento en Vivo");

        RotoPosi.setText("Rotar+");
        RotoPosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotoPosiActionPerformed(evt);
            }
        });

        ElevaPosi.setText("Elevar");
        ElevaPosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevaPosiActionPerformed(evt);
            }
        });

        RotoNega.setText("Rotar-");
        RotoNega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotoNegaActionPerformed(evt);
            }
        });

        ElevoTreinta.setText("Elevar a 30°");
        ElevoTreinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevoTreintaActionPerformed(evt);
            }
        });

        RotoTreinta.setText("Rotar 30°");
        RotoTreinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotoTreintaActionPerformed(evt);
            }
        });

        ElevaNega.setText("Descender");
        ElevaNega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevaNegaActionPerformed(evt);
            }
        });

        RotaUnoOchenta.setText("Rotar 180°");
        RotaUnoOchenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotaUnoOchentaActionPerformed(evt);
            }
        });

        RotaSesenta.setText("Rotar 60°");
        RotaSesenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotaSesentaActionPerformed(evt);
            }
        });

        rotarm.setText("Rotar ");
        rotarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotarmActionPerformed(evt);
            }
        });

        elevarm.setText("Elevar ");
        elevarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevarmActionPerformed(evt);
            }
        });

        rotar.setText("0");
        rotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotarActionPerformed(evt);
            }
        });

        elevar.setText("0");

        rR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rRActionPerformed(evt);
            }
        });

        Origen.setText("Reiniciar ");
        Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigenActionPerformed(evt);
            }
        });

        RotoCuatroCinco.setText("Rotar 45°");
        RotoCuatroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotoCuatroCincoActionPerformed(evt);
            }
        });

        ElevoCuatroCinco.setText("Elevar a 45°");
        ElevoCuatroCinco.setToolTipText("");
        ElevoCuatroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElevoCuatroCincoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(elevarm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotarm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(elevar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(subtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RotoPosi, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(ElevaPosi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RotoNega, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(ElevaNega, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ElevoCuatroCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ElevoTreinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(RotaSesenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(RotoTreinta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RotoCuatroCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RotaUnoOchenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subtitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RotoPosi)
                            .addComponent(RotoNega))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ElevaPosi)
                            .addComponent(ElevaNega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Origen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElevoTreinta)
                    .addComponent(RotoTreinta)
                    .addComponent(RotoCuatroCinco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RotaUnoOchenta)
                    .addComponent(RotaSesenta)
                    .addComponent(ElevoCuatroCinco))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elevar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevarm))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        Disparar.setText("Disparar");
        Disparar.setEnabled(false);
        Disparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotonIsometrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonFrontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonLatIzqui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonLatDere, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(BotonSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(Disparar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Disparar)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(subtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonIsometrica)
                        .addGap(18, 18, 18)
                        .addComponent(BotonFrontal)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSuperior)
                        .addGap(18, 18, 18)
                        .addComponent(BotonLatIzqui)
                        .addGap(18, 18, 18)
                        .addComponent(BotonLatDere)
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        marcador.setText("Cañon cargado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(marcador))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marcador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLatDereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLatDereActionPerformed
 posicionI();
        Vector3f vectorVista1 = new Vector3f(7f,0f,-7f);
               
        mundo.transladarVista(vectorVista1,0f,Math.PI/2.0f,0f);    }//GEN-LAST:event_BotonLatDereActionPerformed

    private void RotoPosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotoPosiActionPerformed
       mundo.Base.setRotarY(-0.0175);
       mundo.BarBase.setRotarY(-0.0175);
       mundo.Cuerpo.setRotarY(-0.0175);
       
        if (mundo.Cuello.getPosicionActual().z>0 && mundo.Cuello.getPosicionActual().x>=0)
        {
         mundo.Cuello.setTransladarZ(-0.05f);
         mundo.Cuello.setTransladarX(0.05f);
        }
        else if (mundo.Cuello.getPosicionActual().z<=0 && mundo.Cuello.getPosicionActual().x>0)
        {
          mundo.Cuello.setTransladarX(-0.05f);
          mundo.Cuello.setTransladarZ(-0.05f);
        }
        else if (mundo.Cuello.getPosicionActual().z<0&& mundo.Cuello.getPosicionActual().x<=0)
        {
            mundo.Cuello.setTransladarZ(0.05f);
            mundo.Cuello.setTransladarX(-0.05f);
        }
        else 
        {
         mundo.Cuello.setTransladarX(0.02f);
         mundo.Cuello.setTransladarZ(0.02f);
        }
      //  System.out.println(mundo.Cuerpo.getPosicionActual());
        
        
        // Comunicacion serial 
         coutn1 ++;
String c;
Integer a = Integer.parseInt( rotar.getText());
  a= a + coutn1 - coutn;
  if (a<=360){
String b = Integer.toString(a);
c = "R|"+b+"|";
rR.setText(c);
RotoNega.setEnabled(true);
  }
  else {
      RotoPosi.setEnabled(false);
      c = "ANGULO NO PERMITIDO";
rR.setText(c);
  }
    }//GEN-LAST:event_RotoPosiActionPerformed

    private void ElevaPosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevaPosiActionPerformed
      mundo.Cuerpo.setRotarX(-0.01);
      mundo.Cuerpo.setTransladarY(0.001f);
      mundo.Cuerpo.setTransladarZ(-0.003f);
      mundo.TapaBarra.setTransladarZ(-0.004f);
      mundo.TapaBarra.setRotarX(-0.01);
      mundo.TapaBarra.setTransladarY(-0.0005f);    
      mundo.Cuello.setRotarX(0.0045);
      mundo.Cuello.setRotarY(0.0091);
      mundo.Cuello.setTransladarY(-0.013f);
      mundo.Cuello.setTransladarZ(-0.0017f);
      mundo.BarBase.setRotarZ(0.01);
      mundo.BarCentro.setRotarY(0.009);
      mundo.BarCentro.setRotarX(0.004);
      mundo.BarCentro.setTransladarY(-0.01f);
      mundo.BarCentro.setTransladarZ(-0.0025f);
      // Comunicacion serial 
              contadorE2 ++;
String c;
Integer a = Integer.parseInt( elevar.getText());
  a= a + contadorE2 - contadorE;
  if (a>45 ){
            ElevaPosi.setEnabled(false);
      c = "ANGULO NO PERMITIDO";
rE.setText(c);         
  }
  else {
       ElevaNega.setEnabled(true);
    
String b = Integer.toString(a);
c = "E|"+b+"|";
rE.setText(c);

  }
    }//GEN-LAST:event_ElevaPosiActionPerformed

    private void DispararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispararActionPerformed
      mundo.Cuerpo.setRotarX(0.1);
    }//GEN-LAST:event_DispararActionPerformed

    private void subtitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtitulo1ActionPerformed

    private void RotoNegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotoNegaActionPerformed
coutn ++;
String c;
Integer a = Integer.parseInt( rotar.getText());
  a= a - coutn + coutn1 ;
  if(a>=0){
String b = Integer.toString(a);
c = "R|"+b+"|";
rR.setText(c);  
RotoPosi.setEnabled(true);
  }
  else{
      RotoNega.setEnabled(false);
     c = "ANGULO NO PERMITIDO";
rR.setText(c);  
  }
    }//GEN-LAST:event_RotoNegaActionPerformed

    private void ElevaNegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevaNegaActionPerformed
    
        mundo.Cuerpo.setRotarX(0.01);
      mundo.Cuerpo.setTransladarY(-0.001f);
      mundo.Cuerpo.setTransladarZ(0.003f);
      mundo.TapaBarra.setRotarX(0.01);
      mundo.TapaBarra.setTransladarY(-0.004f);    
      mundo.Cuello.setRotarX(-0.0045);
      mundo.Cuello.setRotarY(-0.0091);
      mundo.Cuello.setTransladarY(0.013f);
      mundo.Cuello.setTransladarZ(0.0017f);
      mundo.BarBase.setRotarZ(-0.01);
      mundo.BarCentro.setRotarY(-0.009);
      mundo.BarCentro.setRotarX(-0.004);
      mundo.BarCentro.setTransladarY(0.01f);
      mundo.BarCentro.setTransladarZ(0.002f);
      
      // Comunicacion serial 
      contadorE ++;
String c;
Integer a = Integer.parseInt( elevar.getText());
  a= a - contadorE + contadorE2 ;
  if (a>=0){
String b = Integer.toString(a);
c = "E|"+b+"|";
rE.setText(c);

 ElevaPosi.setEnabled(true);
  }
  
  else{
 ElevaNega.setEnabled(false);
     c = "ANGULO NO PERMITIDO ";
rE.setText(c); 
  }
    }//GEN-LAST:event_ElevaNegaActionPerformed

    private void BotonLatIzquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLatIzquiActionPerformed
   posicionI();
   
        Vector3f vectorVista1 = new Vector3f(-7f,0f,-7f);
               
        mundo.transladarVista(vectorVista1,0f,Math.PI/-2.0f,0f);
    }//GEN-LAST:event_BotonLatIzquiActionPerformed

    private void BotonFrontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFrontalActionPerformed
        Vector3f vectorVista = new Vector3f(0f,1f,7f);
        mundo.vistaHome(vectorVista);
    }//GEN-LAST:event_BotonFrontalActionPerformed

    private void BotonSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSuperiorActionPerformed
 posicionI();
        Vector3f vectorVista1 = new Vector3f(0f,6f,-7f);
               
        mundo.transladarVista(vectorVista1,Math.PI/-2.0f,0f,0f);
    }//GEN-LAST:event_BotonSuperiorActionPerformed

    private void BotonIsometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIsometricaActionPerformed
        posicionI();
        Vector3f vectorVista1 = new Vector3f(3.9f,0.8f,-0.5f);
        mundo.transladarVista(vectorVista1,0f,Math.PI/6.0f,0f);
    }//GEN-LAST:event_BotonIsometricaActionPerformed
private int l=0;
    private void rotarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotarmActionPerformed
       // Comunicacion serial 
        String r,b;
 Integer a = Integer.parseInt( rotar.getText());

 if (a<=360){
      l=a;
      r= "R|" + rotar.getText()+"|";
       rR.setText(r);
        coutn =0;  coutn1=0;
      
 }
 else {
r=""+ l ;
       rotar.setText(r);
          b= "ERROR";
       rR.setText(b);
        coutn =0;  coutn1=0;
        
    }//GEN-LAST:event_rotarmActionPerformed

    private void elevarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevarmActionPerformed
// Comunicacion serial  
    
        String r,b;
 Integer a = Integer.parseInt( elevar.getText());


   if (a<=45){
      l=a;
      r= "E|" + elevar.getText()+"|";
       rE.setText(r);
        coutn =0;  coutn1=0;
      
 }
 else {
r=""+ l ;
      elevar.setText(r);
          b= "ERROR";
       rE.setText(b);
        coutn =0;  coutn1=0;
 }
    }                                       

    }//GEN-LAST:event_elevarmActionPerformed

    private void rotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotarActionPerformed

    private void rRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rRActionPerformed

    private void ElevoTreintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevoTreintaActionPerformed
        Reiniciar();
        Temporizado.setTiempo(2.7f);
        Temporizado.setAccion("E");

// Comunicacion serial 
        String c;
        String a="30";
              c= "E|30|";
              elevar.setText(a);
       rE.setText(c);
         contadorE=0;
  contadorE2=0; 

    }//GEN-LAST:event_ElevoTreintaActionPerformed

    private void RotaSesentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotaSesentaActionPerformed
     // Comunicacion serial 
        String c;
        String a="60";
              c= "R|60|";
             rotar.setText(a);
       rR.setText(c);
        coutn =0; coutn1=0;
    }//GEN-LAST:event_RotaSesentaActionPerformed

    private void OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigenActionPerformed
       // Comunicacion serial 
       String a ="0";
       String b = "0";
  String r;
  r= "R|"+ a+"|";
  rR.setText(r);
  coutn= 0;
  coutn1=0;
  rotar.setText(a);
  r= "E|"+ a+"|";
  rE.setText(r);
  contadorE=0;
  contadorE2=0;
  elevar.setText(a);
  Reiniciar();
        ElevaPosi.setEnabled(true);
        ElevaNega.setEnabled(true);
    }//GEN-LAST:event_OrigenActionPerformed

    private void RotaUnoOchentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotaUnoOchentaActionPerformed
      // Comunicacion serial 
        String c;
        String a="180";
              c= "R|180|";
              rotar.setText(a);
       rR.setText(c);
        coutn =0; coutn1=0;
    }//GEN-LAST:event_RotaUnoOchentaActionPerformed

    private void RotoTreintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotoTreintaActionPerformed
     // Comunicacion serial 
        String c;
        String a="30";
              c= "R|30|";
              rotar.setText(a);
       rR.setText(c);
        coutn =0; coutn1=0;
        
    }//GEN-LAST:event_RotoTreintaActionPerformed

    private void RotoCuatroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotoCuatroCincoActionPerformed
      // Comunicacion serial 
        String c;
        String a="45";
              c= "R|45|";
              elevar.setText(a);
       rE.setText(c);
      contadorE=0;
  contadorE2=0;
    }//GEN-LAST:event_RotoCuatroCincoActionPerformed

    private void ElevoCuatroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElevoCuatroCincoActionPerformed
       Reiniciar();
        Temporizado.setTiempo(4f);
        Temporizado.setAccion("E");
// Comunicacion serial 
        String c;
        String a="45";
              c= "E|45|";
              elevar.setText(a);
       rE.setText(c);
        contadorE=0;
  contadorE2=0;
    
    }//GEN-LAST:event_ElevoCuatroCincoActionPerformed

    private void Reiniciar()
    {
   Vector3f vector = new Vector3f(0f,0.38f,0f);
        mundo.BarBase.setPosicionInicial(vector,0,-1.6,0,0.6);
        vector.set(0f,0.25f,0f);
        mundo.Base.setPosicionInicial(vector,0,0,0,1.1);
        vector.set(0f,0.7f,0.2f);
        mundo.Cuerpo.setPosicionInicial(vector,0,0,0,1);
        vector.set(0f,0.95f,-0.85f);
        mundo.BarCentro.setPosicionInicial(vector,0,0,1,1);
        vector.set(0f,0.95f,-1.19f);
        mundo.Cuello.setPosicionInicial(vector,0,0,1,0.4);
        vector.set(0f,0.95f,0.14f);
        mundo.TapaBarra.setPosicionInicial(vector,0,0,0,0.10);
    }
    
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
            java.util.logging.Logger.getLogger(ejemplo3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejemplo3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejemplo3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejemplo3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejemplo3D().setVisible(true);
            }
        });
    }
    public void posicionI(){
            Vector3f vectorVista = new Vector3f(0f,1f,7f);
       mundo.vistaHome(vectorVista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFrontal;
    private javax.swing.JButton BotonIsometrica;
    private javax.swing.JButton BotonLatDere;
    private javax.swing.JButton BotonLatIzqui;
    private javax.swing.JButton BotonSuperior;
    private javax.swing.JButton Disparar;
    private javax.swing.JButton ElevaNega;
    private javax.swing.JButton ElevaPosi;
    private javax.swing.JButton ElevoCuatroCinco;
    private javax.swing.JButton ElevoTreinta;
    private javax.swing.JButton Origen;
    private javax.swing.JButton RotaSesenta;
    private javax.swing.JButton RotaUnoOchenta;
    private javax.swing.JButton RotoCuatroCinco;
    private javax.swing.JButton RotoNega;
    private javax.swing.JButton RotoPosi;
    private javax.swing.JButton RotoTreinta;
    private javax.swing.JTextField elevar;
    private javax.swing.JButton elevarm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox marcador;
    private javax.swing.JTextField rE;
    private javax.swing.JTextField rR;
    private javax.swing.JTextField rotar;
    private javax.swing.JButton rotarm;
    private javax.swing.JTextField subtitulo1;
    private javax.swing.JTextField subtitulo2;
    // End of variables declaration//GEN-END:variables
    
}
