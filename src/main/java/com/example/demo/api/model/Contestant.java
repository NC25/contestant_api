package com.example.demo.api.model;

public class Contestant {
        private String husbandName;
        private String contestantName;
        private int vocalRange;
        private int husbandLocation;

        public Contestant(String hName, String cName, int vRange, int hLoc){
            this.contestantName = cName;
            this.husbandName = hName;
            this.vocalRange = vRange;
            this.husbandLocation = hLoc;
        }

        public String getHusbandName(){
            return this.husbandName;
        }

        public String getContestantName(){
            return this.contestantName;
        }

        public int getVocalRange(){
            return this.vocalRange;
        }

        public  int getHusbandLocation(){
            return this.husbandLocation;
        }

    public void setHusbandName(String husbandName){
        this.husbandName = husbandName;
    }

    public void setVocalRange(int vocalRange){
        this.vocalRange = vocalRange;
    }

    public void setContestantName(String contestantName){
        this.contestantName = contestantName;
    }

    public void setHusbandLoc(int husbandLoc){
        this.husbandLocation = husbandLoc;
    }

    public int score() throws Exception {
            if (getVocalRange() == getHusbandLocation()){
                return getHusbandLocation();
            }
            else if (getVocalRange() > getHusbandLocation()){
                return Math.abs(getVocalRange() - getHusbandLocation());
            }

        throw new Exception("Vocal Range is less than the husband location");
    }








}
