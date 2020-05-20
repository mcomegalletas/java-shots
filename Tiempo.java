/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3dframe;

import java.util.TimerTask;
    
    
/**
 *
 * @author VideoConferencias
 */
public class Tiempo extends TimerTask{
    private universoObjeto mundo;
    long t0 = System.currentTimeMillis();
    private float tiempo;
    private String accion;
    private Objeto objeto=null;
    
    public Tiempo (universoObjeto mundo){
        this.mundo = mundo;
        this.tiempo = 0;
        this.accion = "";
        this.objeto = null;
    }
    
    @Override
    public void run() {
        if (System.currentTimeMillis() - t0 > tiempo * 1000) {
                  accion="0";
              } else {
                   accion();
        }
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
        t0 = System.currentTimeMillis();
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
    
    
    private void accion()
    {
        switch(accion)
        {
            case "ETreinta":
            {
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
             break;
            }
            /*case "rotXp":
                objeto.setRotarX(Math.PI / 32.0);
                break;
            case "rotXn":
                objeto.setRotarX(-Math.PI / 32.0);
                break;
            case "rotYp":
                objeto.setRotarY(Math.PI/32.0);
                break;
            case "rotYn":
                objeto.setRotarY(-Math.PI / 32.0);
                break;
            case "rotZp":
                objeto.setRotarZ(Math.PI / 32.0);
                break;
            case "rotZn":
                objeto.setRotarZ(-Math.PI / 32.0);
                break;
            case "transXp":
                objeto.setTransladarX(0.1f);
                break;
            case "transXn":
                objeto.setTransladarX(-0.1f);
                break;
            case "transYp":
                objeto.setTransladarY(0.1f);
                break;
            case "transYn":
                objeto.setTransladarY(-0.1f);
                break;
            case "transZp":
                objeto.setTransladarZ(0.1f);
                break;
            case "transZn":
                objeto.setTransladarZ(-0.1f);
                break;
            case "0":*/
        }
    }
    
}
