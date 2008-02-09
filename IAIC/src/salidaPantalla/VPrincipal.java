/**
 * 
 */
package salidaPantalla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import Cubo.Edificio;

/**
 * 
 *
 */
public class VPrincipal extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	/**
	 * M�todo elegido por el usuario para resolver el problema
	 */
	private int metodoElegido;
	
	/**
	 * Flag que indica se el usuario ha elegido el juego aleatorio o introducir los datos por archivos
	 */
	private boolean manual;
	
	/**
	 * Indica la dimension del edificio que estamos tratando en el problema
	 */
	private int dimensionEdi;
	
	/**
	 * Imagen de la flecha que presenta por pantalla con el fin de simplificar la representacion
	 */
	private ImageIcon flecha;
	
	/**
	 * Direcci�n hacia la que se est� avanzando en cada momento
	 */
	private int direccion;
	
	/**
	 * Indica si el edificio est� completamente cerrado y no se puede salir
	 */
	private boolean encerrado;
	
	/**
	 * El edificio que creamos para poder salir de �l
	 */
	private Edificio edi;
	
	/**
	 * Fichero fuente de el que vamos a cargar los datos en caso cargar de archivo
	 */
	private FileReader fuente;

	/**
	 * Crea un instancia del formulario principal
	 */
    public VPrincipal() {
     	initComponents();
        actualizaComponentes();
    }
    
    /**
     * M�todo que actualiza el comboB�squedas para que el usuario pueda elegir los m�todos a usar
     */
    private void actualizaComponentes(){
    
        String[] cas=new String [6];
        
        cas[0]="Primero en Profundidad";
        cas[1]="Primero en Anchura";
        cas[2]="Coste Uniforme";
        cas[3]="Profundidad Iterativa";
        cas[4]="Escalada Maxima";
        cas[5]="A*";
        ComboBusquedas.setModel(new javax.swing.DefaultComboBoxModel(cas));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * M�todo que inicializa todos los componentes que se muestran en el formulario
     */
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ComboBusquedas = new javax.swing.JComboBox();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemCargar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItemJugarAleatorio = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenuComponentes = new javax.swing.JMenu();
        jMenuItemComponentes = new javax.swing.JMenuItem();
    	etiquetaImagenFlecha=new javax.swing.JLabel();
    	etiquetaNombreFlecha=new javax.swing.JLabel();
    	jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
    	jTextArea1.setEditable(false);
    	jTextArea2.setEditable(false);
    	jLabel4 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);        
       
        jLabel4.setFont(new java.awt.Font("Batang", 1, 14));
        jLabel4.setText("Solucion �ltimo problema");
        jLabel4.setBounds(80, 25, 200, 20);
        
        jDesktopPane3.add(jLabel4,javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBounds(10,10, 350, 310);
        jDesktopPane5.setBounds(390, 10, 390, 310); 
        jDesktopPane3.setBounds(10,370, 350, 310);
        jDesktopPane2.setBounds(390, 370, 390, 310);                  
        jDesktopPane1.setBackground(new java.awt.Color(102, 204, 255));

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane3.setBackground(new java.awt.Color(0,255, 204));
        //aguamarina

        jDesktopPane1.add(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane4.setBackground(new java.awt.Color(204, 255, 153));
        jDesktopPane4.setForeground(java.awt.Color.white);

        jButton1.setFont(new java.awt.Font("Batang", 1, 12));
        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(140, 230, 120, 40);
        jDesktopPane4.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14));
        jLabel1.setText("Problema");
        jLabel1.setBounds(30, 40, 70, 20);
        jDesktopPane4.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setFont(new java.awt.Font("Batang", 0, 12));
        jTextField1.setBounds(170, 40, 170, 20);
        jTextField1.setEditable(false);
        jDesktopPane4.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Batang", 1, 14));
        jLabel2.setText("B�squeda");
        jLabel2.setBounds(30, 130, 80, 15);
        jDesktopPane4.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ComboBusquedas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBusquedas.setBounds(170,130, 170,20);
        jDesktopPane4.add(ComboBusquedas, javax.swing.JLayeredPane.DEFAULT_LAYER);

       
        jDesktopPane1.add(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane5.setBackground(new java.awt.Color(255, 255, 153));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5); 
        jTextArea2.setColumns(20);
        
        jTextArea2.setRows(5);       
        jScrollPane1.setViewportView(jTextArea1);        
        jScrollPane1.setBounds(10, 80, 370, 190);
        
        jScrollPane2.setViewportView(jTextArea2);        
        jScrollPane2.setBounds(10, 70, 330, 230);
        jDesktopPane3.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        
        jDesktopPane5.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        etiquetaImagenFlecha.setBounds(130, 40, 200, 200);
        etiquetaNombreFlecha.setBounds(110, 150, 200, 200);
        etiquetaNombreFlecha.setFont(new java.awt.Font("Batang", 1, 12));
        jDesktopPane2.add(etiquetaImagenFlecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.add(etiquetaNombreFlecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Batang", 1, 14));
        jLabel3.setText("Informaci�n");
        jLabel3.setBounds(160, 25, 90, 20);
        jDesktopPane5.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);


        jDesktopPane1.add(jDesktopPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu.setText("Menu");

        jMenuItemCargar.setText("Cargar");
        jMenuItemCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemCargar);
        jMenu.add(jSeparator1);

        jMenuItemJugarAleatorio.setText("Jugar Aleatorio");
        jMenuItemJugarAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJugarAleatorioActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemJugarAleatorio);
        jMenu.add(jSeparator2);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemSalir);

        jMenuBar1.add(jMenu);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAyuda.setText("Mostrar Ayuda");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuAyuda);

        jMenuComponentes.setText("Componentes");

        jMenuItemComponentes.setText("Mostrar Componentes");
        jMenuItemComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComponentesActionPerformed(evt);
            }
        });
        jMenuComponentes.add(jMenuItemComponentes);

        jMenuBar1.add(jMenuComponentes);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
      
        setResizable(false);
        
         ComboBusquedas.setVisible(false);
         jButton1.setVisible(false);
         jDesktopPane2.setVisible(false);
         jDesktopPane3.setVisible(false);
         jDesktopPane4.setVisible(false);
         jDesktopPane5.setVisible(false);
         jLabel1.setVisible(false);
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
         jLabel4.setVisible(false);
                
         jScrollPane1.setVisible(false);
         jScrollPane2.setVisible(false);
        
         jTextArea1.setVisible(false);
         jTextArea2.setVisible(false);
        
         jTextField1.setVisible(false);
               
        pack();
        
        setTitle("Micromundo C�bico : Pr�ctica 1 IAIC.");
    }// </editor-fold>//GEN-END:initComponents

    /**
     * M�todo que ejecuta la accion de salir
     * @param evt
     */
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed   
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    /**
     * M�todo que pide un archivo e intenta cargar desde �l los datos
     * @param evt
     */
    private void jMenuItemCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarActionPerformed

    	manual=false;  
    	ComboBusquedas.setEnabled(false);
    	Filtro f=new Filtro();
    	JFileChooser j=new JFileChooser();
     	j.setFileFilter(f);
    	j.setMultiSelectionEnabled(false);    	
    	j.showOpenDialog(jMenuItemCargar);    	
    	if (j.getSelectedFile()!=null){    		
    		String ruta=j.getSelectedFile().getPath();
    		//ahora hay que leer del archivo todo lo necesario
    			fuente=null;
        	try{
    			fuente = new FileReader(ruta);
    			empiezaJugar();
    			}
    		catch (Exception e)
    		{System.out.println("Problemas con el fichero.");}    	    		    		
    	}    	    	
    	
    	//AQUI
    }//GEN-LAST:event_jMenuItemCargarActionPerformed

    /**
     * M�todo que se ejecuta al pulsar el boton "Continuar", 
     * continua con la ejecucci�n del problema dependiendo de si es por archibo o aleatorio
     * @param evt
     */

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //codigo del boton COntinuar
    	if (manual){
    		if(!encerrado){    			
    			metodoElegido=ComboBusquedas.getSelectedIndex();
    			resuelve();
    		}
    	}else{
    		int problema=0;
    		try{
    			String s=new String(); 
    			char c=(char)fuente.read();
    			while (c!=','){//mirar que sea un numero    				
    				s+=c;
    				c=(char)fuente.read();
    			}    			    		
    			//pasamos el String a entero
    			metodoElegido=Integer.parseInt(s);
    			if ((metodoElegido<0)||(metodoElegido>5))
    				metodoElegido=0;
    			
    			
    			//tenemos el metodo
    			while (c!=','){//mirar que sea un numero    				
    				s+=c;
    				c=(char)fuente.read();
    			}    			    		
    			//pasamos el String a entero
    			problema=Integer.parseInt(s);
    		}
    		catch(Exception e){System.out.println("El fichero no tiene un formato correcto");}
    		resuelve(problema);
    	}    	           
    }//GEN-LAST:event_jButton1ActionPerformed           
    
    /**
     * M�todo accesor al atributo manual, el cual nos indica si se est� ejecutando aleatoriamente
     * o mediante archivo
     * @return si se ejecuta aleatorio o no
     */
    public boolean esManual(){
    	return manual;   	
    }
    
    /**
     * M�todo que pinta la flecha en el recuadro indicado
     */
    private void pintarFlecha(){
    	String mensaje = "";
    	switch (direccion){
    	
    	case 0:
    		flecha=new ImageIcon("flechaAbajo.png");
    		mensaje = "Abriendo puerta inferior";
    	    break;
    	case 1:
    		flecha=new ImageIcon("flechaDerecha.png");
    		mensaje = "Abriendo puerta derecha";
		    break;
    	case 2:
    		flecha=new ImageIcon("flechaArriba.png");
    		mensaje = "Abriendo puerta superior";
		    break;
    	case 3:
    		flecha=new ImageIcon("flechaIzquierda.png");
    		mensaje = "Abriendo puerta izquierda";
    		break;
    	case 4:
    		flecha=new ImageIcon("flechaAbajo.png");//sera enfrente cuando tengamos dibujo
    		mensaje = "Abriendo puerta frontal";
    		break;
    	case 5:
    		flecha=new ImageIcon("flechaArriba.png");//sera detras cuando tengamos dibujo
    		mensaje = "Abriendo puerta trasera";
    		break;    	
    	default:
    		flecha=new ImageIcon("flechaAbajo.png");	  		    	        	
    	}    	
    	
    	etiquetaImagenFlecha.setIcon(flecha);
    	etiquetaNombreFlecha.setText(mensaje);
    }
    

    /**
     * Coloca la dimensi�n del edificio en el que vamos a trabajar 
     * @param dim dimension del edificio sobre el que vamos a trabajar
     */
    public void setDimension(int dim){
    	dimensionEdi=dim;    	
    }
    
    /**
     * M�todo que se ejecuta al presionar el boton jugar aleatorio en el men�. 
     * Inicializa los datos necesarios para poder jugar en ese modo
     * @param evt
     */
    private void jMenuItemJugarAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugarAleatorioActionPerformed
    	//Pedir un entero y actualizar dimension del cubo    	
    	manual=true;
    	VentanaPedirDato ven=new VentanaPedirDato(this);
    	ven.setTitle("Introducci�n de datos");
    	ven.setVisible(true);     	
    }
    
    /**
     * Inicializa el edificio y los paneles para poder empezar el juego
     */
    public void empiezaJugar(){ 
    	jTextArea2.setText("");
    	if (!manual){
    	   	
    		try{
    			String s=new String(); 
    			char c=(char)fuente.read();
    			while (c!=';'){//mirar que sea un numero    				
    				s+=c;
    				c=(char)fuente.read();
    			}    			    		
    			//pasamos el String a entero
    			dimensionEdi=Integer.parseInt(s);
    		}
    		catch(Exception e){System.out.println("El fichero no tiene un formato correcto");}
    	}
    	if(dimensionEdi>0){
        	ComboBusquedas.setVisible(true);
            jButton1.setVisible(true);
            jDesktopPane2.setVisible(true);
            jDesktopPane3.setVisible(true);
            jDesktopPane4.setVisible(true);
            jDesktopPane5.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
                   
            jScrollPane1.setVisible(true);
            jScrollPane2.setVisible(true);
           
            jTextArea1.setVisible(true);
            jTextArea2.setVisible(true);
           
            jTextField1.setVisible(true);
    		edi=new Edificio(dimensionEdi,this);
    		edi.inicia();
    		direccion = 0;
    		pintarFlecha();
    		jTextArea1.setText(edi.muestraDescripcionSiguienteProblema(direccion));
    		jTextField1.setText(edi.muestraTituloSiguienteProblema(direccion));
    	}
    }
    
    /**
     * actualiza el panel con la soluci�n encontrada
     * @param a texto a introducir
     */
    public void ponSolucion(ArrayList<String> a){
    	
    	String mostrar="";
    	for (int i=a.size()-1;i>=0;i--){
    		mostrar+=(String)a.get(i)+"\n";    		
    	}
    	jTextArea2.setText(mostrar);
    }
    
    /**
     * M�todo que resuelve un paso en el problema
     */
    public void resuelve(){
		if (!edi.salida() && !edi.cerrado()){							
			if (!edi.avanza(direccion,metodoElegido)){
                direccion++;                     
            }
			else{
                direccion=0;
            }			
			// Vueltra atr�s.
            if (direccion>5){
        	   direccion = edi.retrocede()+1;
            }
		}            		
		if (edi.cerrado()){
			encerrado=true;
			jTextArea1.setText("Encerrado!");		
			jButton1.setVisible(false);
		}
		if(edi.salida()){					
			jTextArea1.setText("��He salido!!\n"+edi.muestraRecorrido());		
			jButton1.setVisible(false);
			
		}
		else{
			pintarFlecha();
			edi.muestraRecorrido();
			jTextArea1.setText(edi.muestraDescripcionSiguienteProblema(direccion));
			jTextField1.setText(edi.muestraTituloSiguienteProblema(direccion));
		}
}//GEN-LAST:event_jMenuItemJugarAleatorioActionPerformed

    /**
     * M�todo que resuelve el siguiente paso del problema, 
     * pero poniendo en la puerta siguiente el problema deseado
     * @param problema: Problema que queremos resolver en la siguietne puerta
     */
    public void resuelve(int problema){
		if (!edi.salida() && !edi.cerrado()){
		
			//antes de avanzar pintar la puerta cerrada y esperar a que haga click en la estrategia
			
			if (!edi.avanza(direccion,metodoElegido,problema)){
                direccion++;                     
            }
			else{
                direccion=0;
            }			
			// Vueltra atr�s.
            if (direccion>5){
        	   direccion = edi.retrocede()+1;
            }
		}            		
		// Informamos del resultado.
		
		// Se queda encerrado.
		if (edi.cerrado()){
			encerrado=true;
			jTextArea1.setText("Encerrado!");	
			jButton1.setVisible(false);
		}
		if(edi.salida()){					
			jTextArea1.setText("��He salido!!\n"+edi.muestraRecorrido());
			jButton1.setVisible(false);
		}
		else{
			pintarFlecha();
			edi.muestraRecorrido();
			jTextArea1.setText(edi.muestraDescripcionSiguienteProblema(direccion));
			jTextField1.setText(edi.muestraTituloSiguienteProblema(direccion));
		}
}//GEN-LAST:event_jMenuItemJugarAleatorioActionPerformed
    
    /**
     * M�todo que muestra una ventana informativa con el archivo de ayuda de la pr�ctica
     * @param evt
     */
    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
  		String mensaje="";
		try{
            BufferedReader flujo = new BufferedReader(new FileReader("AyudaIAIC.txt"));
            String frase = flujo.readLine();
			while(frase != null){
                mensaje = mensaje + frase + "\n";
                frase = flujo.readLine();
            }
			flujo.close();
			VentanaInfo ventana = new VentanaInfo(this,mensaje);	    		
    		ventana.cambiaTamanio();
    		ventana.setTitle("Ayuda");
    		ventana.setVisible(true);
    		
		  }
		catch(Exception e){
			System.out.println("SIN AYUDA");
        }
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    /**
     * M�todo que muestra un panel con los integrantes del grupo que ha realizado la pr�ctica
     * @param evt
     */
    private void jMenuItemComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComponentesActionPerformed
    	VentanaInfo ven=new VentanaInfo(this,
    			"Pablo Fern�ndez Poblaciones"+"\n"+
    			"Luis Gonzalez de Paula"+"\n" + 
    			"Antonio Murillo Melero"+"\n"
    			+"4� A \nIAIC Facultad de Inform�tica");
    	ven.setTitle("Integrantes del grupo");
    	ven.setVisible(true); 
    }//GEN-LAST:event_jMenuItemComponentesActionPerformed
    
    /**
     * M�todo principal
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
     * Lista de m�todos de resoluci�n
     */
    private javax.swing.JComboBox ComboBusquedas;
    
    /**
     * Bot�n continuar
     */
    private javax.swing.JButton jButton1;
    
    /**
     * Panel sobre el que se muestran otros componentes
     */
    private javax.swing.JDesktopPane jDesktopPane1;
    
    /**
     * Panel sobre el que se muestran otros componentes
     */
    private javax.swing.JDesktopPane jDesktopPane2;
    
    /**
     * Panel sobre el que se muestran otros componentes
     */
    private javax.swing.JDesktopPane jDesktopPane3;
    
    /**
     * Panel sobre el que se muestran otros componentes
     */
    private javax.swing.JDesktopPane jDesktopPane4;
    
    /**
     * Panel sobre el que se muestran otros componentes
     */
    private javax.swing.JDesktopPane jDesktopPane5;
    
    /**
     * Etiqueta para mostrar datos o im�genes
     */
    private javax.swing.JLabel jLabel1;
    
    /**
     * Etiqueta para mostrar datos o im�genes
     */
    private javax.swing.JLabel jLabel2;
    
    /**
     * Etiqueta para mostrar datos o im�genes
     */
    private javax.swing.JLabel jLabel3;
    
    /**
     * Etiqueta para mostrar datos o im�genes
     */
    private javax.swing.JLabel jLabel4;
    
    /**
     * Bot�n Men� dentro del men� de la pr�ctica
     */
    private javax.swing.JMenu jMenu;
    
    /**
     * Bot�n del men� de ayuda
     */
    private javax.swing.JMenu jMenuAyuda;
    
    /**
     * Barra de Men�
     */
    private javax.swing.JMenuBar jMenuBar1;
    
    /**
     * Bot�n del men� componentes
     */
    private javax.swing.JMenu jMenuComponentes;
    
    /**
     * Bot�n ayuda
     */
    private javax.swing.JMenuItem jMenuItemAyuda;
    
    /**
     *Bot�n cargar 
     */
    private javax.swing.JMenuItem jMenuItemCargar;
    
    
    /**
     * Boton componentes
     */
    private javax.swing.JMenuItem jMenuItemComponentes;
    
    /**
     * Boton JugarAleatorio
     */
    private javax.swing.JMenuItem jMenuItemJugarAleatorio;
    
    /**
     * Bot�n salir
     */
    private javax.swing.JMenuItem jMenuItemSalir;
    
    /**
     * Panel con barra desplazadora para mostrar datos
     */
    private javax.swing.JScrollPane jScrollPane1;
    
    /**
     * Panel con barra desplazadora para mostrar datos
     */
    private javax.swing.JScrollPane jScrollPane2;
    
    /**
     * Separador entre botones del men�
     */
    private javax.swing.JSeparator jSeparator1;
    
    /**
     * Separador entre botones del men�
     */
    private javax.swing.JSeparator jSeparator2;
    
    /**
     * �rea de texto para mostrar datos
     */
    private javax.swing.JTextArea jTextArea1;
    
    /**
     * �rea de texto para mostrar datos
     */
    private javax.swing.JTextArea jTextArea2;
    
    /**
     * Campo de texto para indicar el problema a resolver
     */
    private javax.swing.JTextField jTextField1;
    
    /**
     * etiqueta para mostrar la imagen de la flecha
     */
    private javax.swing.JLabel etiquetaImagenFlecha;
    
    /**
     * etiqueta para mostrar un texto que acompa�a a la imagen de la flecha
     */
    private javax.swing.JLabel etiquetaNombreFlecha;
    
    // End of variables declaration//GEN-END:variables
    
}
