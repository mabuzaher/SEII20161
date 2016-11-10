/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

/**
 *
 * @author DELL
 */
public class addStdScreen extends javax.swing.JFrame {

    /**
     * Creates new form addStdScreen
     */
    private static addStdScreen screenInstance;
    
    private addStdScreen() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public static synchronized addStdScreen getInstance(){
          if(addStdScreen.screenInstance == null){
              addStdScreen.screenInstance = new addStdScreen();
          }
          return screenInstance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stdNameL = new javax.swing.JLabel();
        stdName = new javax.swing.JTextField();
        warning1 = new javax.swing.JLabel();
        stdDeptL = new javax.swing.JLabel();
        stdDept = new javax.swing.JTextField();
        warning2 = new javax.swing.JLabel();
        stdGradeL = new javax.swing.JLabel();
        stdGrade = new javax.swing.JTextField();
        warning3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        warning4 = new javax.swing.JLabel();
        success = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stdNameL.setText("Student Name");

        stdName.setToolTipText("John");
        stdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdNameActionPerformed(evt);
            }
        });

        warning1.setForeground(new java.awt.Color(255, 0, 0));

        stdDeptL.setText("Student Department");

        stdDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdDeptActionPerformed(evt);
            }
        });

        warning2.setForeground(new java.awt.Color(255, 0, 0));

        stdGradeL.setText("Student Grade");

        stdGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdGradeActionPerformed(evt);
            }
        });

        warning3.setForeground(new java.awt.Color(255, 0, 0));

        submit.setText("Add Student To DB");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        warning4.setForeground(new java.awt.Color(255, 0, 0));

        success.setForeground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stdDeptL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stdGradeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stdNameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stdName)
                                    .addComponent(stdGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warning1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(warning3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stdDept, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warning2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(success, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warning4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdNameL)
                    .addComponent(warning1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdDeptL)
                    .addComponent(stdDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warning2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdGradeL)
                    .addComponent(stdGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warning3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(warning4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(success)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdNameActionPerformed
        if(stdName.getText().isEmpty()){
            warning1.setText("Name is Required");
        }else{
            warning1.setText("");
        }
    }//GEN-LAST:event_stdNameActionPerformed

    private void stdDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdDeptActionPerformed
        if(stdDept.getText().isEmpty()){
            warning2.setText("Department is Required");
        }else{
            warning2.setText("");
        }
    }//GEN-LAST:event_stdDeptActionPerformed

    private void stdGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdGradeActionPerformed
        if(stdGrade.getText().isEmpty()){
            warning3.setText("Grade is Required");
        }else if(Integer.parseInt(stdGrade.getText())<0||Integer.parseInt(stdGrade.getText())>100){
            warning3.setText("Grade Must Be between(0-100)");
        }else{
            warning3.setText("");
        }
    }//GEN-LAST:event_stdGradeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        stdGradeActionPerformed(evt);
        stdDeptActionPerformed(evt);
        stdNameActionPerformed(evt);
        if((warning1.getText().equals("")&&warning2.getText().equals("")&&warning3.getText().equals(""))){
            Student std = new Student(stdName.getText(), stdDept.getText(),Double.parseDouble(stdGrade.getText()));
            dbStudent dbs = new dbStudent();
            boolean done = dbs.addStudent(std);
            if(done){
                stdName.setText("");
                stdDept.setText("");
                stdGrade.setText("");
                success.setText("Added Successfully");
            }else{
                warning4.setText("Error in Connection..");
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addStdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStdScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField stdDept;
    private javax.swing.JLabel stdDeptL;
    private javax.swing.JTextField stdGrade;
    private javax.swing.JLabel stdGradeL;
    private javax.swing.JTextField stdName;
    private javax.swing.JLabel stdNameL;
    private javax.swing.JButton submit;
    private javax.swing.JLabel success;
    private javax.swing.JLabel warning1;
    private javax.swing.JLabel warning2;
    private javax.swing.JLabel warning3;
    private javax.swing.JLabel warning4;
    // End of variables declaration//GEN-END:variables
}
