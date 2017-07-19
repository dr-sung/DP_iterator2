
import java.util.Iterator;


// participant: ConcreteAggregate
// Note --> participant: Aggregate (using java.util.Iterable)
public class TV implements Iterable<Channel> {
    
    private Channel[] channels;
    
    public TV(int nChannels) {
        channels = new Channel[nChannels];
        for (int i = 0; i < channels.length; i++)
            // all channels are assumed to be on-air initially
            channels[i] = new Channel("Channel"+i, i);
    }
    
    public void deleteChannel(int i) {
        channels[i] = null; // delete a channle if not on-air
    }
    
    public void addChannel(int i) {
        channels[i]= new Channel("Channel"+i, i); // add a channel back
    }
    
    public int getChannelCount() {
        return channels.length;
    }

    @Override
    public Iterator iterator() {
        ChannelIterator iterator = new ChannelIterator(channels);
        return iterator;
    }
    
}
