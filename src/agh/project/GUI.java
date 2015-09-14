package agh.project;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This is Graphical User Interface for SatelliteParser application.
 * @author Jakub Latala
 *
 */
public class GUI extends javax.swing.JFrame {

	public Parser par;
	public SQLite dataBase;
	
	/**
     * Creates new form GUI
	 * @throws IOException 
     */
    public GUI() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws IOException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException {

        myButtonGroup = new javax.swing.ButtonGroup();
        showBut = new javax.swing.JButton();
        asiaBox = new javax.swing.JCheckBox();
        europeBox = new javax.swing.JCheckBox();
        atlanticBox = new javax.swing.JCheckBox();
        americaBox = new javax.swing.JCheckBox();
        toSlider = new javax.swing.JSlider();
        rangeLab = new javax.swing.JLabel();
        fromSlider = new javax.swing.JSlider();
        comBox1 = new javax.swing.JComboBox();
        comBox2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        myRadioButton1 = new javax.swing.JRadioButton();
        myRadioButton2 = new javax.swing.JRadioButton();
        myRadioButton3 = new javax.swing.JRadioButton();
        channelsBut = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satelites (lyngsat.com)");

        showBut.setText("Show");
        showBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButActionPerformed(evt);
            }
        });

        asiaBox.setText("Asia");
        asiaBox.setEnabled(false);

        europeBox.setText("Europe");
        europeBox.setEnabled(false);

        atlanticBox.setText("Atlantic");
        atlanticBox.setEnabled(false);

        americaBox.setText("America");
        americaBox.setEnabled(false);

        toSlider.setMajorTickSpacing(60);
        toSlider.setMaximum(180);
        toSlider.setMinorTickSpacing(10);
        toSlider.setPaintTicks(true);
        toSlider.setToolTipText("");
        toSlider.setValue(90);
        toSlider.setEnabled(false);
        toSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toSliderMouseDragged(evt);
            }
        });

        rangeLab.setText("from 90�W to 90�E.");
        rangeLab.setEnabled(false);

        fromSlider.setMajorTickSpacing(60);
        fromSlider.setMaximum(180);
        fromSlider.setMinorTickSpacing(10);
        fromSlider.setPaintTicks(true);
        fromSlider.setToolTipText("");
        fromSlider.setValue(90);
        fromSlider.setEnabled(false);
        fromSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fromSliderMouseDragged(evt);
            }
        });

        comBox1.setMaximumRowCount(2);
        comBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "�E", "�W" }));
        comBox1.setSelectedIndex(1);
        comBox1.setEnabled(false);
        comBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBox1ActionPerformed(evt);
            }
        });

        comBox2.setMaximumRowCount(2);
        comBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "�E", "�W" }));
        comBox2.setEnabled(false);
        comBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBox2ActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        myButtonGroup.add(myRadioButton1);
        myRadioButton1.setSelected(true);
        myRadioButton1.setText("all");
        myRadioButton1.setHideActionText(true);
        myRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRadioButton1ActionPerformed(evt);
            }
        });

        myButtonGroup.add(myRadioButton2);
        myRadioButton2.setText("range");
        myRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRadioButton2ActionPerformed(evt);
            }
        });

        myButtonGroup.add(myRadioButton3);
        myRadioButton3.setText("region");
        myRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRadioButton3ActionPerformed(evt);
            }
        });


        channelsBut.setText("Download channels");
        channelsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					channelsButActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(channelsBut)
                    .addComponent(myRadioButton1)
                    .addComponent(myRadioButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rangeLab))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(showBut)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asiaBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(europeBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atlanticBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(americaBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fromSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(myRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myRadioButton2)
                            .addComponent(rangeLab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asiaBox)
                    .addComponent(europeBox)
                    .addComponent(atlanticBox)
                    .addComponent(americaBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(channelsBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        
        Log4j.log.info("Parsing");
		par = new Parser();
		par.run("asia.html");
		par.run("europe.html");
		par.run("atlantic.html");
		par.run("america.html");
        
		Log4j.log.info("Creating data base");
		dataBase = new SQLite();
		dataBase.deleteTables();
		
		Log4j.log.info("Writing to data base");
		for(int i=0;i<par.Coordinates.size();i++){
			dataBase.insertSatellites(par.Name.elementAt(i), par.Coordinates.elementAt(i), par.EW.elementAt(i), par.Last_Update.elementAt(i));
		}
		Log4j.log.info("Opening GUI window");
    }// </editor-fold>                        

    /**
     * Generate SQL queries.
     * @return
     */
    public String generateSQLQuery(){
    	String firstSign, secondSign, firstDirection, secondDirection;
    	if (this.comBox1.getSelectedIndex()==0){
    		firstDirection = "E";
    		firstSign = ">";
    		if (this.comBox2.getSelectedIndex()==0){
        		secondDirection = "E";
        		secondSign = "<"; 		
    		}
    		else{
    			secondDirection = "W";
    			secondSign = ">";
    		}
    	}
    	else{
    		firstDirection = "W";
    		firstSign = "<";
    		if (this.comBox2.getSelectedIndex()==0){
    			secondDirection = "E";
    			secondSign = "<"; 		
    		}
    		else{
    			secondDirection = "W";
    			secondSign = ">";
    		}
    	}   		
    	
    	String query = "SELECT * FROM satellites WHERE (EW = '"+firstDirection+"' AND Coordinates "+firstSign+"= "+this.fromSlider.getValue()+") OR "
    			+ "(EW = '"+secondDirection+"' AND Coordinates "+secondSign+"= "+this.toSlider.getValue()+")";

    	return query;
    }
    
    /**
     * Generate SQL queries for regions.
     * @return
     */
    private String generateSQLQueryRegion(){
    	String query = "SELECT * FROM satellites WHERE";
    	if(this.asiaBox.isSelected())
    		query += " (((EW = 'W' AND Coordinates >= 160) AND (EW = 'W' AND Coordinates <= 180)) OR ((EW = 'E' AND Coordinates <= 180) AND (EW = 'E' AND Coordinates >= 73)))";
    	if(this.europeBox.isSelected()){
        	if(this.asiaBox.isSelected())
        		query += " OR";
    		query += " ((EW = 'E' AND Coordinates < 73) AND (EW = 'E' AND Coordinates >= 0))";
    	}
    	if(this.atlanticBox.isSelected()){
        	if(this.asiaBox.isSelected() || this.europeBox.isSelected())
        		query += " OR";
    		query += " ((EW = 'W' AND Coordinates >= 0) AND (EW = 'W' AND Coordinates <= 61))";
    	}
    	if(this.americaBox.isSelected()){
        	if(this.asiaBox.isSelected() || this.europeBox.isSelected() || this.atlanticBox.isSelected())
        		query += " OR";
    		query += " ((EW = 'W' AND Coordinates > 61) AND (EW = 'W' AND Coordinates < 160))";
    	}
    	
    	return query;
    }
    
    private void showButActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	readFromDataBase();
    }                                                                             

    private void fromSliderMouseDragged(java.awt.event.MouseEvent evt) {                                        
       this.rangeLab.setText("from "+Integer.toString(this.fromSlider.getValue())
               +this.comBox1.getSelectedItem()+" to "+Integer.toString(this.toSlider.getValue())
               +this.comBox2.getSelectedItem()+".");
    }                                       

    private void toSliderMouseDragged(java.awt.event.MouseEvent evt) {                                      
        this.rangeLab.setText("from "+Integer.toString(this.fromSlider.getValue())
                +this.comBox1.getSelectedItem()+" to "+Integer.toString(this.toSlider.getValue())
                +this.comBox2.getSelectedItem()+".");
    }                                                                      

    private void comBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.rangeLab.setText("from "+Integer.toString(this.fromSlider.getValue())
                +this.comBox1.getSelectedItem()+" to "+Integer.toString(this.toSlider.getValue())
                +this.comBox2.getSelectedItem()+".");
    }                                       

    private void comBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.rangeLab.setText("from "+Integer.toString(this.fromSlider.getValue())
                +this.comBox1.getSelectedItem()+" to "+Integer.toString(this.toSlider.getValue())
                +this.comBox2.getSelectedItem()+".");
    }                                       

    private void myRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.rangeLab.setEnabled(false);
        this.fromSlider.setEnabled(false);
        this.toSlider.setEnabled(false);
        this.comBox1.setEnabled(false);
        this.comBox2.setEnabled(false);
        this.asiaBox.setEnabled(false);
        this.europeBox.setEnabled(false);
        this.atlanticBox.setEnabled(false);
        this.americaBox.setEnabled(false);
    }                                              

    private void myRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.rangeLab.setEnabled(true);
        this.fromSlider.setEnabled(true);
        this.toSlider.setEnabled(true);
        this.comBox1.setEnabled(true);
        this.comBox2.setEnabled(true);
        this.asiaBox.setEnabled(false);
        this.europeBox.setEnabled(false);
        this.atlanticBox.setEnabled(false);
        this.americaBox.setEnabled(false);
    }                                              

    private void myRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.rangeLab.setEnabled(false);
        this.fromSlider.setEnabled(false);
        this.toSlider.setEnabled(false);
        this.comBox1.setEnabled(false);
        this.comBox2.setEnabled(false);
        this.asiaBox.setEnabled(true);
        this.europeBox.setEnabled(true);
        this.atlanticBox.setEnabled(true);
        this.americaBox.setEnabled(true);
    }   
    
    private void channelsButActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                            
    	Log4j.log.info("Parsing packages");
    	String[] pacName = {"europePac.html"};//{"asiaPac.html", "europePac.html", "atlanticPac.html", "americaPac.html"};
    	ParserPackage parP = new ParserPackage();
    	for(String pac : pacName){
    		parP.setFilePath(pac);
    		parP.LoadFile();
    		for(int j=0;j<par.Name.size();j++){
				parP.ParsePackages(par.Name.elementAt(j));
    		}
    	}

		Log4j.log.info("Downloading channels");
		//try{
		DownloaderPool.run(parP);
		//}
		//catch(java.io.FileNotFoundException e){
			//Log4j.log.error(e);
		//}
		try{
		Log4j.log.info("Parsing channels");
		ParserPackage[] parP2 = new ParserPackage[parP.link.size()];
		String name;
		for(int j=0;j<parP.link.size();j++){
			try{
			 name = parP.satellite.get(j).substring("http://www.lyngsat.com/".length(), parP.satellite.get(j).length()-5);
			 File f = new File("channelsSources/"+name+".html");
			 if(!f.exists()){continue;}
			 parP2[j] = new ParserPackage("channelsSources/"+name+".html");		
			 parP2[j].ParseChannels();
			 parP2[j].SaveToFile("channels/"+name+".txt");
			}
			catch(java.lang.NullPointerException e){
				//Log4j.log.error(e);
				continue;
			}
			}
		}
		catch(java.lang.OutOfMemoryError e){
			//Log4j.log.error(e);
		}
		
		Log4j.log.info("Downloading complete");
    } 
    /**
     * Shows list of satellites in TextArea
     * @param sat satellite
     */
    public void showSatList(Satellites sat){
    	this.textArea.append(sat+"\n");
    }

    /**
     * Read from database
     */
    public void readFromDataBase(){
    	Log4j.log.info("Read from data base");
    	List<Satellites> satellite = null;
    	
    	if(this.myRadioButton1.isSelected())
    		satellite = dataBase.selectSatellites("SELECT * FROM satellites");
    	else if(this.myRadioButton2.isSelected())
    		satellite = dataBase.selectSatellites(generateSQLQuery());
    	else if(this.myRadioButton3.isSelected())
    		satellite = dataBase.selectSatellites(generateSQLQueryRegion());
		
    	Log4j.log.info("Print in GUI TextArea");
		this.textArea.setText("");
		for(Satellites sat: satellite)
			showSatList(sat);    	
    }


 // Variables declaration - do not modify                     
    private javax.swing.JCheckBox americaBox;
    private javax.swing.JCheckBox asiaBox;
    private javax.swing.JCheckBox atlanticBox;
    private javax.swing.JButton channelsBut;
    private javax.swing.JComboBox comBox1;
    private javax.swing.JComboBox comBox2;
    private javax.swing.JCheckBox europeBox;
    private javax.swing.JSlider fromSlider;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup myButtonGroup;
    private javax.swing.JRadioButton myRadioButton1;
    private javax.swing.JRadioButton myRadioButton2;
    private javax.swing.JRadioButton myRadioButton3;
    private javax.swing.JLabel rangeLab;
    private javax.swing.JButton showBut;
    private javax.swing.JTextArea textArea;
    private javax.swing.JSlider toSlider;
    // End of variables declaration                 
}
