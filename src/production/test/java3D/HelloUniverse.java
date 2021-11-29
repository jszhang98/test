package production.test.java3D;

import com.sun.j3d.utils.geometry.ColorCube;

import javax.media.j3d.*;
import javax.vecmath.Point3d;
import java.applet.Applet;
import java.awt.*;

public class HelloUniverse extends Applet {
    public BranchGroup createSceneGraph() {
        // Create the root of the branch graph
        BranchGroup objRoot = new BranchGroup();

        // Create the TransformGroup node and initialize it to the
        // identity. Enable the TRANSFORM_WRITE capability so that
        // our behavior code can modify it at run time. Add it to
        // the root of the subgraph.
        TransformGroup objTrans = new TransformGroup();
        objTrans.setCapability(
                TransformGroup.ALLOW_TRANSFORM_WRITE);
        objRoot.addChild(objTrans);
        // Create a simple Shape3D node; add it to the scene graph.
        objTrans.addChild(new ColorCube().getShape());

        // Create a new Behavior object that will perform the
        // desired operation on the specified transform and add
        // it into the scene graph.
        Transform3D yAxis = new Transform3D();
        Alpha rotationAlpha = new Alpha(
                -1, Alpha.INCREASING_ENABLE,
                0, 0,            4000, 0, 0,                        0, 0, 0);
        RotationInterpolator rotator = new RotationInterpolator(
                rotationAlpha, objTrans, yAxis,
                0.0f, (float) Math.PI*2.0f);
        BoundingSphere bounds =
                new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
        rotator.setSchedulingBounds(bounds);
        objTrans.addChild(rotator);

        return objRoot;
    }

//    public HelloUniverse() {
//        setLayout(new BorderLayout());
//        GraphicsConfiguration a = null;
//        //Canvas3D c = new Canvas3D(graphicsConfig);
//        Canvas3D c = new Canvas3D(a);
//        add("Center", c);
//        // Create a simple scene and attach it to the virtual
//        // universe
//        BranchGroup scene = createSceneGraph();
//        UniverseBuilder u = new UniverseBuilder(c);
//        u.addBranchGraph(scene);
//    }
}