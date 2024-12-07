public class AlgorithmFactory {
    public static Searching getAlgorithm(String algorithmName, State start, State goal, boolean with_open) {
        return switch (algorithmName.toUpperCase()) {
            case "BFS" -> new BFS(start, goal, with_open);
            //case "DFID" -> new DFID();
           // case "A*" -> new AStar();
           // case "IDA*" -> new IDAStar();
            //case "DFBNB" -> new DFBnB();
            default -> throw new IllegalArgumentException("Unknown algorithm: " + algorithmName);
        };
    }
}
