package multinetwork;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.*;

public class ClientFrame extends JFrame{

   private JPanel panel = new JPanel(new BorderLayout());
   private JTextArea textArea = new JTextArea();
   private JScrollPane scrollPane = new JScrollPane(textArea);
   private JTextField textField = new JTextField();
   private String id;

   
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public ClientFrame() {
      this.setTitle("채팅");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setBounds(200,200,400,400); //기본크기 지정
      textArea.setFocusable(false);

//      scrollPane.add(textArea);
      panel.add(scrollPane, BorderLayout.CENTER);
      panel.add(textField,BorderLayout.SOUTH);
      
      this.setContentPane(panel);
      this.setVisible(true);
      
      
      while(true) {
         id = JOptionPane.showInputDialog(this,"아이디를 입력해주세요", "아이디 입력", JOptionPane.QUESTION_MESSAGE);
         
         if(id!=null && !id.equals("")) {
            break;
         }
         
      }
      
      //메시지send
      textField.addActionListener(new ActionListener() {
         //textField에 엔터 이벤트가 들어가면 동작
         @Override
         public void actionPerformed(ActionEvent e) {
            DataOutputStream dos = Client.dos;
            try {
               dos.writeUTF("["+id+"]:\t" + textField.getText());
               putChatText("▷" + id + "◁\t" + textField.getText());
               textField.setText("");
               
            } catch (IOException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
            //입력창에 입력 후 입력창 초기화
//            System.out.println(textField.getText());
            
         }
      });
   }
   
   //textArea에 채팅 올라오는 메소드
   public void putChatText(String msg) {
      textArea.append(msg + "\n");
      textArea.setCaretPosition(textArea.getText().length());
   }
   
   
   
   public static void main(String[] args) {

      new ClientFrame();
      
   }

}