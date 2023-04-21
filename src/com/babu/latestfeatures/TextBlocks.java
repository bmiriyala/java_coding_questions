package com.babu.latestfeatures;

public class TextBlocks {

    public static void main(String[] args) {
        String message = "A-143, 9th Floor, Sovereign Corporate Tower,\n" +
                "Sector-136, Noida,\n" +
                "Uttar Pradesh - 201305";

    // BETTER : Using text blocks
    // gets rid of lots of the clutter
        String message2 = """
            A-143, 9th Floor, Sovereign Corporate Tower,
            Sector-136, Noida,
            Uttar Pradesh - 201305""";

        System.out.println("Output:: " + message2);

        // Using a text block
        String text2 = """
                Geeks
                For
                Geeks""";

        System.out.println(text2);
    }

    // Using a literal string
    String text1 = "Geeks For Geeks";

    // Using a text block
    String text2 = """
                Geeks
                For
                Geeks""";
}
