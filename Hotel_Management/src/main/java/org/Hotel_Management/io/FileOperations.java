package org.Hotel_Management.io;

import java.io.*;

public class FileOperations {

    public static void verifyDirectories(String dirPath) {

        File file = new File(dirPath);

        if(!file.exists()) {
            file.mkdirs();
            System.out.println("Directory Created");
        }
    }

    public static void backupCatalog(
            File source,
            File destination) throws IOException {

        try(FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination)) {

            int ch;

            while((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        }
    }

    public static void copyBinaryLog(
            File source,
            File destination) throws IOException {

        try(FileInputStream fis =
                    new FileInputStream(source);

            FileOutputStream fos =
                    new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];

            int bytesRead;

            while((bytesRead = fis.read(buffer))
                    != -1) {

                fos.write(buffer,0,bytesRead);
            }
        }
    }

    public static void writeReceipt(
            String filePath,
            String content)
            throws IOException {

        try(BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(filePath))) {

            bw.write(content);
            bw.flush();
        }
    }
}
