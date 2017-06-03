package com.kitcenter.app.classwork.lesson12;

import java.io.*;
import java.net.URL;

public class ReadWriteFile {

    String currentDir = System.getProperty("user.dir");

    public String readFile(String relativeToProject) throws IOException {
        String line = "";
        String absolutePathIn = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bReader = new BufferedReader(new FileReader(absolutePathIn));
        line = bReader.readLine();
        bReader.close();
        return line;
    }

    public String readFileFromResources(String resourcesFileName) throws IOException {
        String line = "";
        BufferedReader bReader = new BufferedReader(new FileReader(getPath(resourcesFileName)));
        line = bReader.readLine();
        bReader.close();
        return line;
    }

    public void writeFile(String relativeToProject) throws IOException {
        String absolutePathOut = createAbsolutePath(currentDir, relativeToProject);
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePathOut)));
        bWriter.append(readFile("src\\main\\resources\\input.txt"));
        bWriter.close();
    }

    public void writeFileToResources(String resourcesFileName) throws IOException {
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getPath(resourcesFileName))));
        bWriter.append(readFileFromResources("input.txt"));
        bWriter.close();
    }


    public String createAbsolutePath(String project, String relativeToProject) {
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }

    private String getPath(String fileName){
        String path = null;
        URL url = this.getClass().getClassLoader().getResource(fileName);
        if (url != null){
            path = url.getPath();
        } else {
            System.out.println("Not found resources");
        }
        return path;
    }
}

