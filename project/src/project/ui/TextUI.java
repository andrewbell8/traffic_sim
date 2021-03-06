package project.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public final class TextUI implements UI {
  final BufferedReader _in;
  final PrintStream _out;

  public TextUI() {
    _in = new BufferedReader(new InputStreamReader(System.in));
    _out = System.out;
  }

  public void displayMessage(String message) {
    _out.println(message);
  }

  public void displayError(String message) {
    _out.println(message);
  }

  private String getResponse() {
    String result;
    try {
      result = _in.readLine();
    } catch (IOException e) {
      throw new UIError();
    }
    if (result == null) {
      throw new UIError();
    }
    return result;
  }

  public void processMenu(UIMenu menu) {
    _out.println(menu.getHeading());
    _out.println("Enter choice by number:");

    for (int i = 1; i < menu.size(); i++) {
      _out.println("  " + i + ". " + menu.getPrompt(i));
    }
String response = getResponse();
    int selection;
    try {
      selection = Integer.parseInt(response, 10);
      if ((selection < 0) || (selection >= menu.size()))
        selection = 0;
    } catch (NumberFormatException e) {
      selection = 0;
    }
    menu.runAction(selection);
  }

  public String[] processForm(UIForm form) {
    Scanner scan = new Scanner(System.in);

    String[] result = new String[form.size()];

    for (int x = 0; x < form.size(); x++) {
      System.out.print("Enter " + form.getPrompt(x) + ": ");
      String response = scan.next();

      if (response == null) {
        response = "0";
      }
      result[x] = new String(response);
    }
    scan.close();
    return result;
  }
}