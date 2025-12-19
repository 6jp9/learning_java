public class P10_stringmethods {
    public static void main(String[] args) {
        String s = "Jaya Prakash";
        
        // length() --> get the length of a string
        int len = s.length();
        System.out.println(len);

        // chatAt() --> get a char from a string using index. index starts from 0.
        char c = s.charAt(2);
        System.out.println(c);

        // indexOf() --> to get the index of first occurence of a char.
        int ind = s.indexOf("P");
        System.out.println(ind);

        // lastIndexOf() --> to get the index of last occurence of a char.
        int ind2 = s.lastIndexOf("r");
        System.out.println(ind2);

        // toUpperCase() and toLowerCase() to convert Upper and Lower cases.
        String upperStr = s.toUpperCase();
        String lowerStr = s.toLowerCase();
        System.out.println(upperStr);
        System.out.println(lowerStr);

        // trim() to strip the <spaces> at the start amd end of the String.
        System.out.println(s.trim());

        // replace() to replace some chars in string.
        System.out.println(s.replace("a", "o"));

        // isEmpty() returns true if the given string is empty.
        System.out.println(s.isEmpty());

        // contains() to check whether a substring in the string or not. return boolens values.
        System.out.println(s.contains(" "));

        // .equals() same as "=="" in python. i.e., compares strictly values not address. in java.
        System.out.println(s.equals("Jaya Prakash")); // returns true
    }
}
