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

    private void setHusbandName(String husbandName){
        this.husbandName = husbandName;
    }

    private void setVocalRange(int vocalRange){
        this.vocalRange = vocalRange;
    }

    private void setContestantName(String contestantName){
        this.contestantName = contestantName;
    }

    private void setHusbandLoc(int husbandLoc){
        this.husbandLocation = husbandLoc;
    }








}
