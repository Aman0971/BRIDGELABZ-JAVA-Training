package org.Library_Management.io;

import java.io.*;

public class FileOperations {
    public static void verifyDirectories(String dirPath) {
        File file = new File(dirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

        public static void backupDatabase(File source, File destination) throws IOException {
            try(
                FileInputStream fin = new FileInputStream(source);
                FileOutputStream fout = new FileOutputStream(destination)){

                byte[] buffer = new byte[1024];
                int byteRead;

                while((byteRead = fin.read(buffer)) != -1){
                    fout.write(buffer,0,byteRead);
                }
            }

        }
        public static void archiveLogs(File source, File destination) throws IOException{
            try(FileReader fr = new FileReader(source);
                FileWriter fw = new FileWriter(destination)){

                int charRead;
                while( (charRead= fr.read()) != -1){
                    fw.write(charRead);
                }
            }
        }
    public static void writeReceipt(String filePath, String receiptContent) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(receiptContent);
        bw.close();
    }
}
