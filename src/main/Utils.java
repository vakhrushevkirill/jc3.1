package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Utils {
    public String workerDir = "D:\\sources\\java\\netology\\javacore\\jc3.1\\games\\";
    private StringBuilder log = new StringBuilder();
    private File src = new File(workerDir + "src");
    private File res = new File(workerDir + "res");
    private File resDrawables = new File(res.getAbsolutePath() + "\\" + "drawables");
    private File resVectors = new File(res.getAbsolutePath() + "\\" + "vectors");
    private File resIcons = new File(res.getAbsolutePath() + "\\" + "icons");
    private File savegames = new File(workerDir + "savegames");
    private File temp = new File(workerDir + "temp");
    private File tempTxt = new File(temp.getAbsolutePath() + "\\temp.txt");

    public Utils(){

    }

    public void createWorkDir(){
        File worker = new File(workerDir);
        worker.mkdir();
    }

    public void makeDir(){
        if (src.mkdir()){
            log.append("Create " + src.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (res.mkdir()){
            log.append("Create " + res.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (savegames.mkdir()){
            log.append("Create " + savegames.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (temp.mkdir()){
            log.append("Create " + temp.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (resDrawables.mkdir()){
            log.append("Create " + resDrawables.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (resVectors.mkdir()){
            log.append("Create " + resVectors.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
        if (resIcons.mkdir()){
            log.append("Create " + resIcons.getAbsolutePath() + "\n");
        } else {
            log.append("Path exist" + "\n");
        }
    }

    public void writeLog() {
        try (FileWriter writer = new FileWriter(tempTxt, false)){
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
