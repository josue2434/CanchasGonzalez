package frontEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.YearMonth;

public class CustomDatePicker extends JPanel {
    private JComboBox<Integer> yearComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<Integer> dayComboBox;

    public CustomDatePicker() {
        setLayout(new FlowLayout());

        // Año
        JLabel yearLabel = new JLabel("Año:");
        yearComboBox = new JComboBox<>();
        int currentYear = LocalDate.now().getYear();
        int startYear = 2030; // Puedes cambiar el valor según tus necesidades
        int endYear = 2024;   // Puedes cambiar el valor según tus necesidades

        if (currentYear < endYear) {
            endYear = currentYear;
        }

        for (int i = startYear; i >= endYear; i--) {
            yearComboBox.addItem(i);
        }
        yearComboBox.setSelectedItem(currentYear); // Establecer el año actual como predeterminado

        // Mes
        JLabel monthLabel = new JLabel("Mes:");
        String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setSelectedIndex(LocalDate.now().getMonthValue() - 1); // Establecer el mes actual como predeterminado
        monthComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDayComboBox();
            }
        });

        // Día
        JLabel dayLabel = new JLabel("Día:");
        dayComboBox = new JComboBox<>();
        updateDayComboBox();

        // Agregar componentes al panel
        add(yearLabel);
        add(yearComboBox);
        add(monthLabel);
        add(monthComboBox);
        add(dayLabel);
        add(dayComboBox);
    }

    private void updateDayComboBox() {
        String selectedMonth = (String) monthComboBox.getSelectedItem();
        int selectedYear = (int) yearComboBox.getSelectedItem();
        int daysInMonth = YearMonth.of(selectedYear, monthComboBox.getSelectedIndex() + 1).lengthOfMonth();
        dayComboBox.removeAllItems();
        for (int i = 1; i <= daysInMonth; i++) {
            LocalDate date = LocalDate.of(selectedYear, monthComboBox.getSelectedIndex() + 1, i);
            if (isValidDate(date)) {
                dayComboBox.addItem(i);
            }
        }
    }

    private boolean isValidDate(LocalDate date) {
        try {
            YearMonth yearMonth = YearMonth.from(date);
            return yearMonth.equals(YearMonth.from(date)) && date.getDayOfMonth() == date.getDayOfMonth();
        } catch (Exception e) {
            return false;
        }
    }

    // Método para obtener la fecha seleccionada como una cadena de texto en formato "YYYY-MM-DD"
    public String getSelectedDate() {
        int year = (int) yearComboBox.getSelectedItem();
        String month = String.format("%02d", monthComboBox.getSelectedIndex() + 1);
        String day = String.format("%02d", (int) dayComboBox.getSelectedItem());

        return year + "-" + month + "-" + day;
    }
}
