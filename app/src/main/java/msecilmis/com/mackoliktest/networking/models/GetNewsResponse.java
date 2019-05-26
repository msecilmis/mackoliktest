package msecilmis.com.mackoliktest.networking.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

@Root(name="rss")
public class GetNewsResponse {

    @Element(name="channel", required=false)
    Channel channel;

    @Attribute(name="version", required=false)
    Double version;

    public Channel getChannel() {return this.channel;}
    public void setChannel(Channel value) {this.channel = value;}

    public Double getVersion() {return this.version;}
    public void setVersion(Double value) {this.version = value;}

    public static class Item {

        @Element(name="enclosure", required=false)
        Enclosure enclosure;

        @Element(name="link", required=false)
        String link;

        @Element(name="guid", required=false)
        String guid;

        @Element(name="description", required=false)
        String description;

        @Element(name="title", required=false)
        String title;

        @Element(name="category", required=false)
        String category;

        @Element(name="pubDate", required=false)
        String pubDate;

        public Enclosure getEnclosure() {return this.enclosure;}
        public void setEnclosure(Enclosure value) {this.enclosure = value;}

        public String getLink() {return this.link;}
        public void setLink(String value) {this.link = value;}

        public String getGuid() {return this.guid;}
        public void setGuid(String value) {this.guid = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

        public String getCategory() {return this.category;}
        public void setCategory(String value) {this.category = value;}

        public String getPubDate() {return this.pubDate;}
        public void setPubDate(String value) {this.pubDate = value;}

    }

    public static class Enclosure {

        @Attribute(name="length", required=false)
        Integer length;

        @Attribute(name="type", required=false)
        String type;

        @Attribute(name="url", required=false)
        String url;

        public Integer getLength() {return this.length;}
        public void setLength(Integer value) {this.length = value;}

        public String getType() {return this.type;}
        public void setType(String value) {this.type = value;}

        public String getUrl() {return this.url;}
        public void setUrl(String value) {this.url = value;}

    }

    public static class Channel {

        @ElementList(name="item", required=false, entry="item", inline=true)
        List<Item> item;

        @Element(name="link", required=false)
        String link;

        @Element(name="description", required=false)
        String description;

        @Element(name="language", required=false)
        String language;

        @Element(name="title", required=false)
        String title;

        @ElementList(name="category", required=false, entry="category", inline=true)
        List<String> category;

        @Element(name="pubDate", required=false)
        String pubDate;

        public List<Item> getItem() {return this.item;}
        public void setItem(List<Item> value) {this.item = value;}

        public String getLink() {return this.link;}
        public void setLink(String value) {this.link = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getLanguage() {return this.language;}
        public void setLanguage(String value) {this.language = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

        public List<String> getCategory() {return this.category;}
        public void setCategory(List<String> value) {this.category = value;}

        public String getPubDate() {return this.pubDate;}
        public void setPubDate(String value) {this.pubDate = value;}

    }

}