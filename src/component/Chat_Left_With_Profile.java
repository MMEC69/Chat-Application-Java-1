/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author coora
 */
public class Chat_Left_With_Profile extends javax.swing.JLayeredPane {

    /**
     * Creates new form Chat_Left
     */
    public Chat_Left_With_Profile() {
        initComponents();
        txt.setBackground(new Color(247,241,247));
    }
    
    public void setText(String text){
        if(text.equals("")){
            txt.hideText();
        }
        else{
            txt.setText(text);
        }
         
    }
    
    public void setImage(Icon... image){
        txt.setImage(false, image);
    }
    
    public void setTime(){
        txt.setTime("10:30 PM"); //Testing
    }
    
    public void setUserProfile(String user){
        txt.setUserProfile(user);
    }
    
    public void setImageProfile(Icon image){
        iaImage.setImage(image);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        iaImage = new swing.ImageAvatar();
        txt = new component.Chat_Item();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        iaImage.setBorderSize(0);
        iaImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/pro.png"))); // NOI18N
        iaImage.setMaximumSize(new java.awt.Dimension(31, 31));
        iaImage.setMinimumSize(new java.awt.Dimension(31, 31));
        iaImage.setPreferredSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(iaImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iaImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(iaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);

        txt.setBackground(new java.awt.Color(255, 255, 255));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar iaImage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
