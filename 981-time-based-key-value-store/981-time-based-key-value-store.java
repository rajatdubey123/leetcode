class TimeMap {
    HashMap<String, ArrayList<Pair<Integer, String>>> mp;
    public TimeMap() {
        mp = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key)){
            mp.put(key,new ArrayList());
        }
        mp.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!mp.containsKey(key)){
            return "";
        }
        if(timestamp < mp.get(key).get(0).getKey()){
            return "";
        }
        int left = 0;
        int right = mp.get(key).size();
        while(left < right){
            int mid = (left + right)/2;
            if(mp.get(key).get(mid).getKey() <= timestamp){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        if(right == 0){
            return "";
        }
        return mp.get(key).get(right -1).getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */