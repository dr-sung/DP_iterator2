
// example: Iterator design pattern
// (c) Dr. Hong K. Sung

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        TV myTV = new TV(128);

        // only odd channels are on-air
        for (int i = 0; i < myTV.getChannelCount(); i += 2) {
            myTV.deleteChannel(i);
        }

        Iterator iter1 = myTV.iterator();
        Iterator iter2 = myTV.iterator();
        
        System.out.println("1st channel from iter2 is " + iter2.next());

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        System.out.println("2nd channel from iter2 is " + iter2.next());
    }
}
