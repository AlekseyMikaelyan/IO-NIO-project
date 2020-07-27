package org.example.ionioproject.ionioprojectutil;

import java.io.*;

public class SecondTask {

    public static void copyDirectory(File srcDir, File destDir) {

        if(srcDir.isDirectory()) {

            if(!destDir.exists()) {
                destDir.mkdir();
            }

            String [] files = srcDir.list();

            for(String file : files) {
                File srcFile = new File(srcDir, file);
                File destFile = new File(destDir, file);

                copyDirectory(srcFile, destFile);
            }

        } else {
            try {

                InputStream is = new FileInputStream(srcDir);
                OutputStream outs = new FileOutputStream(destDir);

                byte[] buffer = new byte[1024];

                int length;
                while((length = is.read(buffer)) > 0) {
                    outs.write(buffer, 0, length);
                }

                is.close();
                outs.close();

                System.out.println("Файл скопирован из каталога " + srcDir + " в каталог " + destDir);
            } catch (IOException f) {
                f.printStackTrace();
            }
        }
    }
}
