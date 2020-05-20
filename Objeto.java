/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3dframe;
    
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;

/**
 *
 * @author VideoConferencias
 */
class Objeto extends TransformGroup {
    
    String archivo;
    private double rotarX, rotarY, rotarZ;
    private double rotXIni, rotYIni, rotZIni, escalaIni;
    private float transladarX;
    private float transladarY;
    private float transladarZ;
    private Vector3f transIni;
            
    public Objeto(String archivo, Color3f color){
        super();
        this.archivo=archivo;
        ObjectFile f = new ObjectFile ();
        f.setFlags (ObjectFile.RESIZE );
        Scene s = null;
        try {
            s = f.load(archivo);
        }
        catch (java.io.FileNotFoundException ex){     
      	}
         Hashtable namedObjects = s.getNamedObjects();
        Enumeration e = namedObjects.keys();
        while(e.hasMoreElements()){
            String name = (String) e.nextElement();
            Shape3D shape = (Shape3D) namedObjects.get (name);
            shape.setAppearance(apariencia(color));
        }
        addChild(s.getSceneGroup());
        setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        setCapability(TransformGroup.ALLOW_TRANSFORM_READ);

    }
private Appearance apariencia(Color3f micolor) {
        Appearance apariencia= new Appearance();
        PolygonAttributes polyAtt=new PolygonAttributes();
        polyAtt.setCullFace(PolygonAttributes.CULL_NONE);
        polyAtt.setPolygonMode(PolygonAttributes.POLYGON_FILL);
        polyAtt.setPolygonOffset(2.0f);
        polyAtt.setBackFaceNormalFlip(true);
        apariencia.setPolygonAttributes(polyAtt);
        Color3f ambientColor = micolor;
        Color3f emissiveColor  = micolor;
        Color3f diffuseColor  = micolor;
        Color3f specularColor = micolor;
        Material mat=new Material(ambientColor,emissiveColor,diffuseColor,specularColor,64);

        apariencia.setMaterial(mat);
        return apariencia;
    }
    public void setRotarX(double rotarX) {
        this.rotarX = rotarX;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Transform3D incremento = new Transform3D();
        incremento.rotX(rotarX);
        actual.mul(incremento);
        setTransform(actual);
    }

    public void setRotarY(double rotarY) {
        this.rotarY = rotarY;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Transform3D incremento = new Transform3D();
        incremento.rotY(rotarY);
        actual.mul(incremento);
        setTransform(actual);
    }

    public void setRotarZ(double rotarZ) {
        this.rotarZ = rotarZ;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Transform3D incremento = new Transform3D();
        incremento.rotZ(rotarZ);
        actual.mul(incremento);
        setTransform(actual);
    }

    public void setTransladarX(float transladarX) {
        this.transladarX = transladarX;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Vector3f vectoractual = new Vector3f();
        actual.get(vectoractual);
        Vector3f vector = new Vector3f(transladarX, 0f, 0f);
        vector.add(vectoractual);
        actual.setTranslation(vector);
        setTransform(actual);
    }

    public void setTransladarY(float transladarY) {
        this.transladarY = transladarY;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Vector3f vectoractual = new Vector3f();
        actual.get(vectoractual);
        Vector3f vector = new Vector3f(0f, transladarY, 0f);
        vector.add(vectoractual);
        actual.setTranslation(vector);
        setTransform(actual);
    }

    public void setTransladarZ(float transladarZ) {
        this.transladarZ = transladarZ;
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Vector3f vectoractual = new Vector3f();
        actual.get(vectoractual);
        Vector3f vector = new Vector3f(0f, 0f, transladarZ);
        vector.add(vectoractual);
        actual.setTranslation(vector);
        setTransform(actual);
    }

    public void setPosicionInicial(Vector3f transIni,double rotXIni, double rotYIni, double rotZIni, double escalaIni) {
        this.transIni = transIni;
        this.rotXIni = rotXIni;
        this.rotYIni = rotYIni;
        this.rotZIni = rotZIni;
        this.escalaIni = escalaIni;
        Transform3D posicion = new Transform3D();
        posicion.setTranslation(transIni);
        Transform3D incremento = new Transform3D();
        Transform3D escala =new Transform3D();
        incremento.rotX(rotXIni);
        posicion.mul(incremento);
        incremento.rotY(rotYIni);
        posicion.mul(incremento);
        incremento.rotZ(rotZIni);
        posicion.mul(incremento);
        incremento.setScale(escalaIni);
        posicion.mul(incremento);
        setTransform(posicion);
        
    }
    
    public Vector3f getPosicionActual(){
        Transform3D actual = new Transform3D();
        getTransform(actual);
        Vector3f vector = new Vector3f();;
        actual.get(vector);
        return vector;
    }
    
   
    
}
