package sms.pkg22RP02216;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MarksJFrame extends javax.swing.JFrame {

    ArrayList<Integer> marks = new ArrayList<Integer>();


    public MarksJFrame() {
        initComponents();
    }

    public static boolean isNumber(String num) {

        try {
            // Attempt to parse the string as an integer
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }


    public static boolean CheckRange(ArrayList<Integer> marks) {
        int i;

        boolean flag = true;

        int value;

        for (i = 0; i < marks.size(); i++) {
            value = marks.get(i);

            
            if (!((value >= 0 && value <= 100))) {
                flag = false;
                break;
            }

        }

        return flag;
    }
    
    public static ArrayList<String> getMaxStudent(ArrayList<ArrayList<String>> studentList, int max){
        
        
        ArrayList<String> StudentWithHighAvg = null;
        
        for(ArrayList<String> currentRow : studentList){
            
            if(Integer.parseInt(currentRow.get(2))== max){
                    StudentWithHighAvg = currentRow;
            } 
            
            
        }
        
        return StudentWithHighAvg;
        
    }

    // Initializing GUI components
    // Setting properties for jPanel1,JTextfield,JButton
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setText("Reg Number:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel12.setText("PHP Marks:");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setText("Java Marks:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("Name: ");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel15.setText("Math Marks:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextField6.setToolTipText("");

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD STUDENT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("EXIT");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg Number", "Average Marks"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0); //Exit the application
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Retrieve values from text fields
        String Name = jTextField2.getText();
        String regno = jTextField4.getText();
        String math = jTextField6.getText();
        String java = jTextField5.getText();
        String php = jTextField3.getText();

        if (math.isEmpty() || java.isEmpty() || php.isEmpty() || Name.isEmpty() || regno.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill in all inputs");

        } else if (!isNumber(jTextField6.getText()) || !isNumber(jTextField5.getText()) || !isNumber(jTextField3.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for marks.");
        } else if (!CheckRange(marks)) {
            JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
        } else {

            
            int mathInt = Integer.parseInt(math);
            int phpInt = Integer.parseInt(php);
            int javaInt = Integer.parseInt(java);
            int avg;

            ArrayList<Integer> marks = new ArrayList<Integer>();
            

            marks.add(mathInt);
            marks.add(phpInt);
            marks.add(javaInt);

            if (!CheckRange(marks)) {
                JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");

            }
            else{

                
                System.out.println("Raw marks: "+marks.toString());

                avg = Student.getAverageMarks(marks);

                // Create a new student object
                Student student = new Student(Name, regno, avg);

                // Add the new student to the table
                DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
                Object[] newRow = {student.name, student.regno, student.averageMarks};
                tableModel.addRow(newRow);

                ArrayList<String> list;

                ArrayList<ArrayList<String>> stList = new ArrayList<>();
                ArrayList<Integer> stMarks =  new ArrayList<Integer>();

                int i;
                for(i=0;i<jTable2.getRowCount();i++){

                    list = new  ArrayList<String>(); 

                    stMarks.add((Integer)jTable2.getValueAt(i, 2));

                    list.add(jTable2.getValueAt(i, 0).toString());
                    list.add(jTable2.getValueAt(i, 1).toString() );
                    list.add(jTable2.getValueAt(i, 2).toString() );
                    stList.add(list);
                }

                //System.out.println("Display list 1-d : "+list.toString());
                System.out.println("Display list 2-d : "+stList.toString());

                int max = Collections.max(stMarks);
                System.out.println("The max values is : "+max);

                ArrayList<String> st = getMaxStudent(stList,max);

                // get numbers of  rows in the table
                int rowsNum = tableModel.getRowCount();
                int counterRow;
                int HighestIndexRow=0;

                int highestAvg = Integer.parseInt(tableModel.getValueAt(0, 2).toString());

                for(counterRow=0;counterRow<rowsNum;counterRow++){

                    int currentAvg = Integer.parseInt(tableModel.getValueAt(counterRow, 2).toString());
                    System.out.println("Current Index row!!!: "+counterRow);
                    if(currentAvg > highestAvg){

                        highestAvg = currentAvg;

                        HighestIndexRow = counterRow;

                    }

                }

                System.out.println("Current Highest row index : "+HighestIndexRow);
                selectHighStudent(HighestIndexRow);

                System.out.println("FINAL RAW marks: "+marks.toString());

            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarksJFrame().setVisible(true);
            }
        });
    }
    
    public  void selectHighStudent(int HighrowIndex){
        
       
      jTable2.clearSelection();
      jTable2.setRowSelectionInterval(HighrowIndex, HighrowIndex);
      jTable2.setSelectionBackground(Color.yellow);
  
        
    }

    // illustration of encapsulation
    public class Student {

        private static String name;
        private static String regno;
        public static int averageMarks;
        // Constructor for the Student class

        public Student(String name, String regno, int averageMarks) {
            this.name = name;
            this.regno = regno;
            this.averageMarks = averageMarks;
        }
        // for the name

        public String getName() {
            return name;
        }
        // for the registration number

        public String getRegNo() {

            return regno;
        }
        // Method to calculate the average marks

        public static int getAverageMarks(ArrayList<Integer> marks) {
            
           averageMarks  = 0;
           
            for (int num : marks) {
                averageMarks += num;
            }

            return averageMarks / marks.size();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
