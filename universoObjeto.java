/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3dframe;

import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.universe.*;
import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.media.j3d.*;
import javax.swing.JPanel;
import javax.vecmath.*;

/**
 *
 * @author VideoConferencias
 */
public class universoObjeto {
    
    SimpleUniverse simpleU;
    private static final int BOUNDSIZE = 50;
    BoundingSphere bounds = new BoundingSphere(new Point3d(0, 0, 0), BOUNDSIZE);
    Objeto BarBase, Base,Cuerpo,BarCentro,Cuello,TapaBarra;
    private float viewX, viewY, viewZ;
    private double rotX,rotY,rotZ;
    public universoObjeto(JPanel panel){
        panel.setLayout(new BorderLayout());
        GraphicsConfiguration config =
			SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D =new Canvas3D(config);
        panel.add("Center",canvas3D);
        canvas3D.setBounds(0,0,400,200);
        simpleU = new SimpleUniverse(canvas3D);
        orbitControls(canvas3D);
        BranchGroup scene=createSceneGraph();
        scene.compile();
        simpleU.addBranchGraph(scene); 
    }
    private void orbitControls(Canvas3D c) {
        OrbitBehavior orbit = new OrbitBehavior(c, OrbitBehavior.REVERSE_ALL);
        orbit.setSchedulingBounds(bounds);
        ViewingPlatform vp = simpleU.getViewingPlatform();
        vp.setViewPlatformBehavior(orbit);
    } 
    
    private BranchGroup createSceneGraph() {
        BranchGroup objRoot = new BranchGroup();
        Color3f colorpiezabase = new Color3f(0.1f, 0.1f, 0.1f);
        Color3f colorpiezabarbase = new Color3f(0f, 0f, 0f);
         Color3f colorpiezabarra = new Color3f(0.25f, 0.14f, 0.0f);
         Color3f cuello = new Color3f(0.05f, 0.05f, 0.05f);
         
        BarBase = new Objeto("EjeO.obj",colorpiezabarbase);
        Vector3f vector = new Vector3f(0f,0.33f,0f);
        BarBase.setPosicionInicial(vector,0,-1.6,0,0.6);
    
        objRoot.addChild(BarBase);
        
       Base = new Objeto("ElevacionO.obj",colorpiezabase );
        Vector3f vector2 = new Vector3f(0f,0.25f,0f);
        Base.setPosicionInicial(vector2,0,0,0,1.1);
        objRoot.addChild(Base);
        
        Cuerpo = new Objeto("CañonO.obj",colorpiezabase );
        Vector3f vector3 = new Vector3f(0f,0.7f,0.2f);
        Cuerpo.setPosicionInicial(vector3,0,0,0,1);
        objRoot.addChild(Cuerpo);
       
        BarCentro = new Objeto("BarraCompletaO.obj",colorpiezabarra);
        Vector3f vector4 = new Vector3f(0f,0.95f,-0.85f);
        BarCentro.setPosicionInicial(vector4,0,0,1,1);
        objRoot.addChild(BarCentro);
      
        Cuello = new Objeto("CuelloCañonEnsambleO.obj",cuello);
        Vector3f vector5 = new Vector3f(0f,0.95f,-1.19f);
        Cuello.setPosicionInicial(vector5,0,0,1,0.4);
        objRoot.addChild(Cuello);
        
        TapaBarra = new Objeto("Tapita.obj",colorpiezabarra);
         Vector3f vector6 = new Vector3f(0f,0.95f,0.14f);
        TapaBarra.setPosicionInicial(vector6,0,0,0,0.10);
        objRoot.addChild(TapaBarra);
        Vector3f vectorVista = new Vector3f(0f,1f,7f);
        vistaHome(vectorVista);
        objRoot.addChild(crearLuces());
        objRoot.addChild(crearFondo());
        objRoot.addChild(crearSuelo());
        return objRoot;
    }
    
    public void transladarVista(Vector3f vista,double rX,double rY, double rZ){
                ViewingPlatform vp = simpleU.getViewingPlatform(); 
                TransformGroup View_TransformGroup = vp.getMultiTransformGroup().getTransformGroup(0); 
                Transform3D actual = new Transform3D();	
                View_TransformGroup.getTransform(actual);
                Transform3D traslate = new Transform3D();
                traslate.setTranslation(vista);
                actual.mul(traslate); 
                traslate.rotX(rX);
                actual.mul(traslate);
                traslate.rotY(rY);
                actual.mul(traslate);
                traslate.rotZ(rZ);
                actual.mul(traslate);
                View_TransformGroup.setTransform(actual);
    }
    public void vistaHome(Vector3f vista){
                ViewingPlatform vp = simpleU.getViewingPlatform(); 
                TransformGroup View_TransformGroup = vp.getMultiTransformGroup().getTransformGroup(0); 
                Transform3D traslate = new Transform3D();
                traslate.setTranslation(vista);
                View_TransformGroup.setTransform(traslate);
    }
    
    private TransformGroup crearLuces(){
        TransformGroup objRoot = new TransformGroup();
        bounds = new BoundingSphere(new Point3d(0, 0, 5), 100.0);
        Color3f lightColor = new Color3f(0.7f, 0.7f, 0.7f);
        Vector3f light1Direction = new Vector3f(1f, -1f, 0f);
        DirectionalLight luz1 = new DirectionalLight(lightColor, light1Direction);
        luz1.setInfluencingBounds(bounds);
        objRoot.addChild(luz1);
        AmbientLight luz2 = new AmbientLight(lightColor);
        luz2.setInfluencingBounds(bounds);
        objRoot.addChild(luz2);
        return objRoot;
    }
    
    private TransformGroup crearFondo() {
        TransformGroup objRoot = new TransformGroup();
        Background font = new Background(new Color3f(0.898f, 0.921f, 0.960f));
        font.setApplicationBounds(new BoundingSphere(new Point3d(), 100.0));
        objRoot.addChild(font);
        return objRoot;
    }
    
    private TransformGroup crearSuelo() {
        TransformGroup sueloTransf = new TransformGroup();
        int tamano = 40;
        Point3f[] vertices = new Point3f[tamano * tamano];
        float inicio = -20.0f;
        float x = inicio;
        float z = inicio;
        float salto = 1.0f;
        int[] indices = new int[(tamano - 1) * (tamano - 1) * 4];
        int n = 0;
        Color3f verde = new Color3f(0.16f, 0.32f, 0.41f);
        Color3f gris = new Color3f(0.61f, 0.61f, 0.61f);
        Color3f[] colors = {verde, gris};

        int[] colorindices = new int[indices.length];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                vertices[i * tamano + j] = new Point3f(x, -0.1f, z);
                z += salto;
                if (i < (tamano - 1) && j < (tamano - 1)) {
                    int cindex = (i % 2 + j) % 2;
                    colorindices[n] = cindex;
                    indices[n++] = i * tamano + j;
                    colorindices[n] = cindex;
                    indices[n++] = i * tamano + (j + 1);
                    colorindices[n] = cindex;
                    indices[n++] = (i + 1)* tamano + (j + 1);
                    colorindices[n] = cindex;
                    indices[n++] = (i + 1) * tamano + j;
                }
            }
            z = inicio;
            x += salto;
        }
        IndexedQuadArray geom = new IndexedQuadArray(vertices.length,
                GeometryArray.COORDINATES
                | GeometryArray.COLOR_3,
                indices.length);
        geom.setCoordinates(0, vertices);
        geom.setCoordinateIndices(0, indices);
        geom.setColors(0, colors);
        geom.setColorIndices(0, colorindices);
        Shape3D suelo = new Shape3D(geom);
        sueloTransf.addChild(suelo);
        return sueloTransf;
    }

    public void setViewX(float viewX) {
        this.viewX = viewX;
        Vector3f vector = new Vector3f(viewX,0f,0f);
        transladarVista(vector,0,0,0);
    }

    public void setViewY(float viewY) {
        this.viewY = viewY;
        Vector3f vector = new Vector3f(0f,viewY,0f);
        transladarVista(vector,0,0,0);
    }

    public void setViewZ(float viewZ) {
        this.viewZ = viewZ;
        Vector3f vector = new Vector3f(0f,0f,viewZ);
        transladarVista(vector,0,0,0);
    }
    
    public void setRotX(double rotX) {
        this.rotX = rotX;
        Vector3f vector = new Vector3f(0f,0f,0f);
        transladarVista(vector,rotX,0,0);
    }

    public void setRotY(double rotY) {
        this.rotY = rotY;
        Vector3f vector = new Vector3f(0f,0f,0f);
        transladarVista(vector,0,rotY,0);
    }

    public void setRotZ(double rotZ) {
        this.rotZ = rotZ;
        Vector3f vector = new Vector3f(0f,0f,0f);
        transladarVista(vector,0,0,rotZ);
    }
   
}
