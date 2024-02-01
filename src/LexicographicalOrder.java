public class LexicographicalOrder {
    static void sortFruits(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = fruits[minIndex];
            fruits[minIndex] = fruits[i];
            fruits[i] = temp;
        }
    }
    public static void main(String[] args) {

        String[] fruits = {"Papaya", "Lime", "Watermelon", "Apple", "Mango", "Kiwi"};

        System.out.println("Fruits in lexicographical order:");
        sortFruits(fruits);
        for (String f : fruits) {
            System.out.println(f + " ");
        }
    }
}
