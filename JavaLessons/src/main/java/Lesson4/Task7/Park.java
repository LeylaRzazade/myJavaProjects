package Lesson4.Task7;

public class Park {
    private Attraction[] attractions;
    private int attractionCount;

    public Park(int maxAttractions) {
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount] = new Attraction(name, workingHours, cost);
            attractionCount++;
        } else {
            System.out.println("Error: Maximum number of attractions reached.");
        }
    }

    public void displayAttractions() {
        System.out.println("Attractions in the park:");
        for (int i = 0; i < attractionCount; i++) {
            System.out.println(attractions[i]);
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String operatingHours, double cost) {
            this.name = name;
            this.workingHours = operatingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction: " + name + "\nOperating Hours: " + workingHours + "\nCost: $" + cost;
        }
    }
}
