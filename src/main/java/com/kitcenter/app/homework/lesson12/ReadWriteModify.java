package com.kitcenter.app.homework.lesson12;


import java.io.*;
import java.util.*;

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
        String lineStart = "";
        String lineEnd = "";
        String absolutePathIn = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(absolutePathIn));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        while (true) {
            lineStart = bufferedReader.readLine();
            if (lineStart == null) {
                break;
            } else {
                lineEnd += sortAndPaprseStringToIntArray(lineStart) + "\n";
                System.out.println(lineEnd);
            }
        }
        bufferedReader.close();
        return lineEnd;
    }

    private String sortAndPaprseStringToIntArray(String line) {
        if (line.isEmpty() && line != null) {
            System.out.println("Line is empty");
            line = "0";
        }
        String[] stringArrayLine = line.replace(" ", "").split(",");
        int[] intArrayLine = new int[stringArrayLine.length];
        for (int i = 0; i < stringArrayLine.length; i++) {
            intArrayLine[i] = Integer.valueOf(stringArrayLine[i]);
        }
        sortAscendingArray(intArrayLine);
        //sortDescendingArray(intArrayLine);
        return Arrays.toString(intArrayLine).replace("[", "").replace("]", "");
    }

    private int[] sortAscendingArray(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[i]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    private int[] sortDescendingArray(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[i]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
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
