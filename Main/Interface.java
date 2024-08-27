/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Components.Cell;
import Components.CurrentProcess;
import Components.Job;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class Interface extends javax.swing.JFrame {

    String selectedAlgorithm = "FCFS";
    int quantum = 2;
    int currentTime = 0;
    boolean algorithmSet = false;
    boolean quantumSet = false;
    boolean allJobsDone = false;
    ArrayList<Job> jobList = new ArrayList<Job>();
    Animator animator = null;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
        disableButtons();
        radioButtonGroupDisable();
        initGanttChart();
        boolean algorithmSet = false;
        spinnerQuantum.setValue(quantum);
    }

    public Interface(ArrayList<Job> jobList) {
        initComponents();
        setLocationRelativeTo(null);
        enableButtons();
        radioButtonGroupEnable();
        this.jobList = jobList;
        setTableData(jobList);
        initGanttChart();
        setButtonListener();
        CPU.setJobList(jobList);
        boolean algorithmSet = false;
        spinnerQuantum.setValue(quantum);
    }

    public void initGanttChart() {
        buttonGroupAlgorithm.setSelected(radioButtonFCFS.getModel(), true);
        ganttBackground.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        ganttBackground.setPreferredSize(new Dimension(960, 347));
        ganttBackground.setMaximumSize(new Dimension(960, 347));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlgorithm = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        buttonAddData = new javax.swing.JButton();
        buttonAnimate = new javax.swing.JButton();
        buttonNextStep = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelAvgWaitingTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelAvgTurnTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelThroughput = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelCurrentJob = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelCurrentTime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        radioButtonRR = new javax.swing.JRadioButton();
        radioButtonFCFS = new javax.swing.JRadioButton();
        radioButtonSJF = new javax.swing.JRadioButton();
        radioButtonSRTF = new javax.swing.JRadioButton();
        spinnerQuantum = new javax.swing.JSpinner();
        labelQuantum = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobsTable = new javax.swing.JTable();
        ganttBackground = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPU Scheduling Algorithms Simulator");
        setBounds(new java.awt.Rectangle(0, 0, 972, 860));
        setMinimumSize(new java.awt.Dimension(972, 860));
        setPreferredSize(new java.awt.Dimension(978, 860));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonAddData.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        buttonAddData.setText("Add Data");
        buttonAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDataActionPerformed(evt);
            }
        });

        buttonAnimate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        buttonAnimate.setText("Animate >|");
        buttonAnimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnimateActionPerformed(evt);
            }
        });

        buttonNextStep.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        buttonNextStep.setText("Next Step >>");
        buttonNextStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextStepActionPerformed(evt);
            }
        });

        buttonReset.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNextStep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAnimate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNextStep, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAnimate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(331, 118));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel2.setText("Average Waiting Time :");

        labelAvgWaitingTime.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        labelAvgWaitingTime.setText("0");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel4.setText("Average Turnaround Time :");

        labelAvgTurnTime.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        labelAvgTurnTime.setText("0");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel7.setText("Throughput :");

        labelThroughput.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        labelThroughput.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAvgWaitingTime)
                    .addComponent(labelAvgTurnTime)
                    .addComponent(labelThroughput))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelAvgWaitingTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelAvgTurnTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelThroughput))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(195, 118));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel6.setText("Current Job :");

        labelCurrentJob.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        labelCurrentJob.setText("0");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel8.setText("Current Time :");

        labelCurrentTime.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        labelCurrentTime.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCurrentJob))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(labelCurrentTime)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCurrentJob))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelCurrentTime))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroupAlgorithm.add(radioButtonRR);
        radioButtonRR.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        radioButtonRR.setText("Round Robin");
        radioButtonRR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonRRItemStateChanged(evt);
            }
        });
        radioButtonRR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioButtonRRStateChanged(evt);
            }
        });

        buttonGroupAlgorithm.add(radioButtonFCFS);
        radioButtonFCFS.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        radioButtonFCFS.setText("First Come First Served");

        buttonGroupAlgorithm.add(radioButtonSJF);
        radioButtonSJF.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        radioButtonSJF.setText("Shortest Job First");

        buttonGroupAlgorithm.add(radioButtonSRTF);
        radioButtonSRTF.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        radioButtonSRTF.setText("Shortest Remaining Time First");

        spinnerQuantum.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        spinnerQuantum.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinnerQuantum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQuantumStateChanged(evt);
            }
        });
        spinnerQuantum.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinnerQuantumPropertyChange(evt);
            }
        });

        labelQuantum.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        labelQuantum.setText("Quantum :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonFCFS)
                .addGap(18, 18, 18)
                .addComponent(radioButtonSJF)
                .addGap(18, 18, 18)
                .addComponent(radioButtonSRTF)
                .addGap(18, 18, 18)
                .addComponent(radioButtonRR)
                .addGap(26, 26, 26)
                .addComponent(labelQuantum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioButtonRR)
                    .addComponent(radioButtonFCFS)
                    .addComponent(radioButtonSJF)
                    .addComponent(radioButtonSRTF)
                    .addComponent(labelQuantum)
                    .addComponent(spinnerQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radioButtonFCFS, radioButtonRR, radioButtonSJF, radioButtonSRTF});

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel9.setText("Jobs ");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(960, 404));

        jobsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job No", "Arrive", "Burst Time", "Start Time", "Wait Time", "Remaining Time", "Finish Time", "Turnaround"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jobsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jobsTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        ganttBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ganttBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ganttBackground.setFocusable(false);
        ganttBackground.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        ganttBackground.setMaximumSize(new java.awt.Dimension(960, 347));
        ganttBackground.setName(""); // NOI18N
        ganttBackground.setPreferredSize(new java.awt.Dimension(960, 347));
        ganttBackground.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ganttBackgroundLayout = new javax.swing.GroupLayout(ganttBackground);
        ganttBackground.setLayout(ganttBackgroundLayout);
        ganttBackgroundLayout.setHorizontalGroup(
            ganttBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
        );
        ganttBackgroundLayout.setVerticalGroup(
            ganttBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ganttBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganttBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDataActionPerformed
        AddData addDataWindow = new AddData();
        addDataWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAddDataActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        if(animator != null){
                animator.setAllJobsDone(true);
        }
        
        Interface face = new Interface(jobList);
        face.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonResetActionPerformed


    private void buttonNextStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextStepActionPerformed
        radioButtonGroupDisable();
        if (!algorithmSet) {
            CPU.setAlgorithm(selectedAlgorithm);
            algorithmSet = true;
            quantum = (int) spinnerQuantum.getValue();

        }

        if (!quantumSet) {
            quantum = (int) spinnerQuantum.getValue();
            CPU.setQuantum(quantum);
            System.out.println(quantum);
            quantumSet = true;
        }

        CurrentProcess currentProcess = CPU.nextStep(currentTime);

        addCell(currentProcess.getCurrentJob().getJobNo());
        removeTableData();
        setTableData(currentProcess.getTableData());
        updateLabels(currentProcess.getCurrentJob());
        currentTime++;

    }//GEN-LAST:event_buttonNextStepActionPerformed

    private void radioButtonRRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioButtonRRStateChanged

    }//GEN-LAST:event_radioButtonRRStateChanged

    private void radioButtonRRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioButtonRRItemStateChanged

        switch (evt.getStateChange()) {
            case ItemEvent.SELECTED:
                spinnerQuantum.setEnabled(true);
                break;
            case ItemEvent.DESELECTED:
                spinnerQuantum.setEnabled(false);
                break;
            default:
                spinnerQuantum.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_radioButtonRRItemStateChanged

    private void spinnerQuantumPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinnerQuantumPropertyChange

    }//GEN-LAST:event_spinnerQuantumPropertyChange

    private void spinnerQuantumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQuantumStateChanged

        quantum = (int) spinnerQuantum.getValue();
    }//GEN-LAST:event_spinnerQuantumStateChanged

    private void buttonAnimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnimateActionPerformed
        animator = new Animator(buttonNextStep);
        animator.start();
        buttonAddData.setEnabled(false);
        buttonAnimate.setEnabled(false);
    }//GEN-LAST:event_buttonAnimateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                System.out.println(info.getName());
//                if ("Flat Laf Dark".equals(info.getName())) {
//
//                    
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//</editor-fold>
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddData;
    private javax.swing.JButton buttonAnimate;
    private javax.swing.ButtonGroup buttonGroupAlgorithm;
    private javax.swing.JButton buttonNextStep;
    private javax.swing.JButton buttonReset;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel ganttBackground;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jobsTable;
    private javax.swing.JLabel labelAvgTurnTime;
    private javax.swing.JLabel labelAvgWaitingTime;
    private javax.swing.JLabel labelCurrentJob;
    private javax.swing.JLabel labelCurrentTime;
    private javax.swing.JLabel labelQuantum;
    private javax.swing.JLabel labelThroughput;
    private javax.swing.JRadioButton radioButtonFCFS;
    private javax.swing.JRadioButton radioButtonRR;
    private javax.swing.JRadioButton radioButtonSJF;
    private javax.swing.JRadioButton radioButtonSRTF;
    private javax.swing.JSpinner spinnerQuantum;
    // End of variables declaration//GEN-END:variables

    private void radioButtonGroupEnable() {
        spinnerQuantum.setEnabled(false);
        radioButtonFCFS.setEnabled(true);
        radioButtonSRTF.setEnabled(true);
        radioButtonSJF.setEnabled(true);
        radioButtonRR.setEnabled(true);
    }

    private void radioButtonGroupDisable() {
        spinnerQuantum.setEnabled(false);
        radioButtonFCFS.setEnabled(false);
        radioButtonSRTF.setEnabled(false);
        radioButtonSJF.setEnabled(false);
        radioButtonRR.setEnabled(false);
        labelQuantum.setEnabled(false);
    }

    private void enableButtons() {
        buttonAnimate.setEnabled(true);
        buttonReset.setEnabled(true);
        buttonNextStep.setEnabled(true);
    }

    private void disableButtons() {
        buttonAnimate.setEnabled(false);
        buttonReset.setEnabled(false);
        buttonNextStep.setEnabled(false);
    }

    private void addCell(int jobNo) {
        Cell cell = new Cell(jobNo);

        ganttBackground.add(cell);
        ganttBackground.revalidate();
    }

    private void setTableData(ArrayList<Job> jobList) {

        DefaultTableModel tableModel = (DefaultTableModel) jobsTable.getModel();
        Object rowData[] = new Object[8];

        jobList.forEach(job -> {
            rowData[0] = job.getJobNo();
            rowData[1] = job.getArrivalTime();
            rowData[2] = job.getBurstTime();
            rowData[3] = job.getStartTime();
            rowData[4] = job.getWaitTime();
            rowData[5] = job.getRemainingTime();
            rowData[6] = job.getFinishedTime();
            rowData[7] = job.getTurnAroundTime();

            tableModel.addRow(rowData);
        });
    }

    public void setRadioActionCommands() {
        radioButtonFCFS.setActionCommand("FCFS");
        radioButtonSJF.setActionCommand("SJF");
        radioButtonSRTF.setActionCommand("SRTF");
        radioButtonRR.setActionCommand("RR");
    }

    public void setButtonListener() {
        setRadioActionCommands();
        radioButtonFCFS.addItemListener(radioButtonListener);
        radioButtonRR.addItemListener(radioButtonListener);
        radioButtonSJF.addItemListener(radioButtonListener);
        radioButtonSRTF.addItemListener(radioButtonListener);
    }

    ItemListener radioButtonListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                selectedAlgorithm = buttonGroupAlgorithm.getSelection().getActionCommand();
                System.out.println(e);
                CPU.setAlgorithm(selectedAlgorithm);
                //System.out.println(selectedAlgorithm);
            }
        }

    };

    private void updateLabels(Job job) {

        if (job.getJobNo() < 11 && job.getJobNo() > 0) {
            labelCurrentJob.setText("job " + job.getJobNo());
        } else if (job.getJobNo() == 11) {
            labelCurrentJob.setText("waiting");
        } else if (job.getJobNo() == 0) {
            labelCurrentJob.setText("finished");
            calculateAverages();
            allJobsDone = true;
            if(animator != null){
                animator.setAllJobsDone(true);
            }
            buttonNextStep.setEnabled(false);
            buttonAddData.setEnabled(true);
            buttonReset.setEnabled(true);
        }
        labelCurrentTime.setText(currentTime + "");
    }

    private void calculateAverages() {
        DefaultTableModel tableModel = (DefaultTableModel) jobsTable.getModel();

        DecimalFormat formatter = new DecimalFormat("##.###");

        double totalWaitTime = 0;
        double totalTurnaroundTime = 0;
        double finishTime = 0;

        for (int i = 0; i < tableModel.getRowCount(); i++) {

            totalWaitTime = (totalWaitTime + (int) tableModel.getValueAt(i, 4));
        }
        System.out.println("totalWaitTime " + totalWaitTime);
        labelAvgWaitingTime.setText(formatter.format(totalWaitTime / tableModel.getRowCount()));

        for (int i = 0; i < tableModel.getRowCount(); i++) {

            totalTurnaroundTime = (totalTurnaroundTime + (int) tableModel.getValueAt(i, 7));
            System.out.println("totalTurnaroundTime =" + totalTurnaroundTime);
            labelAvgTurnTime.setText(formatter.format(totalTurnaroundTime / tableModel.getRowCount()));
        }

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if ((int) tableModel.getValueAt(i, 6) > finishTime) {
                finishTime = (int) tableModel.getValueAt(i, 6);
            }
        }

        System.out.println("finishTime " + finishTime);
        System.out.println(tableModel.getRowCount());
        labelThroughput.setText(formatter.format(tableModel.getRowCount() / finishTime));
    }

    private void removeTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) jobsTable.getModel();
        tableModel.setRowCount(0);
    }
}
