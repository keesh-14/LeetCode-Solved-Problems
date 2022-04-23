public class Codec {
     Map<Long,String> table = new HashMap<Long,String>();
     long id = 1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        table.put(id,longUrl);
        return Long.toString(id++);
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return table.get(Long.parseLong(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));