import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class PractiseSwitchExpression {

  public static void main(String[] args) {

    List<Direction> directions = new ArrayList<>(List.of(Direction.NORTH,
        Direction.EAST, Direction.SOUTH, Direction.WEST));

    int directionCode;
    char testCode;
    // Direction direction = Direction.EAST;
    for (Direction direction : directions) {

      directionCode = switch (direction.getDir()) {
        case 'N' -> 1;
        case 'E' -> 2;
        case 'S' -> 3;
        case 'W' -> 4;
        default -> 0;
      };

      System.out.println(directionCode);
    }

    for (Direction direction : Direction.values()) {

      directionCode = switch (direction.getDir()) {
        case 'N' -> {
          System.out.println(direction.name());
          yield 1;
        }
        case 'E' -> {
          System.out.println(direction.name());
          yield 2;
        }
        case 'S' -> {
          System.out.println(direction.name());
          yield 3;
        }
        case 'W' -> {
          System.out.println(direction.name());
          yield 4;
        }
        default -> 0;
      };

      System.out.println(directionCode);
    }

  }

}
