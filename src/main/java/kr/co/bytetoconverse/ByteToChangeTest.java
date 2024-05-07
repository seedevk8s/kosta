package kr.co.bytetoconverse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteToChangeTest {
  public static void main(String[] args) {
    Path folder = Paths.get("/home/user1/"); // 여기에 디렉토리 경로를 입력하세요
      try {
          long sizeInBytes = Files.walk(folder)
                  .map(path -> path.toFile())
                  .filter(file -> file.isFile())
                  .mapToLong(file -> file.length())
                  .sum();

          double sizeInKilobytes = sizeInBytes / 1024.0;
          double sizeInMegabytes = sizeInKilobytes / 1024.0;
          double sizeInGigabytes = sizeInMegabytes / 1024.0;

          System.out.println("Directory size: " + sizeInBytes + " bytes");
          System.out.println("Directory size: " + sizeInKilobytes + " KB");
          System.out.println("Directory size: " + sizeInMegabytes + " MB");
          System.out.println("Directory size: " + sizeInGigabytes + " GB");
      } catch (IOException e) {
          e.printStackTrace();
      }   
  }
}
