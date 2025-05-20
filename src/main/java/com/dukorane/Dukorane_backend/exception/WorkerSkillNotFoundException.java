package com.dukorane.Dukorane_backend.exception;

public class WorkerSkillNotFoundException extends RuntimeException{

    public  WorkerSkillNotFoundException (Long id){
        super ("Couldn't find a Worker Skill with id "+id);
    }
}
