package project.model;

public class MP
{
  private static double simulationTimestep = 0.1D;
  public static int simulationRuntime = 1000;

  private static int rows = 2;
  private static int columns = 3;

  public static boolean isAlternating = true;

  public static double carLength = 10.0D;

  public static double roadDrawLength = 200.0D;

  public static double minroadLength = 200.0D;
  public static double maxroadLength = 500.0D;

  public static double roadLength = Math.random() * (maxroadLength - minroadLength) + minroadLength;

  public static double minVelocity = 10.0D * getTimeStep();
  public static double maxVelocity = 30.0D * getTimeStep();

  public static double minCarGeneration = 10.0D * getTimeStep();
  public static double maxCarGeneration = 25.0D * getTimeStep();

  public static double minCarLength = 10.0D;
  public static double maxCarLength = 15.0D;

  public static double minGreenLightTime = 30.0D;
  public static double maxGreenLightTime = 180.0D;

  public static double minYellowLightTime = 4.0D;
  public static double maxYellowLightTime = 5.0D;

  public static double minIntersectionLength = 10.0D;
  public static double maxIntersectionLength = 15.0D;

  public static double minBreakDistance = 9.0D;
  public static double maxBreakDistance = 10.0D;
  public static double breakFactor = 0.5D;

  public static double minStopDistance = 0.5D;
  public static double maxStopDistance = 5.0D;
  public static double stopFactor = 0.0D;

  public static StringBuilder returnCurrentValues() {
    String Alternating;
    if (isAlternating)
      Alternating = "alternating";
    else {
      Alternating = "simple";
    }

    StringBuilder b = new StringBuilder();

    b.append("Simulation time step (seconds)\t[" + getTimeStep() + "]" + "\n");
    b.append("Simulation run time (seconds)\t[" + simulationRuntime + "]" + "\n");
    b.append("Grid size (number of roads)\t[row=" + getRows() + ",column=" + getColumns() + "]" + "\n");
    b.append("Traffic pattern\t[" + Alternating + "]" + "\n");
    b.append("Car entry rate (seconds/car)\t[min=" + minCarGeneration + ",max=" + maxCarGeneration + "]" + "\n");
    b.append("Road segment length (meters)\t[min=" + minroadLength + ",max=" + maxroadLength + "]" + "\n");
    b.append("Intersection length (meters)\t[min=" + minIntersectionLength + ",max=" + maxIntersectionLength + "]" + "\n");
    b.append("Car length (meters)\t[min=" + minCarLength + ",max=" + maxCarLength + "]" + "\n");
    b.append("Car maximum velocity (meters/second)\t[min=" + minVelocity + ",max=" + maxVelocity + "]" + "\n");
    b.append("Car stop distance (meters)\t[min=" + minStopDistance + ",max=" + maxStopDistance + "]" + "\n");
    b.append("Car brake distance (meters)\t[min=" + minBreakDistance + ",max=" + maxBreakDistance + "]" + "\n");
    b.append("Traffic light green time (seconds)\t[min=" + minGreenLightTime + ",max=" + maxGreenLightTime + "]" + "\n");
    b.append("Traffic light yellow time (seconds)\t[min=" + minYellowLightTime + ",max=" + maxYellowLightTime + "]" + "\n");

    return b;
  }

  public static void setTimeStep(double value)
  {
    simulationTimestep = value;
  }

  public static double getTimeStep() {
    return simulationTimestep;
  }

  public static void setGridSize(int x, int y) {
    rows = x;
    columns = y;
  }

  public static int getRows()
  {
    return rows;
  }

  public static int getColumns()
  {
    return columns;
  }

  public static void setRuntime(double value)
  {
    simulationRuntime = (int)value;
  }

  public static double getRuntime() {
    return simulationRuntime;
  }

  public static boolean getPattern() {
    return isAlternating;
  }

  public static void setPattern(boolean value)
  {
    isAlternating = value;
  }

  public static void setCarEntryRate(double parseDouble, double parseDouble2)
  {
    minCarGeneration = parseDouble * getTimeStep();
    maxCarGeneration = parseDouble2 * getTimeStep();
  }

  public static void setRoadLengths(double parseDouble, double parseDouble2)
  {
    minroadLength = parseDouble;
    maxroadLength = parseDouble2;
  }

  public static void setIntersectionLength(double parseDouble, double parseDouble2)
  {
    minIntersectionLength = parseDouble;
    maxIntersectionLength = parseDouble2;
  }

  public static void setCarLength(double parseDouble, double parseDouble2)
  {
    minCarLength = parseDouble;
    maxCarLength = parseDouble2;
  }

  public static void setCarMaxVel(double parseDouble)
  {
    maxVelocity = parseDouble * getTimeStep();
  }

  public static void setCarStopDist(double parseDouble, double parseDouble2)
  {
    minStopDistance = parseDouble;
    maxStopDistance = parseDouble2;
  }

  public static void setCarBreakDist(double parseDouble, double parseDouble2) {
    minBreakDistance = parseDouble;
    maxBreakDistance = parseDouble2;
  }

  public static void setGreenTime(double parseDouble, double parseDouble2) {
    minGreenLightTime = parseDouble;
    maxGreenLightTime = parseDouble2;
  }

  public static void setYellowTime(double parseDouble, double parseDouble2) {
    minYellowLightTime = parseDouble;
    maxYellowLightTime = parseDouble2;
  }

  public static void reset()
  {
    simulationTimestep = 0.1D;
    simulationRuntime = 1000;

    rows = 2;
    columns = 3;

    isAlternating = false;

    carLength = 10.0D;

    roadDrawLength = 200.0D;

    minroadLength = 200.0D;
    maxroadLength = 500.0D;

    roadLength = Math.random() * (maxroadLength - minroadLength) + minroadLength;

    minVelocity = 10.0D * getTimeStep();
    maxVelocity = 30.0D * getTimeStep();

    minCarGeneration = 10.0D * getTimeStep();
    maxCarGeneration = 25.0D * getTimeStep();

    minCarLength = 10.0D;
    maxCarLength = 15.0D;

    minGreenLightTime = 30.0D;
    maxGreenLightTime = 180.0D;

    minYellowLightTime = 32.0D;
    maxYellowLightTime = 40.0D;

    minIntersectionLength = 10.0D;
    maxIntersectionLength = 15.0D;

    minBreakDistance = 9.0D;
    maxBreakDistance = 10.0D;
    breakFactor = 0.5D;

    minStopDistance = 0.5D;
    maxStopDistance = 5.0D;
    stopFactor = 0.0D;
  }
}