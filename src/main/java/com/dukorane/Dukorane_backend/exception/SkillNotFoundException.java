package com.dukorane.Dukorane_backend.exception;

public class SkillNotFoundException extends RuntimeException{

    public SkillNotFoundException (Long id){
        super("Couldn't find a Skill with id "+id);
    }
}
