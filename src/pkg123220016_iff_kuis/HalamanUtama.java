/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220016_iff_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener{

    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Silakan pilih menu di bawah untuk membeli majalah");
        
    JButton tombolAnak = new JButton("Majalah Anak");
    JButton tombolRemaja = new JButton("Majalah Remaja");
    JButton tombolDewasa = new JButton("Majalah Dewasa");
    
        public HalamanUtama(String username)
        {
            setVisible(true);
            setSize(400,400);
            setLayout(null);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Halaman Login");

            add(header);
            add(subheader);
            add(tombolAnak);
            add(tombolRemaja);
            add(tombolDewasa);

            header.setBounds(20,10,400,25);
            subheader.setBounds(20,30,300,25);
            tombolAnak.setBounds(50,80,200,25);
            tombolRemaja.setBounds(50,110,200,25);
            tombolDewasa.setBounds(50,140,200,25);

            header.setFont(header.getFont().deriveFont(20f));
            header.setText("Selamat Datang, "+username);

            tombolAnak.addActionListener(this);
            tombolRemaja.addActionListener(this);
            tombolDewasa.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String kategori="";
        int harga=0;
        
        if(e.getSource()==tombolAnak)
        {
            kategori="Majalah Anak";
            harga=10800;
        }
        
        if(e.getSource()==tombolRemaja)
        {
            kategori="Majalah Remaja";
            harga=13100;
        }
                
        if(e.getSource()==tombolDewasa)
        {
            kategori="Majalah Dewasa";
            harga=69400;
        }
        
        new HalamanPembelian(kategori,harga);
        this.dispose();
    } 
}
