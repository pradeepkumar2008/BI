// File: DataExporter.java
interface DataExporter {
    void exportData();

    // Default JSON export method
    default void exportToJSON() {
        System.out.println("Default JSON export not implemented yet.");
    }
}

class CSVExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in CSV format...");
    }
}

class PDFExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in PDF format...");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data in JSON format (added feature).");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.exportData();
        csv.exportToJSON(); // uses default

        pdf.exportData();
        pdf.exportToJSON(); // overridden
    }
}
