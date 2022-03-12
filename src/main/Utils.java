package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Utils {
    public String workerDir = "D:" + File.separator +
            "sources" + File.separator +
            "java" + File.separator +
            "netology" + File.separator +
            "javacore" + File.separator +
            "jc3.1" + File.separator +
            "games" + File.separator;

    private StringBuilder log = new StringBuilder();


    public Utils(){

    }

    public void createWorkDir(){
        File worker = new File(workerDir);
        worker.mkdir();
    }

    public void makeDir(String path){
        File pathFile = new File(workerDir + path);
        if (pathFile.mkdir()){
            log.append("Create " + pathFile.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + pathFile.getAbsolutePath() + "\n");
        }
    }

    public void writeLog(String filePath) {
        File file = new File(workerDir + File.separator + filePath);
        try (FileWriter writer = new FileWriter(file, false)){
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
