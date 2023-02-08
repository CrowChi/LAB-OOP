package test;

import javax.swing.*;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;

public class CRUD extends JFrame implements ActionListener {
  private JLabel nametext, agetext;
  private JTextField namein, agein;
  private JButton addButton, updateButton, deleteButton, refreshButton;
  private JTable table;
  private JScrollPane scrtable;

  private ArrayList<Person> people = new ArrayList<>();

  public CRUD() {
    getContentPane().setLayout(null);

    nametext = new JLabel("Name:");
    nametext.setBounds(10, 10, 80, 25);
    getContentPane().add(nametext);

    namein = new JTextField();
    namein.setBounds(100, 10, 160, 25);
    getContentPane().add(namein);

    agetext = new JLabel("Age:");
    agetext.setBounds(10, 40, 80, 25);
    getContentPane().add(agetext);

    agein = new JTextField();
    agein.setBounds(100, 40, 160, 25);
    getContentPane().add(agein);

    addButton = new JButton("Add");
    addButton.setBounds(10, 80, 80, 25);
    getContentPane().add(addButton);

    updateButton = new JButton("Update");
    updateButton.setBounds(100, 80, 80, 25);
    getContentPane().add(updateButton);

    deleteButton = new JButton("Delete");
    deleteButton.setBounds(190, 80, 80, 25);
    getContentPane().add(deleteButton);

    refreshButton = new JButton("Refresh");
    refreshButton.setBounds(280, 80, 80, 25);
    getContentPane().add(refreshButton);

    addButton.addActionListener(this);
    updateButton.addActionListener(this);
    deleteButton.addActionListener(this);
    refreshButton.addActionListener(this);

    table = new JTable();
    scrtable = new JScrollPane(table);
    scrtable.setBounds(10, 120, 350, 200);
    getContentPane().add(scrtable);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
    refresh();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
      String name = namein.getText();
      int age = Integer.parseInt(agein.getText());
      people.add(new Person(name, age));
      Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
      refresh();
    } else if (e.getSource() == updateButton) {
      int selectedRow = table.getSelectedRow();
      if (selectedRow != -1) {
        Person person = people.get(selectedRow);
        person.setName(namein.getText());
        person.setAge(Integer.parseInt(agein.getText()));
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        refresh();
      }
    } else if (e.getSource() == deleteButton) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
          people.remove(selectedRow);
          refresh();
        }
      } else if (e.getSource() == refreshButton) {
        refresh();
      }
    }

    private void refresh() {
      String[] columnNames = {"Name", "Age"};
      Object[][] data = new Object[people.size()][2];
      for (int i = 0; i < people.size(); i++) {
        Person person = people.get(i);
        data[i][0] = person.getName();
        data[i][1] = person.getAge();
        
      }
      table.setModel(new DefaultTableModel(data, columnNames));
    }
    

    public static void main(String[] args) {
      new CRUD();
    }

    private class Person {
    	  private String name;
    	  private int age;

    	  public Person(String name) {
    	    this.name = name;
    	    this.age = 0;
    	  }
//overloading
    	  public Person(String name, int age) {
    	    this.name = name;
    	    this.age = age;
    	  }

    	  public String getName() {
    	    return name;
    	  }

    	  public void setName(String name) {
    	    this.name = name;
    	  }

    	  public int getAge() {
    	    return age;
    	  }

    	  public void setAge(int age) {
    	    this.age = age;
    	  }
    	}
  }


