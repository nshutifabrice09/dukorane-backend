package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class WorkerSkillNotFoundException extends RuntimeException{

    public  WorkerSkillNotFoundException (Long id){
        super ("Couldn't find a Worker Skill with id "+id);
    }
}
