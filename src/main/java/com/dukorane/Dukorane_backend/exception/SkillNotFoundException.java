package com.dukorane.Dukorane_backend.exception;

import java.util.UUID;

public class SkillNotFoundException extends RuntimeException{

    public SkillNotFoundException (UUID id){
        super("Couldn't find a Skill with id "+id);
    }
}
