package com.kitcenter.app.homework.lesson12;


import java.io.*;

public class ReadWriteModify {

    String currentDir = System.getProperty("user.dir");

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
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        return line;
    }

    public void writeLineInFile(String relativeToPorject) throws IOException {
        String absolutePathOut = createAbsolutePath(currentDir, relativeToPorject);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePathOut)));
        } catch (FileNotFoundException e) {
            System.out.println("File output error");
        }
        try {
            bufferedWriter.append("\n");
            bufferedWriter.flush();
            bufferedWriter.append(readLineInFile("src\\main\\resources\\input_file.txt"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        bufferedWriter.close();
    }


}
