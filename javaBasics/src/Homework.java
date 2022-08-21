import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Python");
        list.add("C#");
        list.add("JS");
        list.add("PHP");
        list.add("Java");
        addElementToList(list);
        countJava(list);
        addJava(list);
        countJava(list);
        List<String> list2 = new ArrayList<>();
        list.add("Kotlin");
        list.add("C#");
        List<String> mergedList = mergeTwoList(list, list2);
        deleteDuplicateFromList(mergedList);
    }

    public static void addElementToList(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type new language: ");
        String newLanguage = scanner.nextLine();
        list.add(newLanguage);
        System.out.println("List contents: ");
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void countJava(List<String> list) {
        int sum = 0;
        for (String element : list) {
            if (element.equalsIgnoreCase("Java")){
                sum++;
            }
        }
        System.out.println("Number of elements containing the word java/Java: " + sum);
        System.out.println(list);
    }

    public static void addJava (List<String> list) {
        list.add("Java");
        list.add("Java");
        list.add("Java");
    }

    public static List<String> mergeTwoList (List<String> list, List<String> list2) {
        List<String> merge = new ArrayList<>(list);
        merge.addAll(list2);
        System.out.println("Two lists merged: " + merge);
        return merge;
    }

    public static void deleteDuplicateFromList (List<String> mergedList) {
        HashSet<String> set = new HashSet<>(mergedList);
        System.out.println("List without duplicate: " + set);
    }

}