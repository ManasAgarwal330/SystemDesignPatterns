import java.util.List;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Subscribers sub = new YoutubeSubscribers("Manas");
        Channel channel = new YouTubeChannel("ACBD");

        channel.addSubscriber(sub);
        channel.addVideo("java tutorial");
    }
}



interface Subscribers{
    public void addChannelSub(Channel channel);
    public void removeChannelSub(Channel channel);
    public void notifySubscriber(String video);
    String getName();
}

interface Channel{
    public void addVideo(String video);
    public void addSubscriber(Subscribers sub);
    public void notifySubscriber(String video);
}

class YouTubeChannel implements Channel{
    List<Subscribers> subscriber;
    String name;
    public YouTubeChannel(String name){
        this.name = name;
        this.subscriber = new ArrayList<>();
    }

    @Override
    public void addVideo(String video){
        System.out.println("Video "+ video+" added to channel "+this.name);
        this.notifySubscriber(video);
    }

    @Override
    public void addSubscriber(Subscribers sub){
        this.subscriber.add(sub);
        System.out.println("Subscriber "+sub.getName()+" added to channel "+this.name);
    }

    @Override
    public void notifySubscriber(String video){
        for(Subscribers sub:this.subscriber){
            sub.notifySubscriber(video);
        }
    }
}

class YoutubeSubscribers implements Subscribers{

    List<Channel> channels;
    String name;

    public YoutubeSubscribers(String name){
        this.channels = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void addChannelSub(Channel channel){
        channels.add(channel);
        System.out.println("Channel " + channel + "added for subscriber "+ this.name);
    }

    @Override
    public void removeChannelSub(Channel channel){
        channels.remove(channel);
         System.out.println("Channel " + channel + "removed from subscriber "+ this.name);
    }

    @Override
    public void notifySubscriber(String video){
        System.out.println("Notification send for "+ video +" to subscriber "+ this.name);
    }
}