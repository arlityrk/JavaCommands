package com.nortal.commander;

/**
 * Created by arli on 7.12.2014.
 */
public class Environment {
    private String[] envVariables;
    private int envVariablesCnt;
    private long beginTime;

    public void setEnvVariablesCnt(int variableCnt){
        this.envVariablesCnt = variableCnt;
    }

    public void setEnvVariables(int size){
        this.envVariables = new String[size];
    }

    public void setbeginTime(long time){
        this.beginTime=time;
    }

    public String[] getEnvVariables(){
        return envVariables;
    }

    public int getEnvVariablesCnt(){
        return envVariablesCnt;
    }

    public long getBeginTime(){
        return beginTime;
    }
}
