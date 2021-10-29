/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7diu;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Lienzo extends JPanel{
    
    BufferedImage imagen = null;

    public BufferedImage getImagen() {
        return imagen;
    }
    public Lienzo() {
        
        try{
            imagen = ImageIO.read(new URL("https://www.cambio16.com/wp-content/uploads/2017/04/fotos-impresionantes-imagenes-que-parecen-modificadas-con-photoshop-11.jpeg"));
        }catch(IOException ex){
            System.out.println("Excepción" +ex);
        }


    }
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponents(g);
        g.drawImage(imagen, 0,0,null);
    }
    public void setImagen(String path) throws IOException{
        imagen = ImageIO.read(new File(path));
        this.setPreferredSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
        
    }
    
}
