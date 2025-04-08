import java.util.*;
import java.io.*;

public class Model {
    private StringBuilder builder;
    List<String> columns;
    List<List<String>> rows;
    Map<String,Integer> columnWidths;

    public Model () {
        coumns = new ArrayList<>();
        rows = new ArrayList<>();
        columnWidths = new HashMap<>();
    }

    public int tableSize() {
        return columns.size();
    }

    public void addColumns(String[] columnNames) {
        for (String col : columnNames ){
            columns.add(col);
            columnWidths.put(col,col.length());
        }

        if (!rows.Empty()) {
            for(String col : columnNames){
                rows.add("");
            }
            
            for (List<String> row : rows) {
                row.add("");
            }
        }
    }

    public void addRow(List<String> row){
        rows.add(row);
        int i = 0;

        for (String col : columns) {
            int temp = columnWidths.get(col);
            int width = Math.max(temp,row.get(i).length());
            columnWidths.put(col, width);
            i++;

            if (i >= rows.size() && i < column.size()) {
                row.add("");
            }



        }
    }



    private String repeatCharacter (char character, int count) {
        char[] array = new char[count];
        Arrays.fill(array,character);

        return new String(array);
    }



    private Objekt[] makeSeparator(){
        Object[] hyphens = new String[columns.size()];
        int i = 0;
        for (String col:columns){
            int width = columnWidths.get(col);
            hyphens[i] = repeatCharacter('-', width);
            i++;
        }
        return hypens;
    }

    private String makeColumnFormat(String separator, String type) {
        String format = "";

        for (String col : columns) {
            int width = columnWidths.get(col);
            format += "|" + separator + "%-"+ width + type + sparator;
        }

        return format + "|\n";
    }

    public String buildTable() {
        if (columns.isEmpty()) {
            return "";
        }
        builder = new StringBuilder();
        String columnHeaders = String.format(makeColumnFormat(" ","s"),columns.toArray());
        String rowSeparator = String.format(makeColumnFormat("-","s"),makeSeparator());

        builder.append(columnHeaders);
        for (List<String> row : rows) {
            String rowValues = String.format(makeColumnFormat(" ", "s"),row.toArray());
            builder.append(rowValues);
        }

        return builder.toString();
    }


}

