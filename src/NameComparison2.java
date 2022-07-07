public class NameComparison2 {
    public static void main(String[] args) {
        String name1 = "Ivan Ivanov";
        String name2 = "ivan ivanovv";

        NameComparison2 comparison = new NameComparison2();
        comparison.nameComparison(name1, name2);
    }

    public static void nameComparison (String name1, String name2){
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("imya polzovatelya zanyato");
        } else {
            System.out.println("Vashe imya unikalnoe i emmet dlinu " + name2.length() + " simvolov");
            System.out.println("A bez probelov vashe imya emmet dlinu " + (name2.replaceAll(" ", "")).length() + " simvolov");
        }
    }

}
