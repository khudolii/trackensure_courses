package logic;

public class Test2 {
    public int test(int[] height) {
        int firstElement = 0;
        int secondElement = 0;
        int length;
        int width;
        int volume = 0;
        try {
            for (int i = 0; i < height.length; i++) {

                if (height[i] <= 0)
                    continue;
                for (int j = i + 1; j < height.length; j++) {
                    if (height[i] > height[j])
                        width = height[j];
                    else
                        width = height[i];
                    length = j - i;
                    if (volume < length * width) {
                        volume = length * width;
                        firstElement = i;
                        secondElement = j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("The maximum volume of water is placed between:" +
                " (" + firstElement + ";" + height[firstElement] + ") " +
                "- (" + secondElement + ";" + height[secondElement] + ") \n" +
                "Max volume: " + volume);
        return volume;
    }
}
