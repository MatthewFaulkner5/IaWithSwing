import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;


public class FileHandler {
    String filename;
    int rowWidth;

    public FileHandler(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
    }

    public static void appendLine(String fileName, String data) {
        // write text to end of the file
        boolean append = true;
        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String readLineAt(String fileName, int startPoint) {
        // grab the line from position "start" in the file
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(startPoint);
            return rf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void writeLineAt(String fileName, String data, int start) {
        // overwrite a line from position "start" in the file
        // doesn't check that the start position is actually
        // the beginning of the file. This will not behave well
        // unless every line is the same length
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rws")) {
            rf.seek(start);
            rf.writeBytes(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int countLines(String fileName) {
        // return the number of lines in the file
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }


    public static void appendRecord(String data, int rowwidth) {
        String filename = "\\\\bex-file-01\\studenthome$\\16\\16Faulkner_M\\File04.txt";
        int recordCount = FileHandler.countLines(filename);
        if (data.length() != rowwidth) {
            if (data.length() > rowwidth) {
                System.out.println("Tried to write " + data + " to field width of " + rowwidth);

            }
            while (data.length() < rowwidth) {
                data = data + " ";

            }
        }
        if (data.length() == rowwidth) {
            FileHandler.appendLine(filename, data);
            recordCount = recordCount + 1;
        }


    }

    public String getRecord(int rowNumber) {
        return FileHandler.readLineAt(filename, (rowNumber * rowWidth));
    }


    public boolean findRecord(String SearchData) {
        boolean foundData = false;

        for (int i = 0; i < countLines(filename); i++) {
            FileHandler myFHandler = new FileHandler("\\\\bex-file-01\\studenthome$\\16\\16Faulkner_M\\File04.txt", 35);
            if (Objects.equals(SearchData, myFHandler.getRecord(i))) {
                System.out.println("Record found on line " + i);
                foundData = true;

                break;
                //breaks out of loop one a mathc is found

            }
            // search for a record matching data
            // return true if found

        }
        return foundData;
    }
}

