package com.imindersingh.http;

import com.github.sitture.unirestcurl.RequestLogger;
import java.io.*;

public class CurlLogger implements RequestLogger {
    @Override
    public void log(final String curlRequest) {
        System.out.println(curlRequest);
        writeToFile(curlRequest);
    }

    public void writeToFile (final String curlRequest) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("text.txt", true))) {
            printWriter.println(curlRequest);
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}