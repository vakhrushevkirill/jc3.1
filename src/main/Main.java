package main;

import java.io.File;

public class Main {


    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.createWorkDir();
        utils.makeDir("src");
        utils.makeDir("res");
        utils.makeDir("savegames");
        utils.makeDir("temp");
        utils.makeDir("res" + File.separator + "drawables");
        utils.makeDir("res" + File.separator + "vectors");
        utils.makeDir("res" + File.separator + "icons");


        utils.writeLog("temp" + File.separator + "temp.txt");
    }
}
