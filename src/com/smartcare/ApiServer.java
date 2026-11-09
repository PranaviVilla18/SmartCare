package com.smartcare;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ApiServer {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(
            new InetSocketAddress(8080), 0
        );

        server.createContext("/api/status", exchange -> {

            String response =
                "{\"status\":\"success\",\"message\":\"SmartCare Backend Connected\"}";

            byte[] data = response.getBytes(StandardCharsets.UTF_8);

            exchange.getResponseHeaders().set(
                "Content-Type", "application/json; charset=UTF-8"
            );

            exchange.sendResponseHeaders(200, data.length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(data);
            }
        });

        server.start();

        System.out.println("SmartCare API Server started!");
        System.out.println("http://localhost:8080/api/status");
    }
}