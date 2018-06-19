
import dao.FiltroDao;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Filtro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LN710Q
 */
public class Consulta extends JFrame {
    public JLabel lblInscripcion, lblNombre, lblPropietario, lblEdad, lblRaza, lblEstado; 
    public JTextField nombre, propietario, inscripcion, edad;
    public JComboBox raza;
    ButtonGroup estado = new ButtonGroup();
    public JRadioButton si;
    public JRadioButton no;
    public JTable resultados;
    public JPanel table;
    public JButton buscar, insertar, eliminar, actualizar;
    
    private static final int ANCHOC=130, ALTOC=30;
    
    DefaultTableModel tm;

    public Consulta() {
        super("inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        llenarTabla();
        Container c = getContentPane();
        c.add(lblEdad);
        c.add(lblInscripcion);
        c.add(lblNombre);
        c.add(lblPropietario);
        c.add(lblRaza);
        c.add(lblEstado);
        c.add(nombre);
        c.add(propietario);
        c.add(inscripcion);
        c.add(edad);
        c.add(si);
        c.add(no);
        c.add(raza);
        c.add(buscar);
        c.add(insertar);
        c.add(actualizar);
        c.add(eliminar);
        c.add(table);
        setSize(600, 600);
        eventos();
        
        
    }

    public void agregarLabels() {
        lblEdad = new JLabel("edad");
        lblInscripcion = new JLabel("inscripcion");
        lblNombre = new JLabel("nombre");
        lblPropietario =  new JLabel("propietario");
        lblRaza = new JLabel("raza");
        lblEstado = new JLabel("Estado");
        
        lblEdad.setBounds(10,100, ANCHOC, ALTOC);
        lblNombre.setBounds(10,60, ANCHOC, ALTOC);
        lblRaza.setBounds(10,150, ANCHOC, ALTOC);
        lblPropietario.setBounds(400,60, ANCHOC, ALTOC);
        lblInscripcion.setBounds(10,10, ANCHOC, ALTOC);
        lblEstado.setBounds(10,200, ANCHOC, ALTOC);
        
    }

    private void formulario() {
        //nombre, propietario, inscripcion, edad;
        nombre = new JTextField();
        propietario = new JTextField();
        inscripcion = new JTextField();
        edad = new JTextField();
        raza = new JComboBox();
        si = new JRadioButton("si", true);
        no = new JRadioButton("no");
        //buscar, insertar, eliminar, actualizar;
        buscar = new JButton("Buscar");
        insertar = new JButton("Insertar");
        eliminar = new JButton("delete");
        actualizar = new JButton("actualizar");
        
        nombre.setBounds(140,60,ANCHOC, ALTOC);
        inscripcion.setBounds(140,10,ANCHOC, ALTOC);
        edad.setBounds(140,100,ANCHOC, ALTOC);
        raza.setBounds(140,150,ANCHOC, ALTOC);
        table.setBounds(10, 400, 500, 100);
        table.add(new JScrollPane(resultados));
    }

    private void llenarTabla() {
        tm = new DefaultTableModel(){
            public Class<?> getColumnClass(int column){
                switch (column){
                    case 0:
                        return String.class;
                        
                    default:
                        return Boolean.class;
                }
            }
        };
        
        tm.addColumn("inscripcion");
        tm.addColumn("inscripcion");
        tm.addColumn("inscripcion");
        tm.addColumn("inscripcion");
        tm.addColumn("inscripcion");
        
        FiltroDao fd = new FiltroDao();
        //ArrayList<Filtro> filtros = fd.readAll();
        
    }

    private void eventos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }
    
    
}
