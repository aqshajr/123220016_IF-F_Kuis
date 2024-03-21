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
public class HalamanLogin extends JFrame implements ActionListener {
    JLabel header = new JLabel("Halaman Login");
    JLabel labelUsername = new JLabel("Username : ");
    JLabel labelPassword = new JLabel("Password : ");
    
    JTextField inputUsername = new JTextField();
    JTextField inputPassword = new JPasswordField();
    JButton tombolLogin = new JButton("Login");
    
        public HalamanLogin(){
        setVisible(true);
        setSize(500,250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(header);
        add(labelUsername);
        add(labelPassword);
        add(inputUsername);
        add(inputPassword);
        add(tombolLogin);
        
        header.setBounds(20,10,200,25);
        labelUsername.setBounds(20,40,200,25);
        labelPassword.setBounds(20,60,400,25);
        inputUsername.setBounds(20,90,200,25);
        inputPassword.setBounds(20,110,400,25);
        tombolLogin.setBounds(200,160,80,25);
        
        header.setFont(header.getFont().deriveFont(20f));
        
        tombolLogin.addActionListener(this);
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            
            String username=inputUsername.getText();
            String password=inputPassword.getText();
            
            if(username.isEmpty()){
                throw new Exception("Input username tidak boleh kosong!");
            }
            
            if(password.isEmpty()){
                throw new Exception("Input password tidak boleh kosong!");
            }
                        
            if(!"123220016".equals(username))
            {
                throw new Exception("Username Anda salah!");
            }
            
            if(!"12345".equals(password))
            {
                throw new Exception("Password Anda salah!");
            }
            
            new HalamanUtama(username);
            this.dispose();
        } catch(Exception error){
        JOptionPane.showMessageDialog(null,error.getMessage());
        }
    }
}
