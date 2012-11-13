package project.ui;

public abstract interface UI {
  public abstract void processMenu(UIMenu menu);
  public abstract String[] processForm(UIForm form);
  public abstract void displayMessage(String message);
  public abstract void displayError(String message);
}