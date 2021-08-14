package app.gui;


import app.model.Book;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ViewBooksPanel extends JPanel {
    private BookTableModel tableModel;
    private JTable table;


    public ViewBooksPanel(List<Book> bookList) {

        tableModel = new BookTableModel(bookList);
        table = new JTable(tableModel);

        setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }
}
