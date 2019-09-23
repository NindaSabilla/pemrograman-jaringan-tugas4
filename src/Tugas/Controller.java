/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ninda Sabilla
 */
public class Controller {

    public HitungLuas view;
    
    public Controller(HitungLuas view){
        
        this.view = view;
        
        this.view.getButtonHitung().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                hitung();
            }
        });
        
        this.view.getBersihkanbutton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getPanjang().setText("");
                view.getLebar().setText("");
                view.getLuas().setText("");
                view.getKeliling().setText("");
            }
        });
    }
        
    
    
    
     public void hitung(){
        if(this.view.getPanjang().getText().isEmpty() || this.view.getLebar().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Kosong ceunah!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int pjg = Integer.valueOf(view.getPanjang().getText());
            int lbr = Integer.valueOf(view.getLebar().getText());

            int luas    = pjg * lbr;
            int kll     = (2*pjg) + (2*lbr);

            view.getLuas().setText(String.valueOf(luas));
            view.getKeliling().setText(String.valueOf(kll));
        }
    }
}
