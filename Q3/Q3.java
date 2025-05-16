class Round{
    private String name;
    private int rank;
    
    public Round(String[] names){
        int rank = 1;
        for(int i:name){
            competitorList.add(new competitor(i,rank));
            rank++;
        }
    }
