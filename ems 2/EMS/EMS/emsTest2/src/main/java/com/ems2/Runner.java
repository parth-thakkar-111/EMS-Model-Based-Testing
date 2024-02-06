package com.ems2;

import com.ems2.SomeSmallTest;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;
import org.graphwalker.websocket.WebSocketServer;


import java.io.IOException;

public class Runner {
  public static void main(String[] args) throws IOException
   {

    TestExecutor executor = new TestExecutor(SomeSmallTest.class);

    WebSocketServer server = new WebSocketServer(8887, executor.getMachine());
    server.start();


    Result result = executor.execute(true);
    if (result.hasErrors()) {
        for (String error : result.getErrors()) {
            System.out.println(error);
        }
    }
    System.out.println("Done: [" + result.getResults().toString(2) + "]");
  }
}
