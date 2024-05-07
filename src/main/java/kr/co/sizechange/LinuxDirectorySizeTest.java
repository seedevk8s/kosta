package kr.co.sizechange;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LinuxDirectorySizeTest {

  public static void main(String[] args) {
    Path folder = Paths.get("/home/user1/"); // 여기에 디렉토리 경로를 입력하세요
      try {
          long size = Files.walk(folder)
                  .map(path -> path.toFile())
                  .filter(file -> file.isFile())
                  .mapToLong(file -> file.length())
                  .sum();

          System.out.println("Directory size: " + size + " bytes");
      } catch (IOException e) {
          e.printStackTrace();
      }   
  }
}
