package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            for (int j = post.length - 1 - i; j >= post.length - 1 - i; j--) {
                for (int k = word.length - 1 - i; k >= word.length - 1 - i; k--) {
                    if (post[j] != word[k]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] son = new char[]{'l', 'o'};
        char[] bash = new char[]{'H', 'e', 'l', 'l', 'o'};
        System.out.println(endsWith(bash, son));
    }
}
