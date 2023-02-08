package Calculator;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUD extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
    private JButton btnCreate, btnRead, btnUpdate, btnDelete;
    private Connection conn;
    int id;
    public CRUD() {
        setTitle("CRUD");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Connect to the database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/database_name", "username", "password");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        btnCreate = new JButton("Create");
        btnCreate.addActionListener(this);
        panel.add(btnCreate);
        btnRead = new JButton("Read");
        btnRead.addActionListener(this);
        panel.add(btnRead);
        btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(this);
        panel.add(btnUpdate);
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener(this);
        panel.add(btnDelete);
        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCreate) {
            createData();
        } else if (e.getSource() == btnRead) {
            readData();
        } else if (e.getSource() == btnUpdate) {
            updateData();
        } else if (e.getSource() == btnDelete) {
            deleteData();
        }
    }

    private void createData() {
        try {
        	PreparedStatement stmt = conn.prepareStatement("insert into table_name (column1, column2) values (?, ?)");
                    stmt.setString(1, "value1");
                    stmt.setString(2, "value2");
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            private void readData() {
                try {
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");
                    ResultSetMetaData metaData = rs.getMetaData();
                    int columns = metaData.getColumnCount();
                    DefaultTableModel model = new DefaultTableModel();
                    for (int i = 1; i <= columns; i++) {
                        model.addColumn(metaData.getColumnName(i));
                    }
                    while (rs.next()) {
                        Object[] row = new Object[columns];
                        for (int i = 1; i <= columns; i++) {
                            row[i - 1] = rs.getObject(i);
                        }
                        model.addRow(row);
                    }
                    table.setModel(model);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            private void updateData() {

                try {
                    PreparedStatement stmt = conn.prepareStatement("UPDATE table_name SET column1 = ?, column2 = ? WHERE id = ?");
                    stmt.setString(1, "new_value1");
                    stmt.setString(2, "new_value2");
                    stmt.setInt(3, id);
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            private void deleteData() {

                try {
                    PreparedStatement stmt = conn.prepareStatement("DELETE FROM table_name WHERE id = ?");
                    stmt.setInt(1, id);
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            public static void main(String[] args) {
                new CRUD();
            }
        }

