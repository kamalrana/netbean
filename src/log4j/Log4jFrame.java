/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import javax.swing.JFileChooser;    
import javax.swing.JOptionPane;
import static log4j.LogParserAdv1.reqDateFormat;

/**
 *
 * @author kamal64
 */
public class Log4jFrame extends javax.swing.JFrame {
    private static Set propKeySet;

    private JFileChooser fc;
    private String logFileLocation;
    private String conversionPattern;
    private String returnedString;
    public static String databaseFile = "c:/sqlite/testDB.db";

    /**
     * Creates new form Log4jFrame
     */
    public Log4jFrame() {
        initComponents();
        parsePanel.setVisible(false);
        NoOfErrors.setVisible(false);
        errorNo.setVisible(false);
        showErrors.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JButton();
        log4PropTextField = new javax.swing.JTextField();
        PropertyFileBrowse = new javax.swing.JButton();
        logFileTextField = new javax.swing.JTextField();
        logFileBrowse = new javax.swing.JButton();
        log4jFileMessage = new javax.swing.JLabel();
        logFileParserButton = new javax.swing.JButton();
        logFileMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quickParsing = new javax.swing.JButton();
        quickPanel = new javax.swing.JPanel();
        NoOfErrors = new javax.swing.JLabel();
        errorNo = new javax.swing.JLabel();
        showErrors = new javax.swing.JButton();
        parsePanel = new javax.swing.JPanel();
        startDate = new javax.swing.JLabel();
        endDate = new javax.swing.JLabel();
        startDateField = new javax.swing.JTextField();
        endDateField = new javax.swing.JTextField();
        level = new javax.swing.JComboBox();
        levelLabel = new javax.swing.JLabel();
        keyWordlabel = new javax.swing.JLabel();
        keyWordField = new javax.swing.JTextField();

        result.setText("Result");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PropertyFileBrowse.setText("lorjPropertyFile Browse");
        PropertyFileBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertyFileBrowseActionPerformed(evt);
            }
        });

        logFileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logFileTextFieldActionPerformed(evt);
            }
        });

        logFileBrowse.setText("logFile Browse");
        logFileBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logFileBrowseActionPerformed(evt);
            }
        });

        log4jFileMessage.setBackground(new java.awt.Color(255, 255, 255));

        logFileParserButton.setText("Parse File");
        logFileParserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logFileParserButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Log4j File");

        jLabel2.setText("Log File");

        quickParsing.setText("Quick Parsing");
        quickParsing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickParsingActionPerformed(evt);
            }
        });

        NoOfErrors.setText("No of error found");

        errorNo.setText("...");

        showErrors.setBackground(new java.awt.Color(255, 255, 102));
        showErrors.setText("Show Errors");
        showErrors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showErrorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quickPanelLayout = new javax.swing.GroupLayout(quickPanel);
        quickPanel.setLayout(quickPanelLayout);
        quickPanelLayout.setHorizontalGroup(
            quickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quickPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(quickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showErrors)
                    .addComponent(NoOfErrors))
                .addGap(59, 59, 59)
                .addComponent(errorNo)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        quickPanelLayout.setVerticalGroup(
            quickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quickPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(quickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoOfErrors)
                    .addComponent(errorNo))
                .addGap(42, 42, 42)
                .addComponent(showErrors)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        startDate.setText("startDate");

        endDate.setText("endDate");

        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "DEBUG", "ERROR", "WARN" }));

        levelLabel.setText("Level");

        keyWordlabel.setText("Search For specifc Key Word");

        javax.swing.GroupLayout parsePanelLayout = new javax.swing.GroupLayout(parsePanel);
        parsePanel.setLayout(parsePanelLayout);
        parsePanelLayout.setHorizontalGroup(
            parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parsePanelLayout.createSequentialGroup()
                .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parsePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDate)
                            .addComponent(endDate)
                            .addComponent(levelLabel))
                        .addGap(36, 36, 36)
                        .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(level, 0, 82, Short.MAX_VALUE)
                            .addComponent(startDateField)
                            .addComponent(endDateField))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(parsePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(keyWordlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyWordField)))
                .addContainerGap())
        );
        parsePanelLayout.setVerticalGroup(
            parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parsePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDate)
                    .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(parsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyWordlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keyWordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logFileMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(logFileTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(log4jFileMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(log4PropTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PropertyFileBrowse)
                    .addComponent(logFileBrowse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quickPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parsePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quickParsing)
                .addGap(103, 103, 103)
                .addComponent(logFileParserButton)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log4PropTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PropertyFileBrowse)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log4jFileMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logFileBrowse)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logFileMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logFileParserButton)
                    .addComponent(quickParsing))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parsePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quickPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logFileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logFileTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logFileTextFieldActionPerformed

    // log4j property file browse button action. We will not use this Final Release
    private void PropertyFileBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertyFileBrowseActionPerformed
        log4jFileMessage.setText("");
        if (fc == null) {
            fc = new JFileChooser();

            //Add a custom file filter and disable the default
            //(Accept All) file filter.
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setAcceptAllFileFilterUsed(false);

            //Add custom icons for file types.
            fc.setFileView(new ImageFileView());

            //Add the preview pane.
            fc.setAccessory(new ImagePreview(fc));
        }

        int returnVal = fc.showDialog(new FileChooserDemo2(), "Attach");
        File file = null;
        //Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
        if(file==null)
            return ;
        log4PropTextField.setText(file.getAbsolutePath());

        boolean properFileFlag = checkPropertyFile(file);
        if (properFileFlag) {
            log4jFileMessage.setForeground(Color.BLACK);
            log4jFileMessage.setText("Property File Loaded successfully");
        }
        else{
            log4jFileMessage.setForeground(Color.RED);
            log4jFileMessage.setText("Please provide valid log4j property file");
        }

        //Reset the file chooser for the next time it's shown.
        fc.setSelectedFile(null);
    }//GEN-LAST:event_PropertyFileBrowseActionPerformed

    // log4j log file browse button action. We will not use this Final Release
    private void logFileBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logFileBrowseActionPerformed

        if (fc == null) {
            fc = new JFileChooser();

            //Add a custom file filter and disable the default
            //(Accept All) file filter.
            fc.addChoosableFileFilter(new ImageFilter());
            fc.setAcceptAllFileFilterUsed(false);

            //Add custom icons for file types.
            fc.setFileView(new ImageFileView());

            //Add the preview pane.
//            fc.setAccessory(new ImagePreview(fc));
        }

        int returnVal = fc.showDialog(new FileChooserDemo2(), "Attach");
        File file = null;
        //Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();

        }
        logFileLocation= file.getAbsolutePath();
        String logFileName = "";
        logFileTextField.setText(logFileLocation);

        if (logFileLocation.contains("/")) {
            String temp[] = logFileLocation.split("/");
            if (!(temp[temp.length - 1].contains("/") || temp[temp.length - 1]
                    .contains("\\"))) {
                logFileName = temp[temp.length - 1];
            }
            System.out.println("first if condition >> " + logFileName);
        }
        if (logFileLocation.contains("\\")) {
            String temp[] = logFileLocation.split("\\\\");
            if (!(temp[temp.length - 1].contains("/") || temp[temp.length - 1]
                    .contains("\\"))) {
                logFileName = temp[temp.length - 1];
            }
            System.out.println("second if condition >> " + logFileName);
        }
        fc.setSelectedFile(null);
    }//GEN-LAST:event_logFileBrowseActionPerformed

    private void logFileParserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logFileParserButtonActionPerformed
        NoOfErrors.setVisible(false);
        errorNo.setVisible(false);
        showErrors.setVisible(false);
        if(checkRequiredFields())
            return;
         System.out.println("conversionPattern :: "+conversionPattern);
        System.out.println("logFileLocation :: "+logFileLocation);
//        System.exit(1);
        returnedString = LogParserAdv1.beginOperation(System.currentTimeMillis(), conversionPattern ,logFileLocation);
        
        parsePanel.setVisible(true);
        System.out.println("conversionPattern :: "+conversionPattern);
        System.out.println("logFileLocation :: "+logFileLocation);
        
        String Mainaray[] =returnedString.split("##");
        if(Mainaray.length<=1){
            JOptionPane.showMessageDialog(null," Some thing is wrong " );
                   return ;
        }
        String begDate="";
        String endDate="";
        String levelArray[] =null ;
//        String levelString ="SELECT, DEBUG, ERROR, WARN";
        if(Mainaray[0].contains("#")){
           begDate= Mainaray[0].split("#")[0];
           endDate = Mainaray[0].split("#")[1];
            System.out.println("begDate :: "+begDate);
            System.out.println("endDate :: "+endDate);
        }
        
        startDateField.setText("");
        endDateField.setText("");
        
        startDateField.setText(begDate);
        endDateField.setText(endDate);
        
        if(Mainaray[1].contains("#")){
           levelArray= Mainaray[1].split("#");
            for (String string : levelArray) {
                System.out.println("level :: "+string);
            }
level.setModel(new javax.swing.DefaultComboBoxModel(levelArray));
            System.out.println("MOdel is set for level");
        }
    }//GEN-LAST:event_logFileParserButtonActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
//        parsePanel.setVisible(false);
        String levelS=(String) level.getSelectedItem();
        String startDate=startDateField.getText();
        String endDate=endDateField.getText();
        if(levelS.equalsIgnoreCase("select")){
            JOptionPane.showMessageDialog(null," please select level" );
            return ;
        }
        if(startDate.length()<=0){
            JOptionPane.showMessageDialog(null," please specify beg. date" );
            return ;
        }
        if(endDate.length()<=0){
            JOptionPane.showMessageDialog(null," please specify End date" );
            return ;
        }
        String [] arg=new String[4];
        System.out.println("array size :: "+arg.length);
        arg[0]=levelS;
        arg[1]=startDate;
        arg[2]=endDate;
        arg[3]=keyWordField.getText();
        for (String string : arg) {
            System.out.println("aray data :: "+string);
        }
        GridView.main(arg);
    }//GEN-LAST:event_resultActionPerformed

    private void quickParsingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickParsingActionPerformed
//parsePanel.setVisible(false);


quickPanel.setVisible(true);
        NoOfErrors.setVisible(true);
        errorNo.setVisible(true);
        showErrors.setVisible(true);
        
        if(checkRequiredFields())
            return;
        
                String reqDateFormat = LogParserAdv1.getReqDateFormat(conversionPattern);
//		System.out.println("table Creation Sql is >>" + tableCreationSql);

		System.out.println("Pattern is " + conversionPattern);

		DateFormat df = new SimpleDateFormat(reqDateFormat);
		// System.out.println("1>>"+df.format(d));
		String datePattern = df.format(new Date()).replaceAll("[0-9]", "\\\\d") .replaceAll("[a-ce-zA-CE-Z]", "[a-zA-Z]");

		System.out.println("date pattern :: "+datePattern);     
                
                Retreve_FIle.main(new String[] {datePattern,logFileTextField.getText()});
                
                errorNo.setText(Retreve_FIle.noOfErrors+"");
                
                 NoOfErrors.setVisible(true);
        errorNo.setVisible(true);
        showErrors.setVisible(true);
        
                System.out.println("no of errors :: "+Retreve_FIle.noOfErrors);
                System.out.println("no of errors :: "+errorNo.getText());
                showErrors.setBackground(Color.red);
                
    }//GEN-LAST:event_quickParsingActionPerformed

    private void showErrorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showErrorsActionPerformed
        Retreve_FIle.frame.setVisible(true);
    }//GEN-LAST:event_showErrorsActionPerformed

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
            java.util.logging.Logger.getLogger(Log4jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log4jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log4jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log4jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log4jFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoOfErrors;
    private javax.swing.JButton PropertyFileBrowse;
    private javax.swing.JLabel endDate;
    private javax.swing.JTextField endDateField;
    private javax.swing.JLabel errorNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField keyWordField;
    private javax.swing.JLabel keyWordlabel;
    private javax.swing.JComboBox level;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField log4PropTextField;
    private javax.swing.JLabel log4jFileMessage;
    private javax.swing.JButton logFileBrowse;
    private javax.swing.JLabel logFileMessage;
    private javax.swing.JButton logFileParserButton;
    private javax.swing.JTextField logFileTextField;
    private javax.swing.JPanel parsePanel;
    private javax.swing.JPanel quickPanel;
    private javax.swing.JButton quickParsing;
    private javax.swing.JButton result;
    private javax.swing.JButton showErrors;
    private javax.swing.JLabel startDate;
    private javax.swing.JTextField startDateField;
    // End of variables declaration//GEN-END:variables

    private boolean checkPropertyFile(File propertieFile) {
        boolean properFileFlag = true;
        Properties props = new Properties();
        String reqKey = "";
        boolean foundConversionPattern=false;
        try {
            FileInputStream fis = new FileInputStream(propertieFile);
            // read the property file
            props.load(fis);

            // getting key set from file, saving key set for later iteration
            Log4jFrame.propKeySet = props.keySet();

            // if file don't begin with log4j standard key format return false
            if(! ( propKeySet.toArray()[0].toString().toLowerCase().contains("log4j") ) ){
                System.out.println(propKeySet.toArray()[0].toString());
                return false;
            }
            System.out.println("whle key set :: "+propKeySet.toString());
            String fileAppenderrKey="";
            // first iteration through property file to get req. key
            for (Iterator iterator1 = propKeySet.iterator(); iterator1 .hasNext();) {
                String key = (String) iterator1.next();
                
                if (props.getProperty(key).toLowerCase().endsWith("fileappender")) {
                    System.out.println("in fileappedner>> " + key);
                    fileAppenderrKey = key;
                    
//                    System.out.println("prop chcek>> " + props.getProperty(key + ".File"));
//
//                    if (props.getProperty(key + ".File").toLowerCase()
//                            .endsWith(logFileName)) {
//                        System.out.println("Got required key, breaking >>" + key);
//                        reqKey = key;
//                        foundReqKeyFlag = true;
//                        break;
//                    }
                }
                if(key.equalsIgnoreCase(fileAppenderrKey+".layout.conversionPattern"))
                { System.out.println("key>> "+key);
                conversionPattern = props.getProperty(key);

                    System.out.println("req. conversion pattern is " + conversionPattern);
                foundConversionPattern=true;
                }
            }

            // method return if conversion pattern is found, if not probably key's not properly ordered
            if(foundConversionPattern){
                return true;
            }
            
            // second iteration to get conversion pattern
            for (Iterator iterator2 = Log4jFrame.propKeySet.iterator(); iterator2.hasNext();) {

                String key = (String) iterator2.next();

                System.out.println(key + "<< >>" + props.getProperty(key));

                if (key.startsWith(reqKey) && key.toLowerCase().contains((".layout.conversionpattern"))) {
                    // System.out.println(object1);
                    conversionPattern = props.getProperty(key);

                    System.out.println("req. conversion pattern is " + conversionPattern);
                    properFileFlag = true;
                    break;
                }
            }

            // very essential close of input stream.
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properFileFlag;
    }

    private boolean checkRequiredFields() {
  System.out.println("log4PropTextField.getText() ::"+log4PropTextField.getText()+"--");
               System.out.println("logFileTextField.getText() ::"+logFileTextField.getText()+"--");
//               return;
        if(log4PropTextField.getText().length()<=0 || logFileTextField.getText().length()<=0){
                   JOptionPane.showMessageDialog(null," Please select log4j properties and log file" );
                   return true;
               }
        return false;
    }
}