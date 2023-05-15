import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy chooseToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomNumber = new Random().nextDouble() * totalWeight;
        double currentWeight = 0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (currentWeight >= randomNumber) {
                if (toy.getQuantity() > 0) {
                    toy.subtractQuantity(1);
                    return toy;
                }
            }
        }
        return null;
    }

    public static void writeWinningToyToFile(Toy toy, String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file, true);
        writer.write("Congratulations! You won a " + toy.getName() + "!\n");
        writer.close();
    }
}

