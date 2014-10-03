




public class NewJFrame extends javax.swing.JFrame {


  
    public NewJFrame() {
        initComponents();//constructor
    }

    
    private void initComponents() {//swing objects creation,settings(color-position-etc)

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel9.setText("Πληκτρολογείστε μια φράση ή λέξη");

        jTextField3.setText("ΝΙΨΟΝ ΑΝΟΜΗΜΑΤΑ ΜΗ ΜΟΝΑΝ ΟΨΙΝ");

        jLabel10.setText("για να δείτε αν είναι παλινδρομική");

        jButton3.setText("Έλεγχος");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\180px-Palindrom_TENET.svg.png")); 

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); 
        jLabel12.setText("PALINDROME");

        jButton1.setText("Εκκαθάριση");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addGap(171, 171, 171))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel12)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel11)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton3)
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(41, 41, 41)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//event listener 
       String t;
        int length;
        boolean palindrome=true;
        t=jTextField3.getText();
        length=t.length();
        char[] word=new char[length];//new char array object
           word=t.toCharArray();//saving the input string as a char array

        stack stack1=new stack();//creating a stack object
    queue queue1=new queue();//creating a queue object
      for (int i=0;i<length;i++)//filing stack-queue with data
    {if (!Character.isWhitespace(word[i]))//non whitespace chars only(for palindrome phrases)
      {  stack1.push(word[i]);
     queue1.enqueue(word[i]);}

    }



    while(!stack1.isEmpty())//until empty stack(stack-queue same length)
   {


       if(stack1.topAndPop().data!=queue1.first().data)//palindrome check
       {palindrome=false;//break if chars are not equal ,not palindrome
       break;}//palindrome flag false

       queue1.dequeue();


    }

     if(length==0)
    {palindrome=false;}//null strings


   if(palindrome){
       jLabel1.setText("Είναι παλινδρομική!");
   }
   else {
       jLabel1.setText("Δεν είναι παλινδρομική!");
   }


jTextField3.requestFocus();







    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String t=null;
      jTextField3.setText(t);
      jTextField3.requestFocus();
      jLabel1.setText(t);
    }

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
  

}
