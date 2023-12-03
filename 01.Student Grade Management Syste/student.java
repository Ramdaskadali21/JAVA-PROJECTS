import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private String course;
    private int year;
    private String section;
    private char grade;

    public Student(int id, String name, String course, int year, String section, char grade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
        this.section = section;
        this.grade = grade;
    }

    // Getters and Setters
}

public class StudentGradeManagementSystem {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private List<Student> students;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentGradeManagementSystem();
            }
        });
    }

    public StudentGradeManagementSystem() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Student Grade Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Course", "Year", "Section", "Grade"};
        students = new ArrayList<>();
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        JButton editButton = new JButton("Edit Student");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudent();
            }
        });

        JButton deleteButton = new JButton("Delete Student");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        JButton viewButton = new JButton("View Student");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewStudent();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(viewButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    private void addStudent() {
        // Code to add a student
    }

    private void editStudent() {
        // Code to edit a student
    }

    private void deleteStudent() {
        // Code to delete a student
    }

    private void viewStudent() {
        // Code to view student details
    }
}
