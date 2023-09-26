package com.mycompany.app;

/**
 * Hello world app.
 */
public class App {

  private final String message = "Hello my name is Blotto!";

  public App() {
    
  }

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }

  private String getMessage() {
    return message;
  }
}
