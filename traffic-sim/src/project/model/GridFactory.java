package project.model;

import java.util.ArrayList;
import project.model.Grid;

public class GridFactory {
  public static Grid newInstance(boolean alternating, Model model, ArrayList<Agent> _agents, Intersection[][] intersection, AnimatorBuilder builder) {
    if (alternating) {
    	return new Alternating(model, _agents, intersection, builder);
    } else {
    	return new Simple(model, _agents, intersection, builder);
    }
  }
}