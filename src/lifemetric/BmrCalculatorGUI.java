/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifemetric;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author paneq
 */
public class BmrCalculatorGUI extends javax.swing.JFrame {
    BmrCalculator myBmr = new BmrCalculator();
    ArrayList<BmrCalculator> userList = new ArrayList<>();
    
    public BmrCalculatorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBTNgroup = new javax.swing.ButtonGroup();
        biotypeBTNgroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        exerciseBTNgroup = new javax.swing.ButtonGroup();
        titleLB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        subtitleLB = new javax.swing.JLabel();
        weightLB = new javax.swing.JLabel();
        weightTF = new javax.swing.JTextField();
        heightLB = new javax.swing.JLabel();
        heightTF = new javax.swing.JTextField();
        ageLB = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        genderLB = new javax.swing.JLabel();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        biotypeLB = new javax.swing.JLabel();
        ectomorphRB = new javax.swing.JRadioButton();
        mesoRB = new javax.swing.JRadioButton();
        endoRB = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        returnBTN = new javax.swing.JButton();
        checkBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        saveBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        nameLB = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        surnameLB = new javax.swing.JLabel();
        surnameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        littleRB = new javax.swing.JRadioButton();
        lightlyRB = new javax.swing.JRadioButton();
        modRB = new javax.swing.JRadioButton();
        veryExRB = new javax.swing.JRadioButton();
        superExRB = new javax.swing.JRadioButton();

        jLabel3.setText("Name:");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLB.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleLB.setForeground(new java.awt.Color(0, 204, 51));
        titleLB.setText("Calorie Tracker");

        jSeparator1.setForeground(new java.awt.Color(102, 255, 51));

        subtitleLB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subtitleLB.setText("Check your Basic Metabolic Rate ");

        weightLB.setText("Weight(Kg):");

        weightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTFActionPerformed(evt);
            }
        });

        heightLB.setText("Height(cm):");

        heightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTFActionPerformed(evt);
            }
        });

        ageLB.setText("Age:");

        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        genderLB.setText("What is your gender ?");

        genderBTNgroup.add(maleRB);
        maleRB.setText("Male");
        maleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBActionPerformed(evt);
            }
        });

        genderBTNgroup.add(femaleRB);
        femaleRB.setText("Female");
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });

        biotypeLB.setText("What is your biotype ?");

        biotypeBTNgroup.add(ectomorphRB);
        ectomorphRB.setText("Ectomorph");
        ectomorphRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ectomorphRBActionPerformed(evt);
            }
        });

        biotypeBTNgroup.add(mesoRB);
        mesoRB.setText("Mesomorph");
        mesoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesoRBActionPerformed(evt);
            }
        });

        biotypeBTNgroup.add(endoRB);
        endoRB.setText("Endomorph");
        endoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endoRBActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("Remember, this is just a tendency. That is, mark ectomorph if you tend to lose weight, mesomorph if you tend to be athletic, ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel2.setText("and endomorph if you tend to gain weight.");

        exitBTN.setText("EXIT");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        returnBTN.setText("RETURN");
        returnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTNActionPerformed(evt);
            }
        });

        checkBTN.setText("CHECK MY BMR");
        checkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        saveBTN.setText("SAVE TO FILE");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        viewBTN.setText("DISPLAY");
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("SEARCH");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        nameLB.setText("Name:");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        surnameLB.setText("Surname");

        jLabel4.setText("How often do you exercise ?");

        exerciseBTNgroup.add(littleRB);
        littleRB.setText("Little/No exercise");

        exerciseBTNgroup.add(lightlyRB);
        lightlyRB.setText("Lightly active");
        lightlyRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightlyRBActionPerformed(evt);
            }
        });

        exerciseBTNgroup.add(modRB);
        modRB.setText("Moderately active");

        exerciseBTNgroup.add(veryExRB);
        veryExRB.setText("Very active");

        exerciseBTNgroup.add(superExRB);
        superExRB.setText("Super active");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(heightLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(heightTF))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(weightLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ageLB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnameLB))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(maleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(femaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(23, 23, 23))
                                            .addComponent(genderLB, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(biotypeLB)
                                    .addComponent(ectomorphRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(littleRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lightlyRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(veryExRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(superExRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtitleLB)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titleLB, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(176, 176, 176)
                                        .addComponent(returnBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitBTN)
                        .addComponent(returnBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(biotypeLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ectomorphRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesoRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endoRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameLB))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnameLB))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ageLB)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genderLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maleRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(femaleRB)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(weightLB)
                                    .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(heightLB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(littleRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lightlyRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veryExRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(superExRB)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBTN)
                    .addComponent(saveBTN)
                    .addComponent(viewBTN)
                    .addComponent(searchBTN)
                    .addComponent(deleteBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void weightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTFActionPerformed

    private void heightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTFActionPerformed

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void maleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBActionPerformed

    private void ectomorphRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ectomorphRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ectomorphRBActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void returnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTNActionPerformed
        CalorieTrackerGUI calorieMenu = new CalorieTrackerGUI();
        calorieMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBTNActionPerformed

    private void checkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTNActionPerformed
        // TODO add your handling code here:
        //set new instance of Bmr calculator
        BmrCalculator user = new BmrCalculator();
        //set name and surname
        String name = nameTF.getText();
        String surname = surnameTF.getText();
        user.setName(name);
        user.setSurname(surname);
        
        //set weight
        double weight = Double.parseDouble(weightTF.getText());
        user.setWeight(weight);
        //set height
        double height = Double.parseDouble(heightTF.getText());
        user.setHeight(height);
        //set age
        int age = Integer.parseInt(ageTF.getText());
        user.setAge(age);
        //set biotype and call function
        if(ectomorphRB.isSelected()){
            user.setBiotype("ectomorph");
        } else if(mesoRB.isSelected()){
            user.setBiotype("mesomorph");
        } else if(endoRB.isSelected()){
            user.setBiotype("endomorph");
        }
        user.calcBiotype();
        //set gender
        if(maleRB.isSelected()){
            user.setGender("male");
        } else {
            user.setGender("female");
        }
        //call BmrCalculator function
        user.calcBmr();
        //set exercise frequency
        if(littleRB.isSelected()){
            user.setExercise("littleExercise");
        } else if(lightlyRB.isSelected()){
            user.setExercise("lightActive");
        } else if(modRB.isSelected()){
            user.setExercise("moderate");
        } else if(veryExRB.isSelected()){
            user.setExercise("veryActive");
        } else if(superExRB.isSelected()){
            user.setExercise("superActive");
        }
        //calculate the TDEE(amount of calories burnt a day)
        user.calcCalorie();
        String bmrOutput = user.getOutput();
        //add to my arrayList<>();
        userList.add(user);
        //clear displayTA
        displayTA.setText("");
        // Append the output to the TextArea
        displayTA.append(bmrOutput + "\n");
        
        System.out.println("Age: " + ageTF.getText()); 
        System.out.println("Height: " + heightTF.getText());
        System.out.println("Weight: " + weightTF.getText());
        
        
    }//GEN-LAST:event_checkBTNActionPerformed
    
    private void clearFields(){
         // Clear text fields
        nameTF.setText("");
        surnameTF.setText("");
        ageTF.setText("");
        weightTF.setText("");
        heightTF.setText("");

        // Reset radio buttons
        genderBTNgroup.clearSelection();
        biotypeBTNgroup.clearSelection();
        exerciseBTNgroup.clearSelection();
    }
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        File f;
        FileWriter fw;
        BufferedWriter bw;
        
        //set data into a variables
        String name = nameTF.getText();
        String surname = surnameTF.getText();
        String gender;
        String biotype;
        String age = ageTF.getText();
        String height = heightTF.getText();
        String weight = weightTF.getText();
        //check gender
        if(maleRB.isSelected()){
             gender = "Male";
        } else {
             gender = "Female";
        }
        //check bodytype
        if(ectomorphRB.isSelected()){
            biotype = "Ectomorph";
        } else if(mesoRB.isSelected()){
            biotype = "Mesomorph";
        } else {
            biotype = "Endomorph";
        }
   
        try {
            // Create or open the file
            f = new File("userBmr.txt"); // or specify absolute path
            if (!f.exists()) {
                f.createNewFile(); // Create a new file if it doesn't exist
            }

            // Initialize FileWriter and BufferedWriter
            fw = new FileWriter(f, true); // 'true' appends new data to the file
            bw = new BufferedWriter(fw);

            // Write the collected data to the file
            bw.write("Name: " + name + "\n" +
                     "Surname: " + surname + "\n" +
                     "Gender: " + gender + "\n" +
                     "Age: " + age + "\n" +
                     "Biotype: " + biotype + "\n" +
                     "Height: " + height + "\n" +
                     "Weight: " + weight + "\n" +
                     "BMR: " + myBmr.getBmr() + "\n" +
                     "TDEE" + myBmr.getCalories() + "\n");
            
            bw.newLine(); // Add a new line between records
            bw.flush();  // Ensure the data is written to the file immediately
            bw.close();// Close the file

            // Confirmation message
            JOptionPane.showMessageDialog(null, "Written to file");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }//GEN-LAST:event_saveBTNActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        // TODO add your handling code here:
        for(BmrCalculator myBmr1: userList){
            JOptionPane.showMessageDialog(null, myBmr1.userDetail());
        }
        
        
          
        //clear fields
        clearFields();
    }//GEN-LAST:event_viewBTNActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void mesoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesoRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesoRBActionPerformed

    private void endoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endoRBActionPerformed

    }//GEN-LAST:event_endoRBActionPerformed

    private void lightlyRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightlyRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lightlyRBActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
         if(userList.isEmpty()){
            JOptionPane.showMessageDialog(null, "No-one in system");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Enter Name");
            for(BmrCalculator user: userList){ //forEach loop
                if(user.getName().equalsIgnoreCase(searchTerm)){
                    JOptionPane.showMessageDialog(null, user.userDetail());
                }
            }
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        if(userList.isEmpty()){
            JOptionPane.showMessageDialog(null, "No-one in system");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Enter Name");
            for(int i = 0; i < userList.size(); i++){
                BmrCalculator temp = userList.get(i);
                if(temp.getName().equalsIgnoreCase(searchTerm)){
                    userList.remove(i);
                    JOptionPane.showMessageDialog(null, "Removed");
                }
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BmrCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BmrCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BmrCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BmrCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BmrCalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLB;
    private javax.swing.JTextField ageTF;
    private javax.swing.ButtonGroup biotypeBTNgroup;
    private javax.swing.JLabel biotypeLB;
    private javax.swing.JButton checkBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JRadioButton ectomorphRB;
    private javax.swing.JRadioButton endoRB;
    private javax.swing.ButtonGroup exerciseBTNgroup;
    private javax.swing.JButton exitBTN;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.ButtonGroup genderBTNgroup;
    private javax.swing.JLabel genderLB;
    private javax.swing.JLabel heightLB;
    private javax.swing.JTextField heightTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton lightlyRB;
    private javax.swing.JRadioButton littleRB;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JRadioButton mesoRB;
    private javax.swing.JRadioButton modRB;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton returnBTN;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel subtitleLB;
    private javax.swing.JRadioButton superExRB;
    private javax.swing.JLabel surnameLB;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JLabel titleLB;
    private javax.swing.JRadioButton veryExRB;
    private javax.swing.JButton viewBTN;
    private javax.swing.JLabel weightLB;
    private javax.swing.JTextField weightTF;
    // End of variables declaration//GEN-END:variables
}
