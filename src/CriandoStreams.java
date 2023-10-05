import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Teste", "Teste1", "Teste2").stream();

        Stream<String> set = Set.of("Teste", "Teste1", "Teste2").stream();

        Map<String, String> map = Map.of("Teste", "Teste1");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();
    }
}
