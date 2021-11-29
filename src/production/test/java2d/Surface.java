package production.test.java2d;

import production.test.composite.Circle;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

class Surface extends JPanel {
    private int currentX = 10;
    private int currentY =100;
    private double angle = 0;
    private void doDrawing(Graphics g) {


        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new Color(150, 150, 150));

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

//        g2d.fillRect(30, 20, 50, 50);
//        g2d.fillRect(120, 20, 90, 60);
//        g2d.fillRoundRect(250, 20, 70, 60, 25, 25);
//
//        g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
//        g2d.fillArc(120, 130, 110, 100, 5, 150);
//        g2d.fillOval(270, 130, 50, 50);

        //g2d.drawLine(20, 100, 120, 100);

        drawWieldShape(g,900,2);
        //Pen myPen = new Pen(System.Drawing.Color.Red, 5);
        //g2d.getPaint()
        //Shape aa = new Circle();
    }

    public void drawWieldShape(Graphics g, double size, int count){
        for (int i = 0; i < Math.pow(4,count-1); i++) {
            double initAngle = 60*i;
            drawLineByLength(g, 0+angle+initAngle,size/Math.pow(3,count));
            drawLineByLength(g, 60+angle+initAngle,size/Math.pow(3,count));
            drawLineByLength(g, -120+angle+initAngle,size/Math.pow(3,count));
            drawLineByLength(g, 60+angle+initAngle,size/Math.pow(3,count));
        }

    }

    public void drawLineByLength(Graphics g, double angle, double length) {
        double test1 = Math.cos(angle) * length;
        int xEnd = (int) (currentX + Math.cos(Math.toRadians(angle)) * length);
        int yEnd = (int) (currentY + Math.sin(Math.toRadians(angle)) * length);

        g.drawLine(currentX, currentY, xEnd, yEnd);
        this.currentX=xEnd;
        this.currentY=yEnd;
        this.angle = angle;
    }
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}