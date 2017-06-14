package com.kitcenter.app.homework.lesson12;


import java.io.*;
import java.util.Arrays;

public class ReadWriteModify {

    private String currentDir = System.getProperty("user.dir");
    private String sourceFile = "src\\main\\resources\\input_file.txt";
    public String targetFile = "src\\main\\resources\\output_file.txt";

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    private String createAbsolutePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }

    public String readLineInFile(String relativeToProject) throws IOException {
        String line = "";
        String absolutePathIn = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(absolutePathIn));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        /*line = bufferedReader.readLine();
        sortStringArray(line);*/
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                sortStringArray(line);
                System.out.println(line);
                //System.out.println("File copied!");
            }
        }
        bufferedReader.close();
        return line;
    }

    private String sortStringArray(String line){
        String[] stringArrayLine = line.trim().split(";");
        Arrays.sort(stringArrayLine);
        return Arrays.toString(stringArrayLine).replace("[", "").replace(",", ";").replace("]", "");
    }

    public void writeLineInFile(String relativeToProject) throws IOException {

        String absolutePathOut = createAbsolutePath(currentDir, relativeToProject);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePathOut)));
        } catch (FileNotFoundException e) {
            System.out.println("File output error");
        }
        try {
            bufferedWriter.append(readLineInFile("src\\main\\resources\\input_file.txt"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        bufferedWriter.close();
    }

    public void readWriteFile(String sourceFile) {

        try (FileReader fReader = new FileReader(sourceFile);
             BufferedReader bReader = new BufferedReader(fReader);
             FileWriter fWriter = new FileWriter(targetFile);
        ) {
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    String[] stringLine = line.trim().split(";");
                    Arrays.sort(stringLine);
                    fWriter.write(Arrays.toString(stringLine) + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
