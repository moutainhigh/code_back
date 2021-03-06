package com.huatu.ztk.user.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by biguodong on 2018/11/14
 */
@Slf4j
public class ZipUtils {


    public static void doCompress(String srcFile, String zipFile) throws IOException {
        ZipOutputStream out = null;
        try {
            out = new ZipOutputStream(new FileOutputStream(zipFile));
            doCompress(new File(srcFile), out, "");
        } catch (Exception e) {
            throw e;
        } finally {
            deleteDir(new File(srcFile));
            out.close();//记得关闭资源
        }
    }

    public static void doCompress(File inFile, ZipOutputStream out, String dir) throws IOException {
        if(inFile.isDirectory()){
            //需要打包
            File[] files = inFile.listFiles();
            if(files != null && files.length > 0){
                for(File file: files){
                    String name = file.getName();
                    if(!"".equals(dir)){
                        name = dir + "/" + name;
                    }
                    ZipUtils.doCompress(file, out, name);
                }
            }
        } else {
            ZipUtils.doZip(inFile, out, dir);
        }
    }

    public static void doZip(File inFile, ZipOutputStream out, String dir) throws IOException {
        String enterName = null;
        enterName = inFile.getName();
        ZipEntry entry = new ZipEntry(enterName);
        out.putNextEntry(entry);

        int len = 0;
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(inFile);
        while ((len = fis.read(buffer)) > 0){
            out.write(buffer, 0, len);
            out.flush();
        }
        out.closeEntry();
        fis.close();
    }

    private static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            //递归删除目录中的子目录下
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }
}
