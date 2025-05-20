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
    //A
    public Array<Match> buildMatch(){
        ArrayList<Match> creationMatchs = new ArrayList<Match>();
        int start = 0;
        if(competitorList.size() % 2 == 1){
            start = 1;
        }
        for(int i = 0; i <(size - start)/2; i++){
            creationMatchs.add(competitorList.get(start + i), competitorList.get());
        }
    }
    //B
}
