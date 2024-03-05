package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GameObjectFactory {

    private final Map<String, GameObject> gameObjects = new HashMap<>();

    public GameObjectFactory () {
        gameObjects.put("Chess", new Board("Chess"));
        gameObjects.put("Checkers", new Board("checkers"));
    }

    public GameObject getGameObject(String type) {
        return gameObjects.computeIfAbsent(type, Tree::new);
    }
}
